package com.demo.gradle.mqdispatch;

import com.demo.gradle.entity.base.DeviceEventEnum;
import com.demo.gradle.entity.base.EventBus;
import com.demo.gradle.service.ITerminalService;
import com.demo.gradle.utils.ThreadPoolUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Slf4j
@Component
public class LoginEventConsumer {

    @Autowired
    ITerminalService terminalService;

    private Executor neverQueueExecutor = ThreadPoolUtil.neverQueueExecutor;

    @KafkaListener(topics = {"event-bus"}, containerFactory = "batchConsumeContainerFactory", groupId = "login-handler")
    public void consume(List<EventBus> records, Acknowledgment ack){
        try {
            if(Objects.nonNull(ack)){
                ack.acknowledge();
            }
            Map<String, Date> loginMap = null;
            Map<String, Date> logoutMap = null;
            Map<String, Date> heartBeatMap = null;
            if(records.size()>0){
                loginMap = new HashMap<>();
                logoutMap = new HashMap<>();
                heartBeatMap = new HashMap<>();
                for(EventBus bus:records){
                    String imei = bus.getImei();
                    Date statusDate = new Date(bus.getTimestamp());
                    if(DeviceEventEnum.LOGIN.equals(bus.getEvent())){
                        loginMap.put(imei,statusDate);
                    }else if(DeviceEventEnum.LOGOUT.equals(bus.getEvent())){
                        logoutMap.put(imei,statusDate);
                    }else if(DeviceEventEnum.HEART_BEAT.equals(bus.getEvent())){
                        heartBeatMap.put(imei,statusDate);
                    }else {
                        continue;
                    }
                }
            }

            if(loginMap.keySet().size()>0){
                synchronized (loginMap){
                    Map<String, Date> finalLoginMap = loginMap;
                    CompletableFuture.runAsync(new Runnable() {
                        @Override
                        public void run() {
                            log.info("批量更新上线事件，size ={}", finalLoginMap.keySet().size());
                            terminalService.batchHandleLogin(finalLoginMap, true);
                        }
                    }, neverQueueExecutor);
                }
            }

            if(logoutMap.keySet().size()>0){
                synchronized (logoutMap){
                    Map<String, Date> finalLogoutMap = logoutMap;
                    CompletableFuture.runAsync(new Runnable() {
                        @Override
                        public void run() {
                            log.info("批量更新离线事件，size ={}", finalLogoutMap.keySet().size());
                            terminalService.batchHandleLogin(finalLogoutMap, false);
                        }
                    }, neverQueueExecutor);
                }
            }

            if(heartBeatMap.keySet().size()>0){
                synchronized (heartBeatMap){
                    Map<String, Date> finalHeartBeatMap = heartBeatMap;
                    CompletableFuture.runAsync(new Runnable() {
                        @Override
                        public void run() {
                            log.info("批量更新心跳事件，size ={}", finalHeartBeatMap.keySet().size());
                            terminalService.batchUpdateHeartBeat(finalHeartBeatMap);
                        }
                    }, neverQueueExecutor);
                }
            }
        } catch (Exception e) {
            log.error("处理上线，离线事件时发生异常{}", e);
        }

    }
}

package com.demo.gradle.utils;

import com.demo.gradle.entity.base.EventBus;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

@Slf4j
public class EventBusDeserializer implements Deserializer<EventBus> {

    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public EventBus deserialize(String s, byte[] bytes) {
        EventBus bus = null;

        try {
            bus = ProtobufSerializingUtil.deserialize(bytes,EventBus.class);
        } catch (Exception e) {
            log.error("protobuf 反序列化发生异常：{}", e);
        }
        return bus;

    }

    @Override
    public void close() {

    }
}

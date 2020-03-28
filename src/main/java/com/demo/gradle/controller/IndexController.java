package com.demo.gradle.controller;

import com.demo.gradle.entity.base.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/virus")
public class IndexController {

    @Autowired
    Info info;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ResponseEntity<Map<String,Info>> getInfo(){
        log.info("进入InfoController-info方法");
        Map infoMap = new HashMap();
        String province = info.getProvince();
        infoMap.put(province,info);
        return ResponseEntity.ok(infoMap);
    }
}

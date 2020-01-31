package com.demo.gradle.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<Map<String,String>> sayHello(){
        Map map = new HashMap();
        map.put("index","Hello,Gradle!");
        return ResponseEntity.ok(map);
    }
}

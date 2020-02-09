package com.demo.gradle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

@Slf4j
@Controller
public class JspController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexPage(Map<String,Object> model){
        log.info("进入JspController-index方法");
        model.put("date", new Date());
        model.put("message", "Hello,World!");
        return "index";
    }
}

package com.demo.gradle.service.impl;

import com.demo.gradle.service.EchoService;

import java.util.Date;

public class DefaultEchoService implements EchoService {
    private String format;

    public DefaultEchoService(String format) {
        this.format = format;
    }

    @Override
    public String getEcho(String msg) {
        return String.format(format,msg,new Date());
    }
}

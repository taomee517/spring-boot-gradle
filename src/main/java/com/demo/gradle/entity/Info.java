package com.demo.gradle.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Info {
    @Value("${virus.info.province}")
    private String province;

    @Value("${virus.info.count}")
    private int count;
}

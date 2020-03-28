package com.demo.gradle.config;

import com.demo.gradle.entity.base.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VirusConfig {

    @Bean
    public Info info(){
        return new Info();
    }
}

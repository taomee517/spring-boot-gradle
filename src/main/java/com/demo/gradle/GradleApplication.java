package com.demo.gradle;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.demo.gradle.entity.dao")
public class GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleApplication.class, args);
	}

}

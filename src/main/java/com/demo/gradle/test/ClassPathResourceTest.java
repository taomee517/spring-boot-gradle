package com.demo.gradle.test;

import org.springframework.core.io.ClassPathResource;

public class ClassPathResourceTest {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("classpath:application.yml");
        System.out.println("文件名称：" + resource.getFilename());
    }
}

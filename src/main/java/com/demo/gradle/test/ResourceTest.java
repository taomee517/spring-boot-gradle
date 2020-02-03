package com.demo.gradle.test;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

public class ResourceTest {
    public static void main(String[] args) throws IOException {
        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
//        Resource[] res =resolver.getResources("file:F:\\sql\\db_third_service.sql");
//        for (Resource resource : res){
//            System.out.println(resource.getDescription()+"----"+resource.getFilename());
//        }

        Resource res =resolver.getResource("file:F:\\sql\\db_third_service.sql");
        System.out.println(res.getDescription()+"----"+res.getFilename());
    }
}

package com.demo.gradle.utils;


import com.demo.gradle.entity.base.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageUtils {
    public static Pageable buildSpringPageRequest(PageRequest request){
        if (request.getIsPaged()) {
            return org.springframework.data.domain.PageRequest.of(request.getPageNumber()-1,request.getPageSize());
        }
        return null;
    }
}

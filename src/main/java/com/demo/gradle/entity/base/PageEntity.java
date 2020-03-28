package com.demo.gradle.entity.base;

import lombok.Data;

import java.util.List;

@Data
public class PageEntity<T> {
    /**分页数据*/
    private List<T> data;

    /**总条数*/
    private Long count;

    /**总页数*/
    private Integer pageCount;
}

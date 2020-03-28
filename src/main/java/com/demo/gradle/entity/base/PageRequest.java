package com.demo.gradle.entity.base;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PageRequest{

    @NotNull(message = "是否分页不能为空")
    private Boolean isPaged;

    @NotNull(message = "页码不能为空")
    private Integer pageNumber;

    @NotNull(message = "单页条目数不能为空")
    private Integer pageSize;
}

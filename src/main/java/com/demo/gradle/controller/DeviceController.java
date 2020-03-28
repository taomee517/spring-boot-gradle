package com.demo.gradle.controller;

import com.demo.gradle.entity.base.Info;
import com.demo.gradle.entity.base.PageEntity;
import com.demo.gradle.entity.base.PageRequest;
import com.demo.gradle.entity.vo.TerminalVO;
import com.demo.gradle.service.ITerminalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/terminal")
public class DeviceController {

    @Autowired
    ITerminalService terminalService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<PageEntity<List<TerminalVO>>> getInfo(@Validated PageRequest pageRequest, BindingResult bindingResult){
        log.info("进入DeviceController-list方法");
        boolean hasError = bindingResult.hasErrors();
        Assert.isTrue(!hasError, hasError?bindingResult.getAllErrors().get(0).getDefaultMessage():null);

        try {
            PageEntity<List<TerminalVO>> pageEntity = terminalService.queryByRequest(pageRequest);
            return ResponseEntity.ok(pageEntity);
        } catch (Exception e) {
           log.error("查询设备列表发生异常：{}", e);
           return ResponseEntity.status(HttpStatus.valueOf(500)).build();
        }
    }
}

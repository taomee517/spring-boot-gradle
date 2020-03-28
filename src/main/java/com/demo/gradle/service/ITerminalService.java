package com.demo.gradle.service;

import com.demo.gradle.entity.base.PageEntity;
import com.demo.gradle.entity.base.PageRequest;
import com.demo.gradle.entity.vo.TerminalVO;

import java.util.List;

public interface ITerminalService {

    PageEntity<List<TerminalVO>> queryByRequest(PageRequest pageRequest);
}

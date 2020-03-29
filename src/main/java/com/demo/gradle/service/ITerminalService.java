package com.demo.gradle.service;

import com.demo.gradle.entity.base.PageEntity;
import com.demo.gradle.entity.base.PageRequest;
import com.demo.gradle.entity.vo.TerminalVO;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ITerminalService {

    PageEntity<List<TerminalVO>> queryByRequest(PageRequest pageRequest);

    void batchHandleLogin(Map<String, Date> loginMap, boolean online);

    void batchUpdateHeartBeat(Map<String, Date> heartBeatMap);
}

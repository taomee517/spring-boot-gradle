package com.demo.gradle.service.impl;

import com.demo.gradle.entity.base.PageEntity;
import com.demo.gradle.entity.base.PageRequest;
import com.demo.gradle.entity.dao.TerminalPOMapper;
import com.demo.gradle.entity.vo.TerminalVO;
import com.demo.gradle.service.ITerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalServiceImpl implements ITerminalService {

    @Autowired
    TerminalPOMapper terminalPOMapper;

    @Override
    public PageEntity<List<TerminalVO>> queryByRequest(PageRequest pageRequest) {
        PageEntity page = new PageEntity<>();
        long count = 0;
        List<TerminalVO> terminals = null;
        if (pageRequest.getIsPaged()) {
            count = terminalPOMapper.countAll();
            long pageStart = pageRequest.getPageSize()*(pageRequest.getPageNumber()-1);
            terminals = terminalPOMapper.queryByPage(pageStart,pageRequest.getPageSize());
            //计算总页数
            Long pageCount = count%pageRequest.getPageSize()==0?count/pageRequest.getPageSize():count/pageRequest.getPageSize()+1;
            page.setPageCount(pageCount.intValue());
        }else {
            terminals = terminalPOMapper.getAll();
            count = terminals.size();
            page.setPageCount(1);
        }
        page.setCount(count);
        page.setData(terminals);
        return page;
    }
}

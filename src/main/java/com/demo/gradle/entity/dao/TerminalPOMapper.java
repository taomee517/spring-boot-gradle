package com.demo.gradle.entity.dao;

import com.demo.gradle.entity.po.TerminalPO;
import com.demo.gradle.entity.po.TerminalPOExample;
import com.demo.gradle.entity.po.TerminalPOWithBLOBs;
import com.demo.gradle.entity.vo.TerminalVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TerminalPOMapper {
    long countByExample(TerminalPOExample example);

    int deleteByExample(TerminalPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TerminalPOWithBLOBs record);

    int insertSelective(TerminalPOWithBLOBs record);

    List<TerminalPOWithBLOBs> selectByExampleWithBLOBs(TerminalPOExample example);

    List<TerminalPO> selectByExample(TerminalPOExample example);

    TerminalPOWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TerminalPOWithBLOBs record, @Param("example") TerminalPOExample example);

    int updateByExampleWithBLOBs(@Param("record") TerminalPOWithBLOBs record, @Param("example") TerminalPOExample example);

    int updateByExample(@Param("record") TerminalPO record, @Param("example") TerminalPOExample example);

    int updateByPrimaryKeySelective(TerminalPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TerminalPOWithBLOBs record);

    int updateByPrimaryKey(TerminalPO record);

    long countAll();

    List<TerminalVO> queryByPage(@Param("pageStart") long pageStart,@Param("pageSize") int pageSize);

    List<TerminalVO> getAll();

    int batchUpdateOnline(@Param("map") Map<String, Date> loginMap, boolean online);

    void batchUpdateHeartBeat(@Param("map") Map<String, Date> heartBeatMap);
}
package com.fc.test.mapper;

import com.fc.test.model.TSysEmail;
import com.fc.test.model.TSysEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysEmailMapper {
    long countByExample(TSysEmailExample example);

    int deleteByExample(TSysEmailExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysEmail record);

    int insertSelective(TSysEmail record);

    List<TSysEmail> selectByExampleWithBLOBs(TSysEmailExample example);

    List<TSysEmail> selectByExample(TSysEmailExample example);

    TSysEmail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysEmail record, @Param("example") TSysEmailExample example);

    int updateByExampleWithBLOBs(@Param("record") TSysEmail record, @Param("example") TSysEmailExample example);

    int updateByExample(@Param("record") TSysEmail record, @Param("example") TSysEmailExample example);

    int updateByPrimaryKeySelective(TSysEmail record);

    int updateByPrimaryKeyWithBLOBs(TSysEmail record);

    int updateByPrimaryKey(TSysEmail record);
}
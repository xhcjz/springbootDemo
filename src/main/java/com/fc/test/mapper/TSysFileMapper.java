package com.fc.test.mapper;

import com.fc.test.model.TSysFile;
import com.fc.test.model.TSysFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysFileMapper {
    long countByExample(TSysFileExample example);

    int deleteByExample(TSysFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysFile record);

    int insertSelective(TSysFile record);

    List<TSysFile> selectByExample(TSysFileExample example);

    TSysFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysFile record, @Param("example") TSysFileExample example);

    int updateByExample(@Param("record") TSysFile record, @Param("example") TSysFileExample example);

    int updateByPrimaryKeySelective(TSysFile record);

    int updateByPrimaryKey(TSysFile record);
}
package com.fc.test.mapper;

import com.fc.test.model.TSysDictData;
import com.fc.test.model.TSysDictDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysDictDataMapper {
    long countByExample(TSysDictDataExample example);

    int deleteByExample(TSysDictDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysDictData record);

    int insertSelective(TSysDictData record);

    List<TSysDictData> selectByExample(TSysDictDataExample example);

    TSysDictData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    int updateByExample(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    int updateByPrimaryKeySelective(TSysDictData record);

    int updateByPrimaryKey(TSysDictData record);
}
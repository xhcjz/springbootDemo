package com.fc.test.mapper;

import com.fc.test.model.TSysDictType;
import com.fc.test.model.TSysDictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysDictTypeMapper {
    long countByExample(TSysDictTypeExample example);

    int deleteByExample(TSysDictTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysDictType record);

    int insertSelective(TSysDictType record);

    List<TSysDictType> selectByExample(TSysDictTypeExample example);

    TSysDictType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysDictType record, @Param("example") TSysDictTypeExample example);

    int updateByExample(@Param("record") TSysDictType record, @Param("example") TSysDictTypeExample example);

    int updateByPrimaryKeySelective(TSysDictType record);

    int updateByPrimaryKey(TSysDictType record);
}
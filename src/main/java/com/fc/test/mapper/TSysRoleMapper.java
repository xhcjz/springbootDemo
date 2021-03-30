package com.fc.test.mapper;

import com.fc.test.model.TSysRole;
import com.fc.test.model.TSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysRoleMapper {
    long countByExample(TSysRoleExample example);

    int deleteByExample(TSysRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    List<TSysRole> selectByExample(TSysRoleExample example);

    TSysRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysRole record, @Param("example") TSysRoleExample example);

    int updateByExample(@Param("record") TSysRole record, @Param("example") TSysRoleExample example);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
}
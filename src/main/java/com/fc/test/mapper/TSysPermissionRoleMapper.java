package com.fc.test.mapper;

import com.fc.test.model.TSysPermissionRole;
import com.fc.test.model.TSysPermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysPermissionRoleMapper {
    long countByExample(TSysPermissionRoleExample example);

    int deleteByExample(TSysPermissionRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysPermissionRole record);

    int insertSelective(TSysPermissionRole record);

    List<TSysPermissionRole> selectByExample(TSysPermissionRoleExample example);

    TSysPermissionRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysPermissionRole record, @Param("example") TSysPermissionRoleExample example);

    int updateByExample(@Param("record") TSysPermissionRole record, @Param("example") TSysPermissionRoleExample example);

    int updateByPrimaryKeySelective(TSysPermissionRole record);

    int updateByPrimaryKey(TSysPermissionRole record);
}
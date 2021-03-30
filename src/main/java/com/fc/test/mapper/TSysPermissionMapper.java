package com.fc.test.mapper;

import com.fc.test.model.TSysPermission;
import com.fc.test.model.TSysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysPermissionMapper {
    long countByExample(TSysPermissionExample example);

    int deleteByExample(TSysPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysPermission record);

    int insertSelective(TSysPermission record);

    List<TSysPermission> selectByExample(TSysPermissionExample example);

    TSysPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysPermission record, @Param("example") TSysPermissionExample example);

    int updateByExample(@Param("record") TSysPermission record, @Param("example") TSysPermissionExample example);

    int updateByPrimaryKeySelective(TSysPermission record);

    int updateByPrimaryKey(TSysPermission record);
}
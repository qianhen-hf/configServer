package com.fan.configserver.mapper;

import com.fan.configserver.po.ResourceEnv;
import com.fan.configserver.po.ResourceEnvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceEnvMapper {
    int countByExample(ResourceEnvExample example);

    int deleteByExample(ResourceEnvExample example);

    int deleteByPrimaryKey(Long resourceEnvId);

    int insert(ResourceEnv record);

    int insertSelective(ResourceEnv record);

    List<ResourceEnv> selectByExample(ResourceEnvExample example);

    ResourceEnv selectByPrimaryKey(Long resourceEnvId);

    int updateByExampleSelective(@Param("record") ResourceEnv record, @Param("example") ResourceEnvExample example);

    int updateByExample(@Param("record") ResourceEnv record, @Param("example") ResourceEnvExample example);

    int updateByPrimaryKeySelective(ResourceEnv record);

    int updateByPrimaryKey(ResourceEnv record);
}
package com.fan.configserver.mapper;

import com.fan.configserver.po.ResourceItem;
import com.fan.configserver.po.ResourceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceItemMapper {
    int countByExample(ResourceItemExample example);

    int deleteByExample(ResourceItemExample example);

    int insert(ResourceItem record);

    int insertSelective(ResourceItem record);

    List<ResourceItem> selectByExample(ResourceItemExample example);

    int updateByExampleSelective(@Param("record") ResourceItem record, @Param("example") ResourceItemExample example);

    int updateByExample(@Param("record") ResourceItem record, @Param("example") ResourceItemExample example);
}
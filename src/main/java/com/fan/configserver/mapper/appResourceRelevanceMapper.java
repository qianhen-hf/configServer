package com.fan.configserver.mapper;

import com.fan.configserver.po.appResourceRelevance;
import com.fan.configserver.po.appResourceRelevanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface appResourceRelevanceMapper {
    int countByExample(appResourceRelevanceExample example);

    int deleteByExample(appResourceRelevanceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(appResourceRelevance record);

    int insertSelective(appResourceRelevance record);

    List<appResourceRelevance> selectByExample(appResourceRelevanceExample example);

    appResourceRelevance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") appResourceRelevance record, @Param("example") appResourceRelevanceExample example);

    int updateByExample(@Param("record") appResourceRelevance record, @Param("example") appResourceRelevanceExample example);

    int updateByPrimaryKeySelective(appResourceRelevance record);

    int updateByPrimaryKey(appResourceRelevance record);
}
package com.fan.configserver.service;

import com.fan.configserver.mapper.ApplicationItemMapper;
import com.fan.configserver.po.ApplicationEnv;
import com.fan.configserver.po.ApplicationItem;
import com.fan.configserver.po.ApplicationItemExample;
import com.fan.configserver.util.ConvertUtil;
import com.fan.configserver.vo.ApplicationItemRequest;
import com.fan.configserver.vo.ApplicationItemVo;
import com.fan.configserver.vo.JsonPage;
import com.fan.configserver.vo.MyPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/9/3 10:41
 * @UpdateUser: hf
 * @UpdateDate: 2018/9/3 10:41
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Service
public class ApplicationItemService {
    @Autowired
    ApplicationItemMapper applicationItemMapper;
    @Autowired
    ApplicationEnvService applicationEnvService;

    public ApplicationItemVo getApplicationItemByName(String itemName) {
        ApplicationItemExample applicationItemExample = new ApplicationItemExample();
        ApplicationItemExample.Criteria criteria = applicationItemExample.createCriteria();
        criteria.andItemNameEqualTo(itemName);
        List<ApplicationItem> applicationItems = applicationItemMapper.selectByExample(applicationItemExample);
        if (applicationItems.isEmpty()) {
            return null;
        }
        ApplicationItem applicationItem = applicationItems.get(0);
        ApplicationItemVo applicationItemVo = new ApplicationItemVo();
        BeanUtils.copyProperties(applicationItem, applicationItemVo);
        return applicationItemVo;
    }

    public void addItem(ApplicationItemRequest applicationItemRequest) {
        ApplicationItem applicationItem = new ApplicationItem();
        BeanUtils.copyProperties(applicationItemRequest, applicationItem);
        applicationItemMapper.insertSelective(applicationItem);
    }


    public JsonPage<ApplicationItemVo> getApplicationEnvItem(Long applicationId, Long applicationEnvId, MyPage myPage) {
        @SuppressWarnings("unchecked")
        Page<ApplicationItemVo> page = PageHelper.startPage(myPage.getPage(), myPage.getResults(), true);
        ApplicationItemExample applicationItemExample = new ApplicationItemExample();
        ApplicationItemExample.Criteria criteria = applicationItemExample.createCriteria();
        criteria.andApplicationEnvIdEqualTo(applicationEnvId);
        List<ApplicationItem> applicationItems = applicationItemMapper.selectByExample(applicationItemExample);
        JsonPage<ApplicationItemVo> resultList = new JsonPage<ApplicationItemVo>(page);
        List<ApplicationItemVo> copyTo = ConvertUtil.copyTo(applicationItems, ApplicationItemVo.class);
        resultList.setRows(copyTo);
        return resultList;
    }

    public List<ApplicationItem> getApplicationEnvItem(Long applicationId, Long applicationEnvId) {
        ApplicationItemExample applicationItemExample = new ApplicationItemExample();
        ApplicationItemExample.Criteria criteria = applicationItemExample.createCriteria();
        criteria.andApplicationEnvIdEqualTo(applicationEnvId);
        List<ApplicationItem> applicationItems = applicationItemMapper.selectByExample(applicationItemExample);
        return applicationItems;
    }


    public void updateApplicationItem(ApplicationItemRequest applicationItemRequest) {
        ApplicationItem applicationItem = new ApplicationItem();
        BeanUtils.copyProperties(applicationItemRequest, applicationItem);
        applicationItemMapper.updateByPrimaryKeySelective(applicationItem);
    }


    public void delApplicationItem(Long applicationItemId) {
        applicationItemMapper.deleteByPrimaryKey(applicationItemId);
    }


    public JsonPage<ApplicationItemVo> getCommonItem(Long applicationId, MyPage myPage) {
        return getApplicationEnvItem(applicationId, getCommonEnvId(applicationId), myPage);
    }

    public List<ApplicationItem> getApplicationCommonItem(Long applicationId, Long applicationEnvId) {
        return getApplicationEnvItem(applicationId, getCommonEnvId(applicationId));
    }


    public Long getCommonEnvId(Long applicationId) {
        ApplicationEnv applicationEnv = applicationEnvService.getApplicationEnvByName(applicationId, applicationEnvService.getCommonEnvName());
        return applicationEnv.getApplicationEnvId();
    }

}


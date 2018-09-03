package com.fan.configserver.service;

import com.fan.configserver.exception.QhException;
import com.fan.configserver.exception.QhUserErrors;
import com.fan.configserver.mapper.ApplicationMapper;
import com.fan.configserver.po.Application;
import com.fan.configserver.po.ApplicationExample;
import com.fan.configserver.vo.ApplicationRequest;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/30 9:16
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/30 9:16
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Service
public class ApplicationService {
    @Autowired
    ApplicationMapper applicationMapper;
    @Autowired
    ApplicationEnvService applicationEnvService;

    public Application getApplicationById(Long appId) {
        return applicationMapper.selectByPrimaryKey(appId);
    }

    public Application getApplicationByName(String appName) {
        ApplicationExample applicationExample = new ApplicationExample();
        ApplicationExample.Criteria criteria = applicationExample.createCriteria();
        criteria.andApplicationNameEqualTo(appName);
        List<Application> applications = applicationMapper.selectByExample(applicationExample);
        if (applications.isEmpty()) {
            throw new QhException(QhUserErrors.APPLICATION_NOT_EXIST);
        }
        return applications.get(0);
    }


//    public JsonPage<Application> getAllAppByPage(MyPage myPage, Long userId, Integer type) {
//        Page<Application> page = PageHelper.startPage(myPage.getPage(), myPage.getResults(), true);
//        List<App> permList = appMapper.selectAllByUserId(userId, type);
//        List<Application> result = new ArrayList<Application>();
//        JsonPage<Application> resultList = new JsonPage<Application>(page);
//        for (Application App : permList) {
//            Application Application = new Application();
//            try {
//                BeanUtils.copyProperties(Application, App);
//            } catch (Exception e) {
//                throw new QhException(QhUserErrors.COPY_PROPRER);
//            }
//            result.add(Application);
//        }
//        resultList.setRows(result);
//        return resultList;
//    }

    // public List<App> getAllApp() {
    // return appMapper.selectAll();
    // }

    public void createApp(ApplicationRequest applicationRequest) {
        Application application = new Application();
        try {
            BeanUtils.copyProperties(applicationRequest, application);
        } catch (Exception e) {
            throw new QhException(QhUserErrors.COPY_PROPERTY_ERROR);
        }
        application.setCreateTime(new Date());
        applicationMapper.insertSelective(application);
        applicationEnvService.createCommonEnv(application.getApplicationId());
    }


    public void delApplication(Long id) {
        applicationMapper.deleteByPrimaryKey(id);
    }

    public void updateApp(ApplicationRequest applicationRequest) {
        Application application = new Application();
        try {
            BeanUtils.copyProperties(applicationRequest, application);
        } catch (Exception e) {
            throw new QhException(QhUserErrors.COPY_PROPERTY_ERROR);
        }
        applicationMapper.updateByPrimaryKeySelective(application);
    }


}

package com.fan.configserver.po;

import java.util.Date;

public class ApplicationEnv {
    private Long applicationEnvId;

    private Long applicationId;

    private String applicationEnvName;

    private String applicationEnvDesc;

    private Date createTime;

    private Date updateTime;

    private Long createUserId;

    public Long getApplicationEnvId() {
        return applicationEnvId;
    }

    public void setApplicationEnvId(Long applicationEnvId) {
        this.applicationEnvId = applicationEnvId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationEnvName() {
        return applicationEnvName;
    }

    public void setApplicationEnvName(String applicationEnvName) {
        this.applicationEnvName = applicationEnvName == null ? null : applicationEnvName.trim();
    }

    public String getApplicationEnvDesc() {
        return applicationEnvDesc;
    }

    public void setApplicationEnvDesc(String applicationEnvDesc) {
        this.applicationEnvDesc = applicationEnvDesc == null ? null : applicationEnvDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
}
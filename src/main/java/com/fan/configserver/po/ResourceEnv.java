package com.fan.configserver.po;

import java.util.Date;

public class ResourceEnv {
    private Long resourceEnvId;

    private Long resourceId;

    private String resourceEnvName;

    private String resourceEnvDesc;

    private Date createTime;

    private Date updateTime;

    private Long createUserId;

    public Long getResourceEnvId() {
        return resourceEnvId;
    }

    public void setResourceEnvId(Long resourceEnvId) {
        this.resourceEnvId = resourceEnvId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceEnvName() {
        return resourceEnvName;
    }

    public void setResourceEnvName(String resourceEnvName) {
        this.resourceEnvName = resourceEnvName == null ? null : resourceEnvName.trim();
    }

    public String getResourceEnvDesc() {
        return resourceEnvDesc;
    }

    public void setResourceEnvDesc(String resourceEnvDesc) {
        this.resourceEnvDesc = resourceEnvDesc == null ? null : resourceEnvDesc.trim();
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
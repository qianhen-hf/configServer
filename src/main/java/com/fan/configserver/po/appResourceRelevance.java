package com.fan.configserver.po;

public class appResourceRelevance {
    private Long id;

    private Long applicationId;

    private Long applicationEnvId;

    private Long resourceId;

    private Long resourceEnvId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getApplicationEnvId() {
        return applicationEnvId;
    }

    public void setApplicationEnvId(Long applicationEnvId) {
        this.applicationEnvId = applicationEnvId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getResourceEnvId() {
        return resourceEnvId;
    }

    public void setResourceEnvId(Long resourceEnvId) {
        this.resourceEnvId = resourceEnvId;
    }
}
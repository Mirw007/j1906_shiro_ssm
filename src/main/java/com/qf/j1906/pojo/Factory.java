package com.qf.j1906.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Factory {
    private Integer factoryId;

    private String factoryName;

    private String brandName;

    private String factoryLog;

    private Date factoryTime;

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getFactoryLog() {
        return factoryLog;
    }

    public void setFactoryLog(String factoryLog) {
        this.factoryLog = factoryLog == null ? null : factoryLog.trim();
    }

    public Date getFactoryTime() {
        return factoryTime;
    }

    public void setFactoryTime(Date factoryTime) {
        this.factoryTime = factoryTime;
    }
}
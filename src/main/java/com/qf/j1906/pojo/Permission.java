package com.qf.j1906.pojo;

import java.util.Date;

public class Permission {
    private Integer permId;

    private String permName;

    private Date permTime;

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName == null ? null : permName.trim();
    }

    public Date getPermTime() {
        return permTime;
    }

    public void setPermTime(Date permTime) {
        this.permTime = permTime;
    }
}
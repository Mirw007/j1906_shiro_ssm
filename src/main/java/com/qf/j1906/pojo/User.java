package com.qf.j1906.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userId;

    private String userAccount;

    private String userNicheng;

    private String userName;

    private String password;

    private String userSex;

    private Date userTime;

    private String userEmail;

    private String userAddress;
}
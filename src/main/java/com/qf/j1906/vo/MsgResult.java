package com.qf.j1906.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 飞
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgResult {
    /**响应状态码*/
    private int statusCode;
    /**响应短消息*/
    private String message;
    /**响应携带的信息*/
    private List<?> data;
}

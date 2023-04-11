package com.xuecheng.commons.model.dto;

import lombok.Data;

@Data
public class LoginDto {

    /**
     * 用户登录手机号
     */
    private String username;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户类型
     */
    private String utype;
}

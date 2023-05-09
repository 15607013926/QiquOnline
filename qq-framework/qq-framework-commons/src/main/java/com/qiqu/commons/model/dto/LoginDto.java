package com.qiqu.commons.model.dto;

import lombok.Data;

@Data
public class LoginDto {

    /**
     * 用户登录账户
     */
    private String account;

    /**
     * 用户登录密码
     */
    private String password;

}

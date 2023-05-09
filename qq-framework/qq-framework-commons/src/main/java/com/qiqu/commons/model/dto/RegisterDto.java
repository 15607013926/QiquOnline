package com.qiqu.commons.model.dto;

import lombok.Data;

/**
 * @Author 12441
 * @Date 2023/4/16 9:06
 * @Version 1.0
 */
@Data
public class RegisterDto {

    /**
     * 用户登录手机号
     */
    private String account;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户类型
     */
    private String utype;


}

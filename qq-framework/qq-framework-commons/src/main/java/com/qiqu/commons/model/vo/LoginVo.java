package com.qiqu.commons.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo {
    private String access_token;
    private String username;
    //角色字段
    private String role;
}

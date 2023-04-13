package com.qiqu.commons.model.vo;

import lombok.Data;

// 存储token中的用户信息
@Data
public class AuthInfo {

    // 用户id
    private Long uid;
    // 公司id
    private Long companyId;
    // 公司名称
    private String companyName;
}

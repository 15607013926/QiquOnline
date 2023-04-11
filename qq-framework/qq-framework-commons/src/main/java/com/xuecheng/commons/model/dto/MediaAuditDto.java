package com.xuecheng.commons.model.dto;

import lombok.Data;

/**
 * 审核时的VO对象
 */
@Data
public class MediaAuditDto {

    //课程Id
    private Long id;

    //审核状态：参照数据字典
    private String auditStatus;

    //审核意见
    private String auditMind;

}
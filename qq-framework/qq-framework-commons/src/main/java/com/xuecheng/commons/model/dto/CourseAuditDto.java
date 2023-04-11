package com.xuecheng.commons.model.dto;

import lombok.Data;

/**
 * 课程审核时的VO对象
 */
@Data
public class CourseAuditDto {

    //课程Id
    private Long courseBaseId;

    //审核状态：参照数据字典
    private String auditStatus;

    //审核意见
    private String auditMind;

}
package com.xuecheng.commons.model.dto;

import lombok.Data;

/**
 * 课程基本信息查询条件封装
 */
@Data
public class CourseDto {

    //课程审核状态
    private String auditStatus;

    //课程名称
    private String courseName;

    //课程类型
    private String teachmode;
}
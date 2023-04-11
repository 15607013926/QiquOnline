package com.xuecheng.commons.model.dto;

import lombok.Data;

/**
 * 教学计划-媒资绑定提交数据
 */
@Data
public class BindTeachplanMediaDto {

    //媒资信息标识
    private Long mediaId;

    //课程计划标识
    private Long teachplanId;

}
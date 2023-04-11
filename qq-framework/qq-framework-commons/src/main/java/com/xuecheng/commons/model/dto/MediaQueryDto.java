package com.xuecheng.commons.model.dto;

import lombok.Data;

@Data
//媒资查询封装类
public class MediaQueryDto {

    //文件名称
    private String filename;

    //文件类型
    private String type;

    //审核状态
    private String auditStatus;

}
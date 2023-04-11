package com.xuecheng.commons.model.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 课程页面视图信息类
 */
@Data
public class CourseBaseDto {

    private Long id;


    //课程名称
    private String name;

    //课程标签
    private String tags;


    //大分类
    private String mt;

    //小分类
    private String st;

    //课程等级
    private String grade;

    //课程介绍
    private String description;

    //适用人群
    private String users;

    //教学模式（普通，录播，直播等
    private String teachmode;

    //课程图片
    private String pic;

    //收费规则，对应数据字典
    private String charge;

    //价格 
    private BigDecimal price;
}
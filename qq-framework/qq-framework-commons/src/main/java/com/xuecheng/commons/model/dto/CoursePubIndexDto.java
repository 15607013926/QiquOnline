package com.xuecheng.commons.model.dto;

import lombok.Data;

//课程索引搜索条件查询对象
@Data
public class CoursePubIndexDto {

    //查询关键字
    private String keyword;

    //课程二级分类
    private String mt;

    //课程三级分类
    private String st;

    //课程等级
    private String grade;

    //排序字段, 推荐/最新/热评
    private String sortFiled;

}
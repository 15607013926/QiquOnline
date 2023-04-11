package com.xuecheng.commons.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CoursePubIndexVo implements Serializable {

    //主键
    private Long indexId;

    private Long course_id;

    //课程标识",example = "1
    public Long getCourseId() {
        return course_id;
    }

    private Long company_id;

    //机构ID",example = "1
    public Long getCompanyId() {
        return company_id;
    }

    private String company_name;

    //公司名称
    public String getCompanyName() {
        return company_name;
    }

    //课程名称
    private String name;

    //适用人群
    private String users;

    //标签
    private String tags;

    //大分类
    private String mt;

    //大分类名称
    private String mtName;

    //小分类
    private String st;

    //小分类名称
    private String stName;

    //课程等级
    private String grade;

    //教育模式(common普通，record 录播，live直播等）
    private String teachmode;

    //课程图片
    private String pic;

    //课程介绍
    private String description;

    //所有课程计划，json格式
    private String teachplan;

    private Date create_date;

    //发布时间
    public Date getCreateDate() {
        return create_date;
    }

    private Date change_date;

    //修改时间
    public Date getChangeDate() {
        return change_date;
    }

    private Integer is_latest;

    //是否最新课程(1最新)
    public Integer getIsLatest() {
        return is_latest;
    }

    private Integer is_pub;

    //是否发布(1发布 0取消发布)
    public Integer getIsPub() {
        return is_pub;
    }

    //状态（1正常  0删除）
    private String status;

    //备注
    private String remark;
    
    //课程营销数据
    private String market;
    
    //收费规则，对应数据字典--203
    private String charge;

    //现价
    private Float price;

    //有效性，对应数据字典--204
    private String valid;

    //学习人数
    private Long learners;
    
    //课程评论数
    private Long comment_num;
}
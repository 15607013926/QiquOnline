package com.xuecheng.commons.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CourseBaseVo {

    private Long id;

    /**
     * 机构ID
     */
    private Long companyId;

    /**
     * 机构名称
     */
    private String companyName;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 适用人群
     */
    private String users;

    /**
     * 课程标签
     */
    private String tags;

    /**
     * 大分类
     */
    private String mt;

    /**
     * 课程大类名称
     */
    private String mtName;

    /**
     * 小分类
     */
    private String st;

    /**
     * 课程小类名称
     */
    private String stName;

    /**
     * 课程等级
     */
    private String grade;

    /**
     * 教育模式(common普通，record 录播，live直播等）
     */
    private String teachmode;

    /**
     * 课程介绍
     */
    private String description;

    /**
     * 课程图片
     */
    private String pic;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 审核意见
     */
    private String auditMind;

    /**
     * 审核时间
     */
    private Date auditDate;

    /**
     * 是否删除：1为未删除，0为删除
     */
    private Integer status;

    /**
     * 课程发布标识
     */
    private Long coursePubId;

    private Integer planNum;

    private String charge;

    private BigDecimal price;
}
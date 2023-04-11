package com.xuecheng.commons.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 课程计划
 * </p>
 *
 * @author itcast
 */
@Data
public class TeachplanVo implements Serializable {


    private Long id;

    //课程计划名称
    private String pname;

    //课程计划父级Id
    private Long parentid;

    //课程类型:1视频、2文档
    private String mediaType;

    //开始直播时间
    private Date startTime;

    //直播结束时间
    private Date endTime;

    //章节及课程时介绍
    private String description;

    //时长，单位时:分:秒
    private String timelength;

    //排序字段
    private Integer orderby;

    //课程标识
    private Long courseId;

    //课程发布标识
    private Long coursePubId;

    //是否支持试学或预览（试看）
    private String isPreview;

    //层级，分为1、2、3级
    private Integer grade;


    //媒资信息
    private TeachplanMediaVo teachplanMedia;

    //课程计划子级树形结构集合
    private List<TeachplanVo> teachPlanTreeNodes;
}

package com.xuecheng.commons.model.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

//选课记录
@Data
public class CourseRecordVo implements Serializable {

    //主键
    private Long id;

    private Long userId;

    //选课人
    private String userName;

    //课程所属机构标识
    private Long companyId;

    //课程标识
    private Long courseId;

    //课程发布ID
    private Long coursePubId;

    //课程名称
    private String coursePubName;

    //教育模式
    private String teachmode;

    //课程有效期（不论点播或直播，在该期限内有效）" ,hidden = true)
    private Date startTime;

    //课程有效期（不论点播或直播，在该期限内有效）" ,hidden = true)
    private Date endTime;

    //正在学习的课程计划章节Id
    private Long teachplanId;

    //正在学习的课程计划章节名称
    private String teachplanName;

    //该课程用户是否已支付
    private Integer paid;

    //创建时间
    private Date createDate;

    private Date changeDate;

}
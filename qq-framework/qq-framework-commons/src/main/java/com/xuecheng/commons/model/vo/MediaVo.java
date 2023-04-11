package com.xuecheng.commons.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class MediaVo {

    /**
     * 主键
     */
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
     * 文件名称
     */
    private String filename;

    /**
     * 文件类型（文档，音频，视频）
     */
    private String type;

    /**
     * 标签
     */
    private String tags;

    /**
     * 存储源
     */
    private String bucket;

    /**
     * 文件标识
     */
    private String fileId;

    /**
     * 媒资文件访问地址
     */
    private String url;

    //时长
    private String timelength;

    /**
     * 上传人
     */
    private String username;

    /**
     * 上传时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date changeDate;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 审核意见
     */
    private String auditMind;
}

package com.xuecheng.commons.model.dto;
import lombok.Data;

/**
 * 媒资保存信息
 */
@Data
public class MediaDto {

    //文件名称
    private String filename;

    //文件类型（文档，音频，视频）
    private String type;

    //文件标识,视频的videoId
    private String fileId;

    //标签
    private String tags;

    //存储空间
    private String bucket;

}
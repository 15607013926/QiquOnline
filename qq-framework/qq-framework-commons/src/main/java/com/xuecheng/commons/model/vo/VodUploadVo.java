package com.xuecheng.commons.model.vo;

import lombok.Data;

//视频上传凭证封装类
@Data
public class VodUploadVo {

    //请求id
    private String requestId;
    //视频上传地址
    private String uploadAddress;
    //视频上传凭证
    private String uploadAuth;
    //用户id
    private String userId;
    //视频id
    private String videoId;
}
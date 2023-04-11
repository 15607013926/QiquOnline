package com.xuecheng.commons.model.dto;

import lombok.Data;

import java.util.Map;

/**
 * 媒体上传请求信息
 */
@Data
public class VodUploadDto {

   //视频标题
   private String title;

   //视频源文件名
   private String fileName;

   //回调URL
   private String callbackURL;

   //用户自定义的扩展字段，用于回调时透传返回，最大长度512字节")
   private Map<String, String> extend;
}
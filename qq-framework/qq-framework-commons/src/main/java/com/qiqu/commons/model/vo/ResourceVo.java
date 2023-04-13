package com.qiqu.commons.model.vo;

import lombok.Data;

/**
 * 媒资播放信息
 */
@Data
public class ResourceVo {


    //直播推流地址
    String pushUrl;
    
    //课程播放地址
    String playUrl;
    
    Integer state=0;
}
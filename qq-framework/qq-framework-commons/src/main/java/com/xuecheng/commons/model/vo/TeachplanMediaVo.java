package com.xuecheng.commons.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author itcast
 */
@Data
public class TeachplanMediaVo implements Serializable {

    private static final long serialVersionUID = 1L;

    //主键
    private Long planMediaId;

    //媒资信息标识
    private Long mediaId;

    //媒资文件原始名称
    private String mediaFilename;

}

package com.xuecheng.commons.model.dto;

import lombok.Data;

/**
 * 公共分页请求对象
 */
@Data
public class PageRequest {
    /**
     * 当前页
     */
    private Integer pageNo=1;
    /**
     * 每页条数
     */
    private Integer pageSize=1;
    /**
     * 是否排序
     */
    private String order;
    /**
     * 排序的字段
     */
    private String sortBy;
}

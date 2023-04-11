package com.xuecheng.commons.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 通用分页结果
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PageResponseResult<T> extends ResponseResult implements Serializable {
    /**
     * 当前页
     */
    private Long page;
    /**
     * 每页条数
     */
    private Integer pageSize;
    /**
     * 总数
     */
    private Long counts;

    public static ResponseResult okResult(Long counts, List list) {
        return new PageResponseResult(counts, list);
    }

    public static ResponseResult okResult(Long counts) {
        return new PageResponseResult(counts,new ArrayList());
    }

    public PageResponseResult(Long counts, List list) {
        super(list);
        this.counts = counts;
    }

}

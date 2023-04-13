package com.qiqu.commons.model.vo;

import lombok.Data;

@Data
public class DictionaryVo {


    private Long id;

    /**
     * 数据字典名称
     */
    private String name;

    /**
     * 数据字典代码
     */
    private String code;

    //
    private String itemValues;

}
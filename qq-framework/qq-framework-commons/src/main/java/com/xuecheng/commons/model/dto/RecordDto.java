package com.xuecheng.commons.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订阅
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordDto implements Serializable {
    /**
     * 课程Id
     */
    private Long coursePubId;

    /**
     * 用户ID
     */
    private Long userId;
}
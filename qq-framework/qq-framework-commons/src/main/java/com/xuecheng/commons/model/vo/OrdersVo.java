package com.xuecheng.commons.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdersVo implements Serializable {


    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 课程Id
     */
    private Long coursePubId;

    /**
     * 课程名称
     */
    private String coursePubName;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 交易价
     */
    private Long price;

    /**
     * 交易状态
     */
    private Integer status;

}

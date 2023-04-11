package com.xuecheng.commons.constants;

public class OrdersConstants {

    //微信支付的常量设置
    public static final Integer NOT_PAID = 0; //订单支付交易未支付
    public static final Integer PAID = 1; //订单支付交易已支付
    public static final String PAY_METHOD_WX = "wx_pay"; //订单的支付方式


    //订单的状态
    public static final Integer ORDER_INIT_STATUS = 600001; //初始态,
    public static final Integer ORDER_PAID_STATUS = 600002; //已支付,
    public static final Integer ORDER_CANCEL_STATUS = 600003; //已取消,
    public static final Integer ORDER_CLOSED_STATUS = 600004; //已关闭,
    public static final Integer ORDER_REFUNDED_STATUS = 600005; //已退款,
}

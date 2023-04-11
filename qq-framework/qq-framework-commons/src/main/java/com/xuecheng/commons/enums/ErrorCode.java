package com.xuecheng.commons.enums;

// 响应枚举有 2 个属性：即 code、message
public enum ErrorCode {

    SUCCESS(0, "成功"),

    LOGINERROR(1001, "用户名或者密码错误"),

    COMPANYERROR(9998, "机构id错误"),

    PARAMSERROR(9997, "参数错误"),

    DELETEERROR(9996, "此数据不可删除"),

    UPDATEEERROR(9995, "此数据不可修改"),

    ADDEERROR(9994, "数据保存失败"),

    DATAERROR(9993, "数据不合法"),

    ALIYUNERROR(9992, "上传阿里云失败"),

    NOTFOUND(9991, "数据不存在"),

    NOTPLAY(9990, "课程未支付"),

    NOTTOKEN(9989, "token不合法"),

    MEDIABINDERROR(8001, "数据状态不合法"),
    COURSEPUBSHRRROR(8002, "课程发布失败"),

    ORDERERROR(7001,"已购买过此课程"),
    PAYERROR(7002,"创建支付订单失败"),

    ERROR(9999,"服务器内部错误，请稍后再试");

    int code;
    String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

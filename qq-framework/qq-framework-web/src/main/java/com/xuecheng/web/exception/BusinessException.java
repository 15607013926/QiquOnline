package com.xuecheng.web.exception;

import com.xuecheng.commons.enums.ErrorCode;
import lombok.Data;



// 自定义业务异常
@Data
public class BusinessException extends RuntimeException {

    // 声明响应枚举（错误信息）
    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getDesc());
        this.errorCode = errorCode;
    }
}

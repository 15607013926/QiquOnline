package com.qiqu.web.exception;

import com.qiqu.commons.enums.ErrorCode;
import com.qiqu.commons.model.vo.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 预期异常
    @ExceptionHandler(BusinessException.class)
    public ResponseResult businessException(BusinessException e) {
        return ResponseResult.errorResult(e.getErrorCode());
    }

    // 非预期异常
    @ExceptionHandler(Exception.class)
    public ResponseResult exception(Exception e) {
        e.printStackTrace();
        return ResponseResult.errorResult(ErrorCode.ERROR);
    }
}

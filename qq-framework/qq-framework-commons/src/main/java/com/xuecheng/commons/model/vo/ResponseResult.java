package com.xuecheng.commons.model.vo;

import com.xuecheng.commons.enums.ErrorCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 通用的结果返回类
 */
@Data
@NoArgsConstructor
public class ResponseResult<T> implements Serializable {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String errorMessage;
    /**
     * 返回数据
     */
    private T data;


    public ResponseResult(T data) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.data = data;
    }


    public static ResponseResult okResult() {
        return okResult(null);
    }

    public static  ResponseResult okResult(Object data) {
        return new ResponseResult(data);
    }

    public static ResponseResult errorResult(ErrorCode enums) {
        ResponseResult result = new ResponseResult();
        result.setCode(enums.getCode());
        result.setErrorMessage(enums.getDesc());
        return result;
    }
}

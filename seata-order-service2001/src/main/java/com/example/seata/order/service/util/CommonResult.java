package com.example.seata.order.service.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yh
 * @date 2022/7/17 23:52
 */
@Data
@AllArgsConstructor
public class CommonResult<T> {
    private String code;
    /**
     * 提示消息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T data;

    public CommonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static  <T> CommonResult<T> success(String code, String msg, T data) {
        return new CommonResult<>(code, msg, data);
    }

    public static  <T> CommonResult<T> success(String code, String msg) {
        return new CommonResult<>(code, msg);
    }

    public static CommonResult<Void> failed(String code, String msg) {
        return new CommonResult<>(code, msg);
    }
    public static <T> CommonResult<T> failed(String code, String msg, T data) {
        return new CommonResult<>(code, msg,data);
    }

}

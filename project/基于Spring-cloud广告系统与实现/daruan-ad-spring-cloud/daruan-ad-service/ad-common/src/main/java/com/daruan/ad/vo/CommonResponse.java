package com.daruan.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/4/22
 * Time:11:42
 * 统一的响应对象，规范对前端的数据响应格式
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}

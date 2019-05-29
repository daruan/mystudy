package com.daruan.ad.advice;

import com.daruan.ad.exception.AdException;
import com.daruan.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一的异常处理类，
 * 异常也属于响应信息，返回CommonResponse
 * 业务代码中抛出AdException类型的异常时，会在此处被捕获，进行统一处理
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/4/22
 * Time:13:36
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException exception){
        CommonResponse<String> response = new CommonResponse<>(-1,"business error");
        response.setData(exception.getMessage());
        return response;
    }
}

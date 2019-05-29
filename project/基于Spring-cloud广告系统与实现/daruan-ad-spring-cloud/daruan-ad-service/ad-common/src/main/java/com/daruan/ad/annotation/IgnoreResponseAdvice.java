package com.daruan.ad.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/4/22
 * Time:12:08
 * 提供一个响应条件判断，满足条件进行响应拦截，不满足条件不进行响应拦截
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}

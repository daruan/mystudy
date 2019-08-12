package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/6
 * Time:21:54
 */
public class MyAspect {
    public void before(){
        //开启事务
        System.out.println("开启事务");
    }

    public void after(){
        //结束事务
        System.out.println("结束事务");
    }
}

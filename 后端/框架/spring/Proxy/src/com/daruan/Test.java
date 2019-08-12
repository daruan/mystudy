package com.daruan;

import com.daruan.service.UserService;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/6
 * Time:22:05
 */
public class Test {

    public static void main(String[] args) {
        //此处拿到的是UserService的代理对象
        UserService userService = MyBeanFactory.getUserService();
        userService.delete(10);
        userService.add();
        userService.insert();
    }

}

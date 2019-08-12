package com.daruan;

import com.daruan.service.UserService;
import com.daruan.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/6
 * Time:21:56
 */
public class MyBeanFactory {
    public static UserService getUserService(){
        //目标类
        UserService userService = new UserServiceImpl();
        //切面类
        MyAspect myAspect = new MyAspect();

        //生成目标代理类对象
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //开启事务
                        myAspect.before();

                        //执行业务方法
                        Object retObj = method.invoke(userService,args);

                        //提交事务
                        myAspect.after();

                        //业务方法返回值
                        return retObj;
                    }
                }
        );

        //返回代理类对象
        return userServiceProxy;
    }
}

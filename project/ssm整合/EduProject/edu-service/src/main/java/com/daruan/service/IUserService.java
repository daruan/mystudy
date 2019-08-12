package com.daruan.service;

import com.daruan.model.User;
import com.daruan.service.base.IBaseService;

public interface IUserService extends IBaseService<User>{

    //特有的方法
    public User login(String username, String password);
}

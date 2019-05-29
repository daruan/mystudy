package com.daruan.ad.service;

import com.daruan.ad.exception.AdException;
import com.daruan.ad.vo.CreateUserRequest;
import com.daruan.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}

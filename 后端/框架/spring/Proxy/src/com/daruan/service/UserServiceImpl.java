package com.daruan.service;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/6
 * Time:21:53
 */
public class UserServiceImpl implements UserService {
    @Override
    public int delete(int id) {
        System.out.println("删除业务");
        return 1;
    }

    @Override
    public void add() {
        System.out.println("添加业务");
    }

    @Override
    public void insert() {
        System.out.println("插入业务");
    }
}

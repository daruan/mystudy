package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:21:58
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        Person p = new Person("小明");
        p.music();
    }
}

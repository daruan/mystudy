package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:22:00
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        Person p = new Person("小明");
        p.eat();
    }
}

package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:22:20
 */

/**
 * 开启线程的方式二
 * 1.定义实现Runable接口的类
 * 2.实现run方法
 * 3.创建线程类实例对象
 * 4.创建Thread对象，并把自定义的实现类对象作为参数传入其构造
 * 5.启动这个Thread对象
 */
public class MainThread {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();

        for (int i=99; i<200; i++){
            System.out.println("听歌"+ i);
        }
    }
}

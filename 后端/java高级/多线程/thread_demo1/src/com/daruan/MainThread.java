package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:21:52
 */

/**
 * 开启线程的方式一
 * 1.创建一个线程对象继承Thread类
 * 2.重写Thread类的run方法（就是写任务代码的方法）
 * 3.创建这个线程对象
 * 4.调用该对象的start方法启动运行该线程
 */
public class MainThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        thread2.start();

        for (int i=0; i<200; i++){
            System.out.println("主线程执行第" + i + "次");
        }
    }
}

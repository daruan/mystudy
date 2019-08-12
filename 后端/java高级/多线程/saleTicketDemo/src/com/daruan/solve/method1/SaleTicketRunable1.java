package com.daruan.solve.method1;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:9:46
 */

/**
 * 解决线程安全问题方法一：给代码块加锁
 * 此处的代码块是一个整体，原子性的，同一时刻只有一个线程能执行这个代码块（获取锁），执行完了释放锁其他线程才能拿到锁
 *
 */
public class SaleTicketRunable1 implements Runnable{
    //共享数据 100张票 此处三个线程同时执行卖票任务
    private int count = 100;

    @Override
    public void run() {
        //执行卖票任务
        while (true){
            synchronized (this){
                if (count > 0){
                    System.out.println(Thread.currentThread().getName()+"卖出第" + count + "票");
                    count--;
                }
            }
        }
    }
}

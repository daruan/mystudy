package com.daruan.solve.method2;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:9:59
 */

/**
 * 方式二：给任务方法加锁
 */
public class SaleTicketRunable2 implements Runnable {
    //共享数据 100张票 此处三个线程同时执行卖票任务
    private int count = 100;

    @Override
    public void run() {
        //执行卖票任务
        while (true){
            sale();
        }
    }

    public synchronized void sale(){
        if (count > 0){
            System.out.println(Thread.currentThread().getName()+"卖出第" + count + "票");
            count--;
        }
    }
}

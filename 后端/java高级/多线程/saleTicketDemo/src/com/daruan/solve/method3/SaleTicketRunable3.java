package com.daruan.solve.method3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:10:08
 */

/**
 * 方法三：Lock接口方式，比较灵活
 * 例如任务方法出现异常，可在finally中释放锁
 */
public class SaleTicketRunable3 implements Runnable {
    //共享数据 100张票 此处三个线程同时执行卖票任务
    private int count = 100;
    //创建锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //执行卖票任务
        while (true){
            lock.lock();
            if (count > 0){
                System.out.println(Thread.currentThread().getName()+"卖出第" + count + "票");
                count--;
            }
            lock.unlock();
        }
    }
}

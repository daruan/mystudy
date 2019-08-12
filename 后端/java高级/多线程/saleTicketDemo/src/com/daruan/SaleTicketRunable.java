package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:9:18
 */
public class SaleTicketRunable implements Runnable {
    //共享数据 100张票 此处三个线程同时执行卖票任务
    private int count = 100;

    @Override
    public void run() {
        //执行卖票任务
        while (true){
            if (count > 0){
                System.out.println("卖出第" + count + "票");
                count--;
            }
        }
    }
}

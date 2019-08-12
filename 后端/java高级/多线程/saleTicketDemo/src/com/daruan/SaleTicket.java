package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:9:17
 */

/**
 * 三个线程同时执行卖票任务
 */
public class SaleTicket {
    public static void main(String[] args) {
        SaleTicketRunable st = new SaleTicketRunable();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        t1.start();
        t2.start();
        t3.start();

    }
}

package com.daruan.solve.method3;

import com.daruan.solve.method2.SaleTicketRunable2;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:9:53
 */
public class SaleTicket3 {
    public static void main(String[] args) {
        SaleTicketRunable3 st = new SaleTicketRunable3();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        t1.start();
        t2.start();
        t3.start();
    }
}

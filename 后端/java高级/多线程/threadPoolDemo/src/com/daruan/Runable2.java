package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:16:35
 */
public class Runable2 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("看电影");
        }
    }
}

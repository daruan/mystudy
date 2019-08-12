package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:16:34
 */
public class Runable1 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("吃饭");
        }
    }
}

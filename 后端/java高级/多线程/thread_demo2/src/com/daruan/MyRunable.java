package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:22:25
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        //任务代码
        for (int i=0; i<200; i++){
            System.out.println("吃饭"+i);
        }
    }
}

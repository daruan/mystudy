package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:15:14
 */

/**
 * 吃货吃包子
 */
public class ChiHuo extends Thread{
    private Baozi baozi;

    public ChiHuo(Baozi baozi){
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flag == false){
                    //没有包子，吃货线程进入等待
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //开始吃包子
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("吃货吃完包子");
                baozi.flag = false;
                //没有包子，通知包子铺线程开始生产包子
                baozi.notify();
            }
        }
    }
}

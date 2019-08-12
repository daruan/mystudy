package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:15:08
 */

/**
 * 包子铺生产包子
 */
public class BaoziPu extends Thread{
    private Baozi baozi;

    public BaoziPu(Baozi baozi){
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flag == true){
                    //有包子，不需要生产，包子铺线程进入等待状态
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //生产包子
                baozi.pi = "薄皮";
                baozi.xian = "肉馅";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子铺生产好了"+baozi.pi + baozi.xian + "的包子");
                baozi.flag = true;
                //有包子了，通知吃货线程开始吃包子
                baozi.notify();
            }
        }
    }
}

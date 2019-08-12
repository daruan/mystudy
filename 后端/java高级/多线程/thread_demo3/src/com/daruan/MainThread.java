package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:23:02
 */

/**
 * 匿名内部类：快速创建一个子类对象或一个接口的实现类对象
 * 格式：
 *      new 父类(){
 *          重写方法(){}
 *      }
 *      new 接口(){
 *          实现方法(){}
 *      }
 *
 * 使用匿名内部类创建线程对象如下
 */
public class MainThread {
    public static void main(String[] args) {
        //匿名内部类 继承方式
        new Thread(){
            @Override
            public void run() {
                for (int i=0; i<200; i++){
                    System.out.println(getName() + "-" + i);
                }
            }
        }.start();

        //匿名内部类 接口实现方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<200; i++){
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                }
            }
        }).start();
    }
}

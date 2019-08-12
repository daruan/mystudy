package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:16:33
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * jdk1.5之后可以利用线程池对象来拿到线程执行任务
 * 线程池对象是由Excetors工厂类创建
 */
public class MainTest {
    public static void main(String[] args) {
        //创建有三个线程的线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runable1());
        executorService.submit(new Runable2());
    }
}

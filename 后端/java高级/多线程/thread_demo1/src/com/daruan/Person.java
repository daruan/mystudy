package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/2
 * Time:21:52
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void music(){
        for (int i=1; i<=100; i++){
            System.out.println(name + "听第" + i + "首歌");
        }
    }

    public void eat(){
        for (int i=1; i<=100; i++){
            System.out.println(name + "吃第" + i + "口饭");
        }
    }
}

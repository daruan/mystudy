package com.daruan;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/8/3
 * Time:15:21
 */
public class Test {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();

        new BaoziPu(baozi).start();
        new ChiHuo(baozi).start();

    }
}

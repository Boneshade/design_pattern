package com.scott.design.creational.singleton;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2417:04
 */
public class Test {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new TestThread());
        Thread t2 = new Thread(new TestThread());
        t1.start();
        t2.start();
        //不加锁时创建了两个线程 Thread@536和Thread@538
        System.out.println("program end");
    }

}

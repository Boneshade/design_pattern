package com.scott.design.creational.singleton;

/**
 * @author xubr
 * @title: TestThread
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2417:02
 */
public class TestThread implements Runnable {

    @Override
    public void run() {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazySingleton);
    }
}

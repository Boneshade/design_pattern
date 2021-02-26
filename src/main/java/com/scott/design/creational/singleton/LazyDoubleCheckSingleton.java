package com.scott.design.creational.singleton;

/**
 * @author xubr
 * @title: LazyDoubleCheckSingleton
 * @projectName design_pattern
 * @description: <h1>双重校验锁实现对象单例</h1>
 * @date 2021/2/2611:04
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }


    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置LazyDoubleCheckSingleton 指向刚内存分配的地址
                    //4.JVM的重排序可能会导致多线程情况下出现问题,
                    // 所以需要使用volatile关键字不让重排序
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }


}

package com.scott.design.creational.singleton;

/**
 * @author xubr 2021/2/28
 * ThreadLocal对象可以指定在线程内存储数据,数据存储以后,只有指定的线程可以得到存储数据
 * 做个不恰当的比喻，从表面上看ThreadLocal相当于维护了一个map，key就是当前的线程，value就是需要存储的对象。
 * 这里的这个比喻是不恰当的，实际上是ThreadLocal的静态内部类ThreadLocalMap为每个Thread都维护了一个数组table，
 * ThreadLocal确定了一个数组下标，而这个下标就是value存储的对应位置
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new
            ThreadLocal<ThreadLocalInstance>() {
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }

}

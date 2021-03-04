package com.scott.design.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @author xubr
 * @title: GuavaEvent
 * @projectName design_pattern
 * @description: <h1>guava事件</h1>
 * @date 2021/3/414:06
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法,传入的参数是:" + str);
    }


}

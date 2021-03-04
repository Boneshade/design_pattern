package com.scott.design.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @author xubr
 * @title: GuavaEventTest
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/414:08
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }


}

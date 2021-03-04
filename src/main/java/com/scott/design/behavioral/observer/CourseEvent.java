package com.scott.design.behavioral.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author xubr
 * @title: CourseEvent
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/414:10
 */
public class CourseEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("xubr在java 精讲课程向老师提了一个问题,问题是:" + str);
    }
}

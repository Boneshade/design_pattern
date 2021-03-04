package com.scott.design.behavioral.observer;

import com.google.common.eventbus.EventBus;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>观察者模式测试类</h1>
 * @date 2021/3/413:59
 */
public class Test {

    public static void main(String[] args) {

//        Course course = new Course("Java 设计模式精讲");
//        Teacher teacher1 = new Teacher("Alpha");
//        Teacher teacher2 = new Teacher("Beta");
//
//        course.addObserver(teacher1);
//        course.addObserver(teacher2);
//
//
//        //业务逻辑代码
//        Question question = new Question();
//        question.setQuestionContent("观察者模式如何编写");
//        question.setUserName("xubr");
//
//        //在课程上提问,老师那里接收
//        course.produceQuestion(course,question);


        EventBus eventbus = new EventBus();
        CourseEvent guavaEvent = new CourseEvent();
        eventbus.register(guavaEvent);
        eventbus.post("提问的内容");

    }

}

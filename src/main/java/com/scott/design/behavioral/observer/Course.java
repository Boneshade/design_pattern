package com.scott.design.behavioral.observer;

import java.util.Observable;

/**
 * @author xubr
 * @title: Course
 * @projectName design_pattern
 * @description: <h1>观察者模式-课程类</h1>
 * @date 2021/3/413:48
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }


    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }



}

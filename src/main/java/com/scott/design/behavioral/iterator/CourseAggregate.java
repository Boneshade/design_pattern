package com.scott.design.behavioral.iterator;

/**
 * @author xubr
 * @title: CourseAggregate
 * @projectName design_pattern
 * @description: <h1>总课程</h1>
 * @date 2021/3/316:04
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}

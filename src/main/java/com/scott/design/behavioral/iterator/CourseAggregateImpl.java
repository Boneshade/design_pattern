package com.scott.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubr
 * @title: CourseAggregateImpl
 * @projectName design_pattern
 * @description: <h1>总课程实现类</h1>
 * @date 2021/3/316:06
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}

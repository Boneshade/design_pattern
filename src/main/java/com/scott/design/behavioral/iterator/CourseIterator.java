package com.scott.design.behavioral.iterator;

/**
 * @author xubr
 * @title: CorseIterator
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/316:39
 */
public interface CourseIterator {

    Course nextCourse();

    /**
     * <h2>判断是不是最后一个课程<h2/>
     * @return
     */
    boolean isLastCourse();


}

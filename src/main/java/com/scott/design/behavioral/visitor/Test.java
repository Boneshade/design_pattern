package com.scott.design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("并发编程的基石");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for(Course course : courseList){
            course.accept(new Visitor());
        }

    }
}

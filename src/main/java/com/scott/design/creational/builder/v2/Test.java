package com.scott.design.creational.builder.v2;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>链式调用</h1>
 * @date 2021/2/2414:45
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCourseArticle("Java设计模式精讲文章")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseQA("Java设计模式精讲QA")
                .buildCourseVideo("Java设计模式精讲video")
                .build();
        System.out.println(course);
    }

}

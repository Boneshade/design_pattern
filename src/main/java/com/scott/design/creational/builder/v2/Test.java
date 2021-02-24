package com.scott.design.creational.builder.v2;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>��ʽ����</h1>
 * @date 2021/2/2414:45
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course.CourseBuilder()
                .buildCourseName("Java���ģʽ����")
                .buildCourseArticle("Java���ģʽ��������")
                .buildCoursePPT("Java���ģʽ����PPT")
                .buildCourseQA("Java���ģʽ����QA")
                .buildCourseVideo("Java���ģʽ����video")
                .build();
        System.out.println(course);
    }

}

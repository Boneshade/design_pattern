package com.scott.design.creational.builder;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2414:32
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java���ģʽ����", "Java���ģʽ����PPT",
                "Java���ģʽ������Ƶ", "Java���ģʽ�����ּ�", "Java���ģʽ�����ʴ�");
        System.out.println(course);
    }

}

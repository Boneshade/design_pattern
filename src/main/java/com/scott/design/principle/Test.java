package com.scott.design.principle;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: TODO
 * @date 2021/2/614:19
 */
public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
        System.out.println("课程ID:" + javaCourse.getId() + "课程名称" + javaCourse.getName() + "课程价格" + javaCourse.getPrice());
    }

}

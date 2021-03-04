package com.scott.design.behavioral.commend;

import java.util.Stack;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>命令模式</h1>
 * @date 2021/3/416:08
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java 设计模式精讲--By Gleey");

        CloseCourseVideoCommand closeCourseVideoCommand=new CloseCourseVideoCommand(courseVideo);

        OpenCourseVideoCommand openCourseVideoCommand=new OpenCourseVideoCommand(courseVideo);


        Staff staff=new Staff();
        staff.addCommend(openCourseVideoCommand);
        staff.addCommend(closeCourseVideoCommand);


        staff.executeCommands();


    }

}

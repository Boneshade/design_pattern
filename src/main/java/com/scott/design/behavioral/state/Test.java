package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/513:43
 */
public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }


}

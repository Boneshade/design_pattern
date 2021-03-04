package com.scott.design.behavioral.commend;

/**
 * @author xubr
 * @title: CourseVideo
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/416:03
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程视频开放");
    }

    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }


}

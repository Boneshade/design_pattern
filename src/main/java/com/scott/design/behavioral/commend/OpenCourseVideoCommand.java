package com.scott.design.behavioral.commend;

/**
 * @author xubr
 * @title: OpenCourseVideoCommand
 * @projectName design_pattern
 * @description: <h1>打开课程命令</h1>
 * @date 2021/3/416:07
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}

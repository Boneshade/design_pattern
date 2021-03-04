package com.scott.design.behavioral.commend;

/**
 * @author xubr
 * @title: CloseCourseVideoCommand
 * @projectName design_pattern
 * @description: <h1>关闭课程命令</h1>
 * @date 2021/3/416:06
 */
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}

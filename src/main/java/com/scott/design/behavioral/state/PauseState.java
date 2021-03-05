package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: PauseState
 * @projectName design_pattern
 * @description: <h1>暂停状态</h1>
 * @date 2021/3/511:17
 */
public class PauseState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}

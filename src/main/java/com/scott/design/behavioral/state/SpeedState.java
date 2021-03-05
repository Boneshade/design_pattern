package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: SpeedState
 * @projectName design_pattern
 * @description: <h1>加速状态</h1>
 * @date 2021/3/511:15
 */
public class SpeedState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快速播放课程视频状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}

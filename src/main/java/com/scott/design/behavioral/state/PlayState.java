package com.scott.design.behavioral.state;

import com.scott.design.behavioral.iterator.Course;

/**
 * @author xubr
 * @title: PlayState
 * @projectName design_pattern
 * @description: <h1>播放状态</h1>
 * @date 2021/3/511:14
 */
public class PlayState extends CourseVideoState{

    @Override
    public void play() {
        System.out.println("正常播放视频课程状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
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

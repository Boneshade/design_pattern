package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: StopState
 * @projectName design_pattern
 * @description: <h1>停止状态</h1>
 * @date 2021/3/511:17
 */
public class StopState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE );
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进！！");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停！！");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}

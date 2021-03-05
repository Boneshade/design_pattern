package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: CourseVideoState
 * @projectName design_pattern
 * @description: <h1>状态模式-课程视频状态</h1>
 * @date 2021/3/511:11
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 加速播放
     */
    public abstract void speed();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 停止播放
     */
    public abstract void stop();


}

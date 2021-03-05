package com.scott.design.behavioral.state;

/**
 * @author xubr
 * @title: CourseVideoContext
 * @projectName design_pattern
 * @description: <h1>课程视频上下文</h1>
 * @date 2021/3/511:20
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    //播放状态
    public final static PlayState PLAY_STATE = new PlayState();
    //停止状态
    public final static StopState STOP_STATE = new StopState();
    //暂停状态
    public final static PauseState PAUSE_STATE = new PauseState();
    //加速状态
    public final static SpeedState SPEED_STATE = new SpeedState();


    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void stop() {
        this.courseVideoState.stop();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

}

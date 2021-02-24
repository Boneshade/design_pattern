package com.scott.design.creational.abstractfactory;

import com.scott.design.creational.abstractfactory.JavaVideo;
import com.scott.design.creational.abstractfactory.Video;

/**
 * @author xubr
 * @title: JavaCourseFactory
 * @projectName design_pattern
 * @description: <h1>java课程产品族工厂</h1>
 * @date 2021/2/2410:10
 */
public class JavaCourseFactory implements CourseFactory{
    /**
     * <h2>获取java产品族下面的视频<h2/>
     * @return
     */
    public Video getVideo() {
        return new JavaVideo();
    }

    /**
     * <h2>获取java产品族下面的手记<h2/>
     * @return
     */
    public Article getArticle() {
        return new JavaArticle();
    }
}

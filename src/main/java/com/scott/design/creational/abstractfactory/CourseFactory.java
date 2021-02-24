package com.scott.design.creational.abstractfactory;

import com.scott.design.creational.abstractfactory.Video;

/**
 * @author xubr
 * @title: CourseFactory
 * @projectName design_pattern
 * @description: <h1>课程的抽象工厂</h1>
 * @date 2021/2/2410:04
 */
public interface CourseFactory {

    /**
     * <h2>获取同一个产品等级的视频<h2/>
     * @return
     */
    Video getVideo();

    /**
     * <h2>获取同一个产品等级的手记<h2/>
     * @return
     */
    Article getArticle();


}

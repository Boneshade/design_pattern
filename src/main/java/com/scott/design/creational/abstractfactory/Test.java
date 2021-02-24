package com.scott.design.creational.abstractfactory;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2410:18
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();//向上转型
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        video.produce();
        article.produce();
    }

}

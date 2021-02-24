package com.scott.design.creational.builder;

/**
 * @author xubr
 * @title: Coach
 * @projectName design_pattern
 * @description: <h1>ΩÃ¡∑</h1>
 * @date 2021/2/2414:28
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }


}

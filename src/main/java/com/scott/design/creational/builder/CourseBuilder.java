package com.scott.design.creational.builder;

/**
 * @author xubr
 * @title: CourseBuilder
 * @projectName design_pattern
 * @description: <h1>�γ̽�����</h1>
 * @date 2021/2/2411:13
 */
public abstract class CourseBuilder {

    /**
     * <h2>�����߽�������<h2/>
     * @param courseName
     */
    public abstract void buildCourseName(String courseName);

    /**
     * <h2>�����߽���ppt<h2/>
     * @param coursePPT
     */
    public abstract void buildCoursePPT(String coursePPT);

    /**
     * <h2>�����߽�����Ƶ<h2/>
     * @param courseVideo
     */
    public abstract void buildCourseVideo(String courseVideo);

    /**
     * <h2>�����߽�������<h2/>
     * @param courseArticle
     */
    public abstract void buildCourseArticle(String courseArticle);

    /**
     * <h2>�����߽�������<h2/>
     * @param courseQA
     */
    public abstract void buildCourseQA(String courseQA);

    /**
     * <h2>�����߽���γ�<h2/>
     */
    public abstract Course makeCourse();

}

package com.scott.design.behavioral.chainofresponsibility;

/**
 * @author xubr
 * @title: Course
 * @projectName design_pattern
 * @description: <h1>责任链模式-课程</h1>
 * @date 2021/3/59:52
 */
public class Course {

    private String name;

    private String article;

    private String video;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}

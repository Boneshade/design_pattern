package com.scott.design.behavioral.template_method;

/**
 * @author xubr
 * @title: ACourse
 * @projectName design_pattern
 * @description: <h1>模板模式</h1>
 * @date 2021/3/315:20
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();

        //如果子类重写会调用重写的方法
        if (needWriteArticle()) {
            this.writeArticle();
        }
    }

    final void makePPT() {
        System.out.println("制作ppt");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();


}

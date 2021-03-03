package com.scott.design.behavioral.template_method;

/**
 * @author xubr
 * @title: DesignPatternCourse
 * @projectName design_pattern
 * @description: <h1>设计模式课程</h1>
 * @date 2021/3/315:28
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}

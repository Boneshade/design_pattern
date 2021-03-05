package com.scott.design.behavioral.visitor;

/**
 * @author xubr
 * @title: FreeCourse
 * @projectName design_pattern
 * @description: <h1>免费课程</h1>
 * @date 2021/3/514:27
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

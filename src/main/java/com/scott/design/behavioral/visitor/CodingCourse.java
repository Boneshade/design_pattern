package com.scott.design.behavioral.visitor;

/**
 * @author xubr
 * @title: CodingCourse
 * @projectName design_pattern
 * @description: <h1>访问者模式-实战课程</h1>
 * @date 2021/3/514:25
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

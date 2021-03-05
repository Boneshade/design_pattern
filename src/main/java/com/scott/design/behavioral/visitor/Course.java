package com.scott.design.behavioral.visitor;

/**
 * Created by xubr
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void accept(IVisitor visitor);

}

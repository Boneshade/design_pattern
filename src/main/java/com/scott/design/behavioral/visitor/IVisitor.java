package com.scott.design.behavioral.visitor;

/**
 * Created by xubr
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}

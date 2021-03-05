package com.scott.design.behavioral.chainofresponsibility;

/**
 * @author xubr
 * @title: Approver
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/59:53
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);


}

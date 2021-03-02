package com.scott.design.structural.adapter.objectadapter;

/**
 * @author xubr
 * @title: Adapter
 * @projectName design_pattern
 * @description: <h1>不继承直接注入adaptee的方式</h1>
 * @date 2021/3/210:22
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}

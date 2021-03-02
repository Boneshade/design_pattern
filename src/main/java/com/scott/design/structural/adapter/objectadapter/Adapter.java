package com.scott.design.structural.adapter.objectadapter;

/**
 * @author xubr
 * @title: Adapter
 * @projectName design_pattern
 * @description: <h1>���̳�ֱ��ע��adaptee�ķ�ʽ</h1>
 * @date 2021/3/210:22
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}

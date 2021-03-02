package com.scott.design.structural.adapter.classadapter;

/**
 * @author xubr
 * @title: Adapter
 * @projectName design_pattern
 * @description: <h1>Adapter要适配Target使用Adaptee中的request方法</h1>
 * Adaptee 相当于5v锂电池 Target相当于220电压 Adapter就是一个准换头
 * @date 2021/3/210:03
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.adapteeRequest();
    }
}

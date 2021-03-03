package com.scott.design.structural.adapter.classadapter;

/**
 * @author xubr
 * @title: ConcreteTarget
 * @projectName design_pattern
 * @description: <h1>concreteTarget目标方法</h1>
 * @date 2021/3/210:12
 */
public class ConcreteTarget implements Target{

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}

package com.scott.design.base;

/**
 * @author xubr
 * @title: Chilgren2
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2316:59
 */
public class Children2 extends Father{

    @Override
    public void print() {
        System.out.println("Children2:print");
    }
    public void independentMethod() {
        System.out.println("Children2:independentMethod");
    }
}

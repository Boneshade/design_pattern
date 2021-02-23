package com.scott.design.base;

/**
 * @author xubr
 * @title: Children
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2316:37
 */
public class Children extends Father {
    @Override
    public void print() {
        System.out.println("Children:print");
    }
    public void independentMethod() {
        System.out.println("Children:independentMethod");
    }

}

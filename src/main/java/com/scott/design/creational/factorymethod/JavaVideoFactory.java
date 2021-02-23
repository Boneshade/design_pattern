package com.scott.design.creational.factorymethod;

/**
 * @author xubr
 * @title: JavaVideoFactory
 * @projectName design_pattern
 * @description: <h1>java ”∆µπ§≥ß</h1>
 * @date 2021/2/2316:00
 */
public class JavaVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new JavaVideo();
    }
}

package com.scott.design.behavioral.mediator;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>中介者模式测试对象</h1>
 * @date 2021/3/417:42
 */
public class Test {
    public static void main(String[] args) {
        User xubr = new User("xubr");
        User tom = new User("tom");

        xubr.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("Ok");

    }


}

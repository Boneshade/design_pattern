package com.scott.design.behavioral.mediator;

/**
 * @author xubr
 * @title: User
 * @projectName design_pattern
 * @description: <h1>中介者模式</h1>
 * @date 2021/3/417:39
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }

}

package com.scott.design.behavioral.observer;

/**
 * @author xubr
 * @title: Question
 * @projectName design_pattern
 * @description: <h1>观察者模式-问题类</h1>
 * @date 2021/3/413:52
 */
public class Question {

    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}

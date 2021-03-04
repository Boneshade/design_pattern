package com.scott.design.behavioral.mediator;

import java.util.Date;

/**
 * @author xubr
 * @title: StudyGroup
 * @projectName design_pattern
 * @description: <h1>相当于中间人</h1>
 * @date 2021/3/417:40
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] :" + message);
    }

}

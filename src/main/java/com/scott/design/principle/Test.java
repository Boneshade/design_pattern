package com.scott.design.principle;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: TODO
 * @date 2021/2/614:19
 */
public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java���㵽��ҵ�����̿���", 348d);
        System.out.println("�γ�ID:" + javaCourse.getId() + "�γ�����" + javaCourse.getName() + "�γ̼۸�" + javaCourse.getPrice());
    }

}

package com.scott.design.base;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2316:38
 */
public class Test {

    //    public static void main(String[] args) {
//        //����ת��(û��ʹ����������ķ���)
//        Father father = new Children();
//        father.print();
//    }
    public static void func(Father father) {
        father.print();

        if (father instanceof Children) {
            Children children = (Children) father; //����ת��,ͨ������ʵ��������
            children.independentMethod();//����children���еķ���
        }

        if (father instanceof Children2){
            Children2 children2= (Children2) father;
            children2.independentMethod();
        }
    }

    public static void main(String[] args) {
        //����ת��(û��ʹ����������ķ���)
        Father father = new Children();
        father.print();

        func(new Father());
        func(new Children());
        func(new Children2());
    }



}

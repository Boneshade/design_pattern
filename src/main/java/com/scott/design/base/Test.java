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
//        //向上转型(没法使用子类独立的方法)
//        Father father = new Children();
//        father.print();
//    }
    public static void func(Father father) {
        father.print();

        if (father instanceof Children) {
            Children children = (Children) father; //向下转型,通过父类实例化子类
            children.independentMethod();//调用children独有的方法
        }

        if (father instanceof Children2){
            Children2 children2= (Children2) father;
            children2.independentMethod();
        }
    }

    public static void main(String[] args) {
        //向上转型(没法使用子类独立的方法)
        Father father = new Children();
        father.print();

        func(new Father());
        func(new Children());
        func(new Children2());
    }



}

package com.scott.design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/2/2417:04
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        Thread t1 = new Thread(new TestThread());
//        Thread t2 = new Thread(new TestThread());
//        t1.start();
//        t2.start();
//        //������ʱ�����������߳� Thread@536��Thread@538
//        System.out.println("program end");

//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();




    }

}

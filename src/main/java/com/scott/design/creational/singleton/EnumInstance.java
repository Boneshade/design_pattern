package com.scott.design.creational.singleton;

/**
 * @author xubr 2021/2/28
 */
@SuppressWarnings("all")
public enum EnumInstance {

    INSTANCE {
        public void printTest() {
            System.out.println("xubr Print Test");
        }
    };

    //反编译结果:public abstract class EnumInstance extends Enum
    //
    public void printTest(){};

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}

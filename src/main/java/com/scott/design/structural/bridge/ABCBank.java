package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: ABCBank
 * @projectName design_pattern
 * @description: <h1>中国农业银行</h1>
 * @date 2021/3/217:32
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //调用所传进来账号的openAccount方法
//        所以，在运用迪米特法则时要注意以下 6 点。
//        在类的划分上，应该创建弱耦合的类。类与类之间的耦合越弱，就越有利于实现可复用的目标。
//        在类的结构设计上，尽量降低类成员的访问权限。
//        在类的设计上，优先考虑将一个类设置成不变类。
//        在对其他类的引用上，将引用其他对象的次数降到最低。
//        不暴露类的属性成员，而应该提供相应的访问器（set 和 get 方法）。
//        谨慎使用序列化（Serializable）功能。
//        account.openAccount();
        return account;
    }

}

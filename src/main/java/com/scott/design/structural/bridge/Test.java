package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/217:34
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        icbcBank.openAccount();
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        //为什么这个违背了迪米特?
        //答:对引用其他类的引用上,应该将引用其他对象的次数降到最低,此处abcAccount又调用了一次
        abcAccount.openAccount();
        abcAccount.showAccountType();
    }
}

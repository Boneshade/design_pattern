package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: SavingAccount
 * @projectName design_pattern
 * @description: <h1>死期账号</h1>
 * @date 2021/3/217:29
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}

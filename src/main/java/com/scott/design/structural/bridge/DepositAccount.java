package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: DepositAccount
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/217:31
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}

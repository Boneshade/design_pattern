package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: Bank
 * @projectName design_pattern
 * @description: <h1>����-�м������Ľ�ɫ��Account</h1>
 * @date 2021/3/217:28
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}

package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: Bank
 * @projectName design_pattern
 * @description: <h1>银行-中间桥梁的角色是Account</h1>
 * @date 2021/3/217:28
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}

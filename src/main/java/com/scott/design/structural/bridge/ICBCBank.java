package com.scott.design.structural.bridge;

/**
 * @author xubr
 * @title: ICBCBank
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/217:34
 */
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}

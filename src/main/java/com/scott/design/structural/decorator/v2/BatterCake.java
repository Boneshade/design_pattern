package com.scott.design.structural.decorator.v2;

/**
 * @author xubr
 * @title: Battercake
 * @projectName design_pattern
 * @description: <h1>װ����ģʽ</h1>
 * @date 2021/3/117:51
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "���";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

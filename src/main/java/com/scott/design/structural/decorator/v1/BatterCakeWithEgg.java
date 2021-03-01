package com.scott.design.structural.decorator.v1;

/**
 * @author xubr
 * @title: BatterCakeWithEgg
 * @projectName design_pattern
 * @description: <h1>������ӼӸ���</h1>
 * @date 2021/3/117:37
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "��һ������";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

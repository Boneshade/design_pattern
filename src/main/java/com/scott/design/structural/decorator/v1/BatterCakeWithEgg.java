package com.scott.design.structural.decorator.v1;

/**
 * @author xubr
 * @title: BatterCakeWithEgg
 * @projectName design_pattern
 * @description: <h1>煎饼果子加个蛋</h1>
 * @date 2021/3/117:37
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

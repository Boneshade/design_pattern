package com.scott.design.structural.decorator.v1;

/**
 * @author xubr
 * @title: BatterCakeWithEggSausage
 * @projectName design_pattern
 * @description: <h1>煎饼果子加一个鸡蛋</h1>
 * @date 2021/3/117:38
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

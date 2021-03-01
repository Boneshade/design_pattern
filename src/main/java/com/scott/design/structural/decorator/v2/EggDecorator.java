package com.scott.design.structural.decorator.v2;

/**
 * @author xubr
 * @title: EggDecorator
 * @projectName design_pattern
 * @description: <h1>鸡蛋装饰类</h1>
 * @date 2021/3/117:52
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBattercake) {
        super(aBattercake);
    }


    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

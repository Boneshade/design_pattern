package com.scott.design.structural.decorator.v2;

/**
 * @author xubr
 * @title: SausageDecorator
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/117:53
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " º”“ª∏˘œ„≥¶";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

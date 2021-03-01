package com.scott.design.structural.decorator.v2;

/**
 * @author xubr
 * @title: AbstractDecorator
 * @projectName design_pattern
 * @description: <h1>≥ÈœÛ◊∞ Œ¿‡</h1>
 * @date 2021/3/117:49
 */
public class AbstractDecorator extends ABatterCake {

    private ABatterCake aBattercake;

    public AbstractDecorator(ABatterCake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}

package com.scott.design.structural.decorator.v2;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {

        ABatterCake aBattercake;
        aBattercake = new BatterCake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());

    }
}

package com.scott.design.structural.decorator.v1;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/117:40
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 销售价格:" + batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格:" + batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格:" + batterCakeWithEggSausage.cost());


    }

}

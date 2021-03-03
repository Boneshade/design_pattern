package com.scott.design.behavioral.strategy;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/317:38
 */
public class Test {

    public static void main(String[] args) {
        //没有完全脱离if - else
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        promotionActivity618.executePromotionStrategy();


        String promotionKey = "MANJIAN";
        PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();

    }


}

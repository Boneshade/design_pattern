package com.scott.design.behavioral.strategy;

/**
 * @author xubr
 * @title: EmptyPromotionStrategy
 * @projectName design_pattern
 * @description: <h1>无促销活动类</h1>
 * @date 2021/3/317:35
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}

package com.scott.design.behavioral.strategy;

/**
 * @author xubr
 * @title: PromotionActivity
 * @projectName design_pattern
 * @description: <h1>促销活动</h1>
 * @date 2021/3/317:37
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}

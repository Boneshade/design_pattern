package com.scott.design.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xubr
 * @title: PromotionStrategyFactory
 * @projectName design_pattern
 * @description: <h1>促销策略工厂</h1>
 * @date 2021/3/317:40
 */
public class PromotionStrategyFactory {

    //容器单例促销对象
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();


    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}

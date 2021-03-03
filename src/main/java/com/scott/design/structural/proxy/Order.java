package com.scott.design.structural.proxy;

/**
 * @author xubr
 * @title: Order
 * @projectName design_pattern
 * @description: <h1>订单代理模式</h1>
 * @date 2021/3/310:58
 */
public class Order {

    /**
     * 订单信息
     */
    private Object orderInfo;

    /**
     *
     */
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

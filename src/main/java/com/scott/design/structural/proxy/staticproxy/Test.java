package com.scott.design.structural.proxy.staticproxy;

import com.scott.design.structural.proxy.Order;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/313:58
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

    }

}

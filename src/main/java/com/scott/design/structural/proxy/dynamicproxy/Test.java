package com.scott.design.structural.proxy.dynamicproxy;

import com.scott.design.structural.proxy.IOrderService;
import com.scott.design.structural.proxy.Order;
import com.scott.design.structural.proxy.OrderServiceImpl;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/314:24
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderServiceDynamicProxy = (IOrderService) new
                OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);

    }
}

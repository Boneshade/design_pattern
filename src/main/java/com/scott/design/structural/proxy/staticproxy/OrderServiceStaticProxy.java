package com.scott.design.structural.proxy.staticproxy;

import com.scott.design.structural.proxy.IOrderService;
import com.scott.design.structural.proxy.Order;
import com.scott.design.structural.proxy.OrderServiceImpl;
import com.scott.design.structural.proxy.db.DataSourceContextHolder;

/**
 * @author xubr
 * @title: OrderServiceStaticProxy
 * @projectName design_pattern
 * @description: <h1>订单服务静态代理类</h1>
 * @date 2021/3/313:53
 */
public class OrderServiceStaticProxy {

    //对orderService进行增强
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }


}

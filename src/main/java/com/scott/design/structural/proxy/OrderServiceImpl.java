package com.scott.design.structural.proxy;

/**
 * @author xubr
 * @title: OrderServiceImpl
 * @projectName design_pattern
 * @description: <h1>service实现类</h1>
 * @date 2021/3/311:02
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}

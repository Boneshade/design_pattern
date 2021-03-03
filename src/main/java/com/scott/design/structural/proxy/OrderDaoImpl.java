package com.scott.design.structural.proxy;

/**
 * @author xubr
 * @title: OrderDaoImpl
 * @projectName design_pattern
 * @description: <h1>dao层实现类</h1>
 * @date 2021/3/311:01
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}

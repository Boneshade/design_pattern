package com.scott.design.structural.proxy.dynamicproxy;

import com.scott.design.structural.proxy.Order;
import com.scott.design.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xubr
 * @title: OrderServiceDynamicProxy
 * @projectName design_pattern
 * @description: <h1>动态代理</h1>
 * @date 2021/3/314:05
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    //利用构造器将需要代理的类传入
    /**此处是第一步**/
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    //loader: 用哪个类加载器去加载代理对象
    //interfaces:动态代理类需要实现的接口
    //h:动态代理方法在执行时，会调用h里面的invoke方法去执行
    /**此处是第二步**/
    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),
                this);
    }

    //InvocationHandler对象成了代理对象和目标对象的桥梁，不像静态代理这么直接。
    /**在orderServiceDynamicProxy.saveOrder(order)之前**/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.proxy是可以使用反射获取代理对象的信息(也就是proxy.getClass.getName())
        //2.可以将代理对象返回以进行连续调用,这就是proxy存在的目的,因为this并不是代理对象
        Object argObject = args[0];
        beforeMethod(argObject);
        /**此处是调用OrderServiceImpl的saveOrder**/
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }


    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");

        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");


        //todo 设置dataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));

    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }


}

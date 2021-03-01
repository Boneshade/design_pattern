package com.scott.design.structural.decorator.v2;

/**
 * @author xubr
 * @title: ABatterCake
 * @projectName design_pattern
 * @description: <h1>煎饼果子抽象类</h1>
 * @date 2021/3/117:44
 */
public abstract class ABatterCake {

    /**获得描述的抽象方法**/
    protected abstract String getDesc();

    /**获得价钱的抽象方法**/
    protected abstract int cost();

}

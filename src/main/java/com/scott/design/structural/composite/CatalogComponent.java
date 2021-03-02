package com.scott.design.structural.composite;

import java.math.BigDecimal;

/**
 * @author xubr
 * @title: CatalogComponent
 * @projectName design_pattern
 * @description: <h1>组合模式 课程组件</h1>
 * @date 2021/3/215:09
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
      throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public BigDecimal getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}

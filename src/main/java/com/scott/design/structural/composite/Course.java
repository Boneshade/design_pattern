package com.scott.design.structural.composite;

import java.math.BigDecimal;

/**
 * @author xubr
 * @title: Course
 * @projectName design_pattern
 * @description: <h1>组合模式-课程</h1>
 * @date 2021/3/215:13
 */
public class Course extends CatalogComponent {

    private String name;

    private BigDecimal price;

    public Course(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public BigDecimal getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " Price:" + price);
    }
}

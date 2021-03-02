package com.scott.design.structural.composite;

import java.math.BigDecimal;

/**
 * Created by xubr
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", BigDecimal.valueOf(11));
        CatalogComponent windowsCourse = new Course("Windows课程",BigDecimal.valueOf(11));

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",BigDecimal.valueOf(55));
        CatalogComponent mmallCourse2 = new Course("Java电商二期",BigDecimal.valueOf(66));
        CatalogComponent designPattern = new Course("Java设计模式",BigDecimal.valueOf(77));

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();



    }
}

package com.scott.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xubr
 * @title: EmployeeFactory
 * @projectName design_pattern
 * @description: <h1>雇员工厂</h1>
 * @date 2021/3/214:10
 */
public class EmployeeFactory {

    //容器单例
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理:" + department);
            String reportContent = department + "部门汇报:此次汇报的主要内容是......";
            manager.setReportContent(reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }


}

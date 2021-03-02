package com.scott.design.structural.flyweight;

/**
 * @author xubr
 * @title: Manager
 * @projectName design_pattern
 * @description: <h1></h1>
 * @date 2021/3/214:07
 */
public class Manager implements Employee {

    private String title;

    //����һ���ⲿ����
    /**����**/
    private String department;
    //�㱨
    private String reportContent;

    @Override
    public void report() {
        System.out.println();
    }

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportContent() {
        return reportContent;
    }
}

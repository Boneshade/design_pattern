package com.scott.design.structural.proxy.db;

/**
 * @author xubr
 * @title: DataSourceContextHolder
 * @projectName design_pattern
 * @description: <h1>模拟的数据源上下文</h1>
 * @date 2021/3/311:05
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }



}

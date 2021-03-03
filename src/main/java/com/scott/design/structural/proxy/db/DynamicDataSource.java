package com.scott.design.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author xubr
 * @title: DynamicDataSource
 * @projectName design_pattern
 * @description: <h1>AbstractRoutingDataSource根据用户的定义的规则选择当前的数据源</h1>
 * @date 2021/3/311:23
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    //AbstractRoutingDataSource根据用户定义的规则选择当前的数据源,
    // 这样我们可以在执行查询之前,设置使用的数据源。

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }


    //实际上改的是这里key的值
    //	<bean id="dataSource" class="com.geely.design.pattern.structural.proxy.db.DynamicDataSource">
//		<property name="targetDataSources">
//			<map key-type="java.lang.String">
//				<entry value-ref="db0" key="db0"></entry>
//				<entry value-ref="db1" key="db1"></entry>
//			</map>
//		</property>
//		<property name="defaultTargetDataSource" ref="db0"></property>
//	</bean>
}

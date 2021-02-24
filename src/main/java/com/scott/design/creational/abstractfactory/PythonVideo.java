package com.scott.design.creational.abstractfactory;

/**
 * @author xubr
 * @title: PythonVideo
 * @projectName design_pattern
 * @description: <h1>python视频(与javaVideo属于同一个产品等级)</h1>
 * @date 2021/2/2410:14
 */
public class PythonVideo extends Video{
    /**
     * <h2>python视频生产<h2/>
     */
    public void produce() {
        System.out.println("python视频");
    }
}

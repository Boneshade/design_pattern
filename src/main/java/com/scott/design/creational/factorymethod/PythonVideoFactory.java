package com.scott.design.creational.factorymethod;

/**
 * @author xubr
 * @title: PythonVideoFactory
 * @projectName design_pattern
 * @description: <h1>python��Ƶ���ɹ���</h1>
 * @date 2021/2/2316:01
 */
public class PythonVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new PythonVideo();
    }
}

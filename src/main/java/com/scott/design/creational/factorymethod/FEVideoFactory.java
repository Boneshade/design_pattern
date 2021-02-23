package com.scott.design.creational.factorymethod;

/**
 * @author xubr
 * @title: FEVideoFactory
 * @projectName design_pattern
 * @description: <h1>ǰ����Ƶ����</h1>
 * @date 2021/2/2316:03
 */
public class FEVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new FEVideo();
    }
}

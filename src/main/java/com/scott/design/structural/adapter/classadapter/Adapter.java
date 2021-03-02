package com.scott.design.structural.adapter.classadapter;

/**
 * @author xubr
 * @title: Adapter
 * @projectName design_pattern
 * @description: <h1>AdapterҪ����Targetʹ��Adaptee�е�request����</h1>
 * Adaptee �൱��5v﮵�� Target�൱��220��ѹ Adapter����һ��׼��ͷ
 * @date 2021/3/210:03
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.adapteeRequest();
    }
}

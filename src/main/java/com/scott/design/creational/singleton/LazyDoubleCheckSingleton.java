package com.scott.design.creational.singleton;

/**
 * @author xubr
 * @title: LazyDoubleCheckSingleton
 * @projectName design_pattern
 * @description: <h1>˫��У����ʵ�ֶ�����</h1>
 * @date 2021/2/2611:04
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }


    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1.�����ڴ���������
                    //2.��ʼ������
                    //3.����LazyDoubleCheckSingleton ָ����ڴ����ĵ�ַ
                    //4.JVM����������ܻᵼ�¶��߳�����³�������,
                    // ������Ҫʹ��volatile�ؼ��ֲ���������
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }


}

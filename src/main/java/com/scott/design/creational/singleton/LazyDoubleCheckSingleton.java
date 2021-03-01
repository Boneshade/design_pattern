package com.scott.design.creational.singleton;

/**
 * @author xubr 2021/2/26
 * @author xubr
 * @title: LazyDoubleCheckSingleton
 * @projectName design_pattern
 * @description: <h1>˫��У����ʵ�ֶ�����</h1>
 * ʵ������һ����Ķ�����̾���һ�����͵ĵݹ����
 * ������ִ��ʵ��������ʼ����ʵ��������ʼ������ִ�й��캯����ʼ����Ҳ����˵���������Ὣʵ��������ʼ����ʵ��������ʼ����ش���ŵ���Ĺ��캯����ȥ��
 * ������Щ����ᱻ���ڶԳ��๹�캯���ĵ������֮�󣬹��캯������Ĵ���֮ǰ
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

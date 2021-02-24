package com.scott.design.creational.singleton;

/**
 * @author xubr
 * @title: LazySingleton
 * @projectName design_pattern
 * @description: <h1>¿¡∫∫ Ω</h1>
 * @date 2021/2/2416:59
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    public synchronized static LazySingleton getInstance() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}

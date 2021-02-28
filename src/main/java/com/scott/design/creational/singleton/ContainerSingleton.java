package com.scott.design.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xubr 2021/2/28
 * <h1>容器单例<h1/>
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) & instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}

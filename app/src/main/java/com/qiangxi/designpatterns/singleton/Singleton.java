package com.qiangxi.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器方式实现单例类
 */
public class Singleton {
    private static Map<String, Object> singletonMap = new HashMap<>();

    private Singleton() {
    }

    public static void registerSingleton(String key, Object instance) {
        if (!singletonMap.containsKey(key)) {
            singletonMap.put(key, instance);
        }
    }

    public static Object getSingleton(String key) {
        return singletonMap.get(key);
    }

    public static void unRegisterSingleton(String key) {
        if (singletonMap.containsKey(key)) {
            singletonMap.remove(key);
        }
    }
}

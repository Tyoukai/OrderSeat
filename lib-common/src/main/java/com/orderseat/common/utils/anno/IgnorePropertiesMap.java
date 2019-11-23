package com.orderseat.common.utils.anno;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: tyoukai
 * @date: 2019-11-23 12:45
 * @description: 忽略的属性map
 * @version: v1.0
 */
public class IgnorePropertiesMap {
    public static Map<Class, String[]> ignoreMap = new ConcurrentHashMap<>();


    /**
     * 保存类与类中标记为IgnoreProperties的属性
     * 格式 ****model ->  ***fieldName
     *
     * @param clazz
     */
    public static void register(Class clazz) {
        if (ignoreMap.get(clazz) != null) {
            return;
        }

        List<String> ignoreFieldList = new ArrayList<>();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.getAnnotation(IgnoreProperties.class) != null) {
                ignoreFieldList.add(field.getName());
            }
        }

        ignoreMap.putIfAbsent(clazz, ignoreFieldList.toArray(new String[ignoreFieldList.size()]));
    }

    /**
     * 通过类名获取对应需要忽略的属性名称
     *
     * @param clazz
     * @return
     */
    public static String[] getProperties(Class clazz) {
        return ignoreMap.get(clazz);
    }
}

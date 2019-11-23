package com.orderseat.common.utils.system;


import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author: tyoukai
 * @date: 2019-11-23 10:24
 * @description: 查询参数
 * @version: v1.0
 */
public class QueryParams {

    public static final Map<String, Object> EMPTY = new HashMap<>();

    private Map<String, Object> params = new HashMap<>();

    /**
     * 创建对象
     *
     * @return
     */
    public static QueryParams create() {
        return new QueryParams();
    }

    /**
     * 添加参数
     *
     * @param paramName
     * @param paramValue
     * @return
     */
    public QueryParams add(String paramName, Object paramValue) {
        if (paramValue != null) {
            params.put(paramName, paramValue);
        }
        return this;
    }

    /**
     * 分页
     *
     * @param start
     * @param limit
     * @return
     */
    public QueryParams limit(int start, int limit) {
        params.put("start", start);
        params.put("limit", limit);
        return this;
    }

    /**
     * 返回结果
     *
     * @return
     */
    public Map<String, Object> build() {
        return params;
    }

    /**
     * 获取指定类型
     *
     * @param key
     * @param clazz
     * @param defaultValue
     * @param <T>
     * @return
     */
    public <T> T get(String key, Class<T> clazz, T defaultValue) {
        Object v = params.get(key);
        if (v != null) {
            return (T) v;
        }

        return defaultValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(params);
    }
}


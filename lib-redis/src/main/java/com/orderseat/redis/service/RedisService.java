package com.orderseat.redis.service;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author: tyoukai
 * @date: 2019-11-24 20:47
 * @description: redis封装类
 * @version: v1.0
 */
public class RedisService {

    /**
     * redisTemplate模板类
     */
    private RedisTemplate<String, Object> redisTemplate;

    public RedisService() {
    }

    public RedisService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}

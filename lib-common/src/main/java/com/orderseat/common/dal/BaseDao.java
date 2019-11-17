package com.orderseat.common.dal;

import java.util.List;
import java.util.Map;

/**
 * @author: tyoukai
 * @date: 2019-11-17
 * @description: 基础Dao
 * @version: v1.0
 */
public interface BaseDao<B extends BaseBean> {
    /**
     * 增加
     *
     * @param bean
     */
    void add(B bean);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    B queryById(String id);

    /**
     * 删除
     *
     * @param id
     */
    void deleteById(String id);

    /**
     * 更新
     *
     * @param bean
     */
    void updateById(B bean);

    /**
     * 条件查询
     *
     * @param params
     * @return
     */
    List<B> search(Map<String, Object> params);

    /**
     * 统计
     *
     * @param params
     * @return
     */
    long count(Map<String, Object> params);

}

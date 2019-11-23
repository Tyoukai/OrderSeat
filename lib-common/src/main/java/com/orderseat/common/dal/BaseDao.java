package com.orderseat.common.dal;

import com.orderseat.common.utils.system.QueryParams;

import java.util.List;

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
     * @param queryParams
     * @return
     */
    List<B> search(QueryParams queryParams);

    /**
     * 统计
     *
     * @param queryParams
     * @return
     */
    long count(QueryParams queryParams);

}

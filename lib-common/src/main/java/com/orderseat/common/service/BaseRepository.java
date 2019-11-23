package com.orderseat.common.service;

import com.orderseat.common.dal.BaseModel;
import com.orderseat.common.utils.system.QueryParams;

import java.util.List;

/**
 * @author: tyoukai
 * @date: 2019-11-23 10:15
 * @description: 基础仓储类
 * @version: v1.0
 */
public interface BaseRepository<M extends BaseModel> {
    /**
     *
     * @param model
     */
    void add(M model);

    /**
     *
     * @param id
     * @return
     */
    M queryById(String id);

    /**
     *
     * @param id
     */
    void deleteById(String id);

    /**
     *
     * @param model
     */
    void updateById(M model);

    /**
     *
     * @param queryParams
     * @return
     */
    List<M> search(QueryParams queryParams);

    /**
     *
     * @param queryParams
     * @return
     */
    long count(QueryParams queryParams);

}

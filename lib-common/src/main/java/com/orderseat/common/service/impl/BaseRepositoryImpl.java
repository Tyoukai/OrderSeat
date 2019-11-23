package com.orderseat.common.service.impl;

import com.orderseat.common.dal.BaseBean;
import com.orderseat.common.dal.BaseModel;
import com.orderseat.common.utils.system.QueryParams;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @author: tyoukai
 * @date: 2019-11-23 10:15
 * @description: 基础仓储类实现
 * @version: v1.0
 */
public abstract class BaseRepositoryImpl<B extends BaseBean, M extends BaseModel> {

    public void add(M model) {

    }

    public M queryById(String id) {
        return null;
    }

    public void deleteById(String id) {

    }

    public void updateById(M model) {

    }


    public List search(QueryParams queryParams) {
        return null;
    }

    public long count(QueryParams queryParams) {
        return 0;
    }

    protected B convert2Bean(M model) {
        if (model == null) {
            return null;
        }
        return null;
    }

    public abstract B doConvert2Bean(M model);
}

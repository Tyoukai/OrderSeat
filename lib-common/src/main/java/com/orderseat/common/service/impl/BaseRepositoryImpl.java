package com.orderseat.common.service.impl;

import com.orderseat.common.dal.BaseBean;
import com.orderseat.common.dal.BaseDao;
import com.orderseat.common.dal.BaseModel;
import com.orderseat.common.utils.anno.IgnorePropertiesMap;
import com.orderseat.common.utils.system.QueryParams;
import org.springframework.beans.BeanUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: tyoukai
 * @date: 2019-11-23 10:15
 * @description: 基础仓储类实现
 * @version: v1.0
 */
public abstract class BaseRepositoryImpl<B extends BaseBean, M extends BaseModel> {

    /**
     * 获取具体的dao，在实现类中指定
     *
     * @return
     */
    protected abstract BaseDao<B> getDao();

    /**
     * 保存具体repository类对应的具体model
     *
     *   key:***repository   value: ***model
     */
    private Map<Class, Class<M>> CLASS_M = new ConcurrentHashMap<>();

    /**
     * 保存具体repository类对应的具体bean
     *
     *   key:***repository   value: ***bean
     */
    private Map<Class, Class<B>> CLASS_B = new ConcurrentHashMap<>();

    @PostConstruct
    private void init() {
        IgnorePropertiesMap.register(ifNotHasPutMAndThenGetM());
    }

    public void add(M model) {
        if (model == null) {
            return;
        }

        B bean = convert2Bean(model);
        this.getDao().add(bean);
    }

    public M queryById(String id) {
        B bean = this.getDao().queryById(id);
        return covert2Model(bean);
    }

    public void deleteById(String id) {
        this.getDao().deleteById(id);
    }

    public void updateById(M model) {
        B bean = convert2Bean(model);
        this.getDao().updateById(bean);
    }


    public List search(QueryParams queryParams) {
        return this.getDao().search(queryParams);
    }

    public long count(QueryParams queryParams) {
        return this.getDao().count(queryParams);
    }

    protected B convert2Bean(M model) {
        if (model == null) {
            return null;
        }

        B bean = newRealBean();
        BeanUtils.copyProperties(model, bean, IgnorePropertiesMap.getProperties(ifNotHasPutMAndThenGetM()));
        doConvert2Bean(bean, model);

        return bean;
    }

    protected M covert2Model(B bean) {
        if (bean == null) {
            return null;
        }

        M model = newRealModel();
        BeanUtils.copyProperties(bean, model, IgnorePropertiesMap.getProperties(ifNotHasPutBAndThenGetB()));
        doConvert2Model(bean, model);
        return model;
    }

    private Class<M> ifNotHasPutMAndThenGetM() {
        Class clazz = CLASS_M.get(getClass());
        if (clazz != null) {
            return clazz;
        }
        CLASS_M.putIfAbsent(getClass(), (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        return CLASS_M.get(getClass());
    }

    private Class<B> ifNotHasPutBAndThenGetB() {
        Class clazz = CLASS_B.get(getClass());
        if (clazz != null) {
            return clazz;
        }
        CLASS_B.putIfAbsent(getClass(), (Class<B>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        return CLASS_B.get(getClass());
    }

    private B newRealBean() {
        Class<B> clazz = ifNotHasPutBAndThenGetB();
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private M newRealModel() {
        Class<M> clazz = ifNotHasPutMAndThenGetM();
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract void doConvert2Bean(B bean, M model);

    public abstract void doConvert2Model(B bean, M model);
}

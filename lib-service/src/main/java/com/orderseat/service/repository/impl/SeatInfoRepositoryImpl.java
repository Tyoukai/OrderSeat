package com.orderseat.service.repository.impl;

import com.orderseat.common.dal.BaseDao;
import com.orderseat.common.enums.SeatTypeEnum;
import com.orderseat.common.service.impl.BaseRepositoryImpl;
import com.orderseat.dal.bean.SeatBean;
import com.orderseat.dal.dao.SeatDao;
import com.orderseat.dal.model.SeatModel;
import com.orderseat.service.repository.SeatInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: tyoukai
 * @date: 2019-11-23 15:32
 * @description: 座位仓储类实现
 * @version: v1.0
 */
@Repository
public class SeatInfoRepositoryImpl extends BaseRepositoryImpl<SeatBean, SeatModel> implements SeatInfoRepository {

    @Autowired
    private SeatDao dao;

    @Override
    protected BaseDao<SeatBean> getDao() {
        return this.dao;
    }

    @Override
    public void doConvert2Bean(SeatBean bean, SeatModel model) {
        if (bean == null || model == null) {
            return;
        }
        bean.setSeatType(model.getSeatTypeEnum().getCode());
    }

    @Override
    public void doConvert2Model(SeatBean bean, SeatModel model) {
        if (bean == null || model == null ) {
            return;
        }
        model.setSeatTypeEnum(SeatTypeEnum.getEnumByCode(bean.getSeatType()));
    }
}

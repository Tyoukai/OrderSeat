package com.orderseat.service.repository.impl;

import com.orderseat.common.dal.BaseDao;
import com.orderseat.common.enums.ValidEnum;
import com.orderseat.common.service.impl.BaseRepositoryImpl;
import com.orderseat.dal.bean.SeatOccupyTimeBean;
import com.orderseat.dal.dao.SeatOccupyTimeDao;
import com.orderseat.dal.model.SeatOccupyTimeModel;
import com.orderseat.service.repository.OrderSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: tyoukai
 * @date: 2019-11-23 15:32
 * @description: 占座仓储类实现
 * @version: v1.0
 */
public class OrderSeatRepositoryImpl extends BaseRepositoryImpl<SeatOccupyTimeBean, SeatOccupyTimeModel> implements OrderSeatRepository {

    @Autowired
    private SeatOccupyTimeDao dao;

    @Override
    protected BaseDao<SeatOccupyTimeBean> getDao() {
        return this.dao;
    }

    @Override
    public void doConvert2Bean(SeatOccupyTimeBean bean, SeatOccupyTimeModel model) {
        bean.setValid(model.getValid().getCode());
    }

    @Override
    public void doConvert2Model(SeatOccupyTimeBean bean, SeatOccupyTimeModel model) {
        model.setValid(ValidEnum.getEnumByCode(bean.getValid()));
    }
}

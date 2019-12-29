package com.orderseat.service.facade;

import com.orderseat.common.enums.SeatTypeEnum;
import com.orderseat.common.utils.system.COMMON;
import com.orderseat.common.utils.system.QueryParams;
import com.orderseat.dal.model.SeatModel;
import com.orderseat.facade.SeatInfoService;
import com.orderseat.facade.dto.SeatInfoDto;
import com.orderseat.facade.enums.ResultCodeEnum;
import com.orderseat.facade.request.SeatInfoRequest;
import com.orderseat.facade.response.SeatInfoResponse;
import com.orderseat.service.repository.SeatInfoRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TException;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: tyoukai
 * @date: 2019-11-22 12:37
 * @description: 座位查询实现类
 * @version: v1.0
 */
public class SeatInfoServiceImpl implements SeatInfoService.Iface {
    @Resource(name = "SeatInfoRepositoryImpl")
    private SeatInfoRepository seatInfoRepository;

    @Override
    public SeatInfoResponse search(SeatInfoRequest request) throws TException {
        SeatInfoResponse seatInfoResponse = new SeatInfoResponse();
        try {
            SeatInfoDto seatInfoDto = request.getSeatInfoDto();
            QueryParams params = assemblingParams(seatInfoDto);
            List<SeatModel> seatModelList = seatInfoRepository.search(params);
            List<SeatInfoDto> seatInfoDtoList = seatModelList.stream().map(this::convert2SeatInfoDto).collect(Collectors.toList());
            seatInfoResponse.setSeatInfoDtoList(seatInfoDtoList);
            seatInfoResponse.setResultCode(ResultCodeEnum.SUCCESS);
            seatInfoResponse.setDesc("查询结果成功");
        } catch (Exception e) {
            e.printStackTrace();
            seatInfoResponse.setResultCode(ResultCodeEnum.FAIL);
            seatInfoResponse.setDesc("查询异常,请检查OrderSeat系统");
        }
        return seatInfoResponse;
    }

    @Override
    public SeatInfoResponse add(SeatInfoRequest request) throws TException {
        SeatInfoResponse seatInfoResponse = new SeatInfoResponse();
        try {
            SeatInfoDto seatInfoDto = request.getSeatInfoDto();
            SeatModel seatModel = this.convert2SeatModel(seatInfoDto);
            seatInfoRepository.add(seatModel);
            seatInfoResponse.setResultCode(ResultCodeEnum.SUCCESS);
            seatInfoResponse.setDesc("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            seatInfoResponse.setResultCode(ResultCodeEnum.FAIL);
            seatInfoResponse.setDesc("添加异常,请检查OrderSeat系统");
        }
        return seatInfoResponse;
    }

    @Override
    public SeatInfoResponse deleteSeat(SeatInfoRequest request) throws TException {
        SeatInfoResponse seatInfoResponse = new SeatInfoResponse();
        try {
            SeatInfoDto seatInfoDto = request.getSeatInfoDto();
            String id = seatInfoDto.getId();
            seatInfoRepository.deleteById(id);
            seatInfoResponse.setResultCode(ResultCodeEnum.SUCCESS);
            seatInfoResponse.setDesc("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            seatInfoResponse.setResultCode(ResultCodeEnum.FAIL);
            seatInfoResponse.setDesc("删除异常,请检查OrderSeat系统");
        }
        return seatInfoResponse;
    }

    /**
     * 组装参数
     *
     * @param seatInfoDto
     * @return
     */
    private QueryParams assemblingParams(SeatInfoDto seatInfoDto) {
        if (seatInfoDto == null) {
            return null;
        }
        QueryParams params = QueryParams.create();
        if (StringUtils.isNotBlank(seatInfoDto.getId())) {
            params.add("id", seatInfoDto.getId());
        } else if (StringUtils.isNotBlank(seatInfoDto.getBuildingId())) {
            params.add("buildingId", seatInfoDto.getBuildingId());
        } else if (StringUtils.isNotBlank(seatInfoDto.getFloorId())) {
            params.add("floorId", seatInfoDto.getFloorId());
        } else if (StringUtils.isNotBlank(seatInfoDto.getSeatType())) {
            params.add("seatType", seatInfoDto.getSeatType());
        }
        return params;
    }

    private SeatInfoDto convert2SeatInfoDto(SeatModel seatModel) {
        SeatInfoDto seatInfoDto = new SeatInfoDto();
        BeanUtils.copyProperties(seatModel, seatInfoDto);
        return seatInfoDto;
    }

    private  SeatModel convert2SeatModel(SeatInfoDto seatInfoDto) {
        SeatModel seatModel = new SeatModel();
        BeanUtils.copyProperties(seatInfoDto, seatModel);
        if (StringUtils.equals(seatInfoDto.getSeatType(), COMMON.SEAT_TYPE_COMMON)) {
            seatModel.setSeatTypeEnum(SeatTypeEnum.COMMON);
        } else {
            seatModel.setSeatTypeEnum(SeatTypeEnum.ELEGANT);
        }
        return seatModel;
    }
}

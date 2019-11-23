include "../dto/SeatInfoDto.thrift"
include "../enums/ResultCodeEnum.thrift"

namespace java com.orderseat.facade.response

struct SeatInfoResponse {
    1: list<SeatInfoDto.SeatInfoDto> seatInfoDtoList;
    2: ResultCodeEnum.ResultCodeEnum resultCode;
    3: string desc;
}

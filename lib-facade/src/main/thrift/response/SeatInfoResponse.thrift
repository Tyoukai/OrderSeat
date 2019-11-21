include "../dto/SeatInfoDto.thrift"

namespace java com.orderseat.facade.response

struct SeatInfoResponse {
    1: list<SeatInfoDto.SeatInfoDto> seatInfoDtoList;
    2: string resultCode;
    3: string desc;
}

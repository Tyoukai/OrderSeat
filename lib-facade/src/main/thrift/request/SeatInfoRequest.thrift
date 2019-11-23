include "../dto/SeatInfoDto.thrift"

namespace java com.orderseat.facade.request

struct SeatInfoRequest {
    1: required SeatInfoDto.SeatInfoDto seatInfoDto;
    2: i32 pageNum;
    3: i32 pageSize;
}

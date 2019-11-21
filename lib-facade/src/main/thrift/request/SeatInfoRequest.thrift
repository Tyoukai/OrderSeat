include "../dto/SeatInfoDto.thrift"

namespace java com.orderseat.facade.request

struct SeatInfoRequest {
    1: SeatInfoDto.SeatInfoDto seatInfoDto;
    2: required string opt;  // 增0，删1，改3，查4，其他5
    3: i32 pageNum;
    4: i32 pageSize;
}

include "../dto/OrderSeatDto.thrift"

namespace java com.orderseat.facade.response

struct Result {
    1: required OrderSeatDto.OrderSeatDto orderSeatDto;
    // 占座的状态， 成功0，失败1，等待2
    2: required string status;
}

struct OrderSeatResponse {
    1: list<Result> seatResult;
}

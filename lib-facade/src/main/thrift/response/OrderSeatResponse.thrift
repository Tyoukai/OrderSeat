namespace java com.orderseat.facade.response

struct result {
    1: required string seatId;
    // 占座的状态， 成功0，失败1，等待2
    2: required string status;
}

struct OrderSeatResponse {
    1: list<result> seatResult;
}

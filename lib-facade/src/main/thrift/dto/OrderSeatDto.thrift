namespace java com.orderseat.facade.dto

struct OrderSeatDto {
    1: required string id;           // 座位的id
    2: required string startTime;    // 开始时间
    3: required string endTime;      // 结束时间
    4: required string userId;       // 定座位的用户
}

include "../dto/OrderSeatDto.thrift"

namespace java com.orderseat.facade.response

struct {
    1: required string status;   // 占座的状态， 成功0，失败1，等待2
}

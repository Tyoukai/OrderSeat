include "request/OrderSeatRequest.thrift"
include "response/OrderSeatResponse.thrift"

namespace java com.orderseat.facade

service OrderSeatService {
    OrderSeatResponse.OrderSeatResponse orderSeat(1:OrderSeatRequest.OrderSeatRequest request)
}

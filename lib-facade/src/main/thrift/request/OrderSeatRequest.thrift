include "../dto/OrderSeatDto.thrift"

namespace java com.orderseat.facade.request

struct OrderSeatRequest {
    1: required list<OrderSeatDto.OrderSeatDto> orderSeatDtoList;
}

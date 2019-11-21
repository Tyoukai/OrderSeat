include "request/SeatInfoRequest.thrift"
include "response/SeatInfoResponse.thrift"

namespace java com.orderseat.facade

service SeatInfoService {
    SeatInfoResponse.SeatInfoResponse search(1: SeatInfoRequest.SeatInfoRequest request)

    SeatInfoResponse.SeatInfoResponse add(1: SeatInfoRequest.SeatInfoRequest request)

    SeatInfoResponse.SeatInfoResponse deleteSeat(1: SeatInfoRequest.SeatInfoRequest request)
}

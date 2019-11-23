namespace java com.orderseat.facade.dto

struct SeatInfoDto {
    1: optional string id;
    2: optional string buildingId;
    3: optional string floorId;
    4: optional string seatType;
    5: optional string desc;
    6: optional i64 gmtCreateTime;
    7: optional i64 gmtModifiedTime;
}

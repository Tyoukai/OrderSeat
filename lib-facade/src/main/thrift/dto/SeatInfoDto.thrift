namespace java com.orderseat.facade.dto

struct SeatInfoDto {
    1: required string id;
    2: optional string buildingId;
    3: optional string floorId;
    4: optional string desc;
    5: optional i64 gmtCreateTime;
    6: optional i64 gmtModifiedTime;
}

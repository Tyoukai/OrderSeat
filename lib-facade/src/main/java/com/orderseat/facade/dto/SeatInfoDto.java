/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-06")
public class SeatInfoDto implements org.apache.thrift.TBase<SeatInfoDto, SeatInfoDto._Fields>, java.io.Serializable, Cloneable, Comparable<SeatInfoDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SeatInfoDto");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BUILDING_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildingId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FLOOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("floorId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SEAT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("seatType", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField GMT_CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("gmtCreateTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField GMT_MODIFIED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("gmtModifiedTime", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SeatInfoDtoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SeatInfoDtoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String buildingId; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String floorId; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String seatType; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String desc; // optional
  public long gmtCreateTime; // optional
  public long gmtModifiedTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    BUILDING_ID((short)2, "buildingId"),
    FLOOR_ID((short)3, "floorId"),
    SEAT_TYPE((short)4, "seatType"),
    DESC((short)5, "desc"),
    GMT_CREATE_TIME((short)6, "gmtCreateTime"),
    GMT_MODIFIED_TIME((short)7, "gmtModifiedTime");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // BUILDING_ID
          return BUILDING_ID;
        case 3: // FLOOR_ID
          return FLOOR_ID;
        case 4: // SEAT_TYPE
          return SEAT_TYPE;
        case 5: // DESC
          return DESC;
        case 6: // GMT_CREATE_TIME
          return GMT_CREATE_TIME;
        case 7: // GMT_MODIFIED_TIME
          return GMT_MODIFIED_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GMTCREATETIME_ISSET_ID = 0;
  private static final int __GMTMODIFIEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.BUILDING_ID,_Fields.FLOOR_ID,_Fields.SEAT_TYPE,_Fields.DESC,_Fields.GMT_CREATE_TIME,_Fields.GMT_MODIFIED_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUILDING_ID, new org.apache.thrift.meta_data.FieldMetaData("buildingId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FLOOR_ID, new org.apache.thrift.meta_data.FieldMetaData("floorId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEAT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("seatType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GMT_CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("gmtCreateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GMT_MODIFIED_TIME, new org.apache.thrift.meta_data.FieldMetaData("gmtModifiedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SeatInfoDto.class, metaDataMap);
  }

  public SeatInfoDto() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SeatInfoDto(SeatInfoDto other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetBuildingId()) {
      this.buildingId = other.buildingId;
    }
    if (other.isSetFloorId()) {
      this.floorId = other.floorId;
    }
    if (other.isSetSeatType()) {
      this.seatType = other.seatType;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
    this.gmtCreateTime = other.gmtCreateTime;
    this.gmtModifiedTime = other.gmtModifiedTime;
  }

  public SeatInfoDto deepCopy() {
    return new SeatInfoDto(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.buildingId = null;
    this.floorId = null;
    this.seatType = null;
    this.desc = null;
    setGmtCreateTimeIsSet(false);
    this.gmtCreateTime = 0;
    setGmtModifiedTimeIsSet(false);
    this.gmtModifiedTime = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public SeatInfoDto setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBuildingId() {
    return this.buildingId;
  }

  public SeatInfoDto setBuildingId(@org.apache.thrift.annotation.Nullable java.lang.String buildingId) {
    this.buildingId = buildingId;
    return this;
  }

  public void unsetBuildingId() {
    this.buildingId = null;
  }

  /** Returns true if field buildingId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildingId() {
    return this.buildingId != null;
  }

  public void setBuildingIdIsSet(boolean value) {
    if (!value) {
      this.buildingId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFloorId() {
    return this.floorId;
  }

  public SeatInfoDto setFloorId(@org.apache.thrift.annotation.Nullable java.lang.String floorId) {
    this.floorId = floorId;
    return this;
  }

  public void unsetFloorId() {
    this.floorId = null;
  }

  /** Returns true if field floorId is set (has been assigned a value) and false otherwise */
  public boolean isSetFloorId() {
    return this.floorId != null;
  }

  public void setFloorIdIsSet(boolean value) {
    if (!value) {
      this.floorId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSeatType() {
    return this.seatType;
  }

  public SeatInfoDto setSeatType(@org.apache.thrift.annotation.Nullable java.lang.String seatType) {
    this.seatType = seatType;
    return this;
  }

  public void unsetSeatType() {
    this.seatType = null;
  }

  /** Returns true if field seatType is set (has been assigned a value) and false otherwise */
  public boolean isSetSeatType() {
    return this.seatType != null;
  }

  public void setSeatTypeIsSet(boolean value) {
    if (!value) {
      this.seatType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDesc() {
    return this.desc;
  }

  public SeatInfoDto setDesc(@org.apache.thrift.annotation.Nullable java.lang.String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public long getGmtCreateTime() {
    return this.gmtCreateTime;
  }

  public SeatInfoDto setGmtCreateTime(long gmtCreateTime) {
    this.gmtCreateTime = gmtCreateTime;
    setGmtCreateTimeIsSet(true);
    return this;
  }

  public void unsetGmtCreateTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GMTCREATETIME_ISSET_ID);
  }

  /** Returns true if field gmtCreateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetGmtCreateTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GMTCREATETIME_ISSET_ID);
  }

  public void setGmtCreateTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GMTCREATETIME_ISSET_ID, value);
  }

  public long getGmtModifiedTime() {
    return this.gmtModifiedTime;
  }

  public SeatInfoDto setGmtModifiedTime(long gmtModifiedTime) {
    this.gmtModifiedTime = gmtModifiedTime;
    setGmtModifiedTimeIsSet(true);
    return this;
  }

  public void unsetGmtModifiedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GMTMODIFIEDTIME_ISSET_ID);
  }

  /** Returns true if field gmtModifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetGmtModifiedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GMTMODIFIEDTIME_ISSET_ID);
  }

  public void setGmtModifiedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GMTMODIFIEDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case BUILDING_ID:
      if (value == null) {
        unsetBuildingId();
      } else {
        setBuildingId((java.lang.String)value);
      }
      break;

    case FLOOR_ID:
      if (value == null) {
        unsetFloorId();
      } else {
        setFloorId((java.lang.String)value);
      }
      break;

    case SEAT_TYPE:
      if (value == null) {
        unsetSeatType();
      } else {
        setSeatType((java.lang.String)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((java.lang.String)value);
      }
      break;

    case GMT_CREATE_TIME:
      if (value == null) {
        unsetGmtCreateTime();
      } else {
        setGmtCreateTime((java.lang.Long)value);
      }
      break;

    case GMT_MODIFIED_TIME:
      if (value == null) {
        unsetGmtModifiedTime();
      } else {
        setGmtModifiedTime((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case BUILDING_ID:
      return getBuildingId();

    case FLOOR_ID:
      return getFloorId();

    case SEAT_TYPE:
      return getSeatType();

    case DESC:
      return getDesc();

    case GMT_CREATE_TIME:
      return getGmtCreateTime();

    case GMT_MODIFIED_TIME:
      return getGmtModifiedTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case BUILDING_ID:
      return isSetBuildingId();
    case FLOOR_ID:
      return isSetFloorId();
    case SEAT_TYPE:
      return isSetSeatType();
    case DESC:
      return isSetDesc();
    case GMT_CREATE_TIME:
      return isSetGmtCreateTime();
    case GMT_MODIFIED_TIME:
      return isSetGmtModifiedTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SeatInfoDto)
      return this.equals((SeatInfoDto)that);
    return false;
  }

  public boolean equals(SeatInfoDto that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_buildingId = true && this.isSetBuildingId();
    boolean that_present_buildingId = true && that.isSetBuildingId();
    if (this_present_buildingId || that_present_buildingId) {
      if (!(this_present_buildingId && that_present_buildingId))
        return false;
      if (!this.buildingId.equals(that.buildingId))
        return false;
    }

    boolean this_present_floorId = true && this.isSetFloorId();
    boolean that_present_floorId = true && that.isSetFloorId();
    if (this_present_floorId || that_present_floorId) {
      if (!(this_present_floorId && that_present_floorId))
        return false;
      if (!this.floorId.equals(that.floorId))
        return false;
    }

    boolean this_present_seatType = true && this.isSetSeatType();
    boolean that_present_seatType = true && that.isSetSeatType();
    if (this_present_seatType || that_present_seatType) {
      if (!(this_present_seatType && that_present_seatType))
        return false;
      if (!this.seatType.equals(that.seatType))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    boolean this_present_gmtCreateTime = true && this.isSetGmtCreateTime();
    boolean that_present_gmtCreateTime = true && that.isSetGmtCreateTime();
    if (this_present_gmtCreateTime || that_present_gmtCreateTime) {
      if (!(this_present_gmtCreateTime && that_present_gmtCreateTime))
        return false;
      if (this.gmtCreateTime != that.gmtCreateTime)
        return false;
    }

    boolean this_present_gmtModifiedTime = true && this.isSetGmtModifiedTime();
    boolean that_present_gmtModifiedTime = true && that.isSetGmtModifiedTime();
    if (this_present_gmtModifiedTime || that_present_gmtModifiedTime) {
      if (!(this_present_gmtModifiedTime && that_present_gmtModifiedTime))
        return false;
      if (this.gmtModifiedTime != that.gmtModifiedTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetBuildingId()) ? 131071 : 524287);
    if (isSetBuildingId())
      hashCode = hashCode * 8191 + buildingId.hashCode();

    hashCode = hashCode * 8191 + ((isSetFloorId()) ? 131071 : 524287);
    if (isSetFloorId())
      hashCode = hashCode * 8191 + floorId.hashCode();

    hashCode = hashCode * 8191 + ((isSetSeatType()) ? 131071 : 524287);
    if (isSetSeatType())
      hashCode = hashCode * 8191 + seatType.hashCode();

    hashCode = hashCode * 8191 + ((isSetDesc()) ? 131071 : 524287);
    if (isSetDesc())
      hashCode = hashCode * 8191 + desc.hashCode();

    hashCode = hashCode * 8191 + ((isSetGmtCreateTime()) ? 131071 : 524287);
    if (isSetGmtCreateTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gmtCreateTime);

    hashCode = hashCode * 8191 + ((isSetGmtModifiedTime()) ? 131071 : 524287);
    if (isSetGmtModifiedTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gmtModifiedTime);

    return hashCode;
  }

  @Override
  public int compareTo(SeatInfoDto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuildingId()).compareTo(other.isSetBuildingId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildingId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildingId, other.buildingId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFloorId()).compareTo(other.isSetFloorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFloorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.floorId, other.floorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSeatType()).compareTo(other.isSetSeatType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeatType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seatType, other.seatType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGmtCreateTime()).compareTo(other.isSetGmtCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGmtCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gmtCreateTime, other.gmtCreateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGmtModifiedTime()).compareTo(other.isSetGmtModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGmtModifiedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gmtModifiedTime, other.gmtModifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SeatInfoDto(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetBuildingId()) {
      if (!first) sb.append(", ");
      sb.append("buildingId:");
      if (this.buildingId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildingId);
      }
      first = false;
    }
    if (isSetFloorId()) {
      if (!first) sb.append(", ");
      sb.append("floorId:");
      if (this.floorId == null) {
        sb.append("null");
      } else {
        sb.append(this.floorId);
      }
      first = false;
    }
    if (isSetSeatType()) {
      if (!first) sb.append(", ");
      sb.append("seatType:");
      if (this.seatType == null) {
        sb.append("null");
      } else {
        sb.append(this.seatType);
      }
      first = false;
    }
    if (isSetDesc()) {
      if (!first) sb.append(", ");
      sb.append("desc:");
      if (this.desc == null) {
        sb.append("null");
      } else {
        sb.append(this.desc);
      }
      first = false;
    }
    if (isSetGmtCreateTime()) {
      if (!first) sb.append(", ");
      sb.append("gmtCreateTime:");
      sb.append(this.gmtCreateTime);
      first = false;
    }
    if (isSetGmtModifiedTime()) {
      if (!first) sb.append(", ");
      sb.append("gmtModifiedTime:");
      sb.append(this.gmtModifiedTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SeatInfoDtoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SeatInfoDtoStandardScheme getScheme() {
      return new SeatInfoDtoStandardScheme();
    }
  }

  private static class SeatInfoDtoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SeatInfoDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SeatInfoDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUILDING_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buildingId = iprot.readString();
              struct.setBuildingIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FLOOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.floorId = iprot.readString();
              struct.setFloorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SEAT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.seatType = iprot.readString();
              struct.setSeatTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GMT_CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gmtCreateTime = iprot.readI64();
              struct.setGmtCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GMT_MODIFIED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gmtModifiedTime = iprot.readI64();
              struct.setGmtModifiedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SeatInfoDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildingId != null) {
        if (struct.isSetBuildingId()) {
          oprot.writeFieldBegin(BUILDING_ID_FIELD_DESC);
          oprot.writeString(struct.buildingId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.floorId != null) {
        if (struct.isSetFloorId()) {
          oprot.writeFieldBegin(FLOOR_ID_FIELD_DESC);
          oprot.writeString(struct.floorId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.seatType != null) {
        if (struct.isSetSeatType()) {
          oprot.writeFieldBegin(SEAT_TYPE_FIELD_DESC);
          oprot.writeString(struct.seatType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.desc != null) {
        if (struct.isSetDesc()) {
          oprot.writeFieldBegin(DESC_FIELD_DESC);
          oprot.writeString(struct.desc);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetGmtCreateTime()) {
        oprot.writeFieldBegin(GMT_CREATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.gmtCreateTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetGmtModifiedTime()) {
        oprot.writeFieldBegin(GMT_MODIFIED_TIME_FIELD_DESC);
        oprot.writeI64(struct.gmtModifiedTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SeatInfoDtoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SeatInfoDtoTupleScheme getScheme() {
      return new SeatInfoDtoTupleScheme();
    }
  }

  private static class SeatInfoDtoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SeatInfoDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SeatInfoDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetBuildingId()) {
        optionals.set(1);
      }
      if (struct.isSetFloorId()) {
        optionals.set(2);
      }
      if (struct.isSetSeatType()) {
        optionals.set(3);
      }
      if (struct.isSetDesc()) {
        optionals.set(4);
      }
      if (struct.isSetGmtCreateTime()) {
        optionals.set(5);
      }
      if (struct.isSetGmtModifiedTime()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetBuildingId()) {
        oprot.writeString(struct.buildingId);
      }
      if (struct.isSetFloorId()) {
        oprot.writeString(struct.floorId);
      }
      if (struct.isSetSeatType()) {
        oprot.writeString(struct.seatType);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
      if (struct.isSetGmtCreateTime()) {
        oprot.writeI64(struct.gmtCreateTime);
      }
      if (struct.isSetGmtModifiedTime()) {
        oprot.writeI64(struct.gmtModifiedTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SeatInfoDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buildingId = iprot.readString();
        struct.setBuildingIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.floorId = iprot.readString();
        struct.setFloorIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.seatType = iprot.readString();
        struct.setSeatTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
      if (incoming.get(5)) {
        struct.gmtCreateTime = iprot.readI64();
        struct.setGmtCreateTimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.gmtModifiedTime = iprot.readI64();
        struct.setGmtModifiedTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


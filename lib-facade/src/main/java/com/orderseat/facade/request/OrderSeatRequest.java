/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-12")
public class OrderSeatRequest implements org.apache.thrift.TBase<OrderSeatRequest, OrderSeatRequest._Fields>, java.io.Serializable, Cloneable, Comparable<OrderSeatRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrderSeatRequest");

  private static final org.apache.thrift.protocol.TField ORDER_SEAT_DTO_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("orderSeatDtoList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OrderSeatRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OrderSeatRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<com.orderseat.facade.dto.OrderSeatDto> orderSeatDtoList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_SEAT_DTO_LIST((short)1, "orderSeatDtoList");

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
        case 1: // ORDER_SEAT_DTO_LIST
          return ORDER_SEAT_DTO_LIST;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDER_SEAT_DTO_LIST, new org.apache.thrift.meta_data.FieldMetaData("orderSeatDtoList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.orderseat.facade.dto.OrderSeatDto.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrderSeatRequest.class, metaDataMap);
  }

  public OrderSeatRequest() {
  }

  public OrderSeatRequest(
    java.util.List<com.orderseat.facade.dto.OrderSeatDto> orderSeatDtoList)
  {
    this();
    this.orderSeatDtoList = orderSeatDtoList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OrderSeatRequest(OrderSeatRequest other) {
    if (other.isSetOrderSeatDtoList()) {
      java.util.List<com.orderseat.facade.dto.OrderSeatDto> __this__orderSeatDtoList = new java.util.ArrayList<com.orderseat.facade.dto.OrderSeatDto>(other.orderSeatDtoList.size());
      for (com.orderseat.facade.dto.OrderSeatDto other_element : other.orderSeatDtoList) {
        __this__orderSeatDtoList.add(new com.orderseat.facade.dto.OrderSeatDto(other_element));
      }
      this.orderSeatDtoList = __this__orderSeatDtoList;
    }
  }

  public OrderSeatRequest deepCopy() {
    return new OrderSeatRequest(this);
  }

  @Override
  public void clear() {
    this.orderSeatDtoList = null;
  }

  public int getOrderSeatDtoListSize() {
    return (this.orderSeatDtoList == null) ? 0 : this.orderSeatDtoList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.orderseat.facade.dto.OrderSeatDto> getOrderSeatDtoListIterator() {
    return (this.orderSeatDtoList == null) ? null : this.orderSeatDtoList.iterator();
  }

  public void addToOrderSeatDtoList(com.orderseat.facade.dto.OrderSeatDto elem) {
    if (this.orderSeatDtoList == null) {
      this.orderSeatDtoList = new java.util.ArrayList<com.orderseat.facade.dto.OrderSeatDto>();
    }
    this.orderSeatDtoList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.orderseat.facade.dto.OrderSeatDto> getOrderSeatDtoList() {
    return this.orderSeatDtoList;
  }

  public OrderSeatRequest setOrderSeatDtoList(@org.apache.thrift.annotation.Nullable java.util.List<com.orderseat.facade.dto.OrderSeatDto> orderSeatDtoList) {
    this.orderSeatDtoList = orderSeatDtoList;
    return this;
  }

  public void unsetOrderSeatDtoList() {
    this.orderSeatDtoList = null;
  }

  /** Returns true if field orderSeatDtoList is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderSeatDtoList() {
    return this.orderSeatDtoList != null;
  }

  public void setOrderSeatDtoListIsSet(boolean value) {
    if (!value) {
      this.orderSeatDtoList = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ORDER_SEAT_DTO_LIST:
      if (value == null) {
        unsetOrderSeatDtoList();
      } else {
        setOrderSeatDtoList((java.util.List<com.orderseat.facade.dto.OrderSeatDto>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_SEAT_DTO_LIST:
      return getOrderSeatDtoList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ORDER_SEAT_DTO_LIST:
      return isSetOrderSeatDtoList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OrderSeatRequest)
      return this.equals((OrderSeatRequest)that);
    return false;
  }

  public boolean equals(OrderSeatRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_orderSeatDtoList = true && this.isSetOrderSeatDtoList();
    boolean that_present_orderSeatDtoList = true && that.isSetOrderSeatDtoList();
    if (this_present_orderSeatDtoList || that_present_orderSeatDtoList) {
      if (!(this_present_orderSeatDtoList && that_present_orderSeatDtoList))
        return false;
      if (!this.orderSeatDtoList.equals(that.orderSeatDtoList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOrderSeatDtoList()) ? 131071 : 524287);
    if (isSetOrderSeatDtoList())
      hashCode = hashCode * 8191 + orderSeatDtoList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OrderSeatRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOrderSeatDtoList()).compareTo(other.isSetOrderSeatDtoList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderSeatDtoList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderSeatDtoList, other.orderSeatDtoList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OrderSeatRequest(");
    boolean first = true;

    sb.append("orderSeatDtoList:");
    if (this.orderSeatDtoList == null) {
      sb.append("null");
    } else {
      sb.append(this.orderSeatDtoList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (orderSeatDtoList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderSeatDtoList' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OrderSeatRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderSeatRequestStandardScheme getScheme() {
      return new OrderSeatRequestStandardScheme();
    }
  }

  private static class OrderSeatRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<OrderSeatRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OrderSeatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDER_SEAT_DTO_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.orderSeatDtoList = new java.util.ArrayList<com.orderseat.facade.dto.OrderSeatDto>(_list0.size);
                @org.apache.thrift.annotation.Nullable com.orderseat.facade.dto.OrderSeatDto _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.orderseat.facade.dto.OrderSeatDto();
                  _elem1.read(iprot);
                  struct.orderSeatDtoList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setOrderSeatDtoListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OrderSeatRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orderSeatDtoList != null) {
        oprot.writeFieldBegin(ORDER_SEAT_DTO_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.orderSeatDtoList.size()));
          for (com.orderseat.facade.dto.OrderSeatDto _iter3 : struct.orderSeatDtoList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OrderSeatRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OrderSeatRequestTupleScheme getScheme() {
      return new OrderSeatRequestTupleScheme();
    }
  }

  private static class OrderSeatRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<OrderSeatRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OrderSeatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.orderSeatDtoList.size());
        for (com.orderseat.facade.dto.OrderSeatDto _iter4 : struct.orderSeatDtoList)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OrderSeatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.orderSeatDtoList = new java.util.ArrayList<com.orderseat.facade.dto.OrderSeatDto>(_list5.size);
        @org.apache.thrift.annotation.Nullable com.orderseat.facade.dto.OrderSeatDto _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new com.orderseat.facade.dto.OrderSeatDto();
          _elem6.read(iprot);
          struct.orderSeatDtoList.add(_elem6);
        }
      }
      struct.setOrderSeatDtoListIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


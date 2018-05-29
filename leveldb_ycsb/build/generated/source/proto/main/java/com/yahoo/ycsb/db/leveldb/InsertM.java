// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leveldb_ycsb.proto

package com.yahoo.ycsb.db.leveldb;

/**
 * Protobuf type {@code ycsbleveldb.InsertM}
 */
public  final class InsertM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ycsbleveldb.InsertM)
    InsertMOrBuilder {
  // Use InsertM.newBuilder() to construct.
  private InsertM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InsertM() {
    table_ = "";
    key_ = "";
    values_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InsertM(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            table_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            values_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.yahoo.ycsb.db.leveldb.YCSBLeveDB.internal_static_ycsbleveldb_InsertM_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yahoo.ycsb.db.leveldb.YCSBLeveDB.internal_static_ycsbleveldb_InsertM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yahoo.ycsb.db.leveldb.InsertM.class, com.yahoo.ycsb.db.leveldb.InsertM.Builder.class);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object table_;
  /**
   * <code>optional string table = 1;</code>
   */
  public java.lang.String getTable() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      table_ = s;
      return s;
    }
  }
  /**
   * <code>optional string table = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTableBytes() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      table_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <code>optional string key = 2;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>optional string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 3;
  private volatile java.lang.Object values_;
  /**
   * <code>optional string values = 3;</code>
   */
  public java.lang.String getValues() {
    java.lang.Object ref = values_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      values_ = s;
      return s;
    }
  }
  /**
   * <code>optional string values = 3;</code>
   */
  public com.google.protobuf.ByteString
      getValuesBytes() {
    java.lang.Object ref = values_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      values_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTableBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, table_);
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    if (!getValuesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, values_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, table_);
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    if (!getValuesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, values_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.yahoo.ycsb.db.leveldb.InsertM)) {
      return super.equals(obj);
    }
    com.yahoo.ycsb.db.leveldb.InsertM other = (com.yahoo.ycsb.db.leveldb.InsertM) obj;

    boolean result = true;
    result = result && getTable()
        .equals(other.getTable());
    result = result && getKey()
        .equals(other.getKey());
    result = result && getValues()
        .equals(other.getValues());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getTable().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUES_FIELD_NUMBER;
    hash = (53 * hash) + getValues().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yahoo.ycsb.db.leveldb.InsertM parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.yahoo.ycsb.db.leveldb.InsertM prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ycsbleveldb.InsertM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ycsbleveldb.InsertM)
      com.yahoo.ycsb.db.leveldb.InsertMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yahoo.ycsb.db.leveldb.YCSBLeveDB.internal_static_ycsbleveldb_InsertM_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yahoo.ycsb.db.leveldb.YCSBLeveDB.internal_static_ycsbleveldb_InsertM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yahoo.ycsb.db.leveldb.InsertM.class, com.yahoo.ycsb.db.leveldb.InsertM.Builder.class);
    }

    // Construct using com.yahoo.ycsb.db.leveldb.InsertM.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      table_ = "";

      key_ = "";

      values_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yahoo.ycsb.db.leveldb.YCSBLeveDB.internal_static_ycsbleveldb_InsertM_descriptor;
    }

    public com.yahoo.ycsb.db.leveldb.InsertM getDefaultInstanceForType() {
      return com.yahoo.ycsb.db.leveldb.InsertM.getDefaultInstance();
    }

    public com.yahoo.ycsb.db.leveldb.InsertM build() {
      com.yahoo.ycsb.db.leveldb.InsertM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.yahoo.ycsb.db.leveldb.InsertM buildPartial() {
      com.yahoo.ycsb.db.leveldb.InsertM result = new com.yahoo.ycsb.db.leveldb.InsertM(this);
      result.table_ = table_;
      result.key_ = key_;
      result.values_ = values_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.yahoo.ycsb.db.leveldb.InsertM) {
        return mergeFrom((com.yahoo.ycsb.db.leveldb.InsertM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yahoo.ycsb.db.leveldb.InsertM other) {
      if (other == com.yahoo.ycsb.db.leveldb.InsertM.getDefaultInstance()) return this;
      if (!other.getTable().isEmpty()) {
        table_ = other.table_;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.getValues().isEmpty()) {
        values_ = other.values_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.yahoo.ycsb.db.leveldb.InsertM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yahoo.ycsb.db.leveldb.InsertM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object table_ = "";
    /**
     * <code>optional string table = 1;</code>
     */
    public java.lang.String getTable() {
      java.lang.Object ref = table_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        table_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string table = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableBytes() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        table_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string table = 1;</code>
     */
    public Builder setTable(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      table_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string table = 1;</code>
     */
    public Builder clearTable() {
      
      table_ = getDefaultInstance().getTable();
      onChanged();
      return this;
    }
    /**
     * <code>optional string table = 1;</code>
     */
    public Builder setTableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      table_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <code>optional string key = 2;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object values_ = "";
    /**
     * <code>optional string values = 3;</code>
     */
    public java.lang.String getValues() {
      java.lang.Object ref = values_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        values_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string values = 3;</code>
     */
    public com.google.protobuf.ByteString
        getValuesBytes() {
      java.lang.Object ref = values_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        values_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string values = 3;</code>
     */
    public Builder setValues(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      values_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string values = 3;</code>
     */
    public Builder clearValues() {
      
      values_ = getDefaultInstance().getValues();
      onChanged();
      return this;
    }
    /**
     * <code>optional string values = 3;</code>
     */
    public Builder setValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      values_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ycsbleveldb.InsertM)
  }

  // @@protoc_insertion_point(class_scope:ycsbleveldb.InsertM)
  private static final com.yahoo.ycsb.db.leveldb.InsertM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yahoo.ycsb.db.leveldb.InsertM();
  }

  public static com.yahoo.ycsb.db.leveldb.InsertM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsertM>
      PARSER = new com.google.protobuf.AbstractParser<InsertM>() {
    public InsertM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InsertM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InsertM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsertM> getParserForType() {
    return PARSER;
  }

  public com.yahoo.ycsb.db.leveldb.InsertM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


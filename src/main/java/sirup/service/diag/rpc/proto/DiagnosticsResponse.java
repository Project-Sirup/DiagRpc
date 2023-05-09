// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_diag.proto

package sirup.service.diag.rpc.proto;

/**
 * Protobuf type {@code diag.v1.DiagnosticsResponse}
 */
public  final class DiagnosticsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:diag.v1.DiagnosticsResponse)
    DiagnosticsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiagnosticsResponse.newBuilder() to construct.
  private DiagnosticsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiagnosticsResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiagnosticsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            sirup.service.diag.rpc.proto.Report.Builder subBuilder = null;
            if (report_ != null) {
              subBuilder = report_.toBuilder();
            }
            report_ = input.readMessage(sirup.service.diag.rpc.proto.Report.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(report_);
              report_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sirup.service.diag.rpc.proto.Diagnostics.internal_static_diag_v1_DiagnosticsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sirup.service.diag.rpc.proto.Diagnostics.internal_static_diag_v1_DiagnosticsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sirup.service.diag.rpc.proto.DiagnosticsResponse.class, sirup.service.diag.rpc.proto.DiagnosticsResponse.Builder.class);
  }

  public static final int REPORT_FIELD_NUMBER = 1;
  private sirup.service.diag.rpc.proto.Report report_;
  /**
   * <code>.diag.v1.Report report = 1;</code>
   */
  public boolean hasReport() {
    return report_ != null;
  }
  /**
   * <code>.diag.v1.Report report = 1;</code>
   */
  public sirup.service.diag.rpc.proto.Report getReport() {
    return report_ == null ? sirup.service.diag.rpc.proto.Report.getDefaultInstance() : report_;
  }
  /**
   * <code>.diag.v1.Report report = 1;</code>
   */
  public sirup.service.diag.rpc.proto.ReportOrBuilder getReportOrBuilder() {
    return getReport();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (report_ != null) {
      output.writeMessage(1, getReport());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (report_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReport());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sirup.service.diag.rpc.proto.DiagnosticsResponse)) {
      return super.equals(obj);
    }
    sirup.service.diag.rpc.proto.DiagnosticsResponse other = (sirup.service.diag.rpc.proto.DiagnosticsResponse) obj;

    boolean result = true;
    result = result && (hasReport() == other.hasReport());
    if (hasReport()) {
      result = result && getReport()
          .equals(other.getReport());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasReport()) {
      hash = (37 * hash) + REPORT_FIELD_NUMBER;
      hash = (53 * hash) + getReport().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.diag.rpc.proto.DiagnosticsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sirup.service.diag.rpc.proto.DiagnosticsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code diag.v1.DiagnosticsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:diag.v1.DiagnosticsResponse)
      sirup.service.diag.rpc.proto.DiagnosticsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sirup.service.diag.rpc.proto.Diagnostics.internal_static_diag_v1_DiagnosticsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sirup.service.diag.rpc.proto.Diagnostics.internal_static_diag_v1_DiagnosticsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sirup.service.diag.rpc.proto.DiagnosticsResponse.class, sirup.service.diag.rpc.proto.DiagnosticsResponse.Builder.class);
    }

    // Construct using sirup.service.diag.rpc.proto.DiagnosticsResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reportBuilder_ == null) {
        report_ = null;
      } else {
        report_ = null;
        reportBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sirup.service.diag.rpc.proto.Diagnostics.internal_static_diag_v1_DiagnosticsResponse_descriptor;
    }

    @java.lang.Override
    public sirup.service.diag.rpc.proto.DiagnosticsResponse getDefaultInstanceForType() {
      return sirup.service.diag.rpc.proto.DiagnosticsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sirup.service.diag.rpc.proto.DiagnosticsResponse build() {
      sirup.service.diag.rpc.proto.DiagnosticsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sirup.service.diag.rpc.proto.DiagnosticsResponse buildPartial() {
      sirup.service.diag.rpc.proto.DiagnosticsResponse result = new sirup.service.diag.rpc.proto.DiagnosticsResponse(this);
      if (reportBuilder_ == null) {
        result.report_ = report_;
      } else {
        result.report_ = reportBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sirup.service.diag.rpc.proto.DiagnosticsResponse) {
        return mergeFrom((sirup.service.diag.rpc.proto.DiagnosticsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sirup.service.diag.rpc.proto.DiagnosticsResponse other) {
      if (other == sirup.service.diag.rpc.proto.DiagnosticsResponse.getDefaultInstance()) return this;
      if (other.hasReport()) {
        mergeReport(other.getReport());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sirup.service.diag.rpc.proto.DiagnosticsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sirup.service.diag.rpc.proto.DiagnosticsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private sirup.service.diag.rpc.proto.Report report_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.diag.rpc.proto.Report, sirup.service.diag.rpc.proto.Report.Builder, sirup.service.diag.rpc.proto.ReportOrBuilder> reportBuilder_;
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public boolean hasReport() {
      return reportBuilder_ != null || report_ != null;
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public sirup.service.diag.rpc.proto.Report getReport() {
      if (reportBuilder_ == null) {
        return report_ == null ? sirup.service.diag.rpc.proto.Report.getDefaultInstance() : report_;
      } else {
        return reportBuilder_.getMessage();
      }
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public Builder setReport(sirup.service.diag.rpc.proto.Report value) {
      if (reportBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        report_ = value;
        onChanged();
      } else {
        reportBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public Builder setReport(
        sirup.service.diag.rpc.proto.Report.Builder builderForValue) {
      if (reportBuilder_ == null) {
        report_ = builderForValue.build();
        onChanged();
      } else {
        reportBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public Builder mergeReport(sirup.service.diag.rpc.proto.Report value) {
      if (reportBuilder_ == null) {
        if (report_ != null) {
          report_ =
            sirup.service.diag.rpc.proto.Report.newBuilder(report_).mergeFrom(value).buildPartial();
        } else {
          report_ = value;
        }
        onChanged();
      } else {
        reportBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public Builder clearReport() {
      if (reportBuilder_ == null) {
        report_ = null;
        onChanged();
      } else {
        report_ = null;
        reportBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public sirup.service.diag.rpc.proto.Report.Builder getReportBuilder() {
      
      onChanged();
      return getReportFieldBuilder().getBuilder();
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    public sirup.service.diag.rpc.proto.ReportOrBuilder getReportOrBuilder() {
      if (reportBuilder_ != null) {
        return reportBuilder_.getMessageOrBuilder();
      } else {
        return report_ == null ?
            sirup.service.diag.rpc.proto.Report.getDefaultInstance() : report_;
      }
    }
    /**
     * <code>.diag.v1.Report report = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.diag.rpc.proto.Report, sirup.service.diag.rpc.proto.Report.Builder, sirup.service.diag.rpc.proto.ReportOrBuilder> 
        getReportFieldBuilder() {
      if (reportBuilder_ == null) {
        reportBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sirup.service.diag.rpc.proto.Report, sirup.service.diag.rpc.proto.Report.Builder, sirup.service.diag.rpc.proto.ReportOrBuilder>(
                getReport(),
                getParentForChildren(),
                isClean());
        report_ = null;
      }
      return reportBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:diag.v1.DiagnosticsResponse)
  }

  // @@protoc_insertion_point(class_scope:diag.v1.DiagnosticsResponse)
  private static final sirup.service.diag.rpc.proto.DiagnosticsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sirup.service.diag.rpc.proto.DiagnosticsResponse();
  }

  public static sirup.service.diag.rpc.proto.DiagnosticsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnosticsResponse>
      PARSER = new com.google.protobuf.AbstractParser<DiagnosticsResponse>() {
    @java.lang.Override
    public DiagnosticsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiagnosticsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiagnosticsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnosticsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sirup.service.diag.rpc.proto.DiagnosticsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

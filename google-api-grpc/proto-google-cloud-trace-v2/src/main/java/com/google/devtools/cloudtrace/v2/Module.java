// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

/**
 * <pre>
 * Binary module.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.Module}
 */
public  final class Module extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.Module)
    ModuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Module.newBuilder() to construct.
  private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Module() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Module(
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
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder subBuilder = null;
            if (module_ != null) {
              subBuilder = module_.toBuilder();
            }
            module_ = input.readMessage(com.google.devtools.cloudtrace.v2.TruncatableString.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(module_);
              module_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder subBuilder = null;
            if (buildId_ != null) {
              subBuilder = buildId_.toBuilder();
            }
            buildId_ = input.readMessage(com.google.devtools.cloudtrace.v2.TruncatableString.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(buildId_);
              buildId_ = subBuilder.buildPartial();
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
    return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.Module.class, com.google.devtools.cloudtrace.v2.Module.Builder.class);
  }

  public static final int MODULE_FIELD_NUMBER = 1;
  private com.google.devtools.cloudtrace.v2.TruncatableString module_;
  /**
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   */
  public boolean hasModule() {
    return module_ != null;
  }
  /**
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   */
  public com.google.devtools.cloudtrace.v2.TruncatableString getModule() {
    return module_ == null ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : module_;
  }
  /**
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   */
  public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getModuleOrBuilder() {
    return getModule();
  }

  public static final int BUILD_ID_FIELD_NUMBER = 2;
  private com.google.devtools.cloudtrace.v2.TruncatableString buildId_;
  /**
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   */
  public boolean hasBuildId() {
    return buildId_ != null;
  }
  /**
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   */
  public com.google.devtools.cloudtrace.v2.TruncatableString getBuildId() {
    return buildId_ == null ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : buildId_;
  }
  /**
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   */
  public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getBuildIdOrBuilder() {
    return getBuildId();
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
    if (module_ != null) {
      output.writeMessage(1, getModule());
    }
    if (buildId_ != null) {
      output.writeMessage(2, getBuildId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (module_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModule());
    }
    if (buildId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBuildId());
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.Module)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.Module other = (com.google.devtools.cloudtrace.v2.Module) obj;

    boolean result = true;
    result = result && (hasModule() == other.hasModule());
    if (hasModule()) {
      result = result && getModule()
          .equals(other.getModule());
    }
    result = result && (hasBuildId() == other.hasBuildId());
    if (hasBuildId()) {
      result = result && getBuildId()
          .equals(other.getBuildId());
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
    if (hasModule()) {
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule().hashCode();
    }
    if (hasBuildId()) {
      hash = (37 * hash) + BUILD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
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
  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.Module prototype) {
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
   * <pre>
   * Binary module.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.Module}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.Module)
      com.google.devtools.cloudtrace.v2.ModuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.Module.class, com.google.devtools.cloudtrace.v2.Module.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.Module.newBuilder()
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
      if (moduleBuilder_ == null) {
        module_ = null;
      } else {
        module_ = null;
        moduleBuilder_ = null;
      }
      if (buildIdBuilder_ == null) {
        buildId_ = null;
      } else {
        buildId_ = null;
        buildIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.Module.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module build() {
      com.google.devtools.cloudtrace.v2.Module result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module buildPartial() {
      com.google.devtools.cloudtrace.v2.Module result = new com.google.devtools.cloudtrace.v2.Module(this);
      if (moduleBuilder_ == null) {
        result.module_ = module_;
      } else {
        result.module_ = moduleBuilder_.build();
      }
      if (buildIdBuilder_ == null) {
        result.buildId_ = buildId_;
      } else {
        result.buildId_ = buildIdBuilder_.build();
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
      if (other instanceof com.google.devtools.cloudtrace.v2.Module) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.Module)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.Module other) {
      if (other == com.google.devtools.cloudtrace.v2.Module.getDefaultInstance()) return this;
      if (other.hasModule()) {
        mergeModule(other.getModule());
      }
      if (other.hasBuildId()) {
        mergeBuildId(other.getBuildId());
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
      com.google.devtools.cloudtrace.v2.Module parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v2.Module) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.cloudtrace.v2.TruncatableString module_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder> moduleBuilder_;
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public boolean hasModule() {
      return moduleBuilder_ != null || module_ != null;
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString getModule() {
      if (moduleBuilder_ == null) {
        return module_ == null ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : module_;
      } else {
        return moduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder setModule(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (moduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        module_ = value;
        onChanged();
      } else {
        moduleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder setModule(
        com.google.devtools.cloudtrace.v2.TruncatableString.Builder builderForValue) {
      if (moduleBuilder_ == null) {
        module_ = builderForValue.build();
        onChanged();
      } else {
        moduleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder mergeModule(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (moduleBuilder_ == null) {
        if (module_ != null) {
          module_ =
            com.google.devtools.cloudtrace.v2.TruncatableString.newBuilder(module_).mergeFrom(value).buildPartial();
        } else {
          module_ = value;
        }
        onChanged();
      } else {
        moduleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder clearModule() {
      if (moduleBuilder_ == null) {
        module_ = null;
        onChanged();
      } else {
        module_ = null;
        moduleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString.Builder getModuleBuilder() {
      
      onChanged();
      return getModuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getModuleOrBuilder() {
      if (moduleBuilder_ != null) {
        return moduleBuilder_.getMessageOrBuilder();
      } else {
        return module_ == null ?
            com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : module_;
      }
    }
    /**
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder> 
        getModuleFieldBuilder() {
      if (moduleBuilder_ == null) {
        moduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>(
                getModule(),
                getParentForChildren(),
                isClean());
        module_ = null;
      }
      return moduleBuilder_;
    }

    private com.google.devtools.cloudtrace.v2.TruncatableString buildId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder> buildIdBuilder_;
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public boolean hasBuildId() {
      return buildIdBuilder_ != null || buildId_ != null;
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString getBuildId() {
      if (buildIdBuilder_ == null) {
        return buildId_ == null ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : buildId_;
      } else {
        return buildIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder setBuildId(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (buildIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        buildId_ = value;
        onChanged();
      } else {
        buildIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder setBuildId(
        com.google.devtools.cloudtrace.v2.TruncatableString.Builder builderForValue) {
      if (buildIdBuilder_ == null) {
        buildId_ = builderForValue.build();
        onChanged();
      } else {
        buildIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder mergeBuildId(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (buildIdBuilder_ == null) {
        if (buildId_ != null) {
          buildId_ =
            com.google.devtools.cloudtrace.v2.TruncatableString.newBuilder(buildId_).mergeFrom(value).buildPartial();
        } else {
          buildId_ = value;
        }
        onChanged();
      } else {
        buildIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder clearBuildId() {
      if (buildIdBuilder_ == null) {
        buildId_ = null;
        onChanged();
      } else {
        buildId_ = null;
        buildIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString.Builder getBuildIdBuilder() {
      
      onChanged();
      return getBuildIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getBuildIdOrBuilder() {
      if (buildIdBuilder_ != null) {
        return buildIdBuilder_.getMessageOrBuilder();
      } else {
        return buildId_ == null ?
            com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance() : buildId_;
      }
    }
    /**
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder> 
        getBuildIdFieldBuilder() {
      if (buildIdBuilder_ == null) {
        buildIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString, com.google.devtools.cloudtrace.v2.TruncatableString.Builder, com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>(
                getBuildId(),
                getParentForChildren(),
                isClean());
        buildId_ = null;
      }
      return buildIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.Module)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.Module)
  private static final com.google.devtools.cloudtrace.v2.Module DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.Module();
  }

  public static com.google.devtools.cloudtrace.v2.Module getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module>
      PARSER = new com.google.protobuf.AbstractParser<Module>() {
    @java.lang.Override
    public Module parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Module(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Module> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.Module getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


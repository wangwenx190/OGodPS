// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttackHitEffectResult.proto

package emu.grasscutter.net.proto;

public final class AttackHitEffectResultOuterClass {
  private AttackHitEffectResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AttackHitEffectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttackHitEffectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float JECAAMHEFJM = 2;</code>
     * @return The jECAAMHEFJM.
     */
    float getJECAAMHEFJM();

    /**
     * <code>uint32 PPEOKDKPKKD = 9;</code>
     * @return The pPEOKDKPKKD.
     */
    int getPPEOKDKPKKD();

    /**
     * <code>uint32 NPKGMCHJMFK = 7;</code>
     * @return The nPKGMCHJMFK.
     */
    int getNPKGMCHJMFK();

    /**
     * <code>float MPEDEOJOHGC = 1;</code>
     * @return The mPEDEOJOHGC.
     */
    float getMPEDEOJOHGC();

    /**
     * <code>float BDGNPKFNBKD = 14;</code>
     * @return The bDGNPKFNBKD.
     */
    float getBDGNPKFNBKD();

    /**
     * <code>float FJLPLOBFPMJ = 5;</code>
     * @return The fJLPLOBFPMJ.
     */
    float getFJLPLOBFPMJ();
  }
  /**
   * Protobuf type {@code AttackHitEffectResult}
   */
  public static final class AttackHitEffectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AttackHitEffectResult)
      AttackHitEffectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AttackHitEffectResult.newBuilder() to construct.
    private AttackHitEffectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AttackHitEffectResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AttackHitEffectResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttackHitEffectResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 13: {

              mPEDEOJOHGC_ = input.readFloat();
              break;
            }
            case 21: {

              jECAAMHEFJM_ = input.readFloat();
              break;
            }
            case 45: {

              fJLPLOBFPMJ_ = input.readFloat();
              break;
            }
            case 56: {

              nPKGMCHJMFK_ = input.readUInt32();
              break;
            }
            case 72: {

              pPEOKDKPKKD_ = input.readUInt32();
              break;
            }
            case 117: {

              bDGNPKFNBKD_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
    }

    public static final int JECAAMHEFJM_FIELD_NUMBER = 2;
    private float jECAAMHEFJM_;
    /**
     * <code>float JECAAMHEFJM = 2;</code>
     * @return The jECAAMHEFJM.
     */
    @java.lang.Override
    public float getJECAAMHEFJM() {
      return jECAAMHEFJM_;
    }

    public static final int PPEOKDKPKKD_FIELD_NUMBER = 9;
    private int pPEOKDKPKKD_;
    /**
     * <code>uint32 PPEOKDKPKKD = 9;</code>
     * @return The pPEOKDKPKKD.
     */
    @java.lang.Override
    public int getPPEOKDKPKKD() {
      return pPEOKDKPKKD_;
    }

    public static final int NPKGMCHJMFK_FIELD_NUMBER = 7;
    private int nPKGMCHJMFK_;
    /**
     * <code>uint32 NPKGMCHJMFK = 7;</code>
     * @return The nPKGMCHJMFK.
     */
    @java.lang.Override
    public int getNPKGMCHJMFK() {
      return nPKGMCHJMFK_;
    }

    public static final int MPEDEOJOHGC_FIELD_NUMBER = 1;
    private float mPEDEOJOHGC_;
    /**
     * <code>float MPEDEOJOHGC = 1;</code>
     * @return The mPEDEOJOHGC.
     */
    @java.lang.Override
    public float getMPEDEOJOHGC() {
      return mPEDEOJOHGC_;
    }

    public static final int BDGNPKFNBKD_FIELD_NUMBER = 14;
    private float bDGNPKFNBKD_;
    /**
     * <code>float BDGNPKFNBKD = 14;</code>
     * @return The bDGNPKFNBKD.
     */
    @java.lang.Override
    public float getBDGNPKFNBKD() {
      return bDGNPKFNBKD_;
    }

    public static final int FJLPLOBFPMJ_FIELD_NUMBER = 5;
    private float fJLPLOBFPMJ_;
    /**
     * <code>float FJLPLOBFPMJ = 5;</code>
     * @return The fJLPLOBFPMJ.
     */
    @java.lang.Override
    public float getFJLPLOBFPMJ() {
      return fJLPLOBFPMJ_;
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
      if (mPEDEOJOHGC_ != 0F) {
        output.writeFloat(1, mPEDEOJOHGC_);
      }
      if (jECAAMHEFJM_ != 0F) {
        output.writeFloat(2, jECAAMHEFJM_);
      }
      if (fJLPLOBFPMJ_ != 0F) {
        output.writeFloat(5, fJLPLOBFPMJ_);
      }
      if (nPKGMCHJMFK_ != 0) {
        output.writeUInt32(7, nPKGMCHJMFK_);
      }
      if (pPEOKDKPKKD_ != 0) {
        output.writeUInt32(9, pPEOKDKPKKD_);
      }
      if (bDGNPKFNBKD_ != 0F) {
        output.writeFloat(14, bDGNPKFNBKD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mPEDEOJOHGC_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, mPEDEOJOHGC_);
      }
      if (jECAAMHEFJM_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, jECAAMHEFJM_);
      }
      if (fJLPLOBFPMJ_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, fJLPLOBFPMJ_);
      }
      if (nPKGMCHJMFK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, nPKGMCHJMFK_);
      }
      if (pPEOKDKPKKD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, pPEOKDKPKKD_);
      }
      if (bDGNPKFNBKD_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, bDGNPKFNBKD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other = (emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) obj;

      if (java.lang.Float.floatToIntBits(getJECAAMHEFJM())
          != java.lang.Float.floatToIntBits(
              other.getJECAAMHEFJM())) return false;
      if (getPPEOKDKPKKD()
          != other.getPPEOKDKPKKD()) return false;
      if (getNPKGMCHJMFK()
          != other.getNPKGMCHJMFK()) return false;
      if (java.lang.Float.floatToIntBits(getMPEDEOJOHGC())
          != java.lang.Float.floatToIntBits(
              other.getMPEDEOJOHGC())) return false;
      if (java.lang.Float.floatToIntBits(getBDGNPKFNBKD())
          != java.lang.Float.floatToIntBits(
              other.getBDGNPKFNBKD())) return false;
      if (java.lang.Float.floatToIntBits(getFJLPLOBFPMJ())
          != java.lang.Float.floatToIntBits(
              other.getFJLPLOBFPMJ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + JECAAMHEFJM_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getJECAAMHEFJM());
      hash = (37 * hash) + PPEOKDKPKKD_FIELD_NUMBER;
      hash = (53 * hash) + getPPEOKDKPKKD();
      hash = (37 * hash) + NPKGMCHJMFK_FIELD_NUMBER;
      hash = (53 * hash) + getNPKGMCHJMFK();
      hash = (37 * hash) + MPEDEOJOHGC_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMPEDEOJOHGC());
      hash = (37 * hash) + BDGNPKFNBKD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getBDGNPKFNBKD());
      hash = (37 * hash) + FJLPLOBFPMJ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFJLPLOBFPMJ());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult prototype) {
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
     * Protobuf type {@code AttackHitEffectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttackHitEffectResult)
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.newBuilder()
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
        jECAAMHEFJM_ = 0F;

        pPEOKDKPKKD_ = 0;

        nPKGMCHJMFK_ = 0;

        mPEDEOJOHGC_ = 0F;

        bDGNPKFNBKD_ = 0F;

        fJLPLOBFPMJ_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult build() {
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult buildPartial() {
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = new emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult(this);
        result.jECAAMHEFJM_ = jECAAMHEFJM_;
        result.pPEOKDKPKKD_ = pPEOKDKPKKD_;
        result.nPKGMCHJMFK_ = nPKGMCHJMFK_;
        result.mPEDEOJOHGC_ = mPEDEOJOHGC_;
        result.bDGNPKFNBKD_ = bDGNPKFNBKD_;
        result.fJLPLOBFPMJ_ = fJLPLOBFPMJ_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) {
          return mergeFrom((emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other) {
        if (other == emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance()) return this;
        if (other.getJECAAMHEFJM() != 0F) {
          setJECAAMHEFJM(other.getJECAAMHEFJM());
        }
        if (other.getPPEOKDKPKKD() != 0) {
          setPPEOKDKPKKD(other.getPPEOKDKPKKD());
        }
        if (other.getNPKGMCHJMFK() != 0) {
          setNPKGMCHJMFK(other.getNPKGMCHJMFK());
        }
        if (other.getMPEDEOJOHGC() != 0F) {
          setMPEDEOJOHGC(other.getMPEDEOJOHGC());
        }
        if (other.getBDGNPKFNBKD() != 0F) {
          setBDGNPKFNBKD(other.getBDGNPKFNBKD());
        }
        if (other.getFJLPLOBFPMJ() != 0F) {
          setFJLPLOBFPMJ(other.getFJLPLOBFPMJ());
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
        emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float jECAAMHEFJM_ ;
      /**
       * <code>float JECAAMHEFJM = 2;</code>
       * @return The jECAAMHEFJM.
       */
      @java.lang.Override
      public float getJECAAMHEFJM() {
        return jECAAMHEFJM_;
      }
      /**
       * <code>float JECAAMHEFJM = 2;</code>
       * @param value The jECAAMHEFJM to set.
       * @return This builder for chaining.
       */
      public Builder setJECAAMHEFJM(float value) {
        
        jECAAMHEFJM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float JECAAMHEFJM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearJECAAMHEFJM() {
        
        jECAAMHEFJM_ = 0F;
        onChanged();
        return this;
      }

      private int pPEOKDKPKKD_ ;
      /**
       * <code>uint32 PPEOKDKPKKD = 9;</code>
       * @return The pPEOKDKPKKD.
       */
      @java.lang.Override
      public int getPPEOKDKPKKD() {
        return pPEOKDKPKKD_;
      }
      /**
       * <code>uint32 PPEOKDKPKKD = 9;</code>
       * @param value The pPEOKDKPKKD to set.
       * @return This builder for chaining.
       */
      public Builder setPPEOKDKPKKD(int value) {
        
        pPEOKDKPKKD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PPEOKDKPKKD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPPEOKDKPKKD() {
        
        pPEOKDKPKKD_ = 0;
        onChanged();
        return this;
      }

      private int nPKGMCHJMFK_ ;
      /**
       * <code>uint32 NPKGMCHJMFK = 7;</code>
       * @return The nPKGMCHJMFK.
       */
      @java.lang.Override
      public int getNPKGMCHJMFK() {
        return nPKGMCHJMFK_;
      }
      /**
       * <code>uint32 NPKGMCHJMFK = 7;</code>
       * @param value The nPKGMCHJMFK to set.
       * @return This builder for chaining.
       */
      public Builder setNPKGMCHJMFK(int value) {
        
        nPKGMCHJMFK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NPKGMCHJMFK = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearNPKGMCHJMFK() {
        
        nPKGMCHJMFK_ = 0;
        onChanged();
        return this;
      }

      private float mPEDEOJOHGC_ ;
      /**
       * <code>float MPEDEOJOHGC = 1;</code>
       * @return The mPEDEOJOHGC.
       */
      @java.lang.Override
      public float getMPEDEOJOHGC() {
        return mPEDEOJOHGC_;
      }
      /**
       * <code>float MPEDEOJOHGC = 1;</code>
       * @param value The mPEDEOJOHGC to set.
       * @return This builder for chaining.
       */
      public Builder setMPEDEOJOHGC(float value) {
        
        mPEDEOJOHGC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float MPEDEOJOHGC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMPEDEOJOHGC() {
        
        mPEDEOJOHGC_ = 0F;
        onChanged();
        return this;
      }

      private float bDGNPKFNBKD_ ;
      /**
       * <code>float BDGNPKFNBKD = 14;</code>
       * @return The bDGNPKFNBKD.
       */
      @java.lang.Override
      public float getBDGNPKFNBKD() {
        return bDGNPKFNBKD_;
      }
      /**
       * <code>float BDGNPKFNBKD = 14;</code>
       * @param value The bDGNPKFNBKD to set.
       * @return This builder for chaining.
       */
      public Builder setBDGNPKFNBKD(float value) {
        
        bDGNPKFNBKD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float BDGNPKFNBKD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBDGNPKFNBKD() {
        
        bDGNPKFNBKD_ = 0F;
        onChanged();
        return this;
      }

      private float fJLPLOBFPMJ_ ;
      /**
       * <code>float FJLPLOBFPMJ = 5;</code>
       * @return The fJLPLOBFPMJ.
       */
      @java.lang.Override
      public float getFJLPLOBFPMJ() {
        return fJLPLOBFPMJ_;
      }
      /**
       * <code>float FJLPLOBFPMJ = 5;</code>
       * @param value The fJLPLOBFPMJ to set.
       * @return This builder for chaining.
       */
      public Builder setFJLPLOBFPMJ(float value) {
        
        fJLPLOBFPMJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float FJLPLOBFPMJ = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFJLPLOBFPMJ() {
        
        fJLPLOBFPMJ_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AttackHitEffectResult)
    }

    // @@protoc_insertion_point(class_scope:AttackHitEffectResult)
    private static final emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult();
    }

    public static emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AttackHitEffectResult>
        PARSER = new com.google.protobuf.AbstractParser<AttackHitEffectResult>() {
      @java.lang.Override
      public AttackHitEffectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttackHitEffectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AttackHitEffectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AttackHitEffectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttackHitEffectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttackHitEffectResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AttackHitEffectResult.proto\"\225\001\n\025Attack" +
      "HitEffectResult\022\023\n\013JECAAMHEFJM\030\002 \001(\002\022\023\n\013" +
      "PPEOKDKPKKD\030\t \001(\r\022\023\n\013NPKGMCHJMFK\030\007 \001(\r\022\023" +
      "\n\013MPEDEOJOHGC\030\001 \001(\002\022\023\n\013BDGNPKFNBKD\030\016 \001(\002" +
      "\022\023\n\013FJLPLOBFPMJ\030\005 \001(\002B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AttackHitEffectResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttackHitEffectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttackHitEffectResult_descriptor,
        new java.lang.String[] { "JECAAMHEFJM", "PPEOKDKPKKD", "NPKGMCHJMFK", "MPEDEOJOHGC", "BDGNPKFNBKD", "FJLPLOBFPMJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

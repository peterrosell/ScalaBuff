// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test/resources/proto/extensions.proto

package resources.java;

public final class Extensions {
  private Extensions() {}
  public static void registerAllExtensions(
      com.google.protobuf2.ExtensionRegistryLite registry) {
    registry.add(fooExtended);
  }
  public interface ExtensionsTestOrBuilder extends 
       com.google.protobuf2.GeneratedMessageLite.
            ExtendableMessageOrBuilder<ExtensionsTest> {
    
    // required int32 foo = 1;
    boolean hasFoo();
    int getFoo();
  }
  public static final class ExtensionsTest extends
      com.google.protobuf2.GeneratedMessageLite.ExtendableMessage<
        ExtensionsTest> implements ExtensionsTestOrBuilder {
    // Use ExtensionsTest.newBuilder() to construct.
    private ExtensionsTest(Builder builder) {
      super(builder);
    }
    private ExtensionsTest(boolean noInit) {}
    
    private static final ExtensionsTest defaultInstance;
    public static ExtensionsTest getDefaultInstance() {
      return defaultInstance;
    }
    
    public ExtensionsTest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // required int32 foo = 1;
    public static final int FOO_FIELD_NUMBER = 1;
    private int foo_;
    public boolean hasFoo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getFoo() {
      return foo_;
    }
    
    private void initFields() {
      foo_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasFoo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf2.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf2.GeneratedMessageLite
        .ExtendableMessage<resources.java.Extensions.ExtensionsTest>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, foo_);
      }
      extensionWriter.writeUntil(201, output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf2.CodedOutputStream
          .computeInt32Size(1, foo_);
      }
      size += extensionsSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        com.google.protobuf2.ByteString data)
        throws com.google.protobuf2.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        com.google.protobuf2.ByteString data,
        com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf2.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(byte[] data)
        throws com.google.protobuf2.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        byte[] data,
        com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf2.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        java.io.InputStream input,
        com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static resources.java.Extensions.ExtensionsTest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        com.google.protobuf2.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static resources.java.Extensions.ExtensionsTest parseFrom(
        com.google.protobuf2.CodedInputStream input,
        com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(resources.java.Extensions.ExtensionsTest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf2.GeneratedMessageLite.ExtendableBuilder<
          resources.java.Extensions.ExtensionsTest, Builder> implements resources.java.Extensions.ExtensionsTestOrBuilder {
      // Construct using Extensions.ExtensionsTest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        foo_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public resources.java.Extensions.ExtensionsTest getDefaultInstanceForType() {
        return getDefaultInstance();
      }
      
      public resources.java.Extensions.ExtensionsTest build() {
        resources.java.Extensions.ExtensionsTest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private resources.java.Extensions.ExtensionsTest buildParsed()
          throws com.google.protobuf2.InvalidProtocolBufferException {
        resources.java.Extensions.ExtensionsTest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public resources.java.Extensions.ExtensionsTest buildPartial() {
        resources.java.Extensions.ExtensionsTest result = new resources.java.Extensions.ExtensionsTest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.foo_ = foo_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(resources.java.Extensions.ExtensionsTest other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasFoo()) {
          setFoo(other.getFoo());
        }
        this.mergeExtensionFields(other);
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasFoo()) {
          
          return false;
        }
        if (!extensionsAreInitialized()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf2.CodedInputStream input,
          com.google.protobuf2.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              foo_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 foo = 1;
      private int foo_ ;
      public boolean hasFoo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getFoo() {
        return foo_;
      }
      public Builder setFoo(int value) {
        bitField0_ |= 0x00000001;
        foo_ = value;
        
        return this;
      }
      public Builder clearFoo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        foo_ = 0;
        
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ExtensionsTest)
    }
    
    static {
      defaultInstance = new ExtensionsTest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ExtensionsTest)
  }
  
  public static final int FOOEXTENDED_FIELD_NUMBER = 100;
  public static final
    com.google.protobuf2.GeneratedMessageLite.GeneratedExtension<
      resources.java.Extensions.ExtensionsTest,
      java.lang.Integer> fooExtended = com.google.protobuf2.GeneratedMessageLite
          .newSingularGeneratedExtension(
        resources.java.Extensions.ExtensionsTest.getDefaultInstance(),
        5,
        null,
        null,
        100,
        com.google.protobuf2.WireFormat.FieldType.INT32);
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/reflection/testing/reflection_test.proto

package io.grpc.reflection.testing;

public final class ReflectionTestProto {
  private ReflectionTestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(io.grpc.reflection.testing.ReflectionTestProto.bar);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int BAR_FIELD_NUMBER = 100;
  /**
   * <code>extend .grpc.reflection.testing.ThirdLevelType { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      io.grpc.reflection.testing.ThirdLevelType,
      java.lang.Integer> bar = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0io/grpc/reflection/testing/reflection_" +
      "test.proto\022\027grpc.reflection.testing\032:io/" +
      "grpc/reflection/testing/reflection_test_" +
      "depth_two.proto\032Dio/grpc/reflection/test" +
      "ing/reflection_test_depth_two_alternate." +
      "proto2b\n\022ReflectableService\022L\n\006Method\022 ." +
      "grpc.reflection.testing.Request\032\036.grpc.r" +
      "eflection.testing.Reply\"\000:4\n\003bar\022\'.grpc." +
      "reflection.testing.ThirdLevelType\030d \001(\005B" +
      "3\n\032io.grpc.reflection.testingB\023Reflectio",
      "nTestProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.reflection.testing.ReflectionTestDepthTwoProto.getDescriptor(),
          io.grpc.reflection.testing.ReflectionTestDepthTwoAlternateProto.getDescriptor(),
        }, assigner);
    bar.internalInit(descriptor.getExtensions().get(0));
    io.grpc.reflection.testing.ReflectionTestDepthTwoProto.getDescriptor();
    io.grpc.reflection.testing.ReflectionTestDepthTwoAlternateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

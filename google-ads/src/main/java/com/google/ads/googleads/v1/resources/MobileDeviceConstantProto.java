// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/mobile_device_constant.proto

package com.google.ads.googleads.v1.resources;

public final class MobileDeviceConstantProto {
  private MobileDeviceConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MobileDeviceConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MobileDeviceConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v1/resources/mobi" +
      "le_device_constant.proto\022!google.ads.goo" +
      "gleads.v1.resources\0326google/ads/googlead" +
      "s/v1/enums/mobile_device_type.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\032\034google/api/" +
      "annotations.proto\"\314\002\n\024MobileDeviceConsta" +
      "nt\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033." +
      "google.protobuf.Int64Value\022*\n\004name\030\003 \001(\013" +
      "2\034.google.protobuf.StringValue\0227\n\021manufa" +
      "cturer_name\030\004 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022;\n\025operating_system_name\030\005 \001(\0132\034" +
      ".google.protobuf.StringValue\022R\n\004type\030\006 \001" +
      "(\0162D.google.ads.googleads.v1.enums.Mobil" +
      "eDeviceTypeEnum.MobileDeviceTypeB\206\002\n%com" +
      ".google.ads.googleads.v1.resourcesB\031Mobi" +
      "leDeviceConstantProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v1/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V1.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V1\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V1::Resourcesb\006proto3"
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
          com.google.ads.googleads.v1.enums.MobileDeviceTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_MobileDeviceConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_MobileDeviceConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MobileDeviceConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "ManufacturerName", "OperatingSystemName", "Type", });
    com.google.ads.googleads.v1.enums.MobileDeviceTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/product_group_view_service.proto

package com.google.ads.googleads.v6.services;

public final class ProductGroupViewServiceProto {
  private ProductGroupViewServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_GetProductGroupViewRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetProductGroupViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v6/services/produ"
          + "ct_group_view_service.proto\022 google.ads."
          + "googleads.v6.services\032:google/ads/google"
          + "ads/v6/resources/product_group_view.prot"
          + "o\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\"f\n\032"
          + "GetProductGroupViewRequest\022H\n\rresource_n"
          + "ame\030\001 \001(\tB1\340A\002\372A+\n)googleads.googleapis."
          + "com/ProductGroupView2\270\002\n\027ProductGroupVie"
          + "wService\022\325\001\n\023GetProductGroupView\022<.googl"
          + "e.ads.googleads.v6.services.GetProductGr"
          + "oupViewRequest\0323.google.ads.googleads.v6"
          + ".resources.ProductGroupView\"K\202\323\344\223\0025\0223/v6"
          + "/{resource_name=customers/*/productGroup"
          + "Views/*}\332A\rresource_name\032E\312A\030googleads.g"
          + "oogleapis.com\322A\'https://www.googleapis.c"
          + "om/auth/adwordsB\203\002\n$com.google.ads.googl"
          + "eads.v6.servicesB\034ProductGroupViewServic"
          + "eProtoP\001ZHgoogle.golang.org/genproto/goo"
          + "gleapis/ads/googleads/v6/services;servic"
          + "es\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Servi"
          + "ces\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002"
          + "$Google::Ads::GoogleAds::V6::Servicesb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.googleads.v6.resources.ProductGroupViewProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_GetProductGroupViewRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetProductGroupViewRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_GetProductGroupViewRequest_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.googleads.v6.resources.ProductGroupViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

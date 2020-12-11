// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/video_service.proto

package com.google.ads.googleads.v6.services;

public final class VideoServiceProto {
  private VideoServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_GetVideoRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetVideoRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v6/services/video"
          + "_service.proto\022 google.ads.googleads.v6."
          + "services\032-google/ads/googleads/v6/resour"
          + "ces/video.proto\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\"P\n\017GetVideoRequest\022=\n\rresourc"
          + "e_name\030\001 \001(\tB&\340A\002\372A \n\036googleads.googleap"
          + "is.com/Video2\201\002\n\014VideoService\022\251\001\n\010GetVid"
          + "eo\0221.google.ads.googleads.v6.services.Ge"
          + "tVideoRequest\032(.google.ads.googleads.v6."
          + "resources.Video\"@\202\323\344\223\002*\022(/v6/{resource_n"
          + "ame=customers/*/videos/*}\332A\rresource_nam"
          + "e\032E\312A\030googleads.googleapis.com\322A\'https:/"
          + "/www.googleapis.com/auth/adwordsB\370\001\n$com"
          + ".google.ads.googleads.v6.servicesB\021Video"
          + "ServiceProtoP\001ZHgoogle.golang.org/genpro"
          + "to/googleapis/ads/googleads/v6/services;"
          + "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6"
          + ".Services\312\002 Google\\Ads\\GoogleAds\\V6\\Serv"
          + "ices\352\002$Google::Ads::GoogleAds::V6::Servi"
          + "cesb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.googleads.v6.resources.VideoProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_GetVideoRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetVideoRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_GetVideoRequest_descriptor,
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
    com.google.ads.googleads.v6.resources.VideoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/ad_group_ad_label_service.proto

package com.google.ads.googleads.v6.services;

public final class AdGroupAdLabelServiceProto {
  private AdGroupAdLabelServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_GetAdGroupAdLabelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetAdGroupAdLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_AdGroupAdLabelOperation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AdGroupAdLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v6/services/ad_gr"
          + "oup_ad_label_service.proto\022 google.ads.g"
          + "oogleads.v6.services\0329google/ads/googlea"
          + "ds/v6/resources/ad_group_ad_label.proto\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\027goog"
          + "le/rpc/status.proto\"b\n\030GetAdGroupAdLabel"
          + "Request\022F\n\rresource_name\030\001 \001(\tB/\340A\002\372A)\n\'"
          + "googleads.googleapis.com/AdGroupAdLabel\""
          + "\274\001\n\034MutateAdGroupAdLabelsRequest\022\030\n\013cust"
          + "omer_id\030\001 \001(\tB\003\340A\002\022R\n\noperations\030\002 \003(\01329"
          + ".google.ads.googleads.v6.services.AdGrou"
          + "pAdLabelOperationB\003\340A\002\022\027\n\017partial_failur"
          + "e\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"}\n\027AdGrou"
          + "pAdLabelOperation\022C\n\006create\030\001 \001(\01321.goog"
          + "le.ads.googleads.v6.resources.AdGroupAdL"
          + "abelH\000\022\020\n\006remove\030\002 \001(\tH\000B\013\n\toperation\"\241\001"
          + "\n\035MutateAdGroupAdLabelsResponse\0221\n\025parti"
          + "al_failure_error\030\003 \001(\0132\022.google.rpc.Stat"
          + "us\022M\n\007results\030\002 \003(\0132<.google.ads.googlea"
          + "ds.v6.services.MutateAdGroupAdLabelResul"
          + "t\"3\n\032MutateAdGroupAdLabelResult\022\025\n\rresou"
          + "rce_name\030\001 \001(\t2\243\004\n\025AdGroupAdLabelService"
          + "\022\315\001\n\021GetAdGroupAdLabel\022:.google.ads.goog"
          + "leads.v6.services.GetAdGroupAdLabelReque"
          + "st\0321.google.ads.googleads.v6.resources.A"
          + "dGroupAdLabel\"I\202\323\344\223\0023\0221/v6/{resource_nam"
          + "e=customers/*/adGroupAdLabels/*}\332A\rresou"
          + "rce_name\022\362\001\n\025MutateAdGroupAdLabels\022>.goo"
          + "gle.ads.googleads.v6.services.MutateAdGr"
          + "oupAdLabelsRequest\032?.google.ads.googlead"
          + "s.v6.services.MutateAdGroupAdLabelsRespo"
          + "nse\"X\202\323\344\223\0029\"4/v6/customers/{customer_id="
          + "*}/adGroupAdLabels:mutate:\001*\332A\026customer_"
          + "id,operations\032E\312A\030googleads.googleapis.c"
          + "om\322A\'https://www.googleapis.com/auth/adw"
          + "ordsB\201\002\n$com.google.ads.googleads.v6.ser"
          + "vicesB\032AdGroupAdLabelServiceProtoP\001ZHgoo"
          + "gle.golang.org/genproto/googleapis/ads/g"
          + "oogleads/v6/services;services\242\002\003GAA\252\002 Go"
          + "ogle.Ads.GoogleAds.V6.Services\312\002 Google\\"
          + "Ads\\GoogleAds\\V6\\Services\352\002$Google::Ads:"
          + ":GoogleAds::V6::Servicesb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.googleads.v6.resources.AdGroupAdLabelProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_GetAdGroupAdLabelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetAdGroupAdLabelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_GetAdGroupAdLabelRequest_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsRequest_descriptor,
            new java.lang.String[] {
              "CustomerId", "Operations", "PartialFailure", "ValidateOnly",
            });
    internal_static_google_ads_googleads_v6_services_AdGroupAdLabelOperation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_AdGroupAdLabelOperation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_AdGroupAdLabelOperation_descriptor,
            new java.lang.String[] {
              "Create", "Remove", "Operation",
            });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelsResponse_descriptor,
            new java.lang.String[] {
              "PartialFailureError", "Results",
            });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_MutateAdGroupAdLabelResult_descriptor,
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
    com.google.ads.googleads.v6.resources.AdGroupAdLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

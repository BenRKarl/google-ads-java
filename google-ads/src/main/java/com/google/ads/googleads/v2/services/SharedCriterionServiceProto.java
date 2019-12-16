// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/shared_criterion_service.proto

package com.google.ads.googleads.v2.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetSharedCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetSharedCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v2/services/share" +
      "d_criterion_service.proto\022 google.ads.go" +
      "ogleads.v2.services\0328google/ads/googlead" +
      "s/v2/resources/shared_criterion.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/rpc/" +
      "status.proto\032\027google/api/client.proto\"2\n" +
      "\031GetSharedCriterionRequest\022\025\n\rresource_n" +
      "ame\030\001 \001(\t\"\262\001\n\033MutateSharedCriteriaReques" +
      "t\022\023\n\013customer_id\030\001 \001(\t\022N\n\noperations\030\002 \003" +
      "(\0132:.google.ads.googleads.v2.services.Sh" +
      "aredCriterionOperation\022\027\n\017partial_failur" +
      "e\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\177\n\030Shared" +
      "CriterionOperation\022D\n\006create\030\001 \001(\01322.goo" +
      "gle.ads.googleads.v2.resources.SharedCri" +
      "terionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"" +
      "\241\001\n\034MutateSharedCriteriaResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022N\n\007results\030\002 \003(\0132=.google.ads.google" +
      "ads.v2.services.MutateSharedCriterionRes" +
      "ult\"4\n\033MutateSharedCriterionResult\022\025\n\rre" +
      "source_name\030\001 \001(\t2\317\003\n\026SharedCriterionSer" +
      "vice\022\277\001\n\022GetSharedCriterion\022;.google.ads" +
      ".googleads.v2.services.GetSharedCriterio" +
      "nRequest\0322.google.ads.googleads.v2.resou" +
      "rces.SharedCriterion\"8\202\323\344\223\0022\0220/v2/{resou" +
      "rce_name=customers/*/sharedCriteria/*}\022\325" +
      "\001\n\024MutateSharedCriteria\022=.google.ads.goo" +
      "gleads.v2.services.MutateSharedCriteriaR" +
      "equest\032>.google.ads.googleads.v2.service" +
      "s.MutateSharedCriteriaResponse\">\202\323\344\223\0028\"3" +
      "/v2/customers/{customer_id=*}/sharedCrit" +
      "eria:mutate:\001*\032\033\312A\030googleads.googleapis." +
      "comB\202\002\n$com.google.ads.googleads.v2.serv" +
      "icesB\033SharedCriterionServiceProtoP\001ZHgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v2/services;services\242\002\003GAA\252\002 Go" +
      "ogle.Ads.GoogleAds.V2.Services\312\002 Google\\" +
      "Ads\\GoogleAds\\V2\\Services\352\002$Google::Ads:" +
      ":GoogleAds::V2::Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetSharedCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetSharedCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetSharedCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
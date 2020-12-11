// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/conversion_upload_service.proto

package com.google.ads.googleads.v6.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_UploadClickConversionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_UploadClickConversionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_UploadCallConversionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_UploadCallConversionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_ClickConversion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_CallConversion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_ExternalAttributionData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_ClickConversionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_CallConversionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CallConversionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "@google/ads/googleads/v6/services/conversion_upload_service.proto\022 google.ads.g"
          + "oogleads.v6.services\032\034google/api/annotat"
          + "ions.proto\032\027google/api/client.proto\032\037goo"
          + "gle/api/field_behavior.proto\032\027google/rpc/status.proto\"\273\001\n"
          + "\035UploadClickConversionsRequest\022\030\n"
          + "\013customer_id\030\001 \001(\tB\003\340A\002\022K\n"
          + "\013conversions\030\002"
          + " \003(\01321.google.ads.googleads.v6.services.ClickConversionB\003\340A\002\022\034\n"
          + "\017partial_failure\030\003 \001(\010B\003\340A\002\022\025\n\r"
          + "validate_only\030\004 \001(\010\"\235\001\n"
          + "\036UploadClickConversionsResponse\0221\n"
          + "\025partial_failure_error\030\001 \001(\0132\022.google.rpc.Status\022H\n"
          + "\007results\030\002 \003(\01327.google.ads."
          + "googleads.v6.services.ClickConversionResult\"\271\001\n"
          + "\034UploadCallConversionsRequest\022\030\n"
          + "\013customer_id\030\001 \001(\tB\003\340A\002\022J\n"
          + "\013conversions\030\002 "
          + "\003(\01320.google.ads.googleads.v6.services.CallConversionB\003\340A\002\022\034\n"
          + "\017partial_failure\030\003 \001(\010B\003\340A\002\022\025\n\r"
          + "validate_only\030\004 \001(\010\"\233\001\n"
          + "\035UploadCallConversionsResponse\0221\n"
          + "\025partial_failure_error\030\001 \001(\0132\022.google.rpc.Status\022G\n"
          + "\007results\030\002"
          + " \003(\01326.google.ads.googleads.v6.services.CallConversionResult\"\205\003\n"
          + "\017ClickConversion\022\022\n"
          + "\005gclid\030\t \001(\tH\000\210\001\001\022\036\n"
          + "\021conversion_action\030\n"
          + " \001(\tH\001\210\001\001\022!\n"
          + "\024conversion_date_time\030\013 \001(\tH\002\210\001\001\022\035\n"
          + "\020conversion_value\030\014 \001(\001H\003\210\001\001\022\032\n\r"
          + "currency_code\030\r"
          + " \001(\tH\004\210\001\001\022\025\n"
          + "\010order_id\030\016 \001(\tH\005\210\001\001\022\\\n"
          + "\031external_attribution_data\030\007"
          + " \001(\01329.google.ads.googleads.v6.services.ExternalAttributionDataB\010\n"
          + "\006_gclidB\024\n"
          + "\022_conversion_actionB\027\n"
          + "\025_conversion_date_timeB\023\n"
          + "\021_conversion_valueB\020\n"
          + "\016_currency_codeB\013\n"
          + "\t_order_id\"\306\002\n"
          + "\016CallConversion\022\026\n"
          + "\tcaller_id\030\007 \001(\tH\000\210\001\001\022!\n"
          + "\024call_start_date_time\030\010 \001(\tH\001\210\001\001\022\036\n"
          + "\021conversion_action\030\t \001(\tH\002\210\001\001\022!\n"
          + "\024conversion_date_time\030\n"
          + " \001(\tH\003\210\001\001\022\035\n"
          + "\020conversion_value\030\013 \001(\001H\004\210\001\001\022\032\n"
          + "\r"
          + "currency_code\030\014 \001(\tH\005\210\001\001B\014\n\n"
          + "_caller_idB\027\n"
          + "\025_call_start_date_timeB\024\n"
          + "\022_conversion_actionB\027\n"
          + "\025_conversion_date_timeB\023\n"
          + "\021_conversion_valueB\020\n"
          + "\016_currency_code\"\253\001\n"
          + "\027ExternalAttributionData\022(\n"
          + "\033external_attribution_credit\030\003 \001(\001H\000\210\001\001\022\'\n"
          + "\032external_attribution_model\030\004 \001(\tH\001\210\001\001B\036\n"
          + "\034_external_attribution_creditB\035\n"
          + "\033_external_attribution_model\"\247\001\n"
          + "\025ClickConversionResult\022\022\n"
          + "\005gclid\030\004 \001(\tH\000\210\001\001\022\036\n"
          + "\021conversion_action\030\005 \001(\tH\001\210\001\001\022!\n"
          + "\024conversion_date_time\030\006 \001(\tH\002\210\001\001B\010\n"
          + "\006_gclidB\024\n"
          + "\022_conversion_actionB\027\n"
          + "\025_conversion_date_time\"\352\001\n"
          + "\024CallConversionResult\022\026\n"
          + "\tcaller_id\030\005 \001(\tH\000\210\001\001\022!\n"
          + "\024call_start_date_time\030\006 \001(\tH\001\210\001\001\022\036\n"
          + "\021conversion_action\030\007 \001(\tH\002\210\001\001\022!\n"
          + "\024conversion_date_time\030\010 \001(\tH\003\210\001\001B\014\n\n"
          + "_caller_idB\027\n"
          + "\025_call_start_date_timeB\024\n"
          + "\022_conversion_actionB\027\n"
          + "\025_conversion_date_time2\356\004\n"
          + "\027ConversionUploadService\022\206\002\n"
          + "\026UploadClickConversions\022?.google.ads.googleads.v6.services.UploadClickConvers"
          + "ionsRequest\032@.google.ads.googleads.v6.se"
          + "rvices.UploadClickConversionsResponse\"i\202"
          + "\323\344\223\0029\"4/v6/customers/{customer_id=*}:upl"
          + "oadClickConversions:\001*\332A\'customer_id,conversions,partial_failure\022\202\002\n"
          + "\025UploadCallConversions\022>.google.ads.googleads.v6.ser"
          + "vices.UploadCallConversionsRequest\032?.google.ads.googleads.v6.services.UploadCall"
          + "ConversionsResponse\"h\202\323\344\223\0028\"3/v6/custome"
          + "rs/{customer_id=*}:uploadCallConversions"
          + ":\001*\332A\'customer_id,conversions,partial_fa"
          + "ilure\032E\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwordsB\203\002\n"
          + "$com.google.ads.googleads.v6.servicesB\034C"
          + "onversionUploadServiceProtoP\001ZHgoogle.go"
          + "lang.org/genproto/googleapis/ads/googleads/v6/services;services\242\002\003GAA\252\002"
          + " Google.Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\Go"
          + "ogleAds\\V6\\Services\352\002$Google::Ads::GoogleAds::V6::Servicesb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_UploadClickConversionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_UploadClickConversionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_UploadClickConversionsRequest_descriptor,
            new java.lang.String[] {
              "CustomerId", "Conversions", "PartialFailure", "ValidateOnly",
            });
    internal_static_google_ads_googleads_v6_services_UploadClickConversionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_UploadClickConversionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_UploadClickConversionsResponse_descriptor,
            new java.lang.String[] {
              "PartialFailureError", "Results",
            });
    internal_static_google_ads_googleads_v6_services_UploadCallConversionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_UploadCallConversionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_UploadCallConversionsRequest_descriptor,
            new java.lang.String[] {
              "CustomerId", "Conversions", "PartialFailure", "ValidateOnly",
            });
    internal_static_google_ads_googleads_v6_services_UploadCallConversionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_UploadCallConversionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_UploadCallConversionsResponse_descriptor,
            new java.lang.String[] {
              "PartialFailureError", "Results",
            });
    internal_static_google_ads_googleads_v6_services_ClickConversion_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_ClickConversion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_ClickConversion_descriptor,
            new java.lang.String[] {
              "Gclid",
              "ConversionAction",
              "ConversionDateTime",
              "ConversionValue",
              "CurrencyCode",
              "OrderId",
              "ExternalAttributionData",
              "Gclid",
              "ConversionAction",
              "ConversionDateTime",
              "ConversionValue",
              "CurrencyCode",
              "OrderId",
            });
    internal_static_google_ads_googleads_v6_services_CallConversion_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_services_CallConversion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_CallConversion_descriptor,
            new java.lang.String[] {
              "CallerId",
              "CallStartDateTime",
              "ConversionAction",
              "ConversionDateTime",
              "ConversionValue",
              "CurrencyCode",
              "CallerId",
              "CallStartDateTime",
              "ConversionAction",
              "ConversionDateTime",
              "ConversionValue",
              "CurrencyCode",
            });
    internal_static_google_ads_googleads_v6_services_ExternalAttributionData_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_services_ExternalAttributionData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_ExternalAttributionData_descriptor,
            new java.lang.String[] {
              "ExternalAttributionCredit",
              "ExternalAttributionModel",
              "ExternalAttributionCredit",
              "ExternalAttributionModel",
            });
    internal_static_google_ads_googleads_v6_services_ClickConversionResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v6_services_ClickConversionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_ClickConversionResult_descriptor,
            new java.lang.String[] {
              "Gclid",
              "ConversionAction",
              "ConversionDateTime",
              "Gclid",
              "ConversionAction",
              "ConversionDateTime",
            });
    internal_static_google_ads_googleads_v6_services_CallConversionResult_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v6_services_CallConversionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_CallConversionResult_descriptor,
            new java.lang.String[] {
              "CallerId",
              "CallStartDateTime",
              "ConversionAction",
              "ConversionDateTime",
              "CallerId",
              "CallStartDateTime",
              "ConversionAction",
              "ConversionDateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

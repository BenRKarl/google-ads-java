// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/extensions.proto

package com.google.ads.googleads.v1.common;

public interface CallFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.CallFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   */
  com.google.protobuf.StringValue getPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPhoneNumberOrBuilder();

  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   */
  boolean hasCallTrackingEnabled();
  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   */
  com.google.protobuf.BoolValue getCallTrackingEnabled();
  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCallTrackingEnabledOrBuilder();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
   */
  boolean hasCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
   */
  com.google.protobuf.StringValue getCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCallConversionActionOrBuilder();

  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   */
  boolean hasCallConversionTrackingDisabled();
  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   */
  com.google.protobuf.BoolValue getCallConversionTrackingDisabled();
  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCallConversionTrackingDisabledOrBuilder();

  /**
   * <pre>
   * Enum value that indicates whether this call extension uses its own call
   * conversion setting (or just have call conversion disabled), or following
   * the account level setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
   */
  int getCallConversionReportingStateValue();
  /**
   * <pre>
   * Enum value that indicates whether this call extension uses its own call
   * conversion setting (or just have call conversion disabled), or following
   * the account level setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
   */
  com.google.ads.googleads.v1.enums.CallConversionReportingStateEnum.CallConversionReportingState getCallConversionReportingState();
}
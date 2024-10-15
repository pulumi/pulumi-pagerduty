// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertGroupingSettingConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertGroupingSettingConfig Empty = new GetAlertGroupingSettingConfig();

    /**
     * One of `any` or `all`. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`. Group alerts based on one or all of `fields` value(s).
     * 
     */
    @Import(name="aggregate")
    private @Nullable String aggregate;

    /**
     * @return One of `any` or `all`. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`. Group alerts based on one or all of `fields` value(s).
     * 
     */
    public Optional<String> aggregate() {
        return Optional.ofNullable(this.aggregate);
    }

    /**
     * Alerts will be grouped together if the content of these fields match. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return Alerts will be grouped together if the content of these fields match. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * The maximum amount of time allowed between Alerts. This setting applies only when `type` is set to `intelligent`, `content_based`, `content_based_intelligent`. Value must be between `300` and `3600` or exactly `86400` (86400 is supported only for `content_based` alert grouping). Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the recommended time window leave this value unset or set it to `null`.
     * 
     */
    @Import(name="timeWindow", required=true)
    private Integer timeWindow;

    /**
     * @return The maximum amount of time allowed between Alerts. This setting applies only when `type` is set to `intelligent`, `content_based`, `content_based_intelligent`. Value must be between `300` and `3600` or exactly `86400` (86400 is supported only for `content_based` alert grouping). Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the recommended time window leave this value unset or set it to `null`.
     * 
     */
    public Integer timeWindow() {
        return this.timeWindow;
    }

    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting is only required and applies when `type` is set to `time`. To continue grouping alerts until the incident is resolved leave this value unset or set it to `null`.
     * 
     */
    @Import(name="timeout", required=true)
    private Integer timeout;

    /**
     * @return The duration in minutes within which to automatically group incoming alerts. This setting is only required and applies when `type` is set to `time`. To continue grouping alerts until the incident is resolved leave this value unset or set it to `null`.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    private GetAlertGroupingSettingConfig() {}

    private GetAlertGroupingSettingConfig(GetAlertGroupingSettingConfig $) {
        this.aggregate = $.aggregate;
        this.fields = $.fields;
        this.timeWindow = $.timeWindow;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertGroupingSettingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertGroupingSettingConfig $;

        public Builder() {
            $ = new GetAlertGroupingSettingConfig();
        }

        public Builder(GetAlertGroupingSettingConfig defaults) {
            $ = new GetAlertGroupingSettingConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregate One of `any` or `all`. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`. Group alerts based on one or all of `fields` value(s).
         * 
         * @return builder
         * 
         */
        public Builder aggregate(@Nullable String aggregate) {
            $.aggregate = aggregate;
            return this;
        }

        /**
         * @param fields Alerts will be grouped together if the content of these fields match. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Alerts will be grouped together if the content of these fields match. This setting is only required and applies when `type` is set to `content_based` or `content_based_intelligent`.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param timeWindow The maximum amount of time allowed between Alerts. This setting applies only when `type` is set to `intelligent`, `content_based`, `content_based_intelligent`. Value must be between `300` and `3600` or exactly `86400` (86400 is supported only for `content_based` alert grouping). Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the recommended time window leave this value unset or set it to `null`.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(Integer timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeout The duration in minutes within which to automatically group incoming alerts. This setting is only required and applies when `type` is set to `time`. To continue grouping alerts until the incident is resolved leave this value unset or set it to `null`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            $.timeout = timeout;
            return this;
        }

        public GetAlertGroupingSettingConfig build() {
            if ($.timeWindow == null) {
                throw new MissingRequiredPropertyException("GetAlertGroupingSettingConfig", "timeWindow");
            }
            if ($.timeout == null) {
                throw new MissingRequiredPropertyException("GetAlertGroupingSettingConfig", "timeout");
            }
            return $;
        }
    }

}

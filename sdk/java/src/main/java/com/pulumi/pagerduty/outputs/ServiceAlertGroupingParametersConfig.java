// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAlertGroupingParametersConfig {
    /**
     * @return One of `any` or `all`. This setting applies only when `type` is set to `content_based`. Group alerts based on one or all of `fields` value(s).
     * 
     */
    private @Nullable String aggregate;
    /**
     * @return Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `content_based`.
     * 
     */
    private @Nullable List<String> fields;
    /**
     * @return The maximum amount of time allowed between Alerts. Value must be between `300` and `3600`. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours.
     * 
     */
    private @Nullable Integer timeWindow;
    /**
     * @return The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     * 
     */
    private @Nullable Integer timeout;

    private ServiceAlertGroupingParametersConfig() {}
    /**
     * @return One of `any` or `all`. This setting applies only when `type` is set to `content_based`. Group alerts based on one or all of `fields` value(s).
     * 
     */
    public Optional<String> aggregate() {
        return Optional.ofNullable(this.aggregate);
    }
    /**
     * @return Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `content_based`.
     * 
     */
    public List<String> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return The maximum amount of time allowed between Alerts. Value must be between `300` and `3600`. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours.
     * 
     */
    public Optional<Integer> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }
    /**
     * @return The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAlertGroupingParametersConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregate;
        private @Nullable List<String> fields;
        private @Nullable Integer timeWindow;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(ServiceAlertGroupingParametersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregate = defaults.aggregate;
    	      this.fields = defaults.fields;
    	      this.timeWindow = defaults.timeWindow;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder aggregate(@Nullable String aggregate) {

            this.aggregate = aggregate;
            return this;
        }
        @CustomType.Setter
        public Builder fields(@Nullable List<String> fields) {

            this.fields = fields;
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder timeWindow(@Nullable Integer timeWindow) {

            this.timeWindow = timeWindow;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public ServiceAlertGroupingParametersConfig build() {
            final var _resultValue = new ServiceAlertGroupingParametersConfig();
            _resultValue.aggregate = aggregate;
            _resultValue.fields = fields;
            _resultValue.timeWindow = timeWindow;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}

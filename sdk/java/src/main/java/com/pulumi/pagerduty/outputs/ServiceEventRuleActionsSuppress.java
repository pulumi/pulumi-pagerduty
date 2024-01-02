// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleActionsSuppress {
    /**
     * @return The number value of the `threshold_time_unit` before an incident is created.
     * 
     */
    private @Nullable Integer thresholdTimeAmount;
    /**
     * @return The `seconds`,`minutes`, or `hours` the `threshold_time_amount` should be measured.
     * 
     */
    private @Nullable String thresholdTimeUnit;
    /**
     * @return The number of alerts that should be suppressed.
     * 
     */
    private @Nullable Integer thresholdValue;
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    private @Nullable Boolean value;

    private ServiceEventRuleActionsSuppress() {}
    /**
     * @return The number value of the `threshold_time_unit` before an incident is created.
     * 
     */
    public Optional<Integer> thresholdTimeAmount() {
        return Optional.ofNullable(this.thresholdTimeAmount);
    }
    /**
     * @return The `seconds`,`minutes`, or `hours` the `threshold_time_amount` should be measured.
     * 
     */
    public Optional<String> thresholdTimeUnit() {
        return Optional.ofNullable(this.thresholdTimeUnit);
    }
    /**
     * @return The number of alerts that should be suppressed.
     * 
     */
    public Optional<Integer> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
    }
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<Boolean> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleActionsSuppress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer thresholdTimeAmount;
        private @Nullable String thresholdTimeUnit;
        private @Nullable Integer thresholdValue;
        private @Nullable Boolean value;
        public Builder() {}
        public Builder(ServiceEventRuleActionsSuppress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thresholdTimeAmount = defaults.thresholdTimeAmount;
    	      this.thresholdTimeUnit = defaults.thresholdTimeUnit;
    	      this.thresholdValue = defaults.thresholdValue;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder thresholdTimeAmount(@Nullable Integer thresholdTimeAmount) {

            this.thresholdTimeAmount = thresholdTimeAmount;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdTimeUnit(@Nullable String thresholdTimeUnit) {

            this.thresholdTimeUnit = thresholdTimeUnit;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdValue(@Nullable Integer thresholdValue) {

            this.thresholdValue = thresholdValue;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Boolean value) {

            this.value = value;
            return this;
        }
        public ServiceEventRuleActionsSuppress build() {
            final var _resultValue = new ServiceEventRuleActionsSuppress();
            _resultValue.thresholdTimeAmount = thresholdTimeAmount;
            _resultValue.thresholdTimeUnit = thresholdTimeUnit;
            _resultValue.thresholdValue = thresholdValue;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}

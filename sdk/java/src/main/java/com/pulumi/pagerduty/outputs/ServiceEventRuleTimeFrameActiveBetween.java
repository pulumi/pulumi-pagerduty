// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleTimeFrameActiveBetween {
    /**
     * @return Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     * 
     */
    private @Nullable Integer endTime;
    /**
     * @return Beginning of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     * 
     */
    private @Nullable Integer startTime;

    private ServiceEventRuleTimeFrameActiveBetween() {}
    /**
     * @return Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     * 
     */
    public Optional<Integer> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Beginning of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     * 
     */
    public Optional<Integer> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleTimeFrameActiveBetween defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer endTime;
        private @Nullable Integer startTime;
        public Builder() {}
        public Builder(ServiceEventRuleTimeFrameActiveBetween defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(@Nullable Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public ServiceEventRuleTimeFrameActiveBetween build() {
            final var o = new ServiceEventRuleTimeFrameActiveBetween();
            o.endTime = endTime;
            o.startTime = startTime;
            return o;
        }
    }
}

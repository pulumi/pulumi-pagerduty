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
    private final @Nullable Integer endTime;
    /**
     * @return Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `start_time` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `start_time` was `3,600,000` the it would be active starting at `01:00`.
     * 
     */
    private final @Nullable Integer startTime;

    @CustomType.Constructor
    private ServiceEventRuleTimeFrameActiveBetween(
        @CustomType.Parameter("endTime") @Nullable Integer endTime,
        @CustomType.Parameter("startTime") @Nullable Integer startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * @return Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     * 
     */
    public Optional<Integer> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `start_time` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `start_time` was `3,600,000` the it would be active starting at `01:00`.
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

    public static final class Builder {
        private @Nullable Integer endTime;
        private @Nullable Integer startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEventRuleTimeFrameActiveBetween defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(@Nullable Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder startTime(@Nullable Integer startTime) {
            this.startTime = startTime;
            return this;
        }        public ServiceEventRuleTimeFrameActiveBetween build() {
            return new ServiceEventRuleTimeFrameActiveBetween(endTime, startTime);
        }
    }
}

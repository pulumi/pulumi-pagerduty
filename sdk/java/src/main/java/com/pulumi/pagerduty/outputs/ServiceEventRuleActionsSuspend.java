// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleActionsSuspend {
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    private @Nullable Integer value;

    private ServiceEventRuleActionsSuspend() {}
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleActionsSuspend defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer value;
        public Builder() {}
        public Builder(ServiceEventRuleActionsSuspend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public ServiceEventRuleActionsSuspend build() {
            final var o = new ServiceEventRuleActionsSuspend();
            o.value = value;
            return o;
        }
    }
}

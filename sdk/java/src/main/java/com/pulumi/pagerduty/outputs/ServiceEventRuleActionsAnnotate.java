// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleActionsAnnotate {
    /**
     * @return The value for the operation. For example, an RE2 regular expression for regex-type variables.
     * 
     */
    private @Nullable String value;

    private ServiceEventRuleActionsAnnotate() {}
    /**
     * @return The value for the operation. For example, an RE2 regular expression for regex-type variables.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleActionsAnnotate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String value;
        public Builder() {}
        public Builder(ServiceEventRuleActionsAnnotate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ServiceEventRuleActionsAnnotate build() {
            final var o = new ServiceEventRuleActionsAnnotate();
            o.value = value;
            return o;
        }
    }
}

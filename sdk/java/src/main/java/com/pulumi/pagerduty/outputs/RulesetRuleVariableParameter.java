// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleVariableParameter {
    private @Nullable String path;
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    private @Nullable String value;

    private RulesetRuleVariableParameter() {}
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleVariableParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String path;
        private @Nullable String value;
        public Builder() {}
        public Builder(RulesetRuleVariableParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public RulesetRuleVariableParameter build() {
            final var o = new RulesetRuleVariableParameter();
            o.path = path;
            o.value = value;
            return o;
        }
    }
}
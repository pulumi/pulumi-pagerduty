// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionsSuspendArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionsSuspendArgs Empty = new RulesetRuleActionsSuspendArgs();

    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesetRuleActionsSuspendArgs() {}

    private RulesetRuleActionsSuspendArgs(RulesetRuleActionsSuspendArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionsSuspendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionsSuspendArgs $;

        public Builder() {
            $ = new RulesetRuleActionsSuspendArgs();
        }

        public Builder(RulesetRuleActionsSuspendArgs defaults) {
            $ = new RulesetRuleActionsSuspendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public RulesetRuleActionsSuspendArgs build() {
            return $;
        }
    }

}

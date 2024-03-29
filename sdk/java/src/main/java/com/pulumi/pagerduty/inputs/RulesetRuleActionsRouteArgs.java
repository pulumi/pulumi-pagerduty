// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionsRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionsRouteArgs Empty = new RulesetRuleActionsRouteArgs();

    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesetRuleActionsRouteArgs() {}

    private RulesetRuleActionsRouteArgs(RulesetRuleActionsRouteArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionsRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionsRouteArgs $;

        public Builder() {
            $ = new RulesetRuleActionsRouteArgs();
        }

        public Builder(RulesetRuleActionsRouteArgs defaults) {
            $ = new RulesetRuleActionsRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesetRuleActionsRouteArgs build() {
            return $;
        }
    }

}

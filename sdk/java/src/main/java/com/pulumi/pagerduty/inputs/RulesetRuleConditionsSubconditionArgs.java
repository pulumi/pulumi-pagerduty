// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.RulesetRuleConditionsSubconditionParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleConditionsSubconditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleConditionsSubconditionArgs Empty = new RulesetRuleConditionsSubconditionArgs();

    /**
     * Operator to combine sub-conditions. Can be `and` or `or`.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Operator to combine sub-conditions. Can be `and` or `or`.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Parameter for the sub-condition. It requires both a `path` and `value` to be set.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<RulesetRuleConditionsSubconditionParameterArgs>> parameters;

    /**
     * @return Parameter for the sub-condition. It requires both a `path` and `value` to be set.
     * 
     */
    public Optional<Output<List<RulesetRuleConditionsSubconditionParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private RulesetRuleConditionsSubconditionArgs() {}

    private RulesetRuleConditionsSubconditionArgs(RulesetRuleConditionsSubconditionArgs $) {
        this.operator = $.operator;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleConditionsSubconditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleConditionsSubconditionArgs $;

        public Builder() {
            $ = new RulesetRuleConditionsSubconditionArgs();
        }

        public Builder(RulesetRuleConditionsSubconditionArgs defaults) {
            $ = new RulesetRuleConditionsSubconditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator Operator to combine sub-conditions. Can be `and` or `or`.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Operator to combine sub-conditions. Can be `and` or `or`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param parameters Parameter for the sub-condition. It requires both a `path` and `value` to be set.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<RulesetRuleConditionsSubconditionParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameter for the sub-condition. It requires both a `path` and `value` to be set.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<RulesetRuleConditionsSubconditionParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Parameter for the sub-condition. It requires both a `path` and `value` to be set.
         * 
         * @return builder
         * 
         */
        public Builder parameters(RulesetRuleConditionsSubconditionParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public RulesetRuleConditionsSubconditionArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.ServiceEventRuleConditionsSubconditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceEventRuleConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleConditionsArgs Empty = new ServiceEventRuleConditionsArgs();

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
     * List of sub-conditions that define the condition.
     * 
     */
    @Import(name="subconditions")
    private @Nullable Output<List<ServiceEventRuleConditionsSubconditionArgs>> subconditions;

    /**
     * @return List of sub-conditions that define the condition.
     * 
     */
    public Optional<Output<List<ServiceEventRuleConditionsSubconditionArgs>>> subconditions() {
        return Optional.ofNullable(this.subconditions);
    }

    private ServiceEventRuleConditionsArgs() {}

    private ServiceEventRuleConditionsArgs(ServiceEventRuleConditionsArgs $) {
        this.operator = $.operator;
        this.subconditions = $.subconditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleConditionsArgs $;

        public Builder() {
            $ = new ServiceEventRuleConditionsArgs();
        }

        public Builder(ServiceEventRuleConditionsArgs defaults) {
            $ = new ServiceEventRuleConditionsArgs(Objects.requireNonNull(defaults));
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
         * @param subconditions List of sub-conditions that define the condition.
         * 
         * @return builder
         * 
         */
        public Builder subconditions(@Nullable Output<List<ServiceEventRuleConditionsSubconditionArgs>> subconditions) {
            $.subconditions = subconditions;
            return this;
        }

        /**
         * @param subconditions List of sub-conditions that define the condition.
         * 
         * @return builder
         * 
         */
        public Builder subconditions(List<ServiceEventRuleConditionsSubconditionArgs> subconditions) {
            return subconditions(Output.of(subconditions));
        }

        /**
         * @param subconditions List of sub-conditions that define the condition.
         * 
         * @return builder
         * 
         */
        public Builder subconditions(ServiceEventRuleConditionsSubconditionArgs... subconditions) {
            return subconditions(List.of(subconditions));
        }

        public ServiceEventRuleConditionsArgs build() {
            return $;
        }
    }

}

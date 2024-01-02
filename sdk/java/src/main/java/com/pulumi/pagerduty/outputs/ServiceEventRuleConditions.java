// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.ServiceEventRuleConditionsSubcondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleConditions {
    /**
     * @return Operator to combine sub-conditions. Can be `and` or `or`.
     * 
     */
    private @Nullable String operator;
    /**
     * @return List of sub-conditions that define the condition.
     * 
     */
    private @Nullable List<ServiceEventRuleConditionsSubcondition> subconditions;

    private ServiceEventRuleConditions() {}
    /**
     * @return Operator to combine sub-conditions. Can be `and` or `or`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return List of sub-conditions that define the condition.
     * 
     */
    public List<ServiceEventRuleConditionsSubcondition> subconditions() {
        return this.subconditions == null ? List.of() : this.subconditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String operator;
        private @Nullable List<ServiceEventRuleConditionsSubcondition> subconditions;
        public Builder() {}
        public Builder(ServiceEventRuleConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.subconditions = defaults.subconditions;
        }

        @CustomType.Setter
        public Builder operator(@Nullable String operator) {

            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder subconditions(@Nullable List<ServiceEventRuleConditionsSubcondition> subconditions) {

            this.subconditions = subconditions;
            return this;
        }
        public Builder subconditions(ServiceEventRuleConditionsSubcondition... subconditions) {
            return subconditions(List.of(subconditions));
        }
        public ServiceEventRuleConditions build() {
            final var _resultValue = new ServiceEventRuleConditions();
            _resultValue.operator = operator;
            _resultValue.subconditions = subconditions;
            return _resultValue;
        }
    }
}

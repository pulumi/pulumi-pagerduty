// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EscalationPolicyRuleEscalationRuleAssignmentStrategy {
    /**
     * @return Can be `round_robin` or `assign_to_everyone`.
     * 
     */
    private @Nullable String type;

    private EscalationPolicyRuleEscalationRuleAssignmentStrategy() {}
    /**
     * @return Can be `round_robin` or `assign_to_everyone`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EscalationPolicyRuleEscalationRuleAssignmentStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        public Builder() {}
        public Builder(EscalationPolicyRuleEscalationRuleAssignmentStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public EscalationPolicyRuleEscalationRuleAssignmentStrategy build() {
            final var _resultValue = new EscalationPolicyRuleEscalationRuleAssignmentStrategy();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

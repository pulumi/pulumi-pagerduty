// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EscalationPolicyRuleTarget;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EscalationPolicyRule {
    /**
     * @return The number of minutes before an unacknowledged incident escalates away from this rule.
     * 
     */
    private Integer escalationDelayInMinutes;
    /**
     * @return A target ID
     * 
     */
    private @Nullable String id;
    private List<EscalationPolicyRuleTarget> targets;

    private EscalationPolicyRule() {}
    /**
     * @return The number of minutes before an unacknowledged incident escalates away from this rule.
     * 
     */
    public Integer escalationDelayInMinutes() {
        return this.escalationDelayInMinutes;
    }
    /**
     * @return A target ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public List<EscalationPolicyRuleTarget> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EscalationPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer escalationDelayInMinutes;
        private @Nullable String id;
        private List<EscalationPolicyRuleTarget> targets;
        public Builder() {}
        public Builder(EscalationPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.escalationDelayInMinutes = defaults.escalationDelayInMinutes;
    	      this.id = defaults.id;
    	      this.targets = defaults.targets;
        }

        @CustomType.Setter
        public Builder escalationDelayInMinutes(Integer escalationDelayInMinutes) {
            this.escalationDelayInMinutes = Objects.requireNonNull(escalationDelayInMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder targets(List<EscalationPolicyRuleTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(EscalationPolicyRuleTarget... targets) {
            return targets(List.of(targets));
        }
        public EscalationPolicyRule build() {
            final var o = new EscalationPolicyRule();
            o.escalationDelayInMinutes = escalationDelayInMinutes;
            o.id = id;
            o.targets = targets;
            return o;
        }
    }
}
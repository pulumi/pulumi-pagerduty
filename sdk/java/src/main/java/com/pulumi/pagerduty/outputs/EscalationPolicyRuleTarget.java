// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EscalationPolicyRuleTarget {
    /**
     * @return A target ID
     * 
     */
    private String id;
    /**
     * @return Can be `user_reference` or `schedule_reference`. Defaults to `user_reference`. For multiple users as example, repeat the target.
     * 
     */
    private @Nullable String type;

    private EscalationPolicyRuleTarget() {}
    /**
     * @return A target ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Can be `user_reference` or `schedule_reference`. Defaults to `user_reference`. For multiple users as example, repeat the target.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EscalationPolicyRuleTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String type;
        public Builder() {}
        public Builder(EscalationPolicyRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public EscalationPolicyRuleTarget build() {
            final var _resultValue = new EscalationPolicyRuleTarget();
            _resultValue.id = id;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

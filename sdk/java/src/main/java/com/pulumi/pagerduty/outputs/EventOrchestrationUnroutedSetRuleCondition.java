// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationUnroutedSetRuleCondition {
    /**
     * @return A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
     * 
     */
    private String expression;

    private EventOrchestrationUnroutedSetRuleCondition() {}
    /**
     * @return A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
     * 
     */
    public String expression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationUnroutedSetRuleCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        public Builder() {}
        public Builder(EventOrchestrationUnroutedSetRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public EventOrchestrationUnroutedSetRuleCondition build() {
            final var _resultValue = new EventOrchestrationUnroutedSetRuleCondition();
            _resultValue.expression = expression;
            return _resultValue;
        }
    }
}

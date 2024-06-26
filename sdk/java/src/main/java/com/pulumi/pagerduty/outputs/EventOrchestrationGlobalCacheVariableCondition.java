// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationGlobalCacheVariableCondition {
    /**
     * @return A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
     * 
     */
    private String expression;

    private EventOrchestrationGlobalCacheVariableCondition() {}
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

    public static Builder builder(EventOrchestrationGlobalCacheVariableCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        public Builder() {}
        public Builder(EventOrchestrationGlobalCacheVariableCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationGlobalCacheVariableCondition", "expression");
            }
            this.expression = expression;
            return this;
        }
        public EventOrchestrationGlobalCacheVariableCondition build() {
            final var _resultValue = new EventOrchestrationGlobalCacheVariableCondition();
            _resultValue.expression = expression;
            return _resultValue;
        }
    }
}

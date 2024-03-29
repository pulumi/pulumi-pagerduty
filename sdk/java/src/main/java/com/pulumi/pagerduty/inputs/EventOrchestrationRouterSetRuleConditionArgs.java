// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationRouterSetRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetRuleConditionArgs Empty = new EventOrchestrationRouterSetRuleConditionArgs();

    /**
     * A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private EventOrchestrationRouterSetRuleConditionArgs() {}

    private EventOrchestrationRouterSetRuleConditionArgs(EventOrchestrationRouterSetRuleConditionArgs $) {
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterSetRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterSetRuleConditionArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterSetRuleConditionArgs();
        }

        public Builder(EventOrchestrationRouterSetRuleConditionArgs defaults) {
            $ = new EventOrchestrationRouterSetRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public EventOrchestrationRouterSetRuleConditionArgs build() {
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterSetRuleConditionArgs", "expression");
            }
            return $;
        }
    }

}

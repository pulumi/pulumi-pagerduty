// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationRouterSetRuleActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetRuleActionsArgs Empty = new EventOrchestrationRouterSetRuleActionsArgs();

    /**
     * The ID of the target Service for the resulting alert.
     * 
     */
    @Import(name="routeTo", required=true)
    private Output<String> routeTo;

    /**
     * @return The ID of the target Service for the resulting alert.
     * 
     */
    public Output<String> routeTo() {
        return this.routeTo;
    }

    private EventOrchestrationRouterSetRuleActionsArgs() {}

    private EventOrchestrationRouterSetRuleActionsArgs(EventOrchestrationRouterSetRuleActionsArgs $) {
        this.routeTo = $.routeTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterSetRuleActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterSetRuleActionsArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterSetRuleActionsArgs();
        }

        public Builder(EventOrchestrationRouterSetRuleActionsArgs defaults) {
            $ = new EventOrchestrationRouterSetRuleActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeTo The ID of the target Service for the resulting alert.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(Output<String> routeTo) {
            $.routeTo = routeTo;
            return this;
        }

        /**
         * @param routeTo The ID of the target Service for the resulting alert.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(String routeTo) {
            return routeTo(Output.of(routeTo));
        }

        public EventOrchestrationRouterSetRuleActionsArgs build() {
            $.routeTo = Objects.requireNonNull($.routeTo, "expected parameter 'routeTo' to be non-null");
            return $;
        }
    }

}
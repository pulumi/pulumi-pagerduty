// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationRouterSetRuleActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetRuleActionsArgs Empty = new EventOrchestrationRouterSetRuleActionsArgs();

    /**
     * supports the following:
     * 
     */
    @Import(name="dynamicRouteTos")
    private @Nullable Output<List<EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs>> dynamicRouteTos;

    /**
     * @return supports the following:
     * 
     */
    public Optional<Output<List<EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs>>> dynamicRouteTos() {
        return Optional.ofNullable(this.dynamicRouteTos);
    }

    @Import(name="routeTo")
    private @Nullable Output<String> routeTo;

    public Optional<Output<String>> routeTo() {
        return Optional.ofNullable(this.routeTo);
    }

    private EventOrchestrationRouterSetRuleActionsArgs() {}

    private EventOrchestrationRouterSetRuleActionsArgs(EventOrchestrationRouterSetRuleActionsArgs $) {
        this.dynamicRouteTos = $.dynamicRouteTos;
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
         * @param dynamicRouteTos supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dynamicRouteTos(@Nullable Output<List<EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs>> dynamicRouteTos) {
            $.dynamicRouteTos = dynamicRouteTos;
            return this;
        }

        /**
         * @param dynamicRouteTos supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dynamicRouteTos(List<EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs> dynamicRouteTos) {
            return dynamicRouteTos(Output.of(dynamicRouteTos));
        }

        /**
         * @param dynamicRouteTos supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dynamicRouteTos(EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs... dynamicRouteTos) {
            return dynamicRouteTos(List.of(dynamicRouteTos));
        }

        public Builder routeTo(@Nullable Output<String> routeTo) {
            $.routeTo = routeTo;
            return this;
        }

        public Builder routeTo(String routeTo) {
            return routeTo(Output.of(routeTo));
        }

        public EventOrchestrationRouterSetRuleActionsArgs build() {
            return $;
        }
    }

}

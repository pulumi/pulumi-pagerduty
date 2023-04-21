// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationGlobalCatchAllActions;
import java.util.Objects;

@CustomType
public final class EventOrchestrationGlobalCatchAll {
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    private EventOrchestrationGlobalCatchAllActions actions;

    private EventOrchestrationGlobalCatchAll() {}
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    public EventOrchestrationGlobalCatchAllActions actions() {
        return this.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationGlobalCatchAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EventOrchestrationGlobalCatchAllActions actions;
        public Builder() {}
        public Builder(EventOrchestrationGlobalCatchAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
        }

        @CustomType.Setter
        public Builder actions(EventOrchestrationGlobalCatchAllActions actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public EventOrchestrationGlobalCatchAll build() {
            final var o = new EventOrchestrationGlobalCatchAll();
            o.actions = actions;
            return o;
        }
    }
}
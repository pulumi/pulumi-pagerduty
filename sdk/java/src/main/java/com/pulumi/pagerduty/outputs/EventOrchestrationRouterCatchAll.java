// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.EventOrchestrationRouterCatchAllActions;
import java.util.Objects;

@CustomType
public final class EventOrchestrationRouterCatchAll {
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident.
     * 
     */
    private EventOrchestrationRouterCatchAllActions actions;

    private EventOrchestrationRouterCatchAll() {}
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident.
     * 
     */
    public EventOrchestrationRouterCatchAllActions actions() {
        return this.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationRouterCatchAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EventOrchestrationRouterCatchAllActions actions;
        public Builder() {}
        public Builder(EventOrchestrationRouterCatchAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
        }

        @CustomType.Setter
        public Builder actions(EventOrchestrationRouterCatchAllActions actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationRouterCatchAll", "actions");
            }
            this.actions = actions;
            return this;
        }
        public EventOrchestrationRouterCatchAll build() {
            final var _resultValue = new EventOrchestrationRouterCatchAll();
            _resultValue.actions = actions;
            return _resultValue;
        }
    }
}

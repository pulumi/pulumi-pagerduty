// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.EventOrchestrationUnroutedCatchAllActions;
import java.util.Objects;

@CustomType
public final class EventOrchestrationUnroutedCatchAll {
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    private EventOrchestrationUnroutedCatchAllActions actions;

    private EventOrchestrationUnroutedCatchAll() {}
    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    public EventOrchestrationUnroutedCatchAllActions actions() {
        return this.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationUnroutedCatchAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EventOrchestrationUnroutedCatchAllActions actions;
        public Builder() {}
        public Builder(EventOrchestrationUnroutedCatchAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
        }

        @CustomType.Setter
        public Builder actions(EventOrchestrationUnroutedCatchAllActions actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationUnroutedCatchAll", "actions");
            }
            this.actions = actions;
            return this;
        }
        public EventOrchestrationUnroutedCatchAll build() {
            final var _resultValue = new EventOrchestrationUnroutedCatchAll();
            _resultValue.actions = actions;
            return _resultValue;
        }
    }
}

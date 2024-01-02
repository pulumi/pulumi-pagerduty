// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedCatchAllActionsArgs;
import java.util.Objects;


public final class EventOrchestrationUnroutedCatchAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationUnroutedCatchAllArgs Empty = new EventOrchestrationUnroutedCatchAllArgs();

    /**
     * These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    @Import(name="actions", required=true)
    private Output<EventOrchestrationUnroutedCatchAllActionsArgs> actions;

    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    public Output<EventOrchestrationUnroutedCatchAllActionsArgs> actions() {
        return this.actions;
    }

    private EventOrchestrationUnroutedCatchAllArgs() {}

    private EventOrchestrationUnroutedCatchAllArgs(EventOrchestrationUnroutedCatchAllArgs $) {
        this.actions = $.actions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationUnroutedCatchAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationUnroutedCatchAllArgs $;

        public Builder() {
            $ = new EventOrchestrationUnroutedCatchAllArgs();
        }

        public Builder(EventOrchestrationUnroutedCatchAllArgs defaults) {
            $ = new EventOrchestrationUnroutedCatchAllArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<EventOrchestrationUnroutedCatchAllActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(EventOrchestrationUnroutedCatchAllActionsArgs actions) {
            return actions(Output.of(actions));
        }

        public EventOrchestrationUnroutedCatchAllArgs build() {
            if ($.actions == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationUnroutedCatchAllArgs", "actions");
            }
            return $;
        }
    }

}

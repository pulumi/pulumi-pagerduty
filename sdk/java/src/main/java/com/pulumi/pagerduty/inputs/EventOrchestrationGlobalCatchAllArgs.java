// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalCatchAllActionsArgs;
import java.util.Objects;


public final class EventOrchestrationGlobalCatchAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalCatchAllArgs Empty = new EventOrchestrationGlobalCatchAllArgs();

    /**
     * These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    @Import(name="actions", required=true)
    private Output<EventOrchestrationGlobalCatchAllActionsArgs> actions;

    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    public Output<EventOrchestrationGlobalCatchAllActionsArgs> actions() {
        return this.actions;
    }

    private EventOrchestrationGlobalCatchAllArgs() {}

    private EventOrchestrationGlobalCatchAllArgs(EventOrchestrationGlobalCatchAllArgs $) {
        this.actions = $.actions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalCatchAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalCatchAllArgs $;

        public Builder() {
            $ = new EventOrchestrationGlobalCatchAllArgs();
        }

        public Builder(EventOrchestrationGlobalCatchAllArgs defaults) {
            $ = new EventOrchestrationGlobalCatchAllArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<EventOrchestrationGlobalCatchAllActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(EventOrchestrationGlobalCatchAllActionsArgs actions) {
            return actions(Output.of(actions));
        }

        public EventOrchestrationGlobalCatchAllArgs build() {
            if ($.actions == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationGlobalCatchAllArgs", "actions");
            }
            return $;
        }
    }

}

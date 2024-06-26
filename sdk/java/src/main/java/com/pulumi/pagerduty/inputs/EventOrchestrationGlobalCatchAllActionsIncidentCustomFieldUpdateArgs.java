// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs Empty = new EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs();

    /**
     * The custom field id
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The custom field id
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The value to assign to this custom field
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value to assign to this custom field
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs() {}

    private EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs(EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs $) {
        this.id = $.id;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs $;

        public Builder() {
            $ = new EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs();
        }

        public Builder(EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs defaults) {
            $ = new EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The custom field id
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The custom field id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param value The value to assign to this custom field
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to assign to this custom field
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs", "id");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateArgs", "value");
            }
            return $;
        }
    }

}

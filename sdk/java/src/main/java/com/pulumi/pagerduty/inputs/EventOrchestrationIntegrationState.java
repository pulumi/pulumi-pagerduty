// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationIntegrationParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationIntegrationState Empty = new EventOrchestrationIntegrationState();

    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    @Import(name="eventOrchestration")
    private @Nullable Output<String> eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    public Optional<Output<String>> eventOrchestration() {
        return Optional.ofNullable(this.eventOrchestration);
    }

    /**
     * Name/description of the Integration.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Name/description of the Integration.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="parameters")
    private @Nullable Output<List<EventOrchestrationIntegrationParameterArgs>> parameters;

    public Optional<Output<List<EventOrchestrationIntegrationParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private EventOrchestrationIntegrationState() {}

    private EventOrchestrationIntegrationState(EventOrchestrationIntegrationState $) {
        this.eventOrchestration = $.eventOrchestration;
        this.label = $.label;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationIntegrationState $;

        public Builder() {
            $ = new EventOrchestrationIntegrationState();
        }

        public Builder(EventOrchestrationIntegrationState defaults) {
            $ = new EventOrchestrationIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(@Nullable Output<String> eventOrchestration) {
            $.eventOrchestration = eventOrchestration;
            return this;
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(String eventOrchestration) {
            return eventOrchestration(Output.of(eventOrchestration));
        }

        /**
         * @param label Name/description of the Integration.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Name/description of the Integration.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder parameters(@Nullable Output<List<EventOrchestrationIntegrationParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<EventOrchestrationIntegrationParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(EventOrchestrationIntegrationParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public EventOrchestrationIntegrationState build() {
            return $;
        }
    }

}

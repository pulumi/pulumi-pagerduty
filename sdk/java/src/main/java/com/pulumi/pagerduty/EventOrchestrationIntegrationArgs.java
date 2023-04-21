// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationIntegrationArgs Empty = new EventOrchestrationIntegrationArgs();

    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    @Import(name="eventOrchestration", required=true)
    private Output<String> eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    public Output<String> eventOrchestration() {
        return this.eventOrchestration;
    }

    /**
     * Name/description of the Integration.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return Name/description of the Integration.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    private EventOrchestrationIntegrationArgs() {}

    private EventOrchestrationIntegrationArgs(EventOrchestrationIntegrationArgs $) {
        this.eventOrchestration = $.eventOrchestration;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationIntegrationArgs $;

        public Builder() {
            $ = new EventOrchestrationIntegrationArgs();
        }

        public Builder(EventOrchestrationIntegrationArgs defaults) {
            $ = new EventOrchestrationIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(Output<String> eventOrchestration) {
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
        public Builder label(Output<String> label) {
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

        public EventOrchestrationIntegrationArgs build() {
            $.eventOrchestration = Objects.requireNonNull($.eventOrchestration, "expected parameter 'eventOrchestration' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
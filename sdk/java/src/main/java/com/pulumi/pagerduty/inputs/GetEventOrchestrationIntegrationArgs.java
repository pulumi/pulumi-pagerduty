// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventOrchestrationIntegrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationIntegrationArgs Empty = new GetEventOrchestrationIntegrationArgs();

    /**
     * ID of the Event Orchestration to which this Integration belongs.
     * 
     */
    @Import(name="eventOrchestration", required=true)
    private Output<String> eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Integration belongs.
     * 
     */
    public Output<String> eventOrchestration() {
        return this.eventOrchestration;
    }

    /**
     * ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    private GetEventOrchestrationIntegrationArgs() {}

    private GetEventOrchestrationIntegrationArgs(GetEventOrchestrationIntegrationArgs $) {
        this.eventOrchestration = $.eventOrchestration;
        this.id = $.id;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationIntegrationArgs $;

        public Builder() {
            $ = new GetEventOrchestrationIntegrationArgs();
        }

        public Builder(GetEventOrchestrationIntegrationArgs defaults) {
            $ = new GetEventOrchestrationIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(Output<String> eventOrchestration) {
            $.eventOrchestration = eventOrchestration;
            return this;
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(String eventOrchestration) {
            return eventOrchestration(Output.of(eventOrchestration));
        }

        /**
         * @param id ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param label Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public GetEventOrchestrationIntegrationArgs build() {
            $.eventOrchestration = Objects.requireNonNull($.eventOrchestration, "expected parameter 'eventOrchestration' to be non-null");
            return $;
        }
    }

}

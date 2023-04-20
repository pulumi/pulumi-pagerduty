// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventOrchestrationIntegrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationIntegrationPlainArgs Empty = new GetEventOrchestrationIntegrationPlainArgs();

    /**
     * ID of the Event Orchestration to which this Integration belongs.
     * 
     */
    @Import(name="eventOrchestration", required=true)
    private String eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Integration belongs.
     * 
     */
    public String eventOrchestration() {
        return this.eventOrchestration;
    }

    /**
     * ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    private GetEventOrchestrationIntegrationPlainArgs() {}

    private GetEventOrchestrationIntegrationPlainArgs(GetEventOrchestrationIntegrationPlainArgs $) {
        this.eventOrchestration = $.eventOrchestration;
        this.id = $.id;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationIntegrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationIntegrationPlainArgs $;

        public Builder() {
            $ = new GetEventOrchestrationIntegrationPlainArgs();
        }

        public Builder(GetEventOrchestrationIntegrationPlainArgs defaults) {
            $ = new GetEventOrchestrationIntegrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Integration belongs.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(String eventOrchestration) {
            $.eventOrchestration = eventOrchestration;
            return this;
        }

        /**
         * @param id ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param label Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public GetEventOrchestrationIntegrationPlainArgs build() {
            $.eventOrchestration = Objects.requireNonNull($.eventOrchestration, "expected parameter 'eventOrchestration' to be non-null");
            return $;
        }
    }

}

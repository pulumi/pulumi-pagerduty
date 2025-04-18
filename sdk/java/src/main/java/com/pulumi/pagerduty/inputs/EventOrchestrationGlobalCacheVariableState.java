// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalCacheVariableConditionArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalCacheVariableConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationGlobalCacheVariableState extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalCacheVariableState Empty = new EventOrchestrationGlobalCacheVariableState();

    /**
     * Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<EventOrchestrationGlobalCacheVariableConditionArgs>> conditions;

    /**
     * @return Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
     * 
     */
    public Optional<Output<List<EventOrchestrationGlobalCacheVariableConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * A configuration object to define what and how values will be stored in the Cache Variable.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<EventOrchestrationGlobalCacheVariableConfigurationArgs> configuration;

    /**
     * @return A configuration object to define what and how values will be stored in the Cache Variable.
     * 
     */
    public Optional<Output<EventOrchestrationGlobalCacheVariableConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * ID of the Global Event Orchestration to which this Cache Variable belongs.
     * 
     */
    @Import(name="eventOrchestration")
    private @Nullable Output<String> eventOrchestration;

    /**
     * @return ID of the Global Event Orchestration to which this Cache Variable belongs.
     * 
     */
    public Optional<Output<String>> eventOrchestration() {
        return Optional.ofNullable(this.eventOrchestration);
    }

    /**
     * Name of the Cache Variable associated with the Global Event Orchestration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Cache Variable associated with the Global Event Orchestration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private EventOrchestrationGlobalCacheVariableState() {}

    private EventOrchestrationGlobalCacheVariableState(EventOrchestrationGlobalCacheVariableState $) {
        this.conditions = $.conditions;
        this.configuration = $.configuration;
        this.disabled = $.disabled;
        this.eventOrchestration = $.eventOrchestration;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalCacheVariableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalCacheVariableState $;

        public Builder() {
            $ = new EventOrchestrationGlobalCacheVariableState();
        }

        public Builder(EventOrchestrationGlobalCacheVariableState defaults) {
            $ = new EventOrchestrationGlobalCacheVariableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<EventOrchestrationGlobalCacheVariableConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<EventOrchestrationGlobalCacheVariableConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
         * 
         * @return builder
         * 
         */
        public Builder conditions(EventOrchestrationGlobalCacheVariableConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param configuration A configuration object to define what and how values will be stored in the Cache Variable.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<EventOrchestrationGlobalCacheVariableConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration A configuration object to define what and how values will be stored in the Cache Variable.
         * 
         * @return builder
         * 
         */
        public Builder configuration(EventOrchestrationGlobalCacheVariableConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param disabled Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param eventOrchestration ID of the Global Event Orchestration to which this Cache Variable belongs.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(@Nullable Output<String> eventOrchestration) {
            $.eventOrchestration = eventOrchestration;
            return this;
        }

        /**
         * @param eventOrchestration ID of the Global Event Orchestration to which this Cache Variable belongs.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(String eventOrchestration) {
            return eventOrchestration(Output.of(eventOrchestration));
        }

        /**
         * @param name Name of the Cache Variable associated with the Global Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Cache Variable associated with the Global Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EventOrchestrationGlobalCacheVariableState build() {
            return $;
        }
    }

}

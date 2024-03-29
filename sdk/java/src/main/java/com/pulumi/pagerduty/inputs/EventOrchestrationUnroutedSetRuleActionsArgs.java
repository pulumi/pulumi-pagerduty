// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedSetRuleActionsExtractionArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedSetRuleActionsVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationUnroutedSetRuleActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationUnroutedSetRuleActionsArgs Empty = new EventOrchestrationUnroutedSetRuleActionsArgs();

    /**
     * sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
     * 
     */
    @Import(name="eventAction")
    private @Nullable Output<String> eventAction;

    /**
     * @return sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
     * 
     */
    public Optional<Output<String>> eventAction() {
        return Optional.ofNullable(this.eventAction);
    }

    /**
     * Replace any CEF field or Custom Details object field using custom variables.
     * 
     */
    @Import(name="extractions")
    private @Nullable Output<List<EventOrchestrationUnroutedSetRuleActionsExtractionArgs>> extractions;

    /**
     * @return Replace any CEF field or Custom Details object field using custom variables.
     * 
     */
    public Optional<Output<List<EventOrchestrationUnroutedSetRuleActionsExtractionArgs>>> extractions() {
        return Optional.ofNullable(this.extractions);
    }

    /**
     * The ID of a Set from this Unrouted Orchestration whose rules you also want to use with events that match this rule.
     * 
     */
    @Import(name="routeTo")
    private @Nullable Output<String> routeTo;

    /**
     * @return The ID of a Set from this Unrouted Orchestration whose rules you also want to use with events that match this rule.
     * 
     */
    public Optional<Output<String>> routeTo() {
        return Optional.ofNullable(this.routeTo);
    }

    /**
     * sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<EventOrchestrationUnroutedSetRuleActionsVariableArgs>> variables;

    /**
     * @return Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    public Optional<Output<List<EventOrchestrationUnroutedSetRuleActionsVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private EventOrchestrationUnroutedSetRuleActionsArgs() {}

    private EventOrchestrationUnroutedSetRuleActionsArgs(EventOrchestrationUnroutedSetRuleActionsArgs $) {
        this.eventAction = $.eventAction;
        this.extractions = $.extractions;
        this.routeTo = $.routeTo;
        this.severity = $.severity;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationUnroutedSetRuleActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationUnroutedSetRuleActionsArgs $;

        public Builder() {
            $ = new EventOrchestrationUnroutedSetRuleActionsArgs();
        }

        public Builder(EventOrchestrationUnroutedSetRuleActionsArgs defaults) {
            $ = new EventOrchestrationUnroutedSetRuleActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventAction sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
         * 
         * @return builder
         * 
         */
        public Builder eventAction(@Nullable Output<String> eventAction) {
            $.eventAction = eventAction;
            return this;
        }

        /**
         * @param eventAction sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
         * 
         * @return builder
         * 
         */
        public Builder eventAction(String eventAction) {
            return eventAction(Output.of(eventAction));
        }

        /**
         * @param extractions Replace any CEF field or Custom Details object field using custom variables.
         * 
         * @return builder
         * 
         */
        public Builder extractions(@Nullable Output<List<EventOrchestrationUnroutedSetRuleActionsExtractionArgs>> extractions) {
            $.extractions = extractions;
            return this;
        }

        /**
         * @param extractions Replace any CEF field or Custom Details object field using custom variables.
         * 
         * @return builder
         * 
         */
        public Builder extractions(List<EventOrchestrationUnroutedSetRuleActionsExtractionArgs> extractions) {
            return extractions(Output.of(extractions));
        }

        /**
         * @param extractions Replace any CEF field or Custom Details object field using custom variables.
         * 
         * @return builder
         * 
         */
        public Builder extractions(EventOrchestrationUnroutedSetRuleActionsExtractionArgs... extractions) {
            return extractions(List.of(extractions));
        }

        /**
         * @param routeTo The ID of a Set from this Unrouted Orchestration whose rules you also want to use with events that match this rule.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(@Nullable Output<String> routeTo) {
            $.routeTo = routeTo;
            return this;
        }

        /**
         * @param routeTo The ID of a Set from this Unrouted Orchestration whose rules you also want to use with events that match this rule.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(String routeTo) {
            return routeTo(Output.of(routeTo));
        }

        /**
         * @param severity sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<EventOrchestrationUnroutedSetRuleActionsVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions.
         * 
         * @return builder
         * 
         */
        public Builder variables(List<EventOrchestrationUnroutedSetRuleActionsVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions.
         * 
         * @return builder
         * 
         */
        public Builder variables(EventOrchestrationUnroutedSetRuleActionsVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public EventOrchestrationUnroutedSetRuleActionsArgs build() {
            return $;
        }
    }

}

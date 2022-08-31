// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationUnroutedSetRuleActionsExtraction;
import com.pulumi.pagerduty.outputs.EventOrchestrationUnroutedSetRuleActionsVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationUnroutedSetRuleActions {
    /**
     * @return sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
     * 
     */
    private @Nullable String eventAction;
    /**
     * @return Replace any CEF field or Custom Details object field using custom variables.
     * 
     */
    private @Nullable List<EventOrchestrationUnroutedSetRuleActionsExtraction> extractions;
    /**
     * @return The ID of a Set from this Unrouted Orchestration whose rules you also want to use with event that match this rule.
     * 
     */
    private @Nullable String routeTo;
    /**
     * @return sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
     * 
     */
    private @Nullable String severity;
    /**
     * @return Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    private @Nullable List<EventOrchestrationUnroutedSetRuleActionsVariable> variables;

    private EventOrchestrationUnroutedSetRuleActions() {}
    /**
     * @return sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
     * 
     */
    public Optional<String> eventAction() {
        return Optional.ofNullable(this.eventAction);
    }
    /**
     * @return Replace any CEF field or Custom Details object field using custom variables.
     * 
     */
    public List<EventOrchestrationUnroutedSetRuleActionsExtraction> extractions() {
        return this.extractions == null ? List.of() : this.extractions;
    }
    /**
     * @return The ID of a Set from this Unrouted Orchestration whose rules you also want to use with event that match this rule.
     * 
     */
    public Optional<String> routeTo() {
        return Optional.ofNullable(this.routeTo);
    }
    /**
     * @return sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    public List<EventOrchestrationUnroutedSetRuleActionsVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationUnroutedSetRuleActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eventAction;
        private @Nullable List<EventOrchestrationUnroutedSetRuleActionsExtraction> extractions;
        private @Nullable String routeTo;
        private @Nullable String severity;
        private @Nullable List<EventOrchestrationUnroutedSetRuleActionsVariable> variables;
        public Builder() {}
        public Builder(EventOrchestrationUnroutedSetRuleActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventAction = defaults.eventAction;
    	      this.extractions = defaults.extractions;
    	      this.routeTo = defaults.routeTo;
    	      this.severity = defaults.severity;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder eventAction(@Nullable String eventAction) {
            this.eventAction = eventAction;
            return this;
        }
        @CustomType.Setter
        public Builder extractions(@Nullable List<EventOrchestrationUnroutedSetRuleActionsExtraction> extractions) {
            this.extractions = extractions;
            return this;
        }
        public Builder extractions(EventOrchestrationUnroutedSetRuleActionsExtraction... extractions) {
            return extractions(List.of(extractions));
        }
        @CustomType.Setter
        public Builder routeTo(@Nullable String routeTo) {
            this.routeTo = routeTo;
            return this;
        }
        @CustomType.Setter
        public Builder severity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<EventOrchestrationUnroutedSetRuleActionsVariable> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(EventOrchestrationUnroutedSetRuleActionsVariable... variables) {
            return variables(List.of(variables));
        }
        public EventOrchestrationUnroutedSetRuleActions build() {
            final var o = new EventOrchestrationUnroutedSetRuleActions();
            o.eventAction = eventAction;
            o.extractions = extractions;
            o.routeTo = routeTo;
            o.severity = severity;
            o.variables = variables;
            return o;
        }
    }
}

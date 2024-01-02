// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceCatchAllActionsAutomationAction;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceCatchAllActionsExtraction;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceCatchAllActionsVariable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationServiceCatchAllActions {
    /**
     * @return Add this text as a note on the resulting incident.
     * 
     */
    private @Nullable String annotate;
    /**
     * @return Create a [Webhook](https://support.pagerduty.com/docs/event-orchestration#webhooks) associated with the resulting incident.
     * 
     */
    private @Nullable EventOrchestrationServiceCatchAllActionsAutomationAction automationAction;
    /**
     * @return sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
     * 
     */
    private @Nullable String eventAction;
    /**
     * @return Replace any CEF field or Custom Details object field using custom variables.
     * 
     */
    private @Nullable List<EventOrchestrationServiceCatchAllActionsExtraction> extractions;
    /**
     * @return Configure a [Process Automation](https://support.pagerduty.com/docs/event-orchestration#process-automation) associated with the resulting incident.
     * 
     */
    private @Nullable EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction pagerdutyAutomationAction;
    /**
     * @return The ID of the priority you want to set on resulting incident. Consider using the `pagerduty.getPriority` data source.
     * 
     */
    private @Nullable String priority;
    /**
     * @return The ID of a Set from this Service Orchestration whose rules you also want to use with events that match this rule.
     * 
     */
    private @Nullable String routeTo;
    /**
     * @return sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
     * 
     */
    private @Nullable String severity;
    /**
     * @return Set whether the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
     * 
     */
    private @Nullable Boolean suppress;
    /**
     * @return The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won&#39;t create an incident for this alert.
     * 
     */
    private @Nullable Integer suspend;
    /**
     * @return Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    private @Nullable List<EventOrchestrationServiceCatchAllActionsVariable> variables;

    private EventOrchestrationServiceCatchAllActions() {}
    /**
     * @return Add this text as a note on the resulting incident.
     * 
     */
    public Optional<String> annotate() {
        return Optional.ofNullable(this.annotate);
    }
    /**
     * @return Create a [Webhook](https://support.pagerduty.com/docs/event-orchestration#webhooks) associated with the resulting incident.
     * 
     */
    public Optional<EventOrchestrationServiceCatchAllActionsAutomationAction> automationAction() {
        return Optional.ofNullable(this.automationAction);
    }
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
    public List<EventOrchestrationServiceCatchAllActionsExtraction> extractions() {
        return this.extractions == null ? List.of() : this.extractions;
    }
    /**
     * @return Configure a [Process Automation](https://support.pagerduty.com/docs/event-orchestration#process-automation) associated with the resulting incident.
     * 
     */
    public Optional<EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction> pagerdutyAutomationAction() {
        return Optional.ofNullable(this.pagerdutyAutomationAction);
    }
    /**
     * @return The ID of the priority you want to set on resulting incident. Consider using the `pagerduty.getPriority` data source.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The ID of a Set from this Service Orchestration whose rules you also want to use with events that match this rule.
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
     * @return Set whether the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
     * 
     */
    public Optional<Boolean> suppress() {
        return Optional.ofNullable(this.suppress);
    }
    /**
     * @return The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won&#39;t create an incident for this alert.
     * 
     */
    public Optional<Integer> suspend() {
        return Optional.ofNullable(this.suspend);
    }
    /**
     * @return Populate variables from event payloads and use those variables in other event actions.
     * 
     */
    public List<EventOrchestrationServiceCatchAllActionsVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationServiceCatchAllActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String annotate;
        private @Nullable EventOrchestrationServiceCatchAllActionsAutomationAction automationAction;
        private @Nullable String eventAction;
        private @Nullable List<EventOrchestrationServiceCatchAllActionsExtraction> extractions;
        private @Nullable EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction pagerdutyAutomationAction;
        private @Nullable String priority;
        private @Nullable String routeTo;
        private @Nullable String severity;
        private @Nullable Boolean suppress;
        private @Nullable Integer suspend;
        private @Nullable List<EventOrchestrationServiceCatchAllActionsVariable> variables;
        public Builder() {}
        public Builder(EventOrchestrationServiceCatchAllActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotate = defaults.annotate;
    	      this.automationAction = defaults.automationAction;
    	      this.eventAction = defaults.eventAction;
    	      this.extractions = defaults.extractions;
    	      this.pagerdutyAutomationAction = defaults.pagerdutyAutomationAction;
    	      this.priority = defaults.priority;
    	      this.routeTo = defaults.routeTo;
    	      this.severity = defaults.severity;
    	      this.suppress = defaults.suppress;
    	      this.suspend = defaults.suspend;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder annotate(@Nullable String annotate) {

            this.annotate = annotate;
            return this;
        }
        @CustomType.Setter
        public Builder automationAction(@Nullable EventOrchestrationServiceCatchAllActionsAutomationAction automationAction) {

            this.automationAction = automationAction;
            return this;
        }
        @CustomType.Setter
        public Builder eventAction(@Nullable String eventAction) {

            this.eventAction = eventAction;
            return this;
        }
        @CustomType.Setter
        public Builder extractions(@Nullable List<EventOrchestrationServiceCatchAllActionsExtraction> extractions) {

            this.extractions = extractions;
            return this;
        }
        public Builder extractions(EventOrchestrationServiceCatchAllActionsExtraction... extractions) {
            return extractions(List.of(extractions));
        }
        @CustomType.Setter
        public Builder pagerdutyAutomationAction(@Nullable EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction pagerdutyAutomationAction) {

            this.pagerdutyAutomationAction = pagerdutyAutomationAction;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {

            this.priority = priority;
            return this;
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
        public Builder suppress(@Nullable Boolean suppress) {

            this.suppress = suppress;
            return this;
        }
        @CustomType.Setter
        public Builder suspend(@Nullable Integer suspend) {

            this.suspend = suspend;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<EventOrchestrationServiceCatchAllActionsVariable> variables) {

            this.variables = variables;
            return this;
        }
        public Builder variables(EventOrchestrationServiceCatchAllActionsVariable... variables) {
            return variables(List.of(variables));
        }
        public EventOrchestrationServiceCatchAllActions build() {
            final var _resultValue = new EventOrchestrationServiceCatchAllActions();
            _resultValue.annotate = annotate;
            _resultValue.automationAction = automationAction;
            _resultValue.eventAction = eventAction;
            _resultValue.extractions = extractions;
            _resultValue.pagerdutyAutomationAction = pagerdutyAutomationAction;
            _resultValue.priority = priority;
            _resultValue.routeTo = routeTo;
            _resultValue.severity = severity;
            _resultValue.suppress = suppress;
            _resultValue.suspend = suspend;
            _resultValue.variables = variables;
            return _resultValue;
        }
    }
}

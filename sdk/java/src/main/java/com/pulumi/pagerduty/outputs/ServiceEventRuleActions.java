// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsAnnotate;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsEventAction;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsExtraction;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsPriority;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsSeverity;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsSuppress;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActionsSuspend;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleActions {
    /**
     * @return Note added to the event.
     * 
     */
    private @Nullable List<ServiceEventRuleActionsAnnotate> annotates;
    /**
     * @return An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     * 
     */
    private @Nullable List<ServiceEventRuleActionsEventAction> eventActions;
    /**
     * @return Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     * 
     */
    private @Nullable List<ServiceEventRuleActionsExtraction> extractions;
    /**
     * @return The ID of the priority applied to the event.
     * 
     */
    private @Nullable List<ServiceEventRuleActionsPriority> priorities;
    /**
     * @return The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
     * 
     */
    private @Nullable List<ServiceEventRuleActionsSeverity> severities;
    /**
     * @return Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
     * 
     */
    private @Nullable List<ServiceEventRuleActionsSuppress> suppresses;
    /**
     * @return An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering.
     * 
     */
    private @Nullable List<ServiceEventRuleActionsSuspend> suspends;

    private ServiceEventRuleActions() {}
    /**
     * @return Note added to the event.
     * 
     */
    public List<ServiceEventRuleActionsAnnotate> annotates() {
        return this.annotates == null ? List.of() : this.annotates;
    }
    /**
     * @return An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     * 
     */
    public List<ServiceEventRuleActionsEventAction> eventActions() {
        return this.eventActions == null ? List.of() : this.eventActions;
    }
    /**
     * @return Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     * 
     */
    public List<ServiceEventRuleActionsExtraction> extractions() {
        return this.extractions == null ? List.of() : this.extractions;
    }
    /**
     * @return The ID of the priority applied to the event.
     * 
     */
    public List<ServiceEventRuleActionsPriority> priorities() {
        return this.priorities == null ? List.of() : this.priorities;
    }
    /**
     * @return The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
     * 
     */
    public List<ServiceEventRuleActionsSeverity> severities() {
        return this.severities == null ? List.of() : this.severities;
    }
    /**
     * @return Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
     * 
     */
    public List<ServiceEventRuleActionsSuppress> suppresses() {
        return this.suppresses == null ? List.of() : this.suppresses;
    }
    /**
     * @return An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering.
     * 
     */
    public List<ServiceEventRuleActionsSuspend> suspends() {
        return this.suspends == null ? List.of() : this.suspends;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceEventRuleActionsAnnotate> annotates;
        private @Nullable List<ServiceEventRuleActionsEventAction> eventActions;
        private @Nullable List<ServiceEventRuleActionsExtraction> extractions;
        private @Nullable List<ServiceEventRuleActionsPriority> priorities;
        private @Nullable List<ServiceEventRuleActionsSeverity> severities;
        private @Nullable List<ServiceEventRuleActionsSuppress> suppresses;
        private @Nullable List<ServiceEventRuleActionsSuspend> suspends;
        public Builder() {}
        public Builder(ServiceEventRuleActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotates = defaults.annotates;
    	      this.eventActions = defaults.eventActions;
    	      this.extractions = defaults.extractions;
    	      this.priorities = defaults.priorities;
    	      this.severities = defaults.severities;
    	      this.suppresses = defaults.suppresses;
    	      this.suspends = defaults.suspends;
        }

        @CustomType.Setter
        public Builder annotates(@Nullable List<ServiceEventRuleActionsAnnotate> annotates) {

            this.annotates = annotates;
            return this;
        }
        public Builder annotates(ServiceEventRuleActionsAnnotate... annotates) {
            return annotates(List.of(annotates));
        }
        @CustomType.Setter
        public Builder eventActions(@Nullable List<ServiceEventRuleActionsEventAction> eventActions) {

            this.eventActions = eventActions;
            return this;
        }
        public Builder eventActions(ServiceEventRuleActionsEventAction... eventActions) {
            return eventActions(List.of(eventActions));
        }
        @CustomType.Setter
        public Builder extractions(@Nullable List<ServiceEventRuleActionsExtraction> extractions) {

            this.extractions = extractions;
            return this;
        }
        public Builder extractions(ServiceEventRuleActionsExtraction... extractions) {
            return extractions(List.of(extractions));
        }
        @CustomType.Setter
        public Builder priorities(@Nullable List<ServiceEventRuleActionsPriority> priorities) {

            this.priorities = priorities;
            return this;
        }
        public Builder priorities(ServiceEventRuleActionsPriority... priorities) {
            return priorities(List.of(priorities));
        }
        @CustomType.Setter
        public Builder severities(@Nullable List<ServiceEventRuleActionsSeverity> severities) {

            this.severities = severities;
            return this;
        }
        public Builder severities(ServiceEventRuleActionsSeverity... severities) {
            return severities(List.of(severities));
        }
        @CustomType.Setter
        public Builder suppresses(@Nullable List<ServiceEventRuleActionsSuppress> suppresses) {

            this.suppresses = suppresses;
            return this;
        }
        public Builder suppresses(ServiceEventRuleActionsSuppress... suppresses) {
            return suppresses(List.of(suppresses));
        }
        @CustomType.Setter
        public Builder suspends(@Nullable List<ServiceEventRuleActionsSuspend> suspends) {

            this.suspends = suspends;
            return this;
        }
        public Builder suspends(ServiceEventRuleActionsSuspend... suspends) {
            return suspends(List.of(suspends));
        }
        public ServiceEventRuleActions build() {
            final var _resultValue = new ServiceEventRuleActions();
            _resultValue.annotates = annotates;
            _resultValue.eventActions = eventActions;
            _resultValue.extractions = extractions;
            _resultValue.priorities = priorities;
            _resultValue.severities = severities;
            _resultValue.suppresses = suppresses;
            _resultValue.suspends = suspends;
            return _resultValue;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsAnnotate;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsEventAction;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsExtraction;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsPriority;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsRoute;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsSeverity;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsSuppress;
import com.pulumi.pagerduty.outputs.RulesetRuleActionsSuspend;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActions {
    /**
     * @return Note added to the event.
     * 
     */
    private final @Nullable List<RulesetRuleActionsAnnotate> annotates;
    /**
     * @return An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     * 
     */
    private final @Nullable List<RulesetRuleActionsEventAction> eventActions;
    /**
     * @return Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     * 
     */
    private final @Nullable List<RulesetRuleActionsExtraction> extractions;
    /**
     * @return The ID of the priority applied to the event.
     * 
     */
    private final @Nullable List<RulesetRuleActionsPriority> priorities;
    /**
     * @return The ID of the service where the event will be routed.
     * 
     */
    private final @Nullable List<RulesetRuleActionsRoute> routes;
    /**
     * @return The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`warning`,`error`, or `critical`.
     * 
     */
    private final @Nullable List<RulesetRuleActionsSeverity> severities;
    /**
     * @return Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident). Note: If a threshold is set, the rule must also have a `route` action.
     * 
     */
    private final @Nullable List<RulesetRuleActionsSuppress> suppresses;
    /**
     * @return An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering. Note: A rule with a `suspend` action must also have a `route` action.
     * 
     */
    private final @Nullable List<RulesetRuleActionsSuspend> suspends;

    @CustomType.Constructor
    private RulesetRuleActions(
        @CustomType.Parameter("annotates") @Nullable List<RulesetRuleActionsAnnotate> annotates,
        @CustomType.Parameter("eventActions") @Nullable List<RulesetRuleActionsEventAction> eventActions,
        @CustomType.Parameter("extractions") @Nullable List<RulesetRuleActionsExtraction> extractions,
        @CustomType.Parameter("priorities") @Nullable List<RulesetRuleActionsPriority> priorities,
        @CustomType.Parameter("routes") @Nullable List<RulesetRuleActionsRoute> routes,
        @CustomType.Parameter("severities") @Nullable List<RulesetRuleActionsSeverity> severities,
        @CustomType.Parameter("suppresses") @Nullable List<RulesetRuleActionsSuppress> suppresses,
        @CustomType.Parameter("suspends") @Nullable List<RulesetRuleActionsSuspend> suspends) {
        this.annotates = annotates;
        this.eventActions = eventActions;
        this.extractions = extractions;
        this.priorities = priorities;
        this.routes = routes;
        this.severities = severities;
        this.suppresses = suppresses;
        this.suspends = suspends;
    }

    /**
     * @return Note added to the event.
     * 
     */
    public List<RulesetRuleActionsAnnotate> annotates() {
        return this.annotates == null ? List.of() : this.annotates;
    }
    /**
     * @return An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     * 
     */
    public List<RulesetRuleActionsEventAction> eventActions() {
        return this.eventActions == null ? List.of() : this.eventActions;
    }
    /**
     * @return Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     * 
     */
    public List<RulesetRuleActionsExtraction> extractions() {
        return this.extractions == null ? List.of() : this.extractions;
    }
    /**
     * @return The ID of the priority applied to the event.
     * 
     */
    public List<RulesetRuleActionsPriority> priorities() {
        return this.priorities == null ? List.of() : this.priorities;
    }
    /**
     * @return The ID of the service where the event will be routed.
     * 
     */
    public List<RulesetRuleActionsRoute> routes() {
        return this.routes == null ? List.of() : this.routes;
    }
    /**
     * @return The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`warning`,`error`, or `critical`.
     * 
     */
    public List<RulesetRuleActionsSeverity> severities() {
        return this.severities == null ? List.of() : this.severities;
    }
    /**
     * @return Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident). Note: If a threshold is set, the rule must also have a `route` action.
     * 
     */
    public List<RulesetRuleActionsSuppress> suppresses() {
        return this.suppresses == null ? List.of() : this.suppresses;
    }
    /**
     * @return An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering. Note: A rule with a `suspend` action must also have a `route` action.
     * 
     */
    public List<RulesetRuleActionsSuspend> suspends() {
        return this.suspends == null ? List.of() : this.suspends;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RulesetRuleActionsAnnotate> annotates;
        private @Nullable List<RulesetRuleActionsEventAction> eventActions;
        private @Nullable List<RulesetRuleActionsExtraction> extractions;
        private @Nullable List<RulesetRuleActionsPriority> priorities;
        private @Nullable List<RulesetRuleActionsRoute> routes;
        private @Nullable List<RulesetRuleActionsSeverity> severities;
        private @Nullable List<RulesetRuleActionsSuppress> suppresses;
        private @Nullable List<RulesetRuleActionsSuspend> suspends;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetRuleActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotates = defaults.annotates;
    	      this.eventActions = defaults.eventActions;
    	      this.extractions = defaults.extractions;
    	      this.priorities = defaults.priorities;
    	      this.routes = defaults.routes;
    	      this.severities = defaults.severities;
    	      this.suppresses = defaults.suppresses;
    	      this.suspends = defaults.suspends;
        }

        public Builder annotates(@Nullable List<RulesetRuleActionsAnnotate> annotates) {
            this.annotates = annotates;
            return this;
        }
        public Builder annotates(RulesetRuleActionsAnnotate... annotates) {
            return annotates(List.of(annotates));
        }
        public Builder eventActions(@Nullable List<RulesetRuleActionsEventAction> eventActions) {
            this.eventActions = eventActions;
            return this;
        }
        public Builder eventActions(RulesetRuleActionsEventAction... eventActions) {
            return eventActions(List.of(eventActions));
        }
        public Builder extractions(@Nullable List<RulesetRuleActionsExtraction> extractions) {
            this.extractions = extractions;
            return this;
        }
        public Builder extractions(RulesetRuleActionsExtraction... extractions) {
            return extractions(List.of(extractions));
        }
        public Builder priorities(@Nullable List<RulesetRuleActionsPriority> priorities) {
            this.priorities = priorities;
            return this;
        }
        public Builder priorities(RulesetRuleActionsPriority... priorities) {
            return priorities(List.of(priorities));
        }
        public Builder routes(@Nullable List<RulesetRuleActionsRoute> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(RulesetRuleActionsRoute... routes) {
            return routes(List.of(routes));
        }
        public Builder severities(@Nullable List<RulesetRuleActionsSeverity> severities) {
            this.severities = severities;
            return this;
        }
        public Builder severities(RulesetRuleActionsSeverity... severities) {
            return severities(List.of(severities));
        }
        public Builder suppresses(@Nullable List<RulesetRuleActionsSuppress> suppresses) {
            this.suppresses = suppresses;
            return this;
        }
        public Builder suppresses(RulesetRuleActionsSuppress... suppresses) {
            return suppresses(List.of(suppresses));
        }
        public Builder suspends(@Nullable List<RulesetRuleActionsSuspend> suspends) {
            this.suspends = suspends;
            return this;
        }
        public Builder suspends(RulesetRuleActionsSuspend... suspends) {
            return suspends(List.of(suspends));
        }        public RulesetRuleActions build() {
            return new RulesetRuleActions(annotates, eventActions, extractions, priorities, routes, severities, suppresses, suspends);
        }
    }
}

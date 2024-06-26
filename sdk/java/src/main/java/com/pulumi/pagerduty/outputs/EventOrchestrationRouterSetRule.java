// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.EventOrchestrationRouterSetRuleActions;
import com.pulumi.pagerduty.outputs.EventOrchestrationRouterSetRuleCondition;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationRouterSetRule {
    /**
     * @return Actions that will be taken to change the resulting alert and incident, when an event matches this rule.
     * 
     */
    private EventOrchestrationRouterSetRuleActions actions;
    /**
     * @return Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
     * 
     */
    private @Nullable List<EventOrchestrationRouterSetRuleCondition> conditions;
    /**
     * @return Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return The ID of the rule within the `start` set.
     * 
     */
    private @Nullable String id;
    /**
     * @return A description of this rule&#39;s purpose.
     * 
     */
    private @Nullable String label;

    private EventOrchestrationRouterSetRule() {}
    /**
     * @return Actions that will be taken to change the resulting alert and incident, when an event matches this rule.
     * 
     */
    public EventOrchestrationRouterSetRuleActions actions() {
        return this.actions;
    }
    /**
     * @return Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
     * 
     */
    public List<EventOrchestrationRouterSetRuleCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return The ID of the rule within the `start` set.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A description of this rule&#39;s purpose.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationRouterSetRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EventOrchestrationRouterSetRuleActions actions;
        private @Nullable List<EventOrchestrationRouterSetRuleCondition> conditions;
        private @Nullable Boolean disabled;
        private @Nullable String id;
        private @Nullable String label;
        public Builder() {}
        public Builder(EventOrchestrationRouterSetRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
        }

        @CustomType.Setter
        public Builder actions(EventOrchestrationRouterSetRuleActions actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationRouterSetRule", "actions");
            }
            this.actions = actions;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<EventOrchestrationRouterSetRuleCondition> conditions) {

            this.conditions = conditions;
            return this;
        }
        public Builder conditions(EventOrchestrationRouterSetRuleCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        public EventOrchestrationRouterSetRule build() {
            final var _resultValue = new EventOrchestrationRouterSetRule();
            _resultValue.actions = actions;
            _resultValue.conditions = conditions;
            _resultValue.disabled = disabled;
            _resultValue.id = id;
            _resultValue.label = label;
            return _resultValue;
        }
    }
}

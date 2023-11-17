// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationRouterSetRuleActionsArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationRouterSetRuleConditionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationRouterSetRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetRuleArgs Empty = new EventOrchestrationRouterSetRuleArgs();

    /**
     * These are the actions that will be taken to change the resulting alert and incident.
     * 
     */
    @Import(name="actions", required=true)
    private Output<EventOrchestrationRouterSetRuleActionsArgs> actions;

    /**
     * @return These are the actions that will be taken to change the resulting alert and incident.
     * 
     */
    public Output<EventOrchestrationRouterSetRuleActionsArgs> actions() {
        return this.actions;
    }

    /**
     * Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<EventOrchestrationRouterSetRuleConditionArgs>> conditions;

    /**
     * @return Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
     * 
     */
    public Optional<Output<List<EventOrchestrationRouterSetRuleConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A description of this rule&#39;s purpose.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A description of this rule&#39;s purpose.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    private EventOrchestrationRouterSetRuleArgs() {}

    private EventOrchestrationRouterSetRuleArgs(EventOrchestrationRouterSetRuleArgs $) {
        this.actions = $.actions;
        this.conditions = $.conditions;
        this.disabled = $.disabled;
        this.id = $.id;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterSetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterSetRuleArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterSetRuleArgs();
        }

        public Builder(EventOrchestrationRouterSetRuleArgs defaults) {
            $ = new EventOrchestrationRouterSetRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<EventOrchestrationRouterSetRuleActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident.
         * 
         * @return builder
         * 
         */
        public Builder actions(EventOrchestrationRouterSetRuleActionsArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<EventOrchestrationRouterSetRuleConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<EventOrchestrationRouterSetRuleConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(EventOrchestrationRouterSetRuleConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param disabled Indicates whether the rule is disabled and would therefore not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Indicates whether the rule is disabled and would therefore not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param id ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param label A description of this rule&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A description of this rule&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public EventOrchestrationRouterSetRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            return $;
        }
    }

}

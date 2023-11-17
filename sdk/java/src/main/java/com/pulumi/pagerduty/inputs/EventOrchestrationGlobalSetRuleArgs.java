// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalSetRuleActionsArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalSetRuleConditionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationGlobalSetRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalSetRuleArgs Empty = new EventOrchestrationGlobalSetRuleArgs();

    /**
     * These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    @Import(name="actions", required=true)
    private Output<EventOrchestrationGlobalSetRuleActionsArgs> actions;

    /**
     * @return These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
     * 
     */
    public Output<EventOrchestrationGlobalSetRuleActionsArgs> actions() {
        return this.actions;
    }

    /**
     * Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<EventOrchestrationGlobalSetRuleConditionArgs>> conditions;

    /**
     * @return Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
     * 
     */
    public Optional<Output<List<EventOrchestrationGlobalSetRuleConditionArgs>>> conditions() {
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
     * The ID of this set of rules. Rules in other sets can route events into this set using the rule&#39;s `route_to` property.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this set of rules. Rules in other sets can route events into this set using the rule&#39;s `route_to` property.
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

    private EventOrchestrationGlobalSetRuleArgs() {}

    private EventOrchestrationGlobalSetRuleArgs(EventOrchestrationGlobalSetRuleArgs $) {
        this.actions = $.actions;
        this.conditions = $.conditions;
        this.disabled = $.disabled;
        this.id = $.id;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalSetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalSetRuleArgs $;

        public Builder() {
            $ = new EventOrchestrationGlobalSetRuleArgs();
        }

        public Builder(EventOrchestrationGlobalSetRuleArgs defaults) {
            $ = new EventOrchestrationGlobalSetRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<EventOrchestrationGlobalSetRuleActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
         * 
         * @return builder
         * 
         */
        public Builder actions(EventOrchestrationGlobalSetRuleActionsArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<EventOrchestrationGlobalSetRuleConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<EventOrchestrationGlobalSetRuleConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
         * 
         * @return builder
         * 
         */
        public Builder conditions(EventOrchestrationGlobalSetRuleConditionArgs... conditions) {
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
         * @param id The ID of this set of rules. Rules in other sets can route events into this set using the rule&#39;s `route_to` property.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this set of rules. Rules in other sets can route events into this set using the rule&#39;s `route_to` property.
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

        public EventOrchestrationGlobalSetRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            return $;
        }
    }

}

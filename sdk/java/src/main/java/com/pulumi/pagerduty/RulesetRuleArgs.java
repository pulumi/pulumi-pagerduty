// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.RulesetRuleActionsArgs;
import com.pulumi.pagerduty.inputs.RulesetRuleConditionsArgs;
import com.pulumi.pagerduty.inputs.RulesetRuleTimeFrameArgs;
import com.pulumi.pagerduty.inputs.RulesetRuleVariableArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleArgs Empty = new RulesetRuleArgs();

    /**
     * Actions to apply to an event if the conditions match.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<RulesetRuleActionsArgs> actions;

    /**
     * @return Actions to apply to an event if the conditions match.
     * 
     */
    public Optional<Output<RulesetRuleActionsArgs>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     * 
     */
    @Import(name="catchAll")
    private @Nullable Output<Boolean> catchAll;

    /**
     * @return Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     * 
     */
    public Optional<Output<Boolean>> catchAll() {
        return Optional.ofNullable(this.catchAll);
    }

    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<RulesetRuleConditionsArgs> conditions;

    /**
     * @return Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     * 
     */
    public Optional<Output<RulesetRuleConditionsArgs>> conditions() {
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
     * Position/index of the rule within the ruleset.
     * 
     */
    @Import(name="position")
    private @Nullable Output<Integer> position;

    /**
     * @return Position/index of the rule within the ruleset.
     * 
     */
    public Optional<Output<Integer>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The ID of the ruleset that the rule belongs to.
     * 
     */
    @Import(name="ruleset", required=true)
    private Output<String> ruleset;

    /**
     * @return The ID of the ruleset that the rule belongs to.
     * 
     */
    public Output<String> ruleset() {
        return this.ruleset;
    }

    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    @Import(name="timeFrame")
    private @Nullable Output<RulesetRuleTimeFrameArgs> timeFrame;

    /**
     * @return Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    public Optional<Output<RulesetRuleTimeFrameArgs>> timeFrame() {
        return Optional.ofNullable(this.timeFrame);
    }

    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<RulesetRuleVariableArgs>> variables;

    /**
     * @return Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    public Optional<Output<List<RulesetRuleVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private RulesetRuleArgs() {}

    private RulesetRuleArgs(RulesetRuleArgs $) {
        this.actions = $.actions;
        this.catchAll = $.catchAll;
        this.conditions = $.conditions;
        this.disabled = $.disabled;
        this.position = $.position;
        this.ruleset = $.ruleset;
        this.timeFrame = $.timeFrame;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleArgs $;

        public Builder() {
            $ = new RulesetRuleArgs();
        }

        public Builder(RulesetRuleArgs defaults) {
            $ = new RulesetRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Actions to apply to an event if the conditions match.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<RulesetRuleActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Actions to apply to an event if the conditions match.
         * 
         * @return builder
         * 
         */
        public Builder actions(RulesetRuleActionsArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param catchAll Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(@Nullable Output<Boolean> catchAll) {
            $.catchAll = catchAll;
            return this;
        }

        /**
         * @param catchAll Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(Boolean catchAll) {
            return catchAll(Output.of(catchAll));
        }

        /**
         * @param conditions Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<RulesetRuleConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
         * 
         * @return builder
         * 
         */
        public Builder conditions(RulesetRuleConditionsArgs conditions) {
            return conditions(Output.of(conditions));
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
         * @param position Position/index of the rule within the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position Position/index of the rule within the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param ruleset The ID of the ruleset that the rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder ruleset(Output<String> ruleset) {
            $.ruleset = ruleset;
            return this;
        }

        /**
         * @param ruleset The ID of the ruleset that the rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder ruleset(String ruleset) {
            return ruleset(Output.of(ruleset));
        }

        /**
         * @param timeFrame Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
         * 
         * @return builder
         * 
         */
        public Builder timeFrame(@Nullable Output<RulesetRuleTimeFrameArgs> timeFrame) {
            $.timeFrame = timeFrame;
            return this;
        }

        /**
         * @param timeFrame Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
         * 
         * @return builder
         * 
         */
        public Builder timeFrame(RulesetRuleTimeFrameArgs timeFrame) {
            return timeFrame(Output.of(timeFrame));
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<RulesetRuleVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
         * 
         * @return builder
         * 
         */
        public Builder variables(List<RulesetRuleVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
         * 
         * @return builder
         * 
         */
        public Builder variables(RulesetRuleVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public RulesetRuleArgs build() {
            $.ruleset = Objects.requireNonNull($.ruleset, "expected parameter 'ruleset' to be non-null");
            return $;
        }
    }

}
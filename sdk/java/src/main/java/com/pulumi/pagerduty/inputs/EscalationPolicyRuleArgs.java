// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EscalationPolicyRuleEscalationRuleAssignmentStrategyArgs;
import com.pulumi.pagerduty.inputs.EscalationPolicyRuleTargetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EscalationPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EscalationPolicyRuleArgs Empty = new EscalationPolicyRuleArgs();

    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     * 
     */
    @Import(name="escalationDelayInMinutes", required=true)
    private Output<Integer> escalationDelayInMinutes;

    /**
     * @return The number of minutes before an unacknowledged incident escalates away from this rule.
     * 
     */
    public Output<Integer> escalationDelayInMinutes() {
        return this.escalationDelayInMinutes;
    }

    /**
     * The strategy used to assign the escalation rule to an incident. Documented below.
     * 
     */
    @Import(name="escalationRuleAssignmentStrategy")
    private @Nullable Output<EscalationPolicyRuleEscalationRuleAssignmentStrategyArgs> escalationRuleAssignmentStrategy;

    /**
     * @return The strategy used to assign the escalation rule to an incident. Documented below.
     * 
     */
    public Optional<Output<EscalationPolicyRuleEscalationRuleAssignmentStrategyArgs>> escalationRuleAssignmentStrategy() {
        return Optional.ofNullable(this.escalationRuleAssignmentStrategy);
    }

    /**
     * A target ID
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A target ID
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="targets", required=true)
    private Output<List<EscalationPolicyRuleTargetArgs>> targets;

    public Output<List<EscalationPolicyRuleTargetArgs>> targets() {
        return this.targets;
    }

    private EscalationPolicyRuleArgs() {}

    private EscalationPolicyRuleArgs(EscalationPolicyRuleArgs $) {
        this.escalationDelayInMinutes = $.escalationDelayInMinutes;
        this.escalationRuleAssignmentStrategy = $.escalationRuleAssignmentStrategy;
        this.id = $.id;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EscalationPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EscalationPolicyRuleArgs $;

        public Builder() {
            $ = new EscalationPolicyRuleArgs();
        }

        public Builder(EscalationPolicyRuleArgs defaults) {
            $ = new EscalationPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param escalationDelayInMinutes The number of minutes before an unacknowledged incident escalates away from this rule.
         * 
         * @return builder
         * 
         */
        public Builder escalationDelayInMinutes(Output<Integer> escalationDelayInMinutes) {
            $.escalationDelayInMinutes = escalationDelayInMinutes;
            return this;
        }

        /**
         * @param escalationDelayInMinutes The number of minutes before an unacknowledged incident escalates away from this rule.
         * 
         * @return builder
         * 
         */
        public Builder escalationDelayInMinutes(Integer escalationDelayInMinutes) {
            return escalationDelayInMinutes(Output.of(escalationDelayInMinutes));
        }

        /**
         * @param escalationRuleAssignmentStrategy The strategy used to assign the escalation rule to an incident. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder escalationRuleAssignmentStrategy(@Nullable Output<EscalationPolicyRuleEscalationRuleAssignmentStrategyArgs> escalationRuleAssignmentStrategy) {
            $.escalationRuleAssignmentStrategy = escalationRuleAssignmentStrategy;
            return this;
        }

        /**
         * @param escalationRuleAssignmentStrategy The strategy used to assign the escalation rule to an incident. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder escalationRuleAssignmentStrategy(EscalationPolicyRuleEscalationRuleAssignmentStrategyArgs escalationRuleAssignmentStrategy) {
            return escalationRuleAssignmentStrategy(Output.of(escalationRuleAssignmentStrategy));
        }

        /**
         * @param id A target ID
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A target ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder targets(Output<List<EscalationPolicyRuleTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<EscalationPolicyRuleTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(EscalationPolicyRuleTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public EscalationPolicyRuleArgs build() {
            $.escalationDelayInMinutes = Objects.requireNonNull($.escalationDelayInMinutes, "expected parameter 'escalationDelayInMinutes' to be non-null");
            $.targets = Objects.requireNonNull($.targets, "expected parameter 'targets' to be non-null");
            return $;
        }
    }

}

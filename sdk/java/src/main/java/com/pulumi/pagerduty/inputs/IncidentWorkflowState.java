// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.IncidentWorkflowStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentWorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final IncidentWorkflowState Empty = new IncidentWorkflowState();

    /**
     * The description of the workflow.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the workflow.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the Incident Workflow is enabled or not. Disabled workflows will not be triggered, and will not count toward the account&#39;s enabled workflow limit.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<String> isEnabled;

    /**
     * @return Indicates whether the Incident Workflow is enabled or not. Disabled workflows will not be triggered, and will not count toward the account&#39;s enabled workflow limit.
     * 
     */
    public Optional<Output<String>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The name of the workflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The steps in the workflow.
     * 
     */
    @Import(name="steps")
    private @Nullable Output<List<IncidentWorkflowStepArgs>> steps;

    /**
     * @return The steps in the workflow.
     * 
     */
    public Optional<Output<List<IncidentWorkflowStepArgs>>> steps() {
        return Optional.ofNullable(this.steps);
    }

    /**
     * A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     * 
     */
    @Import(name="team")
    private @Nullable Output<String> team;

    /**
     * @return A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     * 
     */
    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    private IncidentWorkflowState() {}

    private IncidentWorkflowState(IncidentWorkflowState $) {
        this.description = $.description;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.steps = $.steps;
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentWorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentWorkflowState $;

        public Builder() {
            $ = new IncidentWorkflowState();
        }

        public Builder(IncidentWorkflowState defaults) {
            $ = new IncidentWorkflowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isEnabled Indicates whether the Incident Workflow is enabled or not. Disabled workflows will not be triggered, and will not count toward the account&#39;s enabled workflow limit.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<String> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Indicates whether the Incident Workflow is enabled or not. Disabled workflows will not be triggered, and will not count toward the account&#39;s enabled workflow limit.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(String isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param steps The steps in the workflow.
         * 
         * @return builder
         * 
         */
        public Builder steps(@Nullable Output<List<IncidentWorkflowStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps The steps in the workflow.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<IncidentWorkflowStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps The steps in the workflow.
         * 
         * @return builder
         * 
         */
        public Builder steps(IncidentWorkflowStepArgs... steps) {
            return steps(List.of(steps));
        }

        /**
         * @param team A team ID. If specified then workflow edit permissions will be scoped to members of this team.
         * 
         * @return builder
         * 
         */
        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team A team ID. If specified then workflow edit permissions will be scoped to members of this team.
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        public IncidentWorkflowState build() {
            return $;
        }
    }

}

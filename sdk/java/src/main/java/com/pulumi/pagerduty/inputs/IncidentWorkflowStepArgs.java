// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.IncidentWorkflowStepInputArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentWorkflowStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final IncidentWorkflowStepArgs Empty = new IncidentWorkflowStepArgs();

    /**
     * The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The ID of the incident workflow.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the incident workflow.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The list of inputs for the workflow action.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<IncidentWorkflowStepInputArgs>> inputs;

    /**
     * @return The list of inputs for the workflow action.
     * 
     */
    public Optional<Output<List<IncidentWorkflowStepInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The name of the workflow step.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the workflow step.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private IncidentWorkflowStepArgs() {}

    private IncidentWorkflowStepArgs(IncidentWorkflowStepArgs $) {
        this.action = $.action;
        this.id = $.id;
        this.inputs = $.inputs;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentWorkflowStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentWorkflowStepArgs $;

        public Builder() {
            $ = new IncidentWorkflowStepArgs();
        }

        public Builder(IncidentWorkflowStepArgs defaults) {
            $ = new IncidentWorkflowStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param id The ID of the incident workflow.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the incident workflow.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param inputs The list of inputs for the workflow action.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<IncidentWorkflowStepInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs The list of inputs for the workflow action.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<IncidentWorkflowStepInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs The list of inputs for the workflow action.
         * 
         * @return builder
         * 
         */
        public Builder inputs(IncidentWorkflowStepInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param name The name of the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IncidentWorkflowStepArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

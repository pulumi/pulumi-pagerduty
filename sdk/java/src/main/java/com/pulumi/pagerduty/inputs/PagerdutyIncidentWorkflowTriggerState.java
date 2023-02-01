// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagerdutyIncidentWorkflowTriggerState extends com.pulumi.resources.ResourceArgs {

    public static final PagerdutyIncidentWorkflowTriggerState Empty = new PagerdutyIncidentWorkflowTriggerState();

    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     * 
     */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     * 
     */
    @Import(name="subscribedToAllServices")
    private @Nullable Output<Boolean> subscribedToAllServices;

    /**
     * @return Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     * 
     */
    public Optional<Output<Boolean>> subscribedToAllServices() {
        return Optional.ofNullable(this.subscribedToAllServices);
    }

    /**
     * May be either `manual` or `conditional`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return May be either `manual` or `conditional`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The workflow ID for the workflow to trigger.
     * 
     */
    @Import(name="workflow")
    private @Nullable Output<String> workflow;

    /**
     * @return The workflow ID for the workflow to trigger.
     * 
     */
    public Optional<Output<String>> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    private PagerdutyIncidentWorkflowTriggerState() {}

    private PagerdutyIncidentWorkflowTriggerState(PagerdutyIncidentWorkflowTriggerState $) {
        this.condition = $.condition;
        this.services = $.services;
        this.subscribedToAllServices = $.subscribedToAllServices;
        this.type = $.type;
        this.workflow = $.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagerdutyIncidentWorkflowTriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagerdutyIncidentWorkflowTriggerState $;

        public Builder() {
            $ = new PagerdutyIncidentWorkflowTriggerState();
        }

        public Builder(PagerdutyIncidentWorkflowTriggerState defaults) {
            $ = new PagerdutyIncidentWorkflowTriggerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param services A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param subscribedToAllServices Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
         * 
         * @return builder
         * 
         */
        public Builder subscribedToAllServices(@Nullable Output<Boolean> subscribedToAllServices) {
            $.subscribedToAllServices = subscribedToAllServices;
            return this;
        }

        /**
         * @param subscribedToAllServices Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
         * 
         * @return builder
         * 
         */
        public Builder subscribedToAllServices(Boolean subscribedToAllServices) {
            return subscribedToAllServices(Output.of(subscribedToAllServices));
        }

        /**
         * @param type May be either `manual` or `conditional`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type May be either `manual` or `conditional`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param workflow The workflow ID for the workflow to trigger.
         * 
         * @return builder
         * 
         */
        public Builder workflow(@Nullable Output<String> workflow) {
            $.workflow = workflow;
            return this;
        }

        /**
         * @param workflow The workflow ID for the workflow to trigger.
         * 
         * @return builder
         * 
         */
        public Builder workflow(String workflow) {
            return workflow(Output.of(workflow));
        }

        public PagerdutyIncidentWorkflowTriggerState build() {
            return $;
        }
    }

}

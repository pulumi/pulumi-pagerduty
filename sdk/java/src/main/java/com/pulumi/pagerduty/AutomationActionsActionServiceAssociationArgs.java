// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AutomationActionsActionServiceAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationActionsActionServiceAssociationArgs Empty = new AutomationActionsActionServiceAssociationArgs();

    /**
     * Id of the action.
     * 
     */
    @Import(name="actionId", required=true)
    private Output<String> actionId;

    /**
     * @return Id of the action.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }

    /**
     * Id of the service associated to the action.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return Id of the service associated to the action.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private AutomationActionsActionServiceAssociationArgs() {}

    private AutomationActionsActionServiceAssociationArgs(AutomationActionsActionServiceAssociationArgs $) {
        this.actionId = $.actionId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionsActionServiceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionsActionServiceAssociationArgs $;

        public Builder() {
            $ = new AutomationActionsActionServiceAssociationArgs();
        }

        public Builder(AutomationActionsActionServiceAssociationArgs defaults) {
            $ = new AutomationActionsActionServiceAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId Id of the action.
         * 
         * @return builder
         * 
         */
        public Builder actionId(Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        /**
         * @param actionId Id of the action.
         * 
         * @return builder
         * 
         */
        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        /**
         * @param serviceId Id of the service associated to the action.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId Id of the service associated to the action.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public AutomationActionsActionServiceAssociationArgs build() {
            $.actionId = Objects.requireNonNull($.actionId, "expected parameter 'actionId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}

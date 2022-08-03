// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs Empty = new EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs();

    /**
     * Id of the Process Automation action to be triggered.
     * 
     */
    @Import(name="actionId", required=true)
    private Output<String> actionId;

    /**
     * @return Id of the Process Automation action to be triggered.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }

    private EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs() {}

    private EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs(EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs $) {
        this.actionId = $.actionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs();
        }

        public Builder(EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs defaults) {
            $ = new EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId Id of the Process Automation action to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder actionId(Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        /**
         * @param actionId Id of the Process Automation action to be triggered.
         * 
         * @return builder
         * 
         */
        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        public EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs build() {
            $.actionId = Objects.requireNonNull($.actionId, "expected parameter 'actionId' to be non-null");
            return $;
        }
    }

}

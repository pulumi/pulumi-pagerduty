// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs Empty = new EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs();

    /**
     * Name to identify the header
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Name to identify the header
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Value of this header
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of this header
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs() {}

    private EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs(EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs();
        }

        public Builder(EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs defaults) {
            $ = new EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Name to identify the header
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Name to identify the header
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of this header
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of this header
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

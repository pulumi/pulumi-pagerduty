// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs Empty = new EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs();

    /**
     * Name to identify the parameter
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Name to identify the parameter
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs() {}

    private EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs(EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs();
        }

        public Builder(EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs defaults) {
            $ = new EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Name to identify the parameter
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Name to identify the parameter
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs", "value");
            }
            return $;
        }
    }

}

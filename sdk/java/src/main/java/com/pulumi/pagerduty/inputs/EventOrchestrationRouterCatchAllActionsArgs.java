// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationRouterCatchAllActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterCatchAllActionsArgs Empty = new EventOrchestrationRouterCatchAllActionsArgs();

    /**
     * Defines where an alert will be sent if doesn&#39;t match any rules. Can either be the ID of a Service _or_ the string `&#34;unrouted&#34;` to send events to the Unrouted Orchestration.
     * 
     */
    @Import(name="routeTo", required=true)
    private Output<String> routeTo;

    /**
     * @return Defines where an alert will be sent if doesn&#39;t match any rules. Can either be the ID of a Service _or_ the string `&#34;unrouted&#34;` to send events to the Unrouted Orchestration.
     * 
     */
    public Output<String> routeTo() {
        return this.routeTo;
    }

    private EventOrchestrationRouterCatchAllActionsArgs() {}

    private EventOrchestrationRouterCatchAllActionsArgs(EventOrchestrationRouterCatchAllActionsArgs $) {
        this.routeTo = $.routeTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterCatchAllActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterCatchAllActionsArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterCatchAllActionsArgs();
        }

        public Builder(EventOrchestrationRouterCatchAllActionsArgs defaults) {
            $ = new EventOrchestrationRouterCatchAllActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeTo Defines where an alert will be sent if doesn&#39;t match any rules. Can either be the ID of a Service _or_ the string `&#34;unrouted&#34;` to send events to the Unrouted Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(Output<String> routeTo) {
            $.routeTo = routeTo;
            return this;
        }

        /**
         * @param routeTo Defines where an alert will be sent if doesn&#39;t match any rules. Can either be the ID of a Service _or_ the string `&#34;unrouted&#34;` to send events to the Unrouted Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder routeTo(String routeTo) {
            return routeTo(Output.of(routeTo));
        }

        public EventOrchestrationRouterCatchAllActionsArgs build() {
            if ($.routeTo == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterCatchAllActionsArgs", "routeTo");
            }
            return $;
        }
    }

}

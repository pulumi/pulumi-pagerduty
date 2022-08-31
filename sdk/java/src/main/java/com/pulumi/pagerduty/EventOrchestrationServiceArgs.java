// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationServiceCatchAllArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationServiceSetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EventOrchestrationServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceArgs Empty = new EventOrchestrationServiceArgs();

    /**
     * the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    @Import(name="catchAll", required=true)
    private Output<EventOrchestrationServiceCatchAllArgs> catchAll;

    /**
     * @return the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    public Output<EventOrchestrationServiceCatchAllArgs> catchAll() {
        return this.catchAll;
    }

    /**
     * ID of the Service to which this Service Orchestration belongs to.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return ID of the Service to which this Service Orchestration belongs to.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    @Import(name="sets", required=true)
    private Output<List<EventOrchestrationServiceSetArgs>> sets;

    /**
     * @return A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    public Output<List<EventOrchestrationServiceSetArgs>> sets() {
        return this.sets;
    }

    private EventOrchestrationServiceArgs() {}

    private EventOrchestrationServiceArgs(EventOrchestrationServiceArgs $) {
        this.catchAll = $.catchAll;
        this.service = $.service;
        this.sets = $.sets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceArgs();
        }

        public Builder(EventOrchestrationServiceArgs defaults) {
            $ = new EventOrchestrationServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catchAll the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(Output<EventOrchestrationServiceCatchAllArgs> catchAll) {
            $.catchAll = catchAll;
            return this;
        }

        /**
         * @param catchAll the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(EventOrchestrationServiceCatchAllArgs catchAll) {
            return catchAll(Output.of(catchAll));
        }

        /**
         * @param service ID of the Service to which this Service Orchestration belongs to.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service ID of the Service to which this Service Orchestration belongs to.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param sets A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(Output<List<EventOrchestrationServiceSetArgs>> sets) {
            $.sets = sets;
            return this;
        }

        /**
         * @param sets A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(List<EventOrchestrationServiceSetArgs> sets) {
            return sets(Output.of(sets));
        }

        /**
         * @param sets A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(EventOrchestrationServiceSetArgs... sets) {
            return sets(List.of(sets));
        }

        public EventOrchestrationServiceArgs build() {
            $.catchAll = Objects.requireNonNull($.catchAll, "expected parameter 'catchAll' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.sets = Objects.requireNonNull($.sets, "expected parameter 'sets' to be non-null");
            return $;
        }
    }

}
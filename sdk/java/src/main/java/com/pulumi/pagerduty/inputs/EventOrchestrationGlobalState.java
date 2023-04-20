// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalCatchAllArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationGlobalSetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationGlobalState extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalState Empty = new EventOrchestrationGlobalState();

    /**
     * the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    @Import(name="catchAll")
    private @Nullable Output<EventOrchestrationGlobalCatchAllArgs> catchAll;

    /**
     * @return the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    public Optional<Output<EventOrchestrationGlobalCatchAllArgs>> catchAll() {
        return Optional.ofNullable(this.catchAll);
    }

    /**
     * ID of the Event Orchestration to which this Global Orchestration belongs to.
     * 
     */
    @Import(name="eventOrchestration")
    private @Nullable Output<String> eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Global Orchestration belongs to.
     * 
     */
    public Optional<Output<String>> eventOrchestration() {
        return Optional.ofNullable(this.eventOrchestration);
    }

    /**
     * A Global Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    @Import(name="sets")
    private @Nullable Output<List<EventOrchestrationGlobalSetArgs>> sets;

    /**
     * @return A Global Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    public Optional<Output<List<EventOrchestrationGlobalSetArgs>>> sets() {
        return Optional.ofNullable(this.sets);
    }

    private EventOrchestrationGlobalState() {}

    private EventOrchestrationGlobalState(EventOrchestrationGlobalState $) {
        this.catchAll = $.catchAll;
        this.eventOrchestration = $.eventOrchestration;
        this.sets = $.sets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalState $;

        public Builder() {
            $ = new EventOrchestrationGlobalState();
        }

        public Builder(EventOrchestrationGlobalState defaults) {
            $ = new EventOrchestrationGlobalState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catchAll the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(@Nullable Output<EventOrchestrationGlobalCatchAllArgs> catchAll) {
            $.catchAll = catchAll;
            return this;
        }

        /**
         * @param catchAll the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
         * 
         * @return builder
         * 
         */
        public Builder catchAll(EventOrchestrationGlobalCatchAllArgs catchAll) {
            return catchAll(Output.of(catchAll));
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Global Orchestration belongs to.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(@Nullable Output<String> eventOrchestration) {
            $.eventOrchestration = eventOrchestration;
            return this;
        }

        /**
         * @param eventOrchestration ID of the Event Orchestration to which this Global Orchestration belongs to.
         * 
         * @return builder
         * 
         */
        public Builder eventOrchestration(String eventOrchestration) {
            return eventOrchestration(Output.of(eventOrchestration));
        }

        /**
         * @param sets A Global Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(@Nullable Output<List<EventOrchestrationGlobalSetArgs>> sets) {
            $.sets = sets;
            return this;
        }

        /**
         * @param sets A Global Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(List<EventOrchestrationGlobalSetArgs> sets) {
            return sets(Output.of(sets));
        }

        /**
         * @param sets A Global Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
         * 
         * @return builder
         * 
         */
        public Builder sets(EventOrchestrationGlobalSetArgs... sets) {
            return sets(List.of(sets));
        }

        public EventOrchestrationGlobalState build() {
            return $;
        }
    }

}

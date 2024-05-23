// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlackConnectionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlackConnectionConfigArgs Empty = new SlackConnectionConfigArgs();

    /**
     * A list of strings to filter events by PagerDuty event type. `&#34;incident.triggered&#34;` is required. The follow event types are also possible:
     * - `incident.acknowledged`
     * - `incident.escalated`
     * - `incident.resolved`
     * - `incident.reassigned`
     * - `incident.annotated`
     * - `incident.unacknowledged`
     * - `incident.delegated`
     * - `incident.priority_updated`
     * - `incident.responder.added`
     * - `incident.responder.replied`
     * - `incident.status_update_published`
     * - `incident.reopened`
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return A list of strings to filter events by PagerDuty event type. `&#34;incident.triggered&#34;` is required. The follow event types are also possible:
     * - `incident.acknowledged`
     * - `incident.escalated`
     * - `incident.resolved`
     * - `incident.reassigned`
     * - `incident.annotated`
     * - `incident.unacknowledged`
     * - `incident.delegated`
     * - `incident.priority_updated`
     * - `incident.responder.added`
     * - `incident.responder.replied`
     * - `incident.status_update_published`
     * - `incident.reopened`
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
     * - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behaviour is to set `priorities` to `No Priority` value.
     * - When set to `[&#34;*&#34;]` its corresponding value for `priorities` in Slack Connection&#39;s configuration will be `Any Priority`.
     * 
     */
    @Import(name="priorities")
    private @Nullable Output<List<String>> priorities;

    /**
     * @return Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
     * - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behaviour is to set `priorities` to `No Priority` value.
     * - When set to `[&#34;*&#34;]` its corresponding value for `priorities` in Slack Connection&#39;s configuration will be `Any Priority`.
     * 
     */
    public Optional<Output<List<String>>> priorities() {
        return Optional.ofNullable(this.priorities);
    }

    /**
     * Allows you to filter events by urgency. Either `high` or `low`.
     * 
     */
    @Import(name="urgency")
    private @Nullable Output<String> urgency;

    /**
     * @return Allows you to filter events by urgency. Either `high` or `low`.
     * 
     */
    public Optional<Output<String>> urgency() {
        return Optional.ofNullable(this.urgency);
    }

    private SlackConnectionConfigArgs() {}

    private SlackConnectionConfigArgs(SlackConnectionConfigArgs $) {
        this.events = $.events;
        this.priorities = $.priorities;
        this.urgency = $.urgency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlackConnectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlackConnectionConfigArgs $;

        public Builder() {
            $ = new SlackConnectionConfigArgs();
        }

        public Builder(SlackConnectionConfigArgs defaults) {
            $ = new SlackConnectionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param events A list of strings to filter events by PagerDuty event type. `&#34;incident.triggered&#34;` is required. The follow event types are also possible:
         * - `incident.acknowledged`
         * - `incident.escalated`
         * - `incident.resolved`
         * - `incident.reassigned`
         * - `incident.annotated`
         * - `incident.unacknowledged`
         * - `incident.delegated`
         * - `incident.priority_updated`
         * - `incident.responder.added`
         * - `incident.responder.replied`
         * - `incident.status_update_published`
         * - `incident.reopened`
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events A list of strings to filter events by PagerDuty event type. `&#34;incident.triggered&#34;` is required. The follow event types are also possible:
         * - `incident.acknowledged`
         * - `incident.escalated`
         * - `incident.resolved`
         * - `incident.reassigned`
         * - `incident.annotated`
         * - `incident.unacknowledged`
         * - `incident.delegated`
         * - `incident.priority_updated`
         * - `incident.responder.added`
         * - `incident.responder.replied`
         * - `incident.status_update_published`
         * - `incident.reopened`
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events A list of strings to filter events by PagerDuty event type. `&#34;incident.triggered&#34;` is required. The follow event types are also possible:
         * - `incident.acknowledged`
         * - `incident.escalated`
         * - `incident.resolved`
         * - `incident.reassigned`
         * - `incident.annotated`
         * - `incident.unacknowledged`
         * - `incident.delegated`
         * - `incident.priority_updated`
         * - `incident.responder.added`
         * - `incident.responder.replied`
         * - `incident.status_update_published`
         * - `incident.reopened`
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param priorities Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
         * - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behaviour is to set `priorities` to `No Priority` value.
         * - When set to `[&#34;*&#34;]` its corresponding value for `priorities` in Slack Connection&#39;s configuration will be `Any Priority`.
         * 
         * @return builder
         * 
         */
        public Builder priorities(@Nullable Output<List<String>> priorities) {
            $.priorities = priorities;
            return this;
        }

        /**
         * @param priorities Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
         * - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behaviour is to set `priorities` to `No Priority` value.
         * - When set to `[&#34;*&#34;]` its corresponding value for `priorities` in Slack Connection&#39;s configuration will be `Any Priority`.
         * 
         * @return builder
         * 
         */
        public Builder priorities(List<String> priorities) {
            return priorities(Output.of(priorities));
        }

        /**
         * @param priorities Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
         * - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behaviour is to set `priorities` to `No Priority` value.
         * - When set to `[&#34;*&#34;]` its corresponding value for `priorities` in Slack Connection&#39;s configuration will be `Any Priority`.
         * 
         * @return builder
         * 
         */
        public Builder priorities(String... priorities) {
            return priorities(List.of(priorities));
        }

        /**
         * @param urgency Allows you to filter events by urgency. Either `high` or `low`.
         * 
         * @return builder
         * 
         */
        public Builder urgency(@Nullable Output<String> urgency) {
            $.urgency = urgency;
            return this;
        }

        /**
         * @param urgency Allows you to filter events by urgency. Either `high` or `low`.
         * 
         * @return builder
         * 
         */
        public Builder urgency(String urgency) {
            return urgency(Output.of(urgency));
        }

        public SlackConnectionConfigArgs build() {
            if ($.events == null) {
                throw new MissingRequiredPropertyException("SlackConnectionConfigArgs", "events");
            }
            return $;
        }
    }

}

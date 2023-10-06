// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs;
import com.pulumi.pagerduty.inputs.EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationServiceCatchAllActionsAutomationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceCatchAllActionsAutomationActionArgs Empty = new EventOrchestrationServiceCatchAllActionsAutomationActionArgs();

    /**
     * When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
     * 
     */
    @Import(name="autoSend")
    private @Nullable Output<Boolean> autoSend;

    /**
     * @return When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
     * 
     */
    public Optional<Output<Boolean>> autoSend() {
        return Optional.ofNullable(this.autoSend);
    }

    /**
     * Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs>> headers;

    /**
     * @return Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
     * 
     */
    public Optional<Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The name of the variable
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the variable
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs>> parameters;

    /**
     * @return Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
     * 
     */
    public Optional<Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The API endpoint where PagerDuty&#39;s servers will send the webhook request.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The API endpoint where PagerDuty&#39;s servers will send the webhook request.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private EventOrchestrationServiceCatchAllActionsAutomationActionArgs() {}

    private EventOrchestrationServiceCatchAllActionsAutomationActionArgs(EventOrchestrationServiceCatchAllActionsAutomationActionArgs $) {
        this.autoSend = $.autoSend;
        this.headers = $.headers;
        this.name = $.name;
        this.parameters = $.parameters;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceCatchAllActionsAutomationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceCatchAllActionsAutomationActionArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceCatchAllActionsAutomationActionArgs();
        }

        public Builder(EventOrchestrationServiceCatchAllActionsAutomationActionArgs defaults) {
            $ = new EventOrchestrationServiceCatchAllActionsAutomationActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoSend When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
         * 
         * @return builder
         * 
         */
        public Builder autoSend(@Nullable Output<Boolean> autoSend) {
            $.autoSend = autoSend;
            return this;
        }

        /**
         * @param autoSend When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
         * 
         * @return builder
         * 
         */
        public Builder autoSend(Boolean autoSend) {
            return autoSend(Output.of(autoSend));
        }

        /**
         * @param headers Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(EventOrchestrationServiceCatchAllActionsAutomationActionHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param name The name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
         * 
         * @return builder
         * 
         */
        public Builder parameters(EventOrchestrationServiceCatchAllActionsAutomationActionParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param url The API endpoint where PagerDuty&#39;s servers will send the webhook request.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The API endpoint where PagerDuty&#39;s servers will send the webhook request.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public EventOrchestrationServiceCatchAllActionsAutomationActionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}

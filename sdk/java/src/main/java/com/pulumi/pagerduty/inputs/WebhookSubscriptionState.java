// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.WebhookSubscriptionDeliveryMethodArgs;
import com.pulumi.pagerduty.inputs.WebhookSubscriptionFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookSubscriptionState Empty = new WebhookSubscriptionState();

    /**
     * Determines whether the subscription will produce webhook events.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Determines whether the subscription will produce webhook events.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The object describing where to send the webhooks.
     * 
     */
    @Import(name="deliveryMethods")
    private @Nullable Output<List<WebhookSubscriptionDeliveryMethodArgs>> deliveryMethods;

    /**
     * @return The object describing where to send the webhooks.
     * 
     */
    public Optional<Output<List<WebhookSubscriptionDeliveryMethodArgs>>> deliveryMethods() {
        return Optional.ofNullable(this.deliveryMethods);
    }

    /**
     * A short description of the webhook subscription
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the webhook subscription
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A set of outbound event types the webhook will receive. The follow event types are possible:
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<String>> events;

    /**
     * @return A set of outbound event types the webhook will receive. The follow event types are possible:
     * 
     */
    public Optional<Output<List<String>>> events() {
        return Optional.ofNullable(this.events);
    }

    /**
     * determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<WebhookSubscriptionFilterArgs>> filters;

    /**
     * @return determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
     * 
     */
    public Optional<Output<List<WebhookSubscriptionFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WebhookSubscriptionState() {}

    private WebhookSubscriptionState(WebhookSubscriptionState $) {
        this.active = $.active;
        this.deliveryMethods = $.deliveryMethods;
        this.description = $.description;
        this.events = $.events;
        this.filters = $.filters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookSubscriptionState $;

        public Builder() {
            $ = new WebhookSubscriptionState();
        }

        public Builder(WebhookSubscriptionState defaults) {
            $ = new WebhookSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Determines whether the subscription will produce webhook events.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Determines whether the subscription will produce webhook events.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param deliveryMethods The object describing where to send the webhooks.
         * 
         * @return builder
         * 
         */
        public Builder deliveryMethods(@Nullable Output<List<WebhookSubscriptionDeliveryMethodArgs>> deliveryMethods) {
            $.deliveryMethods = deliveryMethods;
            return this;
        }

        /**
         * @param deliveryMethods The object describing where to send the webhooks.
         * 
         * @return builder
         * 
         */
        public Builder deliveryMethods(List<WebhookSubscriptionDeliveryMethodArgs> deliveryMethods) {
            return deliveryMethods(Output.of(deliveryMethods));
        }

        /**
         * @param deliveryMethods The object describing where to send the webhooks.
         * 
         * @return builder
         * 
         */
        public Builder deliveryMethods(WebhookSubscriptionDeliveryMethodArgs... deliveryMethods) {
            return deliveryMethods(List.of(deliveryMethods));
        }

        /**
         * @param description A short description of the webhook subscription
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the webhook subscription
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param events A set of outbound event types the webhook will receive. The follow event types are possible:
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events A set of outbound event types the webhook will receive. The follow event types are possible:
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events A set of outbound event types the webhook will receive. The follow event types are possible:
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param filters determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<WebhookSubscriptionFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<WebhookSubscriptionFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
         * 
         * @return builder
         * 
         */
        public Builder filters(WebhookSubscriptionFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param type The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebhookSubscriptionState build() {
            return $;
        }
    }

}

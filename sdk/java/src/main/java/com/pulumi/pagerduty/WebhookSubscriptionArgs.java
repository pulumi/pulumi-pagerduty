// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.WebhookSubscriptionDeliveryMethodArgs;
import com.pulumi.pagerduty.inputs.WebhookSubscriptionFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookSubscriptionArgs Empty = new WebhookSubscriptionArgs();

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
    @Import(name="deliveryMethods", required=true)
    private Output<List<WebhookSubscriptionDeliveryMethodArgs>> deliveryMethods;

    /**
     * @return The object describing where to send the webhooks.
     * 
     */
    public Output<List<WebhookSubscriptionDeliveryMethodArgs>> deliveryMethods() {
        return this.deliveryMethods;
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
     * * `incident.acknowledged`
     * * `incident.annotated`
     * * `incident.delegated`
     * * `incident.escalated`
     * * `incident.priority_updated`
     * * `incident.reassigned`
     * * `incident.reopened`
     * * `incident.resolved`
     * * `incident.responder.added`
     * * `incident.responder.replied`
     * * `incident.status_update_published`
     * * `incident.triggered`
     * * `incident.unacknowledged`
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return A set of outbound event types the webhook will receive. The follow event types are possible:
     * * `incident.acknowledged`
     * * `incident.annotated`
     * * `incident.delegated`
     * * `incident.escalated`
     * * `incident.priority_updated`
     * * `incident.reassigned`
     * * `incident.reopened`
     * * `incident.resolved`
     * * `incident.responder.added`
     * * `incident.responder.replied`
     * * `incident.status_update_published`
     * * `incident.triggered`
     * * `incident.unacknowledged`
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<WebhookSubscriptionFilterArgs>> filters;

    /**
     * @return determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
     * 
     */
    public Output<List<WebhookSubscriptionFilterArgs>> filters() {
        return this.filters;
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

    private WebhookSubscriptionArgs() {}

    private WebhookSubscriptionArgs(WebhookSubscriptionArgs $) {
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
    public static Builder builder(WebhookSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookSubscriptionArgs $;

        public Builder() {
            $ = new WebhookSubscriptionArgs();
        }

        public Builder(WebhookSubscriptionArgs defaults) {
            $ = new WebhookSubscriptionArgs(Objects.requireNonNull(defaults));
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
        public Builder deliveryMethods(Output<List<WebhookSubscriptionDeliveryMethodArgs>> deliveryMethods) {
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
         * * `incident.acknowledged`
         * * `incident.annotated`
         * * `incident.delegated`
         * * `incident.escalated`
         * * `incident.priority_updated`
         * * `incident.reassigned`
         * * `incident.reopened`
         * * `incident.resolved`
         * * `incident.responder.added`
         * * `incident.responder.replied`
         * * `incident.status_update_published`
         * * `incident.triggered`
         * * `incident.unacknowledged`
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events A set of outbound event types the webhook will receive. The follow event types are possible:
         * * `incident.acknowledged`
         * * `incident.annotated`
         * * `incident.delegated`
         * * `incident.escalated`
         * * `incident.priority_updated`
         * * `incident.reassigned`
         * * `incident.reopened`
         * * `incident.resolved`
         * * `incident.responder.added`
         * * `incident.responder.replied`
         * * `incident.status_update_published`
         * * `incident.triggered`
         * * `incident.unacknowledged`
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events A set of outbound event types the webhook will receive. The follow event types are possible:
         * * `incident.acknowledged`
         * * `incident.annotated`
         * * `incident.delegated`
         * * `incident.escalated`
         * * `incident.priority_updated`
         * * `incident.reassigned`
         * * `incident.reopened`
         * * `incident.resolved`
         * * `incident.responder.added`
         * * `incident.responder.replied`
         * * `incident.status_update_published`
         * * `incident.triggered`
         * * `incident.unacknowledged`
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
        public Builder filters(Output<List<WebhookSubscriptionFilterArgs>> filters) {
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

        public WebhookSubscriptionArgs build() {
            if ($.deliveryMethods == null) {
                throw new MissingRequiredPropertyException("WebhookSubscriptionArgs", "deliveryMethods");
            }
            if ($.events == null) {
                throw new MissingRequiredPropertyException("WebhookSubscriptionArgs", "events");
            }
            if ($.filters == null) {
                throw new MissingRequiredPropertyException("WebhookSubscriptionArgs", "filters");
            }
            return $;
        }
    }

}

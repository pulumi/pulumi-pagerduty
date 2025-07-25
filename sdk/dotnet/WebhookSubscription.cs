// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [webhook subscription](https://developer.pagerduty.com/docs/ZG9jOjExMDI5NTkw-v3-overview) allow you to receive HTTP callbacks when incidents are created, updated and deleted. These are also known as V3 Webhooks.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = Pagerduty.GetService.Invoke(new()
    ///     {
    ///         Name = "My Service",
    ///     });
    /// 
    ///     var foo = new Pagerduty.WebhookSubscription("foo", new()
    ///     {
    ///         DeliveryMethods = new[]
    ///         {
    ///             new Pagerduty.Inputs.WebhookSubscriptionDeliveryMethodArgs
    ///             {
    ///                 Type = "http_delivery_method",
    ///                 Url = "https://example.com/receive_a_pagerduty_webhook",
    ///                 CustomHeaders = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.WebhookSubscriptionDeliveryMethodCustomHeaderArgs
    ///                     {
    ///                         Name = "X-Foo",
    ///                         Value = "foo",
    ///                     },
    ///                     new Pagerduty.Inputs.WebhookSubscriptionDeliveryMethodCustomHeaderArgs
    ///                     {
    ///                         Name = "X-Bar",
    ///                         Value = "bar",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Description = "%s",
    ///         Events = new[]
    ///         {
    ///             "incident.acknowledged",
    ///             "incident.annotated",
    ///             "incident.delegated",
    ///             "incident.escalated",
    ///             "incident.priority_updated",
    ///             "incident.reassigned",
    ///             "incident.reopened",
    ///             "incident.resolved",
    ///             "incident.responder.added",
    ///             "incident.responder.replied",
    ///             "incident.status_update_published",
    ///             "incident.triggered",
    ///             "incident.unacknowledged",
    ///         },
    ///         Active = true,
    ///         Filters = new[]
    ///         {
    ///             new Pagerduty.Inputs.WebhookSubscriptionFilterArgs
    ///             {
    ///                 Id = example.Apply(getServiceResult =&gt; getServiceResult.Id),
    ///                 Type = "service_reference",
    ///             },
    ///         },
    ///         Type = "webhook_subscription",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Webhook Subscriptions can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/webhookSubscription:WebhookSubscription main PUABCDL
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/webhookSubscription:WebhookSubscription")]
    public partial class WebhookSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines whether the subscription will produce webhook events.
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// The object describing where to send the webhooks.
        /// </summary>
        [Output("deliveryMethods")]
        public Output<ImmutableArray<Outputs.WebhookSubscriptionDeliveryMethod>> DeliveryMethods { get; private set; } = null!;

        /// <summary>
        /// A short description of the webhook subscription
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A set of outbound event types the webhook will receive. The follow event types are possible: 
        /// * `incident.acknowledged`
        /// * `incident.annotated`
        /// * `incident.delegated`
        /// * `incident.escalated`
        /// * `incident.priority_updated`
        /// * `incident.reassigned`
        /// * `incident.reopened`
        /// * `incident.resolved`
        /// * `incident.responder.added`
        /// * `incident.responder.replied`
        /// * `incident.status_update_published`
        /// * `incident.triggered`
        /// * `incident.unacknowledged`
        /// </summary>
        [Output("events")]
        public Output<ImmutableArray<string>> Events { get; private set; } = null!;

        /// <summary>
        /// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<Outputs.WebhookSubscriptionFilter>> Filters { get; private set; } = null!;

        /// <summary>
        /// The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a WebhookSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebhookSubscription(string name, WebhookSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/webhookSubscription:WebhookSubscription", name, args ?? new WebhookSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebhookSubscription(string name, Input<string> id, WebhookSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/webhookSubscription:WebhookSubscription", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WebhookSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebhookSubscription Get(string name, Input<string> id, WebhookSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new WebhookSubscription(name, id, state, options);
        }
    }

    public sealed class WebhookSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines whether the subscription will produce webhook events.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("deliveryMethods", required: true)]
        private InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs>? _deliveryMethods;

        /// <summary>
        /// The object describing where to send the webhooks.
        /// </summary>
        public InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs> DeliveryMethods
        {
            get => _deliveryMethods ?? (_deliveryMethods = new InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs>());
            set => _deliveryMethods = value;
        }

        /// <summary>
        /// A short description of the webhook subscription
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events", required: true)]
        private InputList<string>? _events;

        /// <summary>
        /// A set of outbound event types the webhook will receive. The follow event types are possible: 
        /// * `incident.acknowledged`
        /// * `incident.annotated`
        /// * `incident.delegated`
        /// * `incident.escalated`
        /// * `incident.priority_updated`
        /// * `incident.reassigned`
        /// * `incident.reopened`
        /// * `incident.resolved`
        /// * `incident.responder.added`
        /// * `incident.responder.replied`
        /// * `incident.status_update_published`
        /// * `incident.triggered`
        /// * `incident.unacknowledged`
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("filters", required: true)]
        private InputList<Inputs.WebhookSubscriptionFilterArgs>? _filters;

        /// <summary>
        /// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        /// </summary>
        public InputList<Inputs.WebhookSubscriptionFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.WebhookSubscriptionFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WebhookSubscriptionArgs()
        {
        }
        public static new WebhookSubscriptionArgs Empty => new WebhookSubscriptionArgs();
    }

    public sealed class WebhookSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines whether the subscription will produce webhook events.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("deliveryMethods")]
        private InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs>? _deliveryMethods;

        /// <summary>
        /// The object describing where to send the webhooks.
        /// </summary>
        public InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs> DeliveryMethods
        {
            get => _deliveryMethods ?? (_deliveryMethods = new InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs>());
            set => _deliveryMethods = value;
        }

        /// <summary>
        /// A short description of the webhook subscription
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events")]
        private InputList<string>? _events;

        /// <summary>
        /// A set of outbound event types the webhook will receive. The follow event types are possible: 
        /// * `incident.acknowledged`
        /// * `incident.annotated`
        /// * `incident.delegated`
        /// * `incident.escalated`
        /// * `incident.priority_updated`
        /// * `incident.reassigned`
        /// * `incident.reopened`
        /// * `incident.resolved`
        /// * `incident.responder.added`
        /// * `incident.responder.replied`
        /// * `incident.status_update_published`
        /// * `incident.triggered`
        /// * `incident.unacknowledged`
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("filters")]
        private InputList<Inputs.WebhookSubscriptionFilterGetArgs>? _filters;

        /// <summary>
        /// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        /// </summary>
        public InputList<Inputs.WebhookSubscriptionFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.WebhookSubscriptionFilterGetArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WebhookSubscriptionState()
        {
        }
        public static new WebhookSubscriptionState Empty => new WebhookSubscriptionState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        [Output("deliveryMethods")]
        public Output<ImmutableArray<Outputs.WebhookSubscriptionDeliveryMethod>> DeliveryMethods { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("events")]
        public Output<ImmutableArray<string>> Events { get; private set; } = null!;

        [Output("filters")]
        public Output<ImmutableArray<Outputs.WebhookSubscriptionFilter>> Filters { get; private set; } = null!;

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
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("deliveryMethods", required: true)]
        private InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs>? _deliveryMethods;
        public InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs> DeliveryMethods
        {
            get => _deliveryMethods ?? (_deliveryMethods = new InputList<Inputs.WebhookSubscriptionDeliveryMethodArgs>());
            set => _deliveryMethods = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events", required: true)]
        private InputList<string>? _events;
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("filters", required: true)]
        private InputList<Inputs.WebhookSubscriptionFilterArgs>? _filters;
        public InputList<Inputs.WebhookSubscriptionFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.WebhookSubscriptionFilterArgs>());
            set => _filters = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public WebhookSubscriptionArgs()
        {
        }
        public static new WebhookSubscriptionArgs Empty => new WebhookSubscriptionArgs();
    }

    public sealed class WebhookSubscriptionState : global::Pulumi.ResourceArgs
    {
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("deliveryMethods")]
        private InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs>? _deliveryMethods;
        public InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs> DeliveryMethods
        {
            get => _deliveryMethods ?? (_deliveryMethods = new InputList<Inputs.WebhookSubscriptionDeliveryMethodGetArgs>());
            set => _deliveryMethods = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events")]
        private InputList<string>? _events;
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("filters")]
        private InputList<Inputs.WebhookSubscriptionFilterGetArgs>? _filters;
        public InputList<Inputs.WebhookSubscriptionFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.WebhookSubscriptionFilterGetArgs>());
            set => _filters = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public WebhookSubscriptionState()
        {
        }
        public static new WebhookSubscriptionState Empty => new WebhookSubscriptionState();
    }
}

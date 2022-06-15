// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class WebhookSubscriptionDeliveryMethodArgs : Pulumi.ResourceArgs
    {
        [Input("customHeaders")]
        private InputList<Inputs.WebhookSubscriptionDeliveryMethodCustomHeaderArgs>? _customHeaders;

        /// <summary>
        /// The custom_header of a webhook subscription define any optional headers that will be passed along with the payload to the destination URL.
        /// </summary>
        public InputList<Inputs.WebhookSubscriptionDeliveryMethodCustomHeaderArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.WebhookSubscriptionDeliveryMethodCustomHeaderArgs>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Whether this webhook subscription is temporarily disabled. Becomes true if the delivery method URL is repeatedly rejected by the server.
        /// </summary>
        [Input("temporarilyDisabled")]
        public Input<bool>? TemporarilyDisabled { get; set; }

        /// <summary>
        /// Indicates the type of the delivery method. Allowed and default value: `http_delivery_method`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The destination URL for webhook delivery.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebhookSubscriptionDeliveryMethodArgs()
        {
        }
    }
}

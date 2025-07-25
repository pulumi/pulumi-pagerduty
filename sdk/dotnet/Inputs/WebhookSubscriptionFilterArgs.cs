// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class WebhookSubscriptionFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the object being used as the filter. This field is required for all filter types except account_reference.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The type of object being used as the filter. Allowed values are `account_reference`, `service_reference`, and `team_reference`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WebhookSubscriptionFilterArgs()
        {
        }
        public static new WebhookSubscriptionFilterArgs Empty => new WebhookSubscriptionFilterArgs();
    }
}

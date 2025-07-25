// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class WebhookSubscriptionFilter
    {
        /// <summary>
        /// The id of the object being used as the filter. This field is required for all filter types except account_reference.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The type of object being used as the filter. Allowed values are `account_reference`, `service_reference`, and `team_reference`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private WebhookSubscriptionFilter(
            string? id,

            string type)
        {
            Id = id;
            Type = type;
        }
    }
}

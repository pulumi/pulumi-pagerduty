// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationAction
    {
        /// <summary>
        /// When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
        /// </summary>
        public readonly bool? AutoSend;
        /// <summary>
        /// Specify custom key/value pairs that'll be sent with the webhook request as request headers.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsAutomationActionHeader> Headers;
        /// <summary>
        /// Name of this Webhook.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsAutomationActionParameter> Parameters;
        /// <summary>
        /// The API endpoint where PagerDuty's servers will send the webhook request.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private EventOrchestrationGlobalSetRuleActionsAutomationAction(
            bool? autoSend,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsAutomationActionHeader> headers,

            string name,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsAutomationActionParameter> parameters,

            string url)
        {
            AutoSend = autoSend;
            Headers = headers;
            Name = name;
            Parameters = parameters;
            Url = url;
        }
    }
}

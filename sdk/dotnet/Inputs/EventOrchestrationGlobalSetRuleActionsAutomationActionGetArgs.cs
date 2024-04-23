// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
        /// </summary>
        [Input("autoSend")]
        public Input<bool>? AutoSend { get; set; }

        [Input("headers")]
        private InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderGetArgs>? _headers;

        /// <summary>
        /// Specify custom key/value pairs that'll be sent with the webhook request as request headers.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// Name of this Webhook.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("parameters")]
        private InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs>? _parameters;

        /// <summary>
        /// Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The API endpoint where PagerDuty's servers will send the webhook request.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public EventOrchestrationGlobalSetRuleActionsAutomationActionGetArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleActionsAutomationActionGetArgs Empty => new EventOrchestrationGlobalSetRuleActionsAutomationActionGetArgs();
    }
}

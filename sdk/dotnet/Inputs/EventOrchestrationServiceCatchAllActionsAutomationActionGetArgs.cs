// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceCatchAllActionsAutomationActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident or alert is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
        /// </summary>
        [Input("autoSend")]
        public Input<bool>? AutoSend { get; set; }

        [Input("headers")]
        private InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionHeaderGetArgs>? _headers;

        /// <summary>
        /// Specify custom key/value pairs that'll be sent with the webhook request as request headers.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// Name of this Webhook.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("parameters")]
        private InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionParameterGetArgs>? _parameters;

        /// <summary>
        /// Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.EventOrchestrationServiceCatchAllActionsAutomationActionParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The Webhook will be associated (or automatically triggered, if `auto_send` is `true`) with the incident or alert, whenever an alert reaches the specified state. Allowed values are: `["alert_triggered"]`, `["alert_suspended"]`, `["alert_suppressed"]`. NOTE: `auto_send` must be `true` for trigger types of `["alert_suspended"]` and `["alert_suppressed"]`
        /// </summary>
        [Input("triggerTypes")]
        public Input<string>? TriggerTypes { get; set; }

        /// <summary>
        /// The API endpoint where PagerDuty's servers will send the webhook request.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public EventOrchestrationServiceCatchAllActionsAutomationActionGetArgs()
        {
        }
        public static new EventOrchestrationServiceCatchAllActionsAutomationActionGetArgs Empty => new EventOrchestrationServiceCatchAllActionsAutomationActionGetArgs();
    }
}

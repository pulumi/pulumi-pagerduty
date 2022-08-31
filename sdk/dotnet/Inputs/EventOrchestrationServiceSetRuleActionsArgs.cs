// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceSetRuleActionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Add this text as a note on the resulting incident.
        /// </summary>
        [Input("annotate")]
        public Input<string>? Annotate { get; set; }

        /// <summary>
        /// Create a [Webhook](https://support.pagerduty.com/docs/event-orchestration#webhooks) associated with the resulting incident.
        /// </summary>
        [Input("automationAction")]
        public Input<Inputs.EventOrchestrationServiceSetRuleActionsAutomationActionArgs>? AutomationAction { get; set; }

        /// <summary>
        /// sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
        /// </summary>
        [Input("eventAction")]
        public Input<string>? EventAction { get; set; }

        [Input("extractions")]
        private InputList<Inputs.EventOrchestrationServiceSetRuleActionsExtractionArgs>? _extractions;

        /// <summary>
        /// Replace any CEF field or Custom Details object field using custom variables.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceSetRuleActionsExtractionArgs> Extractions
        {
            get => _extractions ?? (_extractions = new InputList<Inputs.EventOrchestrationServiceSetRuleActionsExtractionArgs>());
            set => _extractions = value;
        }

        /// <summary>
        /// Configure a [Process Automation](https://support.pagerduty.com/docs/event-orchestration#process-automation) associated with the resulting incident.
        /// </summary>
        [Input("pagerdutyAutomationAction")]
        public Input<Inputs.EventOrchestrationServiceSetRuleActionsPagerdutyAutomationActionArgs>? PagerdutyAutomationAction { get; set; }

        [Input("priority")]
        public Input<string>? Priority { get; set; }

        /// <summary>
        /// The ID of a Set from this Service Orchestration whose rules you also want to use with event that match this rule.
        /// </summary>
        [Input("routeTo")]
        public Input<string>? RouteTo { get; set; }

        /// <summary>
        /// sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// Set whether the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
        /// </summary>
        [Input("suppress")]
        public Input<bool>? Suppress { get; set; }

        /// <summary>
        /// The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
        /// </summary>
        [Input("suspend")]
        public Input<int>? Suspend { get; set; }

        [Input("variables")]
        private InputList<Inputs.EventOrchestrationServiceSetRuleActionsVariableArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceSetRuleActionsVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.EventOrchestrationServiceSetRuleActionsVariableArgs>());
            set => _variables = value;
        }

        public EventOrchestrationServiceSetRuleActionsArgs()
        {
        }
        public static new EventOrchestrationServiceSetRuleActionsArgs Empty => new EventOrchestrationServiceSetRuleActionsArgs();
    }
}
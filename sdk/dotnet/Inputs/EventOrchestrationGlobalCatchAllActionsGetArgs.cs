// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalCatchAllActionsGetArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.EventOrchestrationGlobalCatchAllActionsAutomationActionGetArgs>? AutomationAction { get; set; }

        /// <summary>
        /// When true, this event will be dropped. Dropped events will not trigger or resolve an alert or an incident. Dropped events will not be evaluated against router rules.
        /// </summary>
        [Input("dropEvent")]
        public Input<bool>? DropEvent { get; set; }

        /// <summary>
        /// The ID of the Escalation Policy you want to assign incidents to. Event rules with this action will override the Escalation Policy already set on a Service's settings, with what is configured by this action.
        /// </summary>
        [Input("escalationPolicy")]
        public Input<string>? EscalationPolicy { get; set; }

        /// <summary>
        /// sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
        /// </summary>
        [Input("eventAction")]
        public Input<string>? EventAction { get; set; }

        [Input("extractions")]
        private InputList<Inputs.EventOrchestrationGlobalCatchAllActionsExtractionGetArgs>? _extractions;

        /// <summary>
        /// Replace any CEF field or Custom Details object field using custom variables.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalCatchAllActionsExtractionGetArgs> Extractions
        {
            get => _extractions ?? (_extractions = new InputList<Inputs.EventOrchestrationGlobalCatchAllActionsExtractionGetArgs>());
            set => _extractions = value;
        }

        [Input("incidentCustomFieldUpdates")]
        private InputList<Inputs.EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs>? _incidentCustomFieldUpdates;

        /// <summary>
        /// Assign a custom field to the resulting incident.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs> IncidentCustomFieldUpdates
        {
            get => _incidentCustomFieldUpdates ?? (_incidentCustomFieldUpdates = new InputList<Inputs.EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs>());
            set => _incidentCustomFieldUpdates = value;
        }

        /// <summary>
        /// The ID of the priority you want to set on resulting incident. Consider using the `pagerduty.getPriority` data source.
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        /// <summary>
        /// The ID of a Set from this Global Orchestration whose rules you also want to use with events that match this rule.
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
        /// The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won't create an incident for this alert.
        /// </summary>
        [Input("suspend")]
        public Input<int>? Suspend { get; set; }

        [Input("variables")]
        private InputList<Inputs.EventOrchestrationGlobalCatchAllActionsVariableGetArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalCatchAllActionsVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.EventOrchestrationGlobalCatchAllActionsVariableGetArgs>());
            set => _variables = value;
        }

        public EventOrchestrationGlobalCatchAllActionsGetArgs()
        {
        }
        public static new EventOrchestrationGlobalCatchAllActionsGetArgs Empty => new EventOrchestrationGlobalCatchAllActionsGetArgs();
    }
}

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
    public sealed class EventOrchestrationGlobalSetRuleActions
    {
        /// <summary>
        /// Add this text as a note on the resulting incident.
        /// </summary>
        public readonly string? Annotate;
        /// <summary>
        /// Create a [Webhook](https://support.pagerduty.com/docs/event-orchestration#webhooks) to be run for certain alert states.
        /// </summary>
        public readonly Outputs.EventOrchestrationGlobalSetRuleActionsAutomationAction? AutomationAction;
        /// <summary>
        /// When true, this event will be dropped. Dropped events will not trigger or resolve an alert or an incident. Dropped events will not be evaluated against router rules.
        /// </summary>
        public readonly bool? DropEvent;
        /// <summary>
        /// The ID of the Escalation Policy you want to assign incidents to. Event rules with this action will override the Escalation Policy already set on a Service's settings, with what is configured by this action.
        /// </summary>
        public readonly string? EscalationPolicy;
        /// <summary>
        /// sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
        /// </summary>
        public readonly string? EventAction;
        /// <summary>
        /// Replace any CEF field or Custom Details object field using custom variables.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsExtraction> Extractions;
        /// <summary>
        /// Assign a custom field to the resulting incident.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate> IncidentCustomFieldUpdates;
        /// <summary>
        /// The ID of the priority you want to set on resulting incident. Consider using the `pagerduty.getPriority` data source.
        /// </summary>
        public readonly string? Priority;
        /// <summary>
        /// The ID of a Set from this Global Orchestration whose rules you also want to use with events that match this rule.
        /// </summary>
        public readonly string? RouteTo;
        /// <summary>
        /// sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
        /// </summary>
        public readonly string? Severity;
        /// <summary>
        /// Set whether the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
        /// </summary>
        public readonly bool? Suppress;
        /// <summary>
        /// The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won't create an incident for this alert.
        /// </summary>
        public readonly int? Suspend;
        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsVariable> Variables;

        [OutputConstructor]
        private EventOrchestrationGlobalSetRuleActions(
            string? annotate,

            Outputs.EventOrchestrationGlobalSetRuleActionsAutomationAction? automationAction,

            bool? dropEvent,

            string? escalationPolicy,

            string? eventAction,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsExtraction> extractions,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate> incidentCustomFieldUpdates,

            string? priority,

            string? routeTo,

            string? severity,

            bool? suppress,

            int? suspend,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleActionsVariable> variables)
        {
            Annotate = annotate;
            AutomationAction = automationAction;
            DropEvent = dropEvent;
            EscalationPolicy = escalationPolicy;
            EventAction = eventAction;
            Extractions = extractions;
            IncidentCustomFieldUpdates = incidentCustomFieldUpdates;
            Priority = priority;
            RouteTo = routeTo;
            Severity = severity;
            Suppress = suppress;
            Suspend = suspend;
            Variables = variables;
        }
    }
}

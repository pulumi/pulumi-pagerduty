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
    public sealed class EventOrchestrationServiceCatchAllActions
    {
        /// <summary>
        /// Add this text as a note on the resulting incident.
        /// </summary>
        public readonly string? Annotate;
        /// <summary>
        /// Create a [Webhook](https://support.pagerduty.com/docs/event-orchestration#webhooks) associated with the resulting incident.
        /// </summary>
        public readonly Outputs.EventOrchestrationServiceCatchAllActionsAutomationAction? AutomationAction;
        /// <summary>
        /// sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
        /// </summary>
        public readonly string? EventAction;
        /// <summary>
        /// Replace any CEF field or Custom Details object field using custom variables.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationServiceCatchAllActionsExtraction> Extractions;
        /// <summary>
        /// Configure a [Process Automation](https://support.pagerduty.com/docs/event-orchestration#process-automation) associated with the resulting incident.
        /// </summary>
        public readonly Outputs.EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction? PagerdutyAutomationAction;
        public readonly string? Priority;
        /// <summary>
        /// The ID of a Set from this Service Orchestration whose rules you also want to use with event that match this rule.
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
        /// The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a `resolve` event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
        /// </summary>
        public readonly int? Suspend;
        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationServiceCatchAllActionsVariable> Variables;

        [OutputConstructor]
        private EventOrchestrationServiceCatchAllActions(
            string? annotate,

            Outputs.EventOrchestrationServiceCatchAllActionsAutomationAction? automationAction,

            string? eventAction,

            ImmutableArray<Outputs.EventOrchestrationServiceCatchAllActionsExtraction> extractions,

            Outputs.EventOrchestrationServiceCatchAllActionsPagerdutyAutomationAction? pagerdutyAutomationAction,

            string? priority,

            string? routeTo,

            string? severity,

            bool? suppress,

            int? suspend,

            ImmutableArray<Outputs.EventOrchestrationServiceCatchAllActionsVariable> variables)
        {
            Annotate = annotate;
            AutomationAction = automationAction;
            EventAction = eventAction;
            Extractions = extractions;
            PagerdutyAutomationAction = pagerdutyAutomationAction;
            Priority = priority;
            RouteTo = routeTo;
            Severity = severity;
            Suppress = suppress;
            Suspend = suspend;
            Variables = variables;
        }
    }
}
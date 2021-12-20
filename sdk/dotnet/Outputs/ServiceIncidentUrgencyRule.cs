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
    public sealed class ServiceIncidentUrgencyRule
    {
        /// <summary>
        /// Incidents' urgency during support hours.
        /// </summary>
        public readonly Outputs.ServiceIncidentUrgencyRuleDuringSupportHours? DuringSupportHours;
        /// <summary>
        /// Incidents' urgency outside support hours.
        /// </summary>
        public readonly Outputs.ServiceIncidentUrgencyRuleOutsideSupportHours? OutsideSupportHours;
        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
        /// </summary>
        public readonly string? Urgency;

        [OutputConstructor]
        private ServiceIncidentUrgencyRule(
            Outputs.ServiceIncidentUrgencyRuleDuringSupportHours? duringSupportHours,

            Outputs.ServiceIncidentUrgencyRuleOutsideSupportHours? outsideSupportHours,

            string type,

            string? urgency)
        {
            DuringSupportHours = duringSupportHours;
            OutsideSupportHours = outsideSupportHours;
            Type = type;
            Urgency = urgency;
        }
    }
}

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
    public sealed class ServiceIncidentUrgencyRuleDuringSupportHours
    {
        /// <summary>
        /// The type of scheduled action. Currently, this must be set to `urgency_change`.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
        /// </summary>
        public readonly string? Urgency;

        [OutputConstructor]
        private ServiceIncidentUrgencyRuleDuringSupportHours(
            string? type,

            string? urgency)
        {
            Type = type;
            Urgency = urgency;
        }
    }
}

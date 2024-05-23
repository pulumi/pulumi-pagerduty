// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIncidentUrgencyRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Incidents' urgency during support hours.
        /// </summary>
        [Input("duringSupportHours")]
        public Input<Inputs.ServiceIncidentUrgencyRuleDuringSupportHoursGetArgs>? DuringSupportHours { get; set; }

        /// <summary>
        /// Incidents' urgency outside support hours.
        /// </summary>
        [Input("outsideSupportHours")]
        public Input<Inputs.ServiceIncidentUrgencyRuleOutsideSupportHoursGetArgs>? OutsideSupportHours { get; set; }

        /// <summary>
        /// The type of incident urgency: `constant` or `use_support_hours` (when depending on specific support hours; see `support_hours`).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
        /// </summary>
        [Input("urgency")]
        public Input<string>? Urgency { get; set; }

        public ServiceIncidentUrgencyRuleGetArgs()
        {
        }
        public static new ServiceIncidentUrgencyRuleGetArgs Empty => new ServiceIncidentUrgencyRuleGetArgs();
    }
}

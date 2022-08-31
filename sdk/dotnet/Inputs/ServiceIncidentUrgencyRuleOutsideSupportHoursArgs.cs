// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIncidentUrgencyRuleOutsideSupportHoursArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
        /// </summary>
        [Input("urgency")]
        public Input<string>? Urgency { get; set; }

        public ServiceIncidentUrgencyRuleOutsideSupportHoursArgs()
        {
        }
        public static new ServiceIncidentUrgencyRuleOutsideSupportHoursArgs Empty => new ServiceIncidentUrgencyRuleOutsideSupportHoursArgs();
    }
}

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
    public sealed class ServiceAlertGroupingParametersConfig
    {
        /// <summary>
        /// One of `any` or `all`. This setting applies only when `type` is set to `content_based`. Group alerts based on one or all of `fields` value(s).
        /// </summary>
        public readonly string? Aggregate;
        /// <summary>
        /// Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `content_based`.
        /// </summary>
        public readonly ImmutableArray<string> Fields;
        /// <summary>
        /// The maximum amount of time allowed between Alerts. Value must be between `300` and `3600`. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours.
        /// </summary>
        public readonly int? TimeWindow;
        /// <summary>
        /// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private ServiceAlertGroupingParametersConfig(
            string? aggregate,

            ImmutableArray<string> fields,

            int? timeWindow,

            int? timeout)
        {
            Aggregate = aggregate;
            Fields = fields;
            TimeWindow = timeWindow;
            Timeout = timeout;
        }
    }
}

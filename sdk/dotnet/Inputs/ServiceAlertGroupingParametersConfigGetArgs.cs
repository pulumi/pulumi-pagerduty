// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceAlertGroupingParametersConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of `any` or `all`. This setting applies only when `type` is set to `content_based`. Group alerts based on one or all of `fields` value(s).
        /// </summary>
        [Input("aggregate")]
        public Input<string>? Aggregate { get; set; }

        [Input("fields")]
        private InputList<string>? _fields;

        /// <summary>
        /// Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `content_based`.
        /// </summary>
        public InputList<string> Fields
        {
            get => _fields ?? (_fields = new InputList<string>());
            set => _fields = value;
        }

        /// <summary>
        /// The maximum amount of time allowed between Alerts. Value must be between `300` and `3600`. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours.
        /// </summary>
        [Input("timeWindow")]
        public Input<int>? TimeWindow { get; set; }

        /// <summary>
        /// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ServiceAlertGroupingParametersConfigGetArgs()
        {
        }
        public static new ServiceAlertGroupingParametersConfigGetArgs Empty => new ServiceAlertGroupingParametersConfigGetArgs();
    }
}

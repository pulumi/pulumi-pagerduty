// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsSuppressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number value of the `threshold_time_unit` before an incident is created.
        /// </summary>
        [Input("thresholdTimeAmount")]
        public Input<int>? ThresholdTimeAmount { get; set; }

        /// <summary>
        /// The `seconds`,`minutes`, or `hours` the `threshold_time_amount` should be measured.
        /// </summary>
        [Input("thresholdTimeUnit")]
        public Input<string>? ThresholdTimeUnit { get; set; }

        /// <summary>
        /// The number of alerts that should be suppressed.
        /// </summary>
        [Input("thresholdValue")]
        public Input<int>? ThresholdValue { get; set; }

        /// <summary>
        /// Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
        /// </summary>
        [Input("value")]
        public Input<bool>? Value { get; set; }

        public ServiceEventRuleActionsSuppressArgs()
        {
        }
        public static new ServiceEventRuleActionsSuppressArgs Empty => new ServiceEventRuleActionsSuppressArgs();
    }
}

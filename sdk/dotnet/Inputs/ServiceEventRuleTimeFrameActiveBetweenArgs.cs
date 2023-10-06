// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleTimeFrameActiveBetweenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
        /// </summary>
        [Input("endTime")]
        public Input<int>? EndTime { get; set; }

        /// <summary>
        /// Beginning of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
        /// </summary>
        [Input("startTime")]
        public Input<int>? StartTime { get; set; }

        public ServiceEventRuleTimeFrameActiveBetweenArgs()
        {
        }
        public static new ServiceEventRuleTimeFrameActiveBetweenArgs Empty => new ServiceEventRuleTimeFrameActiveBetweenArgs();
    }
}

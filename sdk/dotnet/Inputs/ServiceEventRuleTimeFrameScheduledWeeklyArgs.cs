// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleTimeFrameScheduledWeeklyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Length of time the schedule will be active.  Unix timestamp in milliseconds.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `start_time` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `start_time` was `3,600,000` the it would be active starting at `01:00`.
        /// </summary>
        [Input("startTime")]
        public Input<int>? StartTime { get; set; }

        /// <summary>
        /// Timezone for the given schedule.
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("weekdays")]
        private InputList<int>? _weekdays;

        /// <summary>
        /// An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
        /// </summary>
        public InputList<int> Weekdays
        {
            get => _weekdays ?? (_weekdays = new InputList<int>());
            set => _weekdays = value;
        }

        public ServiceEventRuleTimeFrameScheduledWeeklyArgs()
        {
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceSupportHoursArgs : global::Pulumi.ResourceArgs
    {
        [Input("daysOfWeeks")]
        private InputList<int>? _daysOfWeeks;

        /// <summary>
        /// Array of days of week as integers. `1` to `7`, `1` being
        /// Monday and `7` being Sunday.
        /// </summary>
        public InputList<int> DaysOfWeeks
        {
            get => _daysOfWeeks ?? (_daysOfWeeks = new InputList<int>());
            set => _daysOfWeeks = value;
        }

        /// <summary>
        /// The support hours' ending time of day.
        /// 
        /// A `scheduled_actions` block is required when using `type = "use_support_hours"` in `incident_urgency_rule`.
        /// 
        /// The block contains the following arguments:
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        /// <summary>
        /// The support hours' starting time of day.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The time zone for the support hours.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServiceSupportHoursArgs()
        {
        }
        public static new ServiceSupportHoursArgs Empty => new ServiceSupportHoursArgs();
    }
}

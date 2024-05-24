// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceSupportHoursGetArgs : global::Pulumi.ResourceArgs
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
        /// The type of support hours. Can be `fixed_time_per_day`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServiceSupportHoursGetArgs()
        {
        }
        public static new ServiceSupportHoursGetArgs Empty => new ServiceSupportHoursGetArgs();
    }
}

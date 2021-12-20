// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ScheduleLayerRestrictionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The duration of the restriction in `seconds`.
        /// </summary>
        [Input("durationSeconds", required: true)]
        public Input<int> DurationSeconds { get; set; } = null!;

        /// <summary>
        /// Number of the day when restriction starts. From 1 to 7 where 1 is Monday and 7 is Sunday.
        /// </summary>
        [Input("startDayOfWeek")]
        public Input<int>? StartDayOfWeek { get; set; }

        /// <summary>
        /// The start time in `HH:mm:ss` format.
        /// </summary>
        [Input("startTimeOfDay", required: true)]
        public Input<string> StartTimeOfDay { get; set; } = null!;

        /// <summary>
        /// Can be `daily_restriction` or `weekly_restriction`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ScheduleLayerRestrictionGetArgs()
        {
        }
    }
}

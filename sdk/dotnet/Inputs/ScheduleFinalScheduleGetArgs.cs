// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ScheduleFinalScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the schedule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("renderedCoveragePercentage")]
        public Input<string>? RenderedCoveragePercentage { get; set; }

        public ScheduleFinalScheduleGetArgs()
        {
        }
        public static new ScheduleFinalScheduleGetArgs Empty => new ScheduleFinalScheduleGetArgs();
    }
}

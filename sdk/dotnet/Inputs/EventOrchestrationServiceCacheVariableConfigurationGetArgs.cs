// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceCacheVariableConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        /// <summary>
        /// The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
        /// </summary>
        [Input("ttlSeconds")]
        public Input<int>? TtlSeconds { get; set; }

        /// <summary>
        /// The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public EventOrchestrationServiceCacheVariableConfigurationGetArgs()
        {
        }
        public static new EventOrchestrationServiceCacheVariableConfigurationGetArgs Empty => new EventOrchestrationServiceCacheVariableConfigurationGetArgs();
    }
}

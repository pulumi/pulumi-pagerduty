// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalCacheVariableConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of data that will eventually be set for the Cache Variable via an API request. This field is only used when type is `external_data`
        /// </summary>
        [Input("dataType")]
        public Input<string>? DataType { get; set; }

        /// <summary>
        /// A [RE2 regular expression][4] that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        /// <summary>
        /// The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count` or `external_data`
        /// </summary>
        [Input("ttlSeconds")]
        public Input<int>? TtlSeconds { get; set; }

        /// <summary>
        /// The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value`, `trigger_event_count` or `external_data`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public EventOrchestrationGlobalCacheVariableConfigurationArgs()
        {
        }
        public static new EventOrchestrationGlobalCacheVariableConfigurationArgs Empty => new EventOrchestrationGlobalCacheVariableConfigurationArgs();
    }
}

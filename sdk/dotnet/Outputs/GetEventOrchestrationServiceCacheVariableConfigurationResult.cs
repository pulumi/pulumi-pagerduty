// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class GetEventOrchestrationServiceCacheVariableConfigurationResult
    {
        /// <summary>
        /// A [RE2 regular expression][4] that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
        /// </summary>
        public readonly string Regex;
        /// <summary>
        /// The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
        /// </summary>
        public readonly int TtlSeconds;
        /// <summary>
        /// The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetEventOrchestrationServiceCacheVariableConfigurationResult(
            string regex,

            string source,

            int ttlSeconds,

            string type)
        {
            Regex = regex;
            Source = source;
            TtlSeconds = ttlSeconds;
            Type = type;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceCatchAllActionsVariableArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of this Webhook.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Only `regex` is supported
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Value of this header
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationServiceCatchAllActionsVariableArgs()
        {
        }
    }
}

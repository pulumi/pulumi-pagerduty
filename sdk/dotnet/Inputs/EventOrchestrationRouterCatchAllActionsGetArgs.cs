// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationRouterCatchAllActionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines where an alert will be sent if doesn't match any rules. Can either be the ID of a Service _or_ the string `"unrouted"` to send events to the Unrouted Orchestration.
        /// </summary>
        [Input("routeTo", required: true)]
        public Input<string> RouteTo { get; set; } = null!;

        public EventOrchestrationRouterCatchAllActionsGetArgs()
        {
        }
        public static new EventOrchestrationRouterCatchAllActionsGetArgs Empty => new EventOrchestrationRouterCatchAllActionsGetArgs();
    }
}

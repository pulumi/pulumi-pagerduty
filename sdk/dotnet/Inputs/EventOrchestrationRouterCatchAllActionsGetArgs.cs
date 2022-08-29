// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// The ID of the target Service for the resulting alert.
        /// </summary>
        [Input("routeTo", required: true)]
        public Input<string> RouteTo { get; set; } = null!;

        public EventOrchestrationRouterCatchAllActionsGetArgs()
        {
        }
        public static new EventOrchestrationRouterCatchAllActionsGetArgs Empty => new EventOrchestrationRouterCatchAllActionsGetArgs();
    }
}

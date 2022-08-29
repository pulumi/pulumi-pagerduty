// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class GetEventOrchestrationIntegrationParameterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Routing key that routes to this Orchestration.
        /// </summary>
        [Input("routingKey", required: true)]
        public Input<string> RoutingKey { get; set; } = null!;

        /// <summary>
        /// Type of the routing key. `global` is the default type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetEventOrchestrationIntegrationParameterInputArgs()
        {
        }
        public static new GetEventOrchestrationIntegrationParameterInputArgs Empty => new GetEventOrchestrationIntegrationParameterInputArgs();
    }
}

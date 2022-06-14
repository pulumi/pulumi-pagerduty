// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceCatchAllActionsPagerdutyAutomationActionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the Process Automation action to be triggered.
        /// </summary>
        [Input("actionId", required: true)]
        public Input<string> ActionId { get; set; } = null!;

        public EventOrchestrationServiceCatchAllActionsPagerdutyAutomationActionArgs()
        {
        }
    }
}

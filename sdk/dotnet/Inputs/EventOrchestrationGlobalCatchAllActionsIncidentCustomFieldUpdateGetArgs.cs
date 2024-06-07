// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The custom field id
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The value to assign to this custom field
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs()
        {
        }
        public static new EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs Empty => new EventOrchestrationGlobalCatchAllActionsIncidentCustomFieldUpdateGetArgs();
    }
}

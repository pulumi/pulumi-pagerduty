// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name to identify the parameter
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value of this parameter
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs Empty => new EventOrchestrationGlobalSetRuleActionsAutomationActionParameterGetArgs();
    }
}

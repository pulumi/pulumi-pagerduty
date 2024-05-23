// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name to identify the header
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value of this header
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderArgs Empty => new EventOrchestrationGlobalSetRuleActionsAutomationActionHeaderArgs();
    }
}

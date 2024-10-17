// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        public EventOrchestrationGlobalSetRuleConditionGetArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleConditionGetArgs Empty => new EventOrchestrationGlobalSetRuleConditionGetArgs();
    }
}
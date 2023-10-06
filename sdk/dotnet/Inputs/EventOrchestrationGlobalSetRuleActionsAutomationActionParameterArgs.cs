// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationActionParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name to identify the parameter
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationGlobalSetRuleActionsAutomationActionParameterArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleActionsAutomationActionParameterArgs Empty => new EventOrchestrationGlobalSetRuleActionsAutomationActionParameterArgs();
    }
}

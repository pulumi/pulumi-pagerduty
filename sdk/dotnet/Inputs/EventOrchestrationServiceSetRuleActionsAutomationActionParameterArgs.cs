// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs()
        {
        }
        public static new EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs Empty => new EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs();
    }
}

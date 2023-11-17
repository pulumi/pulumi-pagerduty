// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationGlobalSetRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
        /// </summary>
        [Input("actions", required: true)]
        public Input<Inputs.EventOrchestrationGlobalSetRuleActionsGetArgs> Actions { get; set; } = null!;

        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationGlobalSetRuleConditionGetArgs>? _conditions;

        /// <summary>
        /// Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalSetRuleConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationGlobalSetRuleConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The ID of this set of rules. Rules in other sets can route events into this set using the rule's `route_to` property.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A description of this rule's purpose.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public EventOrchestrationGlobalSetRuleGetArgs()
        {
        }
        public static new EventOrchestrationGlobalSetRuleGetArgs Empty => new EventOrchestrationGlobalSetRuleGetArgs();
    }
}

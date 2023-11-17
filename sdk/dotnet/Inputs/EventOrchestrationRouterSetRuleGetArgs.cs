// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationRouterSetRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// These are the actions that will be taken to change the resulting alert and incident.
        /// </summary>
        [Input("actions", required: true)]
        public Input<Inputs.EventOrchestrationRouterSetRuleActionsGetArgs> Actions { get; set; } = null!;

        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationRouterSetRuleConditionGetArgs>? _conditions;

        /// <summary>
        /// Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
        /// </summary>
        public InputList<Inputs.EventOrchestrationRouterSetRuleConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationRouterSetRuleConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// ID of the `start` set. Router supports only one set and it's id has to be `start`
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A description of this rule's purpose.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public EventOrchestrationRouterSetRuleGetArgs()
        {
        }
        public static new EventOrchestrationRouterSetRuleGetArgs Empty => new EventOrchestrationRouterSetRuleGetArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class EventOrchestrationGlobalSetRule
    {
        /// <summary>
        /// Actions that will be taken to change the resulting alert and incident, when an event matches this rule.
        /// </summary>
        public readonly Outputs.EventOrchestrationGlobalSetRuleActions Actions;
        /// <summary>
        /// Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleCondition> Conditions;
        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// The custom field id
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A description of this rule's purpose.
        /// </summary>
        public readonly string? Label;

        [OutputConstructor]
        private EventOrchestrationGlobalSetRule(
            Outputs.EventOrchestrationGlobalSetRuleActions actions,

            ImmutableArray<Outputs.EventOrchestrationGlobalSetRuleCondition> conditions,

            bool? disabled,

            string? id,

            string? label)
        {
            Actions = actions;
            Conditions = conditions;
            Disabled = disabled;
            Id = id;
            Label = label;
        }
    }
}

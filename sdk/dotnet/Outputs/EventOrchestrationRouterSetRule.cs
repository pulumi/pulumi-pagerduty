// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class EventOrchestrationRouterSetRule
    {
        /// <summary>
        /// Actions that will be taken to change the resulting alert and incident, when an event matches this rule.
        /// </summary>
        public readonly Outputs.EventOrchestrationRouterSetRuleActions Actions;
        /// <summary>
        /// Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will _always_ match against the rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventOrchestrationRouterSetRuleCondition> Conditions;
        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// The ID of the rule within the `start` set.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A description of this rule's purpose.
        /// </summary>
        public readonly string? Label;

        [OutputConstructor]
        private EventOrchestrationRouterSetRule(
            Outputs.EventOrchestrationRouterSetRuleActions actions,

            ImmutableArray<Outputs.EventOrchestrationRouterSetRuleCondition> conditions,

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

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationUnroutedSetRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions that will be taken to change the resulting alert and incident, when an event matches this rule.
        /// </summary>
        [Input("actions", required: true)]
        public Input<Inputs.EventOrchestrationUnroutedSetRuleActionsArgs> Actions { get; set; } = null!;

        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationUnroutedSetRuleConditionArgs>? _conditions;

        /// <summary>
        /// Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if any of these conditions match. If none are provided, the event will `always` match against the rule.
        /// </summary>
        public InputList<Inputs.EventOrchestrationUnroutedSetRuleConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationUnroutedSetRuleConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The ID of the rule within the set.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A description of this rule's purpose.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public EventOrchestrationUnroutedSetRuleArgs()
        {
        }
        public static new EventOrchestrationUnroutedSetRuleArgs Empty => new EventOrchestrationUnroutedSetRuleArgs();
    }
}

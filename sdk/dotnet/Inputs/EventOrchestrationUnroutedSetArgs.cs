// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationUnroutedSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of this set of rules. Rules in other sets can route events into this set using the rule's `route_to` property.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.EventOrchestrationUnroutedSetRuleArgs>? _rules;
        public InputList<Inputs.EventOrchestrationUnroutedSetRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EventOrchestrationUnroutedSetRuleArgs>());
            set => _rules = value;
        }

        public EventOrchestrationUnroutedSetArgs()
        {
        }
        public static new EventOrchestrationUnroutedSetArgs Empty => new EventOrchestrationUnroutedSetArgs();
    }
}
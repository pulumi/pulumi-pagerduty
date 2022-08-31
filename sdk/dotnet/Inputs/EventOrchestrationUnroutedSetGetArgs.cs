// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationUnroutedSetGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of this set of rules. Rules in other sets can route events into this set using the rule's `route_to` property.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.EventOrchestrationUnroutedSetRuleGetArgs>? _rules;
        public InputList<Inputs.EventOrchestrationUnroutedSetRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EventOrchestrationUnroutedSetRuleGetArgs>());
            set => _rules = value;
        }

        public EventOrchestrationUnroutedSetGetArgs()
        {
        }
        public static new EventOrchestrationUnroutedSetGetArgs Empty => new EventOrchestrationUnroutedSetGetArgs();
    }
}
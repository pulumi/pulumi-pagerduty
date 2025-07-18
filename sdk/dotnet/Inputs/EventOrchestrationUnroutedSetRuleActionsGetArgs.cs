// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationUnroutedSetRuleActionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// sets whether the resulting alert status is trigger or resolve. Allowed values are: `trigger`, `resolve`
        /// </summary>
        [Input("eventAction")]
        public Input<string>? EventAction { get; set; }

        [Input("extractions")]
        private InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsExtractionGetArgs>? _extractions;

        /// <summary>
        /// Replace any CEF field or Custom Details object field using custom variables.
        /// </summary>
        public InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsExtractionGetArgs> Extractions
        {
            get => _extractions ?? (_extractions = new InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsExtractionGetArgs>());
            set => _extractions = value;
        }

        /// <summary>
        /// The ID of a Set from this Unrouted Orchestration whose rules you also want to use with events that match this rule.
        /// </summary>
        [Input("routeTo")]
        public Input<string>? RouteTo { get; set; }

        /// <summary>
        /// sets Severity of the resulting alert. Allowed values are: `info`, `error`, `warning`, `critical`
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        [Input("variables")]
        private InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsVariableGetArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions.
        /// </summary>
        public InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.EventOrchestrationUnroutedSetRuleActionsVariableGetArgs>());
            set => _variables = value;
        }

        public EventOrchestrationUnroutedSetRuleActionsGetArgs()
        {
        }
        public static new EventOrchestrationUnroutedSetRuleActionsGetArgs Empty => new EventOrchestrationUnroutedSetRuleActionsGetArgs();
    }
}

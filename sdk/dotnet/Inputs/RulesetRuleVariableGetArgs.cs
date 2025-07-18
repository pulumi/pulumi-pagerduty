// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class RulesetRuleVariableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputList<Inputs.RulesetRuleVariableParameterGetArgs>? _parameters;
        public InputList<Inputs.RulesetRuleVariableParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.RulesetRuleVariableParameterGetArgs>());
            set => _parameters = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public RulesetRuleVariableGetArgs()
        {
        }
        public static new RulesetRuleVariableGetArgs Empty => new RulesetRuleVariableGetArgs();
    }
}

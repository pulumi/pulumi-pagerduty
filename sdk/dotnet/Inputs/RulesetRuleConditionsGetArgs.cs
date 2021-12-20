// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class RulesetRuleConditionsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Operator to combine sub-conditions. Can be `and` or `or`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("subconditions")]
        private InputList<Inputs.RulesetRuleConditionsSubconditionGetArgs>? _subconditions;

        /// <summary>
        /// List of sub-conditions that define the condition.
        /// </summary>
        public InputList<Inputs.RulesetRuleConditionsSubconditionGetArgs> Subconditions
        {
            get => _subconditions ?? (_subconditions = new InputList<Inputs.RulesetRuleConditionsSubconditionGetArgs>());
            set => _subconditions = value;
        }

        public RulesetRuleConditionsGetArgs()
        {
        }
    }
}

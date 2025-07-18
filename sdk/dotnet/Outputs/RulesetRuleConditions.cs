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
    public sealed class RulesetRuleConditions
    {
        /// <summary>
        /// Operator to combine sub-conditions. Can be `and` or `or`.
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// List of sub-conditions that define the condition.
        /// </summary>
        public readonly ImmutableArray<Outputs.RulesetRuleConditionsSubcondition> Subconditions;

        [OutputConstructor]
        private RulesetRuleConditions(
            string? @operator,

            ImmutableArray<Outputs.RulesetRuleConditionsSubcondition> subconditions)
        {
            Operator = @operator;
            Subconditions = subconditions;
        }
    }
}

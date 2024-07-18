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
    public sealed class RulesetRuleConditionsSubconditionParameter
    {
        public readonly string? Path;
        /// <summary>
        /// Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private RulesetRuleConditionsSubconditionParameter(
            string? path,

            string? value)
        {
            Path = path;
            Value = value;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class RulesetRuleActionsRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public RulesetRuleActionsRouteArgs()
        {
        }
        public static new RulesetRuleActionsRouteArgs Empty => new RulesetRuleActionsRouteArgs();
    }
}

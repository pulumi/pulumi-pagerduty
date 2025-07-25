// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleConditionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Operator to combine sub-conditions. Can be `and` or `or`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("subconditions")]
        private InputList<Inputs.ServiceEventRuleConditionsSubconditionGetArgs>? _subconditions;

        /// <summary>
        /// List of sub-conditions that define the condition.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleConditionsSubconditionGetArgs> Subconditions
        {
            get => _subconditions ?? (_subconditions = new InputList<Inputs.ServiceEventRuleConditionsSubconditionGetArgs>());
            set => _subconditions = value;
        }

        public ServiceEventRuleConditionsGetArgs()
        {
        }
        public static new ServiceEventRuleConditionsGetArgs Empty => new ServiceEventRuleConditionsGetArgs();
    }
}

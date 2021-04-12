// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleConditionsSubconditionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of operator to apply to the sub-condition. Can be `exists`,`nexists`,`equals`,`nequals`,`contains`,`ncontains`,`matches`, or `nmatches`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ServiceEventRuleConditionsSubconditionParameterGetArgs>? _parameters;

        /// <summary>
        /// Parameter for the sub-condition. It requires both a `path` and `value` to be set. The `path` value must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleConditionsSubconditionParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ServiceEventRuleConditionsSubconditionParameterGetArgs>());
            set => _parameters = value;
        }

        public ServiceEventRuleConditionsSubconditionGetArgs()
        {
        }
    }
}
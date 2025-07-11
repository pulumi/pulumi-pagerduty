// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleConditionsSubconditionParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public ServiceEventRuleConditionsSubconditionParameterArgs()
        {
        }
        public static new ServiceEventRuleConditionsSubconditionParameterArgs Empty => new ServiceEventRuleConditionsSubconditionParameterArgs();
    }
}

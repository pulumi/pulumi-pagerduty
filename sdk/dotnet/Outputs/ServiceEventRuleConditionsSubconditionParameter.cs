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
    public sealed class ServiceEventRuleConditionsSubconditionParameter
    {
        /// <summary>
        /// Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The value for the operation. For example, an RE2 regular expression for regex-type variables.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ServiceEventRuleConditionsSubconditionParameter(
            string? path,

            string? value)
        {
            Path = path;
            Value = value;
        }
    }
}

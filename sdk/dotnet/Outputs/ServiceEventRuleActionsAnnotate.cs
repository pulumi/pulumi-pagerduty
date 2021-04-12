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
    public sealed class ServiceEventRuleActionsAnnotate
    {
        /// <summary>
        /// The value for the operation. For example, an RE2 regular expression for regex-type variables.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ServiceEventRuleActionsAnnotate(string? value)
        {
            Value = value;
        }
    }
}
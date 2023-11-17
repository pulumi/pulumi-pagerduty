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
    public sealed class EventOrchestrationGlobalSetRuleActionsAutomationActionParameter
    {
        /// <summary>
        /// Name to identify the parameter
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Value of this parameter
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private EventOrchestrationGlobalSetRuleActionsAutomationActionParameter(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}

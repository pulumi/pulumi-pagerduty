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
    public sealed class EventOrchestrationServiceSetRuleActionsAutomationActionHeader
    {
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private EventOrchestrationServiceSetRuleActionsAutomationActionHeader(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}

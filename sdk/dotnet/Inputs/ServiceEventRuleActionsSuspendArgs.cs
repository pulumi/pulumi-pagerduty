// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsSuspendArgs : global::Pulumi.ResourceArgs
    {
        [Input("value")]
        public Input<int>? Value { get; set; }

        public ServiceEventRuleActionsSuspendArgs()
        {
        }
        public static new ServiceEventRuleActionsSuspendArgs Empty => new ServiceEventRuleActionsSuspendArgs();
    }
}

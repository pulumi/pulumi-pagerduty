// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsSeverityArgs : global::Pulumi.ResourceArgs
    {
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ServiceEventRuleActionsSeverityArgs()
        {
        }
        public static new ServiceEventRuleActionsSeverityArgs Empty => new ServiceEventRuleActionsSeverityArgs();
    }
}
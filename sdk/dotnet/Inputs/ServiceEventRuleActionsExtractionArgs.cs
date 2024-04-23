// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsExtractionArgs : global::Pulumi.ResourceArgs
    {
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("target")]
        public Input<string>? Target { get; set; }

        [Input("template")]
        public Input<string>? Template { get; set; }

        public ServiceEventRuleActionsExtractionArgs()
        {
        }
        public static new ServiceEventRuleActionsExtractionArgs Empty => new ServiceEventRuleActionsExtractionArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserMatchPredicatePredicatePredicateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matcher", required: true)]
        public Input<string> Matcher { get; set; } = null!;

        [Input("part", required: true)]
        public Input<string> Part { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServiceIntegrationEmailParserMatchPredicatePredicatePredicateGetArgs()
        {
        }
        public static new ServiceIntegrationEmailParserMatchPredicatePredicatePredicateGetArgs Empty => new ServiceIntegrationEmailParserMatchPredicatePredicatePredicateGetArgs();
    }
}

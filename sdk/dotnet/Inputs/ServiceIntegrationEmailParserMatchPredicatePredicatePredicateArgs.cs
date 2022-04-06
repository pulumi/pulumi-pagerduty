// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Predicate value or valid regex.
        /// </summary>
        [Input("matcher", required: true)]
        public Input<string> Matcher { get; set; } = null!;

        /// <summary>
        /// Can be `subject`, `body` or `from_addresses`.
        /// </summary>
        [Input("part", required: true)]
        public Input<string> Part { get; set; } = null!;

        /// <summary>
        /// Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs()
        {
        }
    }
}

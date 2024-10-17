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
    public sealed class ServiceIntegrationEmailParserMatchPredicatePredicatePredicate
    {
        /// <summary>
        /// Predicate value or valid regex.
        /// </summary>
        public readonly string Matcher;
        /// <summary>
        /// Can be `subject`, `body` or `from_addresses`.
        /// </summary>
        public readonly string Part;
        /// <summary>
        /// Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ServiceIntegrationEmailParserMatchPredicatePredicatePredicate(
            string matcher,

            string part,

            string type)
        {
            Matcher = matcher;
            Part = part;
            Type = type;
        }
    }
}
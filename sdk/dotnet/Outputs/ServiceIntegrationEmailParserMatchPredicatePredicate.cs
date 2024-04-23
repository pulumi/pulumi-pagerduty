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
    public sealed class ServiceIntegrationEmailParserMatchPredicatePredicate
    {
        public readonly string? Matcher;
        public readonly string? Part;
        public readonly ImmutableArray<Outputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> Predicates;
        public readonly string Type;

        [OutputConstructor]
        private ServiceIntegrationEmailParserMatchPredicatePredicate(
            string? matcher,

            string? part,

            ImmutableArray<Outputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> predicates,

            string type)
        {
            Matcher = matcher;
            Part = part;
            Predicates = predicates;
            Type = type;
        }
    }
}

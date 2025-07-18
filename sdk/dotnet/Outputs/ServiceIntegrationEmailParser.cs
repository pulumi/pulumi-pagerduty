// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class ServiceIntegrationEmailParser
    {
        /// <summary>
        /// Can be `resolve` or `trigger`.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The ID of the service integration.
        /// </summary>
        public readonly int? Id;
        public readonly Outputs.ServiceIntegrationEmailParserMatchPredicate MatchPredicate;
        public readonly ImmutableArray<Outputs.ServiceIntegrationEmailParserValueExtractor> ValueExtractors;

        [OutputConstructor]
        private ServiceIntegrationEmailParser(
            string action,

            int? id,

            Outputs.ServiceIntegrationEmailParserMatchPredicate matchPredicate,

            ImmutableArray<Outputs.ServiceIntegrationEmailParserValueExtractor> valueExtractors)
        {
            Action = action;
            Id = id;
            MatchPredicate = matchPredicate;
            ValueExtractors = valueExtractors;
        }
    }
}

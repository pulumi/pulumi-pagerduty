// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be `resolve` or `trigger`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The ID of the service integration.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("matchPredicate", required: true)]
        public Input<Inputs.ServiceIntegrationEmailParserMatchPredicateGetArgs> MatchPredicate { get; set; } = null!;

        [Input("valueExtractors")]
        private InputList<Inputs.ServiceIntegrationEmailParserValueExtractorGetArgs>? _valueExtractors;
        public InputList<Inputs.ServiceIntegrationEmailParserValueExtractorGetArgs> ValueExtractors
        {
            get => _valueExtractors ?? (_valueExtractors = new InputList<Inputs.ServiceIntegrationEmailParserValueExtractorGetArgs>());
            set => _valueExtractors = value;
        }

        public ServiceIntegrationEmailParserGetArgs()
        {
        }
        public static new ServiceIntegrationEmailParserGetArgs Empty => new ServiceIntegrationEmailParserGetArgs();
    }
}

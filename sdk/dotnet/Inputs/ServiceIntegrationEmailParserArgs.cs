// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.ServiceIntegrationEmailParserMatchPredicateArgs> MatchPredicate { get; set; } = null!;

        [Input("valueExtractors")]
        private InputList<Inputs.ServiceIntegrationEmailParserValueExtractorArgs>? _valueExtractors;
        public InputList<Inputs.ServiceIntegrationEmailParserValueExtractorArgs> ValueExtractors
        {
            get => _valueExtractors ?? (_valueExtractors = new InputList<Inputs.ServiceIntegrationEmailParserValueExtractorArgs>());
            set => _valueExtractors = value;
        }

        public ServiceIntegrationEmailParserArgs()
        {
        }
        public static new ServiceIntegrationEmailParserArgs Empty => new ServiceIntegrationEmailParserArgs();
    }
}
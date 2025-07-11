// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserMatchPredicatePredicateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Predicate value or valid regex.
        /// </summary>
        [Input("matcher")]
        public Input<string>? Matcher { get; set; }

        /// <summary>
        /// Can be `subject`, `body` or `from_addresses`.
        /// </summary>
        [Input("part")]
        public Input<string>? Part { get; set; }

        [Input("predicates")]
        private InputList<Inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>? _predicates;
        public InputList<Inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs> Predicates
        {
            get => _predicates ?? (_predicates = new InputList<Inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>());
            set => _predicates = value;
        }

        /// <summary>
        /// Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServiceIntegrationEmailParserMatchPredicatePredicateArgs()
        {
        }
        public static new ServiceIntegrationEmailParserMatchPredicatePredicateArgs Empty => new ServiceIntegrationEmailParserMatchPredicatePredicateArgs();
    }
}

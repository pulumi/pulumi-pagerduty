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
    public sealed class GetEventOrchestrationIntegrationDetailResult
    {
        /// <summary>
        /// ID of the integration
        /// </summary>
        public readonly string Id;
        public readonly string Label;
        /// <summary>
        /// A single-item list containing a parameter object describing the integration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationIntegrationDetailParameterResult> Parameters;

        [OutputConstructor]
        private GetEventOrchestrationIntegrationDetailResult(
            string id,

            string label,

            ImmutableArray<Outputs.GetEventOrchestrationIntegrationDetailParameterResult> parameters)
        {
            Id = id;
            Label = label;
            Parameters = parameters;
        }
    }
}

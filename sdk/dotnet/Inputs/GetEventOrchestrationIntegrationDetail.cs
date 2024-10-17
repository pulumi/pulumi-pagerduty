// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class GetEventOrchestrationIntegrationDetailArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the integration
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("parameters", required: true)]
        private List<Inputs.GetEventOrchestrationIntegrationDetailParameterArgs>? _parameters;
        public List<Inputs.GetEventOrchestrationIntegrationDetailParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new List<Inputs.GetEventOrchestrationIntegrationDetailParameterArgs>());
            set => _parameters = value;
        }

        public GetEventOrchestrationIntegrationDetailArgs()
        {
        }
        public static new GetEventOrchestrationIntegrationDetailArgs Empty => new GetEventOrchestrationIntegrationDetailArgs();
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class GetEventOrchestrationIntegrationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the integration
        /// * `parameters`
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("parameters", required: true)]
        private List<Inputs.GetEventOrchestrationIntegrationParameterArgs>? _parameters;
        public List<Inputs.GetEventOrchestrationIntegrationParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new List<Inputs.GetEventOrchestrationIntegrationParameterArgs>());
            set => _parameters = value;
        }

        public GetEventOrchestrationIntegrationArgs()
        {
        }
        public static new GetEventOrchestrationIntegrationArgs Empty => new GetEventOrchestrationIntegrationArgs();
    }
}
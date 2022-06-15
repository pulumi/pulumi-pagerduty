// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationIntegrationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the integration
        /// * `parameters`
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("parameters")]
        private InputList<Inputs.EventOrchestrationIntegrationParameterArgs>? _parameters;
        public InputList<Inputs.EventOrchestrationIntegrationParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.EventOrchestrationIntegrationParameterArgs>());
            set => _parameters = value;
        }

        public EventOrchestrationIntegrationArgs()
        {
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetEventOrchestration
    {
        /// <summary>
        /// Use this data source to get information about a specific Global [Event Orchestration](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations)
        /// </summary>
        public static Task<GetEventOrchestrationResult> InvokeAsync(GetEventOrchestrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationResult>("pagerduty:index/getEventOrchestration:getEventOrchestration", args ?? new GetEventOrchestrationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific Global [Event Orchestration](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations)
        /// </summary>
        public static Output<GetEventOrchestrationResult> Invoke(GetEventOrchestrationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationResult>("pagerduty:index/getEventOrchestration:getEventOrchestration", args ?? new GetEventOrchestrationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationArgs : global::Pulumi.InvokeArgs
    {
        [Input("integrationDetail")]
        private List<Inputs.GetEventOrchestrationIntegrationDetailArgs>? _integrationDetail;

        /// <summary>
        /// An integration for the Event Orchestration.
        /// </summary>
        public List<Inputs.GetEventOrchestrationIntegrationDetailArgs> IntegrationDetail
        {
            get => _integrationDetail ?? (_integrationDetail = new List<Inputs.GetEventOrchestrationIntegrationDetailArgs>());
            set => _integrationDetail = value;
        }

        /// <summary>
        /// The name of the Global Event orchestration to find in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetEventOrchestrationArgs()
        {
        }
        public static new GetEventOrchestrationArgs Empty => new GetEventOrchestrationArgs();
    }

    public sealed class GetEventOrchestrationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("integrationDetail")]
        private InputList<Inputs.GetEventOrchestrationIntegrationDetailInputArgs>? _integrationDetail;

        /// <summary>
        /// An integration for the Event Orchestration.
        /// </summary>
        public InputList<Inputs.GetEventOrchestrationIntegrationDetailInputArgs> IntegrationDetail
        {
            get => _integrationDetail ?? (_integrationDetail = new InputList<Inputs.GetEventOrchestrationIntegrationDetailInputArgs>());
            set => _integrationDetail = value;
        }

        /// <summary>
        /// The name of the Global Event orchestration to find in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetEventOrchestrationInvokeArgs()
        {
        }
        public static new GetEventOrchestrationInvokeArgs Empty => new GetEventOrchestrationInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventOrchestrationResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// An integration for the Event Orchestration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationIntegrationDetailResult> IntegrationDetail;
        /// <summary>
        /// The name of the found Event Orchestration.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetEventOrchestrationResult(
            string id,

            ImmutableArray<Outputs.GetEventOrchestrationIntegrationDetailResult> integrationDetail,

            string name)
        {
            Id = id;
            IntegrationDetail = integrationDetail;
            Name = name;
        }
    }
}
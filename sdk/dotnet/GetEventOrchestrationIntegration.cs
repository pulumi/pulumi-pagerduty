// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetEventOrchestrationIntegration
    {
        /// <summary>
        /// Use this data source to get information about a specific [Integration](https://developer.pagerduty.com/api-reference/1c6607db389a8-get-an-integration-for-an-event-orchestration) for an Event Orchestration.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var eventOrchestration = new Pagerduty.EventOrchestration("event_orchestration", new()
        ///     {
        ///         Name = "Test Event Orchestration",
        ///     });
        /// 
        ///     var integration = Pagerduty.GetEventOrchestrationIntegration.Invoke(new()
        ///     {
        ///         EventOrchestration = eventOrchestration.Id,
        ///         Label = "Test Event Orchestration Default Integration",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEventOrchestrationIntegrationResult> InvokeAsync(GetEventOrchestrationIntegrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationIntegrationResult>("pagerduty:index/getEventOrchestrationIntegration:getEventOrchestrationIntegration", args ?? new GetEventOrchestrationIntegrationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Integration](https://developer.pagerduty.com/api-reference/1c6607db389a8-get-an-integration-for-an-event-orchestration) for an Event Orchestration.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var eventOrchestration = new Pagerduty.EventOrchestration("event_orchestration", new()
        ///     {
        ///         Name = "Test Event Orchestration",
        ///     });
        /// 
        ///     var integration = Pagerduty.GetEventOrchestrationIntegration.Invoke(new()
        ///     {
        ///         EventOrchestration = eventOrchestration.Id,
        ///         Label = "Test Event Orchestration Default Integration",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationIntegrationResult> Invoke(GetEventOrchestrationIntegrationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationIntegrationResult>("pagerduty:index/getEventOrchestrationIntegration:getEventOrchestrationIntegration", args ?? new GetEventOrchestrationIntegrationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationIntegrationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Event Orchestration to which this Integration belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public string EventOrchestration { get; set; } = null!;

        /// <summary>
        /// ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
        /// </summary>
        [Input("label")]
        public string? Label { get; set; }

        public GetEventOrchestrationIntegrationArgs()
        {
        }
        public static new GetEventOrchestrationIntegrationArgs Empty => new GetEventOrchestrationIntegrationArgs();
    }

    public sealed class GetEventOrchestrationIntegrationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Event Orchestration to which this Integration belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public Input<string> EventOrchestration { get; set; } = null!;

        /// <summary>
        /// ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public GetEventOrchestrationIntegrationInvokeArgs()
        {
        }
        public static new GetEventOrchestrationIntegrationInvokeArgs Empty => new GetEventOrchestrationIntegrationInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventOrchestrationIntegrationResult
    {
        public readonly string EventOrchestration;
        public readonly string? Id;
        public readonly string? Label;
        public readonly ImmutableArray<Outputs.GetEventOrchestrationIntegrationParameterResult> Parameters;

        [OutputConstructor]
        private GetEventOrchestrationIntegrationResult(
            string eventOrchestration,

            string? id,

            string? label,

            ImmutableArray<Outputs.GetEventOrchestrationIntegrationParameterResult> parameters)
        {
            EventOrchestration = eventOrchestration;
            Id = id;
            Label = label;
            Parameters = parameters;
        }
    }
}

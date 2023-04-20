// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetEventOrchestrations
    {
        /// <summary>
        /// Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var tfOrchA = new Pagerduty.EventOrchestration("tfOrchA");
        /// 
        ///     var tfOrchB = new Pagerduty.EventOrchestration("tfOrchB");
        /// 
        ///     var tfMyMonitor = Pagerduty.GetEventOrchestrations.Invoke(new()
        ///     {
        ///         NameFilter = ".*Orchestration$",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEventOrchestrationsResult> InvokeAsync(GetEventOrchestrationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationsResult>("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args ?? new GetEventOrchestrationsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var tfOrchA = new Pagerduty.EventOrchestration("tfOrchA");
        /// 
        ///     var tfOrchB = new Pagerduty.EventOrchestration("tfOrchB");
        /// 
        ///     var tfMyMonitor = Pagerduty.GetEventOrchestrations.Invoke(new()
        ///     {
        ///         NameFilter = ".*Orchestration$",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEventOrchestrationsResult> Invoke(GetEventOrchestrationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationsResult>("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args ?? new GetEventOrchestrationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The regex name of Global Event orchestrations to find in the PagerDuty API.
        /// </summary>
        [Input("nameFilter", required: true)]
        public string NameFilter { get; set; } = null!;

        public GetEventOrchestrationsArgs()
        {
        }
        public static new GetEventOrchestrationsArgs Empty => new GetEventOrchestrationsArgs();
    }

    public sealed class GetEventOrchestrationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The regex name of Global Event orchestrations to find in the PagerDuty API.
        /// </summary>
        [Input("nameFilter", required: true)]
        public Input<string> NameFilter { get; set; } = null!;

        public GetEventOrchestrationsInvokeArgs()
        {
        }
        public static new GetEventOrchestrationsInvokeArgs Empty => new GetEventOrchestrationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventOrchestrationsResult
    {
        public readonly ImmutableArray<Outputs.GetEventOrchestrationsEventOrchestrationResult> EventOrchestrations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of the Event Orchestrations which name match `name_filter` argument.
        /// </summary>
        public readonly string NameFilter;

        [OutputConstructor]
        private GetEventOrchestrationsResult(
            ImmutableArray<Outputs.GetEventOrchestrationsEventOrchestrationResult> eventOrchestrations,

            string id,

            string nameFilter)
        {
            EventOrchestrations = eventOrchestrations;
            Id = id;
            NameFilter = nameFilter;
        }
    }
}

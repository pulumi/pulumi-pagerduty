// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        ///     var tfOrchA = new Pagerduty.EventOrchestration("tf_orch_a", new()
        ///     {
        ///         Name = "Test Event A Orchestration",
        ///     });
        /// 
        ///     var tfOrchB = new Pagerduty.EventOrchestration("tf_orch_b", new()
        ///     {
        ///         Name = "Test Event B Orchestration",
        ///     });
        /// 
        ///     var tfMyMonitor = Pagerduty.GetEventOrchestrations.Invoke(new()
        ///     {
        ///         NameFilter = ".*Orchestration$",
        ///     });
        /// 
        ///     var cacheVar = new Pagerduty.EventOrchestrationGlobalCacheVariable("cache_var", new()
        ///     {
        ///         EventOrchestration = tfMyMonitor.Apply(getEventOrchestrationsResult =&gt; getEventOrchestrationsResult.EventOrchestrations[0]?.Id),
        ///         Name = "recent_host",
        ///         Conditions = new[]
        ///         {
        ///             new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConditionArgs
        ///             {
        ///                 Expression = "event.source exists",
        ///             },
        ///         },
        ///         Configuration = new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConfigurationArgs
        ///         {
        ///             Type = "recent_value",
        ///             Source = "event.source",
        ///             Regex = ".*",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEventOrchestrationsResult> InvokeAsync(GetEventOrchestrationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationsResult>("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args ?? new GetEventOrchestrationsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
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
        ///     var tfOrchA = new Pagerduty.EventOrchestration("tf_orch_a", new()
        ///     {
        ///         Name = "Test Event A Orchestration",
        ///     });
        /// 
        ///     var tfOrchB = new Pagerduty.EventOrchestration("tf_orch_b", new()
        ///     {
        ///         Name = "Test Event B Orchestration",
        ///     });
        /// 
        ///     var tfMyMonitor = Pagerduty.GetEventOrchestrations.Invoke(new()
        ///     {
        ///         NameFilter = ".*Orchestration$",
        ///     });
        /// 
        ///     var cacheVar = new Pagerduty.EventOrchestrationGlobalCacheVariable("cache_var", new()
        ///     {
        ///         EventOrchestration = tfMyMonitor.Apply(getEventOrchestrationsResult =&gt; getEventOrchestrationsResult.EventOrchestrations[0]?.Id),
        ///         Name = "recent_host",
        ///         Conditions = new[]
        ///         {
        ///             new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConditionArgs
        ///             {
        ///                 Expression = "event.source exists",
        ///             },
        ///         },
        ///         Configuration = new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConfigurationArgs
        ///         {
        ///             Type = "recent_value",
        ///             Source = "event.source",
        ///             Regex = ".*",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationsResult> Invoke(GetEventOrchestrationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationsResult>("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args ?? new GetEventOrchestrationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
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
        ///     var tfOrchA = new Pagerduty.EventOrchestration("tf_orch_a", new()
        ///     {
        ///         Name = "Test Event A Orchestration",
        ///     });
        /// 
        ///     var tfOrchB = new Pagerduty.EventOrchestration("tf_orch_b", new()
        ///     {
        ///         Name = "Test Event B Orchestration",
        ///     });
        /// 
        ///     var tfMyMonitor = Pagerduty.GetEventOrchestrations.Invoke(new()
        ///     {
        ///         NameFilter = ".*Orchestration$",
        ///     });
        /// 
        ///     var cacheVar = new Pagerduty.EventOrchestrationGlobalCacheVariable("cache_var", new()
        ///     {
        ///         EventOrchestration = tfMyMonitor.Apply(getEventOrchestrationsResult =&gt; getEventOrchestrationsResult.EventOrchestrations[0]?.Id),
        ///         Name = "recent_host",
        ///         Conditions = new[]
        ///         {
        ///             new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConditionArgs
        ///             {
        ///                 Expression = "event.source exists",
        ///             },
        ///         },
        ///         Configuration = new Pagerduty.Inputs.EventOrchestrationGlobalCacheVariableConfigurationArgs
        ///         {
        ///             Type = "recent_value",
        ///             Source = "event.source",
        ///             Regex = ".*",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationsResult> Invoke(GetEventOrchestrationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationsResult>("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args ?? new GetEventOrchestrationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The regex name of Global Event Orchestrations to find in the PagerDuty API.
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
        /// The regex name of Global Event Orchestrations to find in the PagerDuty API.
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
        /// <summary>
        /// The list of the Event Orchestrations with a name that matches the `name_filter` argument.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationsEventOrchestrationResult> EventOrchestrations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The regex supplied to find the list of Global Event Orchestrations
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

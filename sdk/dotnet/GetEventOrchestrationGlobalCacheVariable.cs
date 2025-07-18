// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetEventOrchestrationGlobalCacheVariable
    {
        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Global Event Orchestration.
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
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationGlobalCacheVariable.Invoke(new()
        ///     {
        ///         EventOrchestration = eventOrchestration.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEventOrchestrationGlobalCacheVariableResult> InvokeAsync(GetEventOrchestrationGlobalCacheVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationGlobalCacheVariableResult>("pagerduty:index/getEventOrchestrationGlobalCacheVariable:getEventOrchestrationGlobalCacheVariable", args ?? new GetEventOrchestrationGlobalCacheVariableArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Global Event Orchestration.
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
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationGlobalCacheVariable.Invoke(new()
        ///     {
        ///         EventOrchestration = eventOrchestration.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationGlobalCacheVariableResult> Invoke(GetEventOrchestrationGlobalCacheVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationGlobalCacheVariableResult>("pagerduty:index/getEventOrchestrationGlobalCacheVariable:getEventOrchestrationGlobalCacheVariable", args ?? new GetEventOrchestrationGlobalCacheVariableInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Global Event Orchestration.
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
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationGlobalCacheVariable.Invoke(new()
        ///     {
        ///         EventOrchestration = eventOrchestration.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationGlobalCacheVariableResult> Invoke(GetEventOrchestrationGlobalCacheVariableInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationGlobalCacheVariableResult>("pagerduty:index/getEventOrchestrationGlobalCacheVariable:getEventOrchestrationGlobalCacheVariable", args ?? new GetEventOrchestrationGlobalCacheVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationGlobalCacheVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Global Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public string EventOrchestration { get; set; } = null!;

        /// <summary>
        /// ID of the Cache Variable associated with the Global Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Global Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetEventOrchestrationGlobalCacheVariableArgs()
        {
        }
        public static new GetEventOrchestrationGlobalCacheVariableArgs Empty => new GetEventOrchestrationGlobalCacheVariableArgs();
    }

    public sealed class GetEventOrchestrationGlobalCacheVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Global Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public Input<string> EventOrchestration { get; set; } = null!;

        /// <summary>
        /// ID of the Cache Variable associated with the Global Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Global Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetEventOrchestrationGlobalCacheVariableInvokeArgs()
        {
        }
        public static new GetEventOrchestrationGlobalCacheVariableInvokeArgs Empty => new GetEventOrchestrationGlobalCacheVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventOrchestrationGlobalCacheVariableResult
    {
        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationGlobalCacheVariableConditionResult> Conditions;
        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationGlobalCacheVariableConfigurationResult> Configurations;
        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        public readonly bool Disabled;
        public readonly string EventOrchestration;
        public readonly string? Id;
        public readonly string? Name;

        [OutputConstructor]
        private GetEventOrchestrationGlobalCacheVariableResult(
            ImmutableArray<Outputs.GetEventOrchestrationGlobalCacheVariableConditionResult> conditions,

            ImmutableArray<Outputs.GetEventOrchestrationGlobalCacheVariableConfigurationResult> configurations,

            bool disabled,

            string eventOrchestration,

            string? id,

            string? name)
        {
            Conditions = conditions;
            Configurations = configurations;
            Disabled = disabled;
            EventOrchestration = eventOrchestration;
            Id = id;
            Name = name;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetEventOrchestrationServiceCacheVariable
    {
        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Service Event Orchestration.
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
        ///     var engineering = new Pagerduty.Team("engineering", new()
        ///     {
        ///         Name = "Engineering",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         Teams = new[]
        ///         {
        ///             engineering.Id,
        ///         },
        ///     });
        /// 
        ///     var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("example", new()
        ///     {
        ///         Name = "Engineering Escalation Policy",
        ///         NumLoops = 2,
        ///         Rules = new[]
        ///         {
        ///             new Pagerduty.Inputs.EscalationPolicyRuleArgs
        ///             {
        ///                 EscalationDelayInMinutes = 10,
        ///                 Targets = new[]
        ///                 {
        ///                     new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
        ///                     {
        ///                         Type = "user",
        ///                         Id = example.Id,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var service = new Pagerduty.Service("service", new()
        ///     {
        ///         Name = "My Web App",
        ///         AutoResolveTimeout = "14400",
        ///         AcknowledgementTimeout = "600",
        ///         EscalationPolicy = exampleEscalationPolicy.Id,
        ///         AlertCreation = "create_alerts_and_incidents",
        ///     });
        /// 
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationServiceCacheVariable.Invoke(new()
        ///     {
        ///         Service = service.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetEventOrchestrationServiceCacheVariableResult> InvokeAsync(GetEventOrchestrationServiceCacheVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventOrchestrationServiceCacheVariableResult>("pagerduty:index/getEventOrchestrationServiceCacheVariable:getEventOrchestrationServiceCacheVariable", args ?? new GetEventOrchestrationServiceCacheVariableArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Service Event Orchestration.
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
        ///     var engineering = new Pagerduty.Team("engineering", new()
        ///     {
        ///         Name = "Engineering",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         Teams = new[]
        ///         {
        ///             engineering.Id,
        ///         },
        ///     });
        /// 
        ///     var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("example", new()
        ///     {
        ///         Name = "Engineering Escalation Policy",
        ///         NumLoops = 2,
        ///         Rules = new[]
        ///         {
        ///             new Pagerduty.Inputs.EscalationPolicyRuleArgs
        ///             {
        ///                 EscalationDelayInMinutes = 10,
        ///                 Targets = new[]
        ///                 {
        ///                     new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
        ///                     {
        ///                         Type = "user",
        ///                         Id = example.Id,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var service = new Pagerduty.Service("service", new()
        ///     {
        ///         Name = "My Web App",
        ///         AutoResolveTimeout = "14400",
        ///         AcknowledgementTimeout = "600",
        ///         EscalationPolicy = exampleEscalationPolicy.Id,
        ///         AlertCreation = "create_alerts_and_incidents",
        ///     });
        /// 
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationServiceCacheVariable.Invoke(new()
        ///     {
        ///         Service = service.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationServiceCacheVariableResult> Invoke(GetEventOrchestrationServiceCacheVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationServiceCacheVariableResult>("pagerduty:index/getEventOrchestrationServiceCacheVariable:getEventOrchestrationServiceCacheVariable", args ?? new GetEventOrchestrationServiceCacheVariableInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Service Event Orchestration.
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
        ///     var engineering = new Pagerduty.Team("engineering", new()
        ///     {
        ///         Name = "Engineering",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         Teams = new[]
        ///         {
        ///             engineering.Id,
        ///         },
        ///     });
        /// 
        ///     var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("example", new()
        ///     {
        ///         Name = "Engineering Escalation Policy",
        ///         NumLoops = 2,
        ///         Rules = new[]
        ///         {
        ///             new Pagerduty.Inputs.EscalationPolicyRuleArgs
        ///             {
        ///                 EscalationDelayInMinutes = 10,
        ///                 Targets = new[]
        ///                 {
        ///                     new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
        ///                     {
        ///                         Type = "user",
        ///                         Id = example.Id,
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var service = new Pagerduty.Service("service", new()
        ///     {
        ///         Name = "My Web App",
        ///         AutoResolveTimeout = "14400",
        ///         AcknowledgementTimeout = "600",
        ///         EscalationPolicy = exampleEscalationPolicy.Id,
        ///         AlertCreation = "create_alerts_and_incidents",
        ///     });
        /// 
        ///     var cacheVariable = Pagerduty.GetEventOrchestrationServiceCacheVariable.Invoke(new()
        ///     {
        ///         Service = service.Id,
        ///         Name = "example_cache_variable",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventOrchestrationServiceCacheVariableResult> Invoke(GetEventOrchestrationServiceCacheVariableInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventOrchestrationServiceCacheVariableResult>("pagerduty:index/getEventOrchestrationServiceCacheVariable:getEventOrchestrationServiceCacheVariable", args ?? new GetEventOrchestrationServiceCacheVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventOrchestrationServiceCacheVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// ID of the Service Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("service", required: true)]
        public string Service { get; set; } = null!;

        public GetEventOrchestrationServiceCacheVariableArgs()
        {
        }
        public static new GetEventOrchestrationServiceCacheVariableArgs Empty => new GetEventOrchestrationServiceCacheVariableArgs();
    }

    public sealed class GetEventOrchestrationServiceCacheVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the Service Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public GetEventOrchestrationServiceCacheVariableInvokeArgs()
        {
        }
        public static new GetEventOrchestrationServiceCacheVariableInvokeArgs Empty => new GetEventOrchestrationServiceCacheVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventOrchestrationServiceCacheVariableResult
    {
        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationServiceCacheVariableConditionResult> Conditions;
        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventOrchestrationServiceCacheVariableConfigurationResult> Configurations;
        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        public readonly bool Disabled;
        public readonly string? Id;
        public readonly string? Name;
        public readonly string Service;

        [OutputConstructor]
        private GetEventOrchestrationServiceCacheVariableResult(
            ImmutableArray<Outputs.GetEventOrchestrationServiceCacheVariableConditionResult> conditions,

            ImmutableArray<Outputs.GetEventOrchestrationServiceCacheVariableConfigurationResult> configurations,

            bool disabled,

            string? id,

            string? name,

            string service)
        {
            Conditions = conditions;
            Configurations = configurations;
            Disabled = disabled;
            Id = id;
            Name = name;
            Service = service;
        }
    }
}

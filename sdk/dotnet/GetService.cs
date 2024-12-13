// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetService
    {
        /// <summary>
        /// Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
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
        ///     var example = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "My Service",
        ///     });
        /// 
        ///     var datadog = Pagerduty.GetVendor.Invoke(new()
        ///     {
        ///         Name = "Datadog",
        ///     });
        /// 
        ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
        ///     {
        ///         Name = "Datadog Integration",
        ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
        ///         Service = example.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         Type = "generic_events_api_inbound_integration",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("pagerduty:index/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
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
        ///     var example = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "My Service",
        ///     });
        /// 
        ///     var datadog = Pagerduty.GetVendor.Invoke(new()
        ///     {
        ///         Name = "Datadog",
        ///     });
        /// 
        ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
        ///     {
        ///         Name = "Datadog Integration",
        ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
        ///         Service = example.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         Type = "generic_events_api_inbound_integration",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("pagerduty:index/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
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
        ///     var example = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "My Service",
        ///     });
        /// 
        ///     var datadog = Pagerduty.GetVendor.Invoke(new()
        ///     {
        ///         Name = "Datadog",
        ///     });
        /// 
        ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
        ///     {
        ///         Name = "Datadog Integration",
        ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
        ///         Service = example.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         Type = "generic_events_api_inbound_integration",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("pagerduty:index/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The service name to use to find a service in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The service name to use to find a service in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        /// <summary>
        /// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
        /// </summary>
        public readonly int AcknowledgementTimeout;
        /// <summary>
        /// Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging.
        /// </summary>
        public readonly string AlertCreation;
        /// <summary>
        /// Time in seconds that an incident is automatically resolved if left open for that long. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
        /// </summary>
        public readonly int AutoResolveTimeout;
        /// <summary>
        /// The user-provided description of the service.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The escalation policy associated with this service.
        /// </summary>
        public readonly string EscalationPolicy;
        /// <summary>
        /// The ID of the found service.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The short name of the found service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The set of teams associated with the service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTeamResult> Teams;
        /// <summary>
        /// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetServiceResult(
            int acknowledgementTimeout,

            string alertCreation,

            int autoResolveTimeout,

            string description,

            string escalationPolicy,

            string id,

            string name,

            ImmutableArray<Outputs.GetServiceTeamResult> teams,

            string type)
        {
            AcknowledgementTimeout = acknowledgementTimeout;
            AlertCreation = alertCreation;
            AutoResolveTimeout = autoResolveTimeout;
            Description = description;
            EscalationPolicy = escalationPolicy;
            Id = id;
            Name = name;
            Teams = teams;
            Type = type;
        }
    }
}

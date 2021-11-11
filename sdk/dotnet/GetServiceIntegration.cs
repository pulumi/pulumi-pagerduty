// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Pagerduty
{
    public static class GetServiceIntegration
    {
        /// <summary>
        /// Use this data source to get information about a specific service_integration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Pagerduty.GetServiceIntegration.InvokeAsync(new Pagerduty.GetServiceIntegrationArgs
        ///         {
        ///             IntegrationSummary = "Datadog",
        ///             ServiceName = "My Service",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServiceIntegrationResult> InvokeAsync(GetServiceIntegrationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceIntegrationResult>("pagerduty:index/getServiceIntegration:getServiceIntegration", args ?? new GetServiceIntegrationArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to get information about a specific service_integration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Pagerduty.GetServiceIntegration.InvokeAsync(new Pagerduty.GetServiceIntegrationArgs
        ///         {
        ///             IntegrationSummary = "Datadog",
        ///             ServiceName = "My Service",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetServiceIntegrationResult> Invoke(GetServiceIntegrationInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServiceIntegrationResult>("pagerduty:index/getServiceIntegration:getServiceIntegration", args ?? new GetServiceIntegrationInvokeArgs(), options.WithVersion());
    }


    public sealed class GetServiceIntegrationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The integration summary used to find the desired integration on the service
        /// </summary>
        [Input("integrationSummary", required: true)]
        public string IntegrationSummary { get; set; } = null!;

        /// <summary>
        /// The service name to use to find a service in the PagerDuty API.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetServiceIntegrationArgs()
        {
        }
    }

    public sealed class GetServiceIntegrationInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The integration summary used to find the desired integration on the service
        /// </summary>
        [Input("integrationSummary", required: true)]
        public Input<string> IntegrationSummary { get; set; } = null!;

        /// <summary>
        /// The service name to use to find a service in the PagerDuty API.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetServiceIntegrationInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceIntegrationResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The integration key for the integration. This can be used to configure alerts.
        /// </summary>
        public readonly string IntegrationKey;
        public readonly string IntegrationSummary;
        public readonly string ServiceName;

        [OutputConstructor]
        private GetServiceIntegrationResult(
            string id,

            string integrationKey,

            string integrationSummary,

            string serviceName)
        {
            Id = id;
            IntegrationKey = integrationKey;
            IntegrationSummary = integrationSummary;
            ServiceName = serviceName;
        }
    }
}

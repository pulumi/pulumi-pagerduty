// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetVendor
    {
        /// <summary>
        /// Use this data source to get information about a specific [vendor](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI1OQ-list-vendors) that you can use for a service integration (e.g. Amazon Cloudwatch, Splunk, Datadog).
        /// 
        /// &gt; For the case of vendors that rely on [Change Events](https://support.pagerduty.com/docs/change-events) (e.g. Jekings CI, Github, Gitlab, ...) is important to know that those vendors are only available with [PagerDuty AIOps](https://support.pagerduty.com/docs/aiops) add-on. Therefore, they won't be accessible as result of `pagerduty.getVendor` data source without the proper entitlements.
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
        ///     var datadog = Pagerduty.GetVendor.Invoke(new()
        ///     {
        ///         Name = "Datadog",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         Teams = new[]
        ///         {
        ///             examplePagerdutyTeam.Id,
        ///         },
        ///     });
        /// 
        ///     var foo = new Pagerduty.EscalationPolicy("foo", new()
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
        ///     var exampleService = new Pagerduty.Service("example", new()
        ///     {
        ///         Name = "My Web App",
        ///         AutoResolveTimeout = "14400",
        ///         AcknowledgementTimeout = "600",
        ///         EscalationPolicy = examplePagerdutyEscalationPolicy.Id,
        ///     });
        /// 
        ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
        ///     {
        ///         Name = "Datadog Integration",
        ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
        ///         Service = exampleService.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVendorResult> InvokeAsync(GetVendorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVendorResult>("pagerduty:index/getVendor:getVendor", args ?? new GetVendorArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [vendor](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI1OQ-list-vendors) that you can use for a service integration (e.g. Amazon Cloudwatch, Splunk, Datadog).
        /// 
        /// &gt; For the case of vendors that rely on [Change Events](https://support.pagerduty.com/docs/change-events) (e.g. Jekings CI, Github, Gitlab, ...) is important to know that those vendors are only available with [PagerDuty AIOps](https://support.pagerduty.com/docs/aiops) add-on. Therefore, they won't be accessible as result of `pagerduty.getVendor` data source without the proper entitlements.
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
        ///     var datadog = Pagerduty.GetVendor.Invoke(new()
        ///     {
        ///         Name = "Datadog",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         Teams = new[]
        ///         {
        ///             examplePagerdutyTeam.Id,
        ///         },
        ///     });
        /// 
        ///     var foo = new Pagerduty.EscalationPolicy("foo", new()
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
        ///     var exampleService = new Pagerduty.Service("example", new()
        ///     {
        ///         Name = "My Web App",
        ///         AutoResolveTimeout = "14400",
        ///         AcknowledgementTimeout = "600",
        ///         EscalationPolicy = examplePagerdutyEscalationPolicy.Id,
        ///     });
        /// 
        ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
        ///     {
        ///         Name = "Datadog Integration",
        ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
        ///         Service = exampleService.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVendorResult> Invoke(GetVendorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVendorResult>("pagerduty:index/getVendor:getVendor", args ?? new GetVendorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVendorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The vendor name to use to find a vendor in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetVendorArgs()
        {
        }
        public static new GetVendorArgs Empty => new GetVendorArgs();
    }

    public sealed class GetVendorInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The vendor name to use to find a vendor in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetVendorInvokeArgs()
        {
        }
        public static new GetVendorInvokeArgs Empty => new GetVendorInvokeArgs();
    }


    [OutputType]
    public sealed class GetVendorResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The short name of the found vendor.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The generic service type for this vendor.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetVendorResult(
            string id,

            string name,

            string type)
        {
            Id = id;
            Name = name;
            Type = type;
        }
    }
}

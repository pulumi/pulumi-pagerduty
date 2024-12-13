// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetLicenses
    {
        /// <summary>
        /// Use this data source to get information about the purchased [licenses](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) that you can use for other managing PagerDuty user resources. To reference a unique license, see `pagerduty.getLicense` [data source](https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/data-sources/pagerduty_license). After applying changes to users' licenses, the `current_value` and `allocations_available` attributes of licenses will change.
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
        ///     var invalidRoles = new[]
        ///     {
        ///         "owner",
        ///     };
        /// 
        ///     var licenses = Pagerduty.GetLicenses.Invoke();
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         License = licenses.Apply(getLicensesResult =&gt; getLicensesResult.Licenses[0]?.Id),
        ///         Role = "user",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLicensesResult> InvokeAsync(GetLicensesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLicensesResult>("pagerduty:index/getLicenses:getLicenses", args ?? new GetLicensesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the purchased [licenses](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) that you can use for other managing PagerDuty user resources. To reference a unique license, see `pagerduty.getLicense` [data source](https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/data-sources/pagerduty_license). After applying changes to users' licenses, the `current_value` and `allocations_available` attributes of licenses will change.
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
        ///     var invalidRoles = new[]
        ///     {
        ///         "owner",
        ///     };
        /// 
        ///     var licenses = Pagerduty.GetLicenses.Invoke();
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         License = licenses.Apply(getLicensesResult =&gt; getLicensesResult.Licenses[0]?.Id),
        ///         Role = "user",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLicensesResult> Invoke(GetLicensesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLicensesResult>("pagerduty:index/getLicenses:getLicenses", args ?? new GetLicensesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the purchased [licenses](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) that you can use for other managing PagerDuty user resources. To reference a unique license, see `pagerduty.getLicense` [data source](https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/data-sources/pagerduty_license). After applying changes to users' licenses, the `current_value` and `allocations_available` attributes of licenses will change.
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
        ///     var invalidRoles = new[]
        ///     {
        ///         "owner",
        ///     };
        /// 
        ///     var licenses = Pagerduty.GetLicenses.Invoke();
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Name = "Earline Greenholt",
        ///         Email = "125.greenholt.earline@graham.name",
        ///         License = licenses.Apply(getLicensesResult =&gt; getLicensesResult.Licenses[0]?.Id),
        ///         Role = "user",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLicensesResult> Invoke(GetLicensesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLicensesResult>("pagerduty:index/getLicenses:getLicenses", args ?? new GetLicensesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLicensesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Allows to override the default behavior for setting the `id` attribute that is required for data sources.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetLicensesArgs()
        {
        }
        public static new GetLicensesArgs Empty => new GetLicensesArgs();
    }

    public sealed class GetLicensesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Allows to override the default behavior for setting the `id` attribute that is required for data sources.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetLicensesInvokeArgs()
        {
        }
        public static new GetLicensesInvokeArgs Empty => new GetLicensesInvokeArgs();
    }


    [OutputType]
    public sealed class GetLicensesResult
    {
        /// <summary>
        /// ID of the license
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The list of purchased licenses.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLicensesLicenseResult> Licenses;

        [OutputConstructor]
        private GetLicensesResult(
            string? id,

            ImmutableArray<Outputs.GetLicensesLicenseResult> licenses)
        {
            Id = id;
            Licenses = licenses;
        }
    }
}

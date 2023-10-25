// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetLicense
    {
        /// <summary>
        /// Use this data source to use a single purchased [license](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) to manage PagerDuty user resources. After applying changes to users' licenses, the `current_value` and `allocations_available` attributes of licenses will change.
        /// 
        /// &gt; It is preferred to set the `name` and `description` to their exact values or to set the `id`. However, this will require updating your configuration if the accounts products ever change. To avoid errors when account products change, you may set the `name` of a license to a valid substring such as `"Full User"` or `"Stakeholder"`.
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
        ///     var invalidRoles = new[]
        ///     {
        ///         "owner",
        ///     };
        /// 
        ///     var fullUser = Pagerduty.GetLicense.Invoke(new()
        ///     {
        ///         Name = "Full User",
        ///         Description = "",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Email = "125.greenholt.earline@graham.name",
        ///         License = fullUser.Apply(getLicenseResult =&gt; getLicenseResult.Id),
        ///         Role = "user",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLicenseResult> InvokeAsync(GetLicenseArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLicenseResult>("pagerduty:index/getLicense:getLicense", args ?? new GetLicenseArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to use a single purchased [license](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) to manage PagerDuty user resources. After applying changes to users' licenses, the `current_value` and `allocations_available` attributes of licenses will change.
        /// 
        /// &gt; It is preferred to set the `name` and `description` to their exact values or to set the `id`. However, this will require updating your configuration if the accounts products ever change. To avoid errors when account products change, you may set the `name` of a license to a valid substring such as `"Full User"` or `"Stakeholder"`.
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
        ///     var invalidRoles = new[]
        ///     {
        ///         "owner",
        ///     };
        /// 
        ///     var fullUser = Pagerduty.GetLicense.Invoke(new()
        ///     {
        ///         Name = "Full User",
        ///         Description = "",
        ///     });
        /// 
        ///     var example = new Pagerduty.User("example", new()
        ///     {
        ///         Email = "125.greenholt.earline@graham.name",
        ///         License = fullUser.Apply(getLicenseResult =&gt; getLicenseResult.Id),
        ///         Role = "user",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLicenseResult> Invoke(GetLicenseInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLicenseResult>("pagerduty:index/getLicense:getLicense", args ?? new GetLicenseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLicenseArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Available allocations to assign to users
        /// </summary>
        [Input("allocationsAvailable")]
        public int? AllocationsAvailable { get; set; }

        /// <summary>
        /// The number of allocations already assigned to users
        /// </summary>
        [Input("currentValue")]
        public int? CurrentValue { get; set; }

        /// <summary>
        /// Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("htmlUrl")]
        public string? HtmlUrl { get; set; }

        /// <summary>
        /// Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The role group for the license that determines the available `valid_roles`
        /// </summary>
        [Input("roleGroup")]
        public string? RoleGroup { get; set; }

        [Input("self")]
        public string? Self { get; set; }

        /// <summary>
        /// Summary of the license
        /// </summary>
        [Input("summary")]
        public string? Summary { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        [Input("validRoles")]
        private List<string>? _validRoles;

        /// <summary>
        /// List of allowed roles that may be assigned to a user with this license
        /// </summary>
        public List<string> ValidRoles
        {
            get => _validRoles ?? (_validRoles = new List<string>());
            set => _validRoles = value;
        }

        public GetLicenseArgs()
        {
        }
        public static new GetLicenseArgs Empty => new GetLicenseArgs();
    }

    public sealed class GetLicenseInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Available allocations to assign to users
        /// </summary>
        [Input("allocationsAvailable")]
        public Input<int>? AllocationsAvailable { get; set; }

        /// <summary>
        /// The number of allocations already assigned to users
        /// </summary>
        [Input("currentValue")]
        public Input<int>? CurrentValue { get; set; }

        /// <summary>
        /// Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        /// <summary>
        /// Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The role group for the license that determines the available `valid_roles`
        /// </summary>
        [Input("roleGroup")]
        public Input<string>? RoleGroup { get; set; }

        [Input("self")]
        public Input<string>? Self { get; set; }

        /// <summary>
        /// Summary of the license
        /// </summary>
        [Input("summary")]
        public Input<string>? Summary { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("validRoles")]
        private InputList<string>? _validRoles;

        /// <summary>
        /// List of allowed roles that may be assigned to a user with this license
        /// </summary>
        public InputList<string> ValidRoles
        {
            get => _validRoles ?? (_validRoles = new InputList<string>());
            set => _validRoles = value;
        }

        public GetLicenseInvokeArgs()
        {
        }
        public static new GetLicenseInvokeArgs Empty => new GetLicenseInvokeArgs();
    }


    [OutputType]
    public sealed class GetLicenseResult
    {
        /// <summary>
        /// Available allocations to assign to users
        /// </summary>
        public readonly int AllocationsAvailable;
        /// <summary>
        /// The number of allocations already assigned to users
        /// </summary>
        public readonly int CurrentValue;
        public readonly string Description;
        public readonly string HtmlUrl;
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The role group for the license that determines the available `valid_roles`
        /// </summary>
        public readonly string RoleGroup;
        public readonly string Self;
        /// <summary>
        /// Summary of the license
        /// </summary>
        public readonly string Summary;
        public readonly string Type;
        /// <summary>
        /// List of allowed roles that may be assigned to a user with this license
        /// </summary>
        public readonly ImmutableArray<string> ValidRoles;

        [OutputConstructor]
        private GetLicenseResult(
            int allocationsAvailable,

            int currentValue,

            string description,

            string htmlUrl,

            string id,

            string name,

            string roleGroup,

            string self,

            string summary,

            string type,

            ImmutableArray<string> validRoles)
        {
            AllocationsAvailable = allocationsAvailable;
            CurrentValue = currentValue;
            Description = description;
            HtmlUrl = htmlUrl;
            Id = id;
            Name = name;
            RoleGroup = roleGroup;
            Self = self;
            Summary = summary;
            Type = type;
            ValidRoles = validRoles;
        }
    }
}

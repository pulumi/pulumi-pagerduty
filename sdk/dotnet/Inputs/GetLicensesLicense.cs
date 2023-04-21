// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class GetLicensesLicenseArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Available allocations to assign to users
        /// </summary>
        [Input("allocationsAvailable", required: true)]
        public int AllocationsAvailable { get; set; }

        /// <summary>
        /// The number of allocations already assigned to users
        /// </summary>
        [Input("currentValue", required: true)]
        public int CurrentValue { get; set; }

        /// <summary>
        /// Description of the license
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        [Input("htmlUrl", required: true)]
        public string HtmlUrl { get; set; } = null!;

        /// <summary>
        /// Allows to override the default behavior for setting the `id` attribute that is required for data sources.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// Name of the license
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The role group for the license that determines the available `valid_roles`
        /// </summary>
        [Input("roleGroup", required: true)]
        public string RoleGroup { get; set; } = null!;

        [Input("self", required: true)]
        public string Self { get; set; } = null!;

        /// <summary>
        /// Summary of the license
        /// </summary>
        [Input("summary", required: true)]
        public string Summary { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        [Input("validRoles", required: true)]
        private List<string>? _validRoles;

        /// <summary>
        /// List of allowed roles that may be assigned to a user with this license
        /// </summary>
        public List<string> ValidRoles
        {
            get => _validRoles ?? (_validRoles = new List<string>());
            set => _validRoles = value;
        }

        public GetLicensesLicenseArgs()
        {
        }
        public static new GetLicensesLicenseArgs Empty => new GetLicensesLicenseArgs();
    }
}
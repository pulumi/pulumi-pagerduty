// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class GetLicensesLicenseInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Available allocations to assign to users
        /// </summary>
        [Input("allocationsAvailable", required: true)]
        public Input<int> AllocationsAvailable { get; set; } = null!;

        /// <summary>
        /// The number of allocations already assigned to users
        /// </summary>
        [Input("currentValue", required: true)]
        public Input<int> CurrentValue { get; set; } = null!;

        /// <summary>
        /// Description of the license
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("htmlUrl", required: true)]
        public Input<string> HtmlUrl { get; set; } = null!;

        /// <summary>
        /// Allows to override the default behavior for setting the `id` attribute that is required for data sources.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Name of the license
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The role group for the license that determines the available `valid_roles`
        /// </summary>
        [Input("roleGroup", required: true)]
        public Input<string> RoleGroup { get; set; } = null!;

        [Input("self", required: true)]
        public Input<string> Self { get; set; } = null!;

        /// <summary>
        /// Summary of the license
        /// </summary>
        [Input("summary", required: true)]
        public Input<string> Summary { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("validRoles", required: true)]
        private InputList<string>? _validRoles;

        /// <summary>
        /// List of allowed roles that may be assigned to a user with this license
        /// </summary>
        public InputList<string> ValidRoles
        {
            get => _validRoles ?? (_validRoles = new InputList<string>());
            set => _validRoles = value;
        }

        public GetLicensesLicenseInputArgs()
        {
        }
        public static new GetLicensesLicenseInputArgs Empty => new GetLicensesLicenseInputArgs();
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMg-create-a-team) is a collection of users and escalation policies that represent a group of people within an organization.
    /// 
    /// The account must have the `teams` ability to use the following resource.
    /// 
    /// ## Import
    /// 
    /// Teams can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/team:Team main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/team:Team")]
    public partial class Team : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app
        /// </summary>
        [Output("htmlUrl")]
        public Output<string> HtmlUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
        /// </summary>
        [Output("parent")]
        public Output<string?> Parent { get; private set; } = null!;


        /// <summary>
        /// Create a Team resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Team(string name, TeamArgs? args = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/team:Team", name, args ?? new TeamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Team(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/team:Team", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Team resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Team Get(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
        {
            return new Team(name, id, state, options);
        }
    }

    public sealed class TeamArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        public TeamArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new TeamArgs Empty => new TeamArgs();
    }

    public sealed class TeamState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app
        /// </summary>
        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        /// <summary>
        /// The name of the group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        public TeamState()
        {
            Description = "Managed by Pulumi";
        }
        public static new TeamState Empty => new TeamState();
    }
}

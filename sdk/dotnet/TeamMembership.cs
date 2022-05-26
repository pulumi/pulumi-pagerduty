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
    /// A [team membership](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMg-add-a-user-to-a-team) manages memberships within a team.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var fooUser = new Pagerduty.User("fooUser", new Pagerduty.UserArgs
    ///         {
    ///             Email = "foo@bar.com",
    ///         });
    ///         var fooTeam = new Pagerduty.Team("fooTeam", new Pagerduty.TeamArgs
    ///         {
    ///             Description = "foo",
    ///         });
    ///         var fooTeamMembership = new Pagerduty.TeamMembership("fooTeamMembership", new Pagerduty.TeamMembershipArgs
    ///         {
    ///             UserId = fooUser.Id,
    ///             TeamId = fooTeam.Id,
    ///             Role = "manager",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Team memberships can be imported using the `user_id` and `team_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/teamMembership:TeamMembership")]
    public partial class TeamMembership : Pulumi.CustomResource
    {
        /// <summary>
        /// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        /// These roles match up to user roles in the following ways:
        /// * User role of `user` is a Team role of `manager`
        /// * User role of `limited_user` is a Team role of `responder`
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// The ID of the team in which the user will belong.
        /// </summary>
        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;

        /// <summary>
        /// The ID of the user to add to the team.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a TeamMembership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamMembership(string name, TeamMembershipArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/teamMembership:TeamMembership", name, args ?? new TeamMembershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamMembership(string name, Input<string> id, TeamMembershipState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/teamMembership:TeamMembership", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TeamMembership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamMembership Get(string name, Input<string> id, TeamMembershipState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamMembership(name, id, state, options);
        }
    }

    public sealed class TeamMembershipArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        /// These roles match up to user roles in the following ways:
        /// * User role of `user` is a Team role of `manager`
        /// * User role of `limited_user` is a Team role of `responder`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The ID of the team in which the user will belong.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        /// <summary>
        /// The ID of the user to add to the team.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public TeamMembershipArgs()
        {
        }
    }

    public sealed class TeamMembershipState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        /// These roles match up to user roles in the following ways:
        /// * User role of `user` is a Team role of `manager`
        /// * User role of `limited_user` is a Team role of `responder`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The ID of the team in which the user will belong.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// The ID of the user to add to the team.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public TeamMembershipState()
        {
        }
    }
}

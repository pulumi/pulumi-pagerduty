// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetTeamMembers
    {
        /// <summary>
        /// Use this data source to get information about a specific [team's members][1].
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
        ///     var devops = Pagerduty.GetTeam.Invoke(new()
        ///     {
        ///         Name = "devops",
        ///     });
        /// 
        ///     var devopsMembers = Pagerduty.GetTeamMembers.Invoke(new()
        ///     {
        ///         TeamId = devops.Apply(getTeamResult =&gt; getTeamResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTeamMembersResult> InvokeAsync(GetTeamMembersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTeamMembersResult>("pagerduty:index/getTeamMembers:getTeamMembers", args ?? new GetTeamMembersArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [team's members][1].
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
        ///     var devops = Pagerduty.GetTeam.Invoke(new()
        ///     {
        ///         Name = "devops",
        ///     });
        /// 
        ///     var devopsMembers = Pagerduty.GetTeamMembers.Invoke(new()
        ///     {
        ///         TeamId = devops.Apply(getTeamResult =&gt; getTeamResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTeamMembersResult> Invoke(GetTeamMembersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTeamMembersResult>("pagerduty:index/getTeamMembers:getTeamMembers", args ?? new GetTeamMembersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTeamMembersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the team to find in the PagerDuty API.
        /// </summary>
        [Input("teamId", required: true)]
        public string TeamId { get; set; } = null!;

        public GetTeamMembersArgs()
        {
        }
        public static new GetTeamMembersArgs Empty => new GetTeamMembersArgs();
    }

    public sealed class GetTeamMembersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the team to find in the PagerDuty API.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        public GetTeamMembersInvokeArgs()
        {
        }
        public static new GetTeamMembersInvokeArgs Empty => new GetTeamMembersInvokeArgs();
    }


    [OutputType]
    public sealed class GetTeamMembersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The users of the found team.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTeamMembersMemberResult> Members;
        public readonly string TeamId;

        [OutputConstructor]
        private GetTeamMembersResult(
            string id,

            ImmutableArray<Outputs.GetTeamMembersMemberResult> members,

            string teamId)
        {
            Id = id;
            Members = members;
            TeamId = teamId;
        }
    }
}
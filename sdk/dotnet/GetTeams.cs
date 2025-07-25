// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetTeams
    {
        /// <summary>
        /// Use this data source to [list teams](https://developer.pagerduty.com/api-reference/0138639504311-list-teams) in your PagerDuty account.
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
        ///     var allTeams = Pagerduty.GetTeams.Invoke();
        /// 
        ///     // Fetch only teams whose name matches "devops"
        ///     var devops = Pagerduty.GetTeams.Invoke(new()
        ///     {
        ///         Query = "devops",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTeamsResult> InvokeAsync(GetTeamsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTeamsResult>("pagerduty:index/getTeams:getTeams", args ?? new GetTeamsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to [list teams](https://developer.pagerduty.com/api-reference/0138639504311-list-teams) in your PagerDuty account.
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
        ///     var allTeams = Pagerduty.GetTeams.Invoke();
        /// 
        ///     // Fetch only teams whose name matches "devops"
        ///     var devops = Pagerduty.GetTeams.Invoke(new()
        ///     {
        ///         Query = "devops",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTeamsResult> Invoke(GetTeamsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTeamsResult>("pagerduty:index/getTeams:getTeams", args ?? new GetTeamsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to [list teams](https://developer.pagerduty.com/api-reference/0138639504311-list-teams) in your PagerDuty account.
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
        ///     var allTeams = Pagerduty.GetTeams.Invoke();
        /// 
        ///     // Fetch only teams whose name matches "devops"
        ///     var devops = Pagerduty.GetTeams.Invoke(new()
        ///     {
        ///         Query = "devops",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTeamsResult> Invoke(GetTeamsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTeamsResult>("pagerduty:index/getTeams:getTeams", args ?? new GetTeamsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTeamsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the result, showing only the records whose name matches the query.
        /// </summary>
        [Input("query")]
        public string? Query { get; set; }

        public GetTeamsArgs()
        {
        }
        public static new GetTeamsArgs Empty => new GetTeamsArgs();
    }

    public sealed class GetTeamsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the result, showing only the records whose name matches the query.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        public GetTeamsInvokeArgs()
        {
        }
        public static new GetTeamsInvokeArgs Empty => new GetTeamsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTeamsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Query;
        /// <summary>
        /// The teams found.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTeamsTeamResult> Teams;

        [OutputConstructor]
        private GetTeamsResult(
            string id,

            string? query,

            ImmutableArray<Outputs.GetTeamsTeamResult> teams)
        {
            Id = id;
            Query = query;
            Teams = teams;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetTag
    {
        /// <summary>
        /// Use this data source to get information about a specific [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) that you can use to assign to users, teams, and escalation_policies.
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
        ///     var me = Pagerduty.GetUser.Invoke(new()
        ///     {
        ///         Email = "me@example.com",
        ///     });
        /// 
        ///     var devops = Pagerduty.GetTag.Invoke(new()
        ///     {
        ///         Label = "devops",
        ///     });
        /// 
        ///     var foo = new Pagerduty.TagAssignment("foo", new()
        ///     {
        ///         TagId = devops.Apply(getTagResult =&gt; getTagResult.Id),
        ///         EntityId = me.Apply(getUserResult =&gt; getUserResult.Id),
        ///         EntityType = "users",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTagResult> InvokeAsync(GetTagArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTagResult>("pagerduty:index/getTag:getTag", args ?? new GetTagArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) that you can use to assign to users, teams, and escalation_policies.
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
        ///     var me = Pagerduty.GetUser.Invoke(new()
        ///     {
        ///         Email = "me@example.com",
        ///     });
        /// 
        ///     var devops = Pagerduty.GetTag.Invoke(new()
        ///     {
        ///         Label = "devops",
        ///     });
        /// 
        ///     var foo = new Pagerduty.TagAssignment("foo", new()
        ///     {
        ///         TagId = devops.Apply(getTagResult =&gt; getTagResult.Id),
        ///         EntityId = me.Apply(getUserResult =&gt; getUserResult.Id),
        ///         EntityType = "users",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTagResult> Invoke(GetTagInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagResult>("pagerduty:index/getTag:getTag", args ?? new GetTagInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) that you can use to assign to users, teams, and escalation_policies.
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
        ///     var me = Pagerduty.GetUser.Invoke(new()
        ///     {
        ///         Email = "me@example.com",
        ///     });
        /// 
        ///     var devops = Pagerduty.GetTag.Invoke(new()
        ///     {
        ///         Label = "devops",
        ///     });
        /// 
        ///     var foo = new Pagerduty.TagAssignment("foo", new()
        ///     {
        ///         TagId = devops.Apply(getTagResult =&gt; getTagResult.Id),
        ///         EntityId = me.Apply(getUserResult =&gt; getUserResult.Id),
        ///         EntityType = "users",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTagResult> Invoke(GetTagInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagResult>("pagerduty:index/getTag:getTag", args ?? new GetTagInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTagArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The label of the tag to find in the PagerDuty API.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        public GetTagArgs()
        {
        }
        public static new GetTagArgs Empty => new GetTagArgs();
    }

    public sealed class GetTagInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The label of the tag to find in the PagerDuty API.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        public GetTagInvokeArgs()
        {
        }
        public static new GetTagInvokeArgs Empty => new GetTagInvokeArgs();
    }


    [OutputType]
    public sealed class GetTagResult
    {
        /// <summary>
        /// The ID of the found team.
        /// </summary>
        public readonly string Id;
        public readonly string Label;

        [OutputConstructor]
        private GetTagResult(
            string id,

            string label)
        {
            Id = id;
            Label = label;
        }
    }
}

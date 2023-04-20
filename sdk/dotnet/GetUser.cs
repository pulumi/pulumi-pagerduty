// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetUser
    {
        /// <summary>
        /// Use this data source to get information about a specific [user](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources.
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
        ///     var me = Pagerduty.GetUser.Invoke(new()
        ///     {
        ///         Email = "me@example.com",
        ///     });
        /// 
        ///     var foo = new Pagerduty.EscalationPolicy("foo", new()
        ///     {
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
        ///                         Id = me.Apply(getUserResult =&gt; getUserResult.Id),
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("pagerduty:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [user](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources.
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
        ///     var me = Pagerduty.GetUser.Invoke(new()
        ///     {
        ///         Email = "me@example.com",
        ///     });
        /// 
        ///     var foo = new Pagerduty.EscalationPolicy("foo", new()
        ///     {
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
        ///                         Id = me.Apply(getUserResult =&gt; getUserResult.Id),
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("pagerduty:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email to use to find a user in the PagerDuty API.
        /// </summary>
        [Input("email", required: true)]
        public string Email { get; set; } = null!;

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email to use to find a user in the PagerDuty API.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        public readonly string Email;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The short name of the found user.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetUserResult(
            string email,

            string id,

            string name)
        {
            Email = email;
            Id = id;
            Name = name;
        }
    }
}

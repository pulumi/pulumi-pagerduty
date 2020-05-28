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
        /// Use this data source to get information about a specific [user](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users) that you can use for other PagerDuty resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var me = Output.Create(Pagerduty.GetUser.InvokeAsync(new Pagerduty.GetUserArgs
        ///         {
        ///             Email = "me@example.com",
        ///         }));
        ///         var foo = new Pagerduty.EscalationPolicy("foo", new Pagerduty.EscalationPolicyArgs
        ///         {
        ///             NumLoops = 2,
        ///             Rules = 
        ///             {
        ///                 new Pagerduty.Inputs.EscalationPolicyRuleArgs
        ///                 {
        ///                     EscalationDelayInMinutes = 10,
        ///                     Target = 
        ///                     {
        ///                         
        ///                         {
        ///                             { "id", me.Apply(me =&gt; me.Id) },
        ///                             { "type", "user" },
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("pagerduty:index/getUser:getUser", args ?? new GetUserArgs(), options.WithVersion());
    }


    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email to use to find a user in the PagerDuty API.
        /// </summary>
        [Input("email", required: true)]
        public string Email { get; set; } = null!;

        public GetUserArgs()
        {
        }
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

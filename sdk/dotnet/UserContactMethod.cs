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
    ///     var example = new Pagerduty.User("example", new()
    ///     {
    ///         Name = "Earline Greenholt",
    ///         Email = "125.greenholt.earline@graham.name",
    ///         Teams = new[]
    ///         {
    ///             examplePagerdutyTeam.Id,
    ///         },
    ///     });
    /// 
    ///     var email = new Pagerduty.UserContactMethod("email", new()
    ///     {
    ///         UserId = example.Id,
    ///         Type = "email_contact_method",
    ///         Address = "foo@bar.com",
    ///         Label = "Work",
    ///     });
    /// 
    ///     var phone = new Pagerduty.UserContactMethod("phone", new()
    ///     {
    ///         UserId = example.Id,
    ///         Type = "phone_contact_method",
    ///         CountryCode = 1,
    ///         Address = "2025550199",
    ///         Label = "Work",
    ///     });
    /// 
    ///     var sms = new Pagerduty.UserContactMethod("sms", new()
    ///     {
    ///         UserId = example.Id,
    ///         Type = "sms_contact_method",
    ///         CountryCode = 1,
    ///         Address = "2025550199",
    ///         Label = "Work",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Contact methods can be imported using the `user_id` and the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/userContactMethod:UserContactMethod")]
    public partial class UserContactMethod : global::Pulumi.CustomResource
    {
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        /// </summary>
        [Output("blacklisted")]
        public Output<bool> Blacklisted { get; private set; } = null!;

        [Output("countryCode")]
        public Output<int> CountryCode { get; private set; } = null!;

        /// <summary>
        /// If true, this phone is capable of receiving SMS messages.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        [Output("sendShortEmail")]
        public Output<bool?> SendShortEmail { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserContactMethod resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserContactMethod(string name, UserContactMethodArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/userContactMethod:UserContactMethod", name, args ?? new UserContactMethodArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserContactMethod(string name, Input<string> id, UserContactMethodState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/userContactMethod:UserContactMethod", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserContactMethod resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserContactMethod Get(string name, Input<string> id, UserContactMethodState? state = null, CustomResourceOptions? options = null)
        {
            return new UserContactMethod(name, id, state, options);
        }
    }

    public sealed class UserContactMethodArgs : global::Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("countryCode")]
        public Input<int>? CountryCode { get; set; }

        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        [Input("sendShortEmail")]
        public Input<bool>? SendShortEmail { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserContactMethodArgs()
        {
        }
        public static new UserContactMethodArgs Empty => new UserContactMethodArgs();
    }

    public sealed class UserContactMethodState : global::Pulumi.ResourceArgs
    {
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        /// </summary>
        [Input("blacklisted")]
        public Input<bool>? Blacklisted { get; set; }

        [Input("countryCode")]
        public Input<int>? CountryCode { get; set; }

        /// <summary>
        /// If true, this phone is capable of receiving SMS messages.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("sendShortEmail")]
        public Input<bool>? SendShortEmail { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserContactMethodState()
        {
        }
        public static new UserContactMethodState Empty => new UserContactMethodState();
    }
}

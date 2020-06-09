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
    /// A [notification rule](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users_id_notification_rules_notification_rule_id) configures where and when a PagerDuty user is notified when a triggered incident is assigned to him. Unique notification rules can be created for both high and low-urgency incidents.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Pagerduty.User("example", new Pagerduty.UserArgs
    ///         {
    ///             Email = "125.greenholt.earline@graham.name",
    ///         });
    ///         var email = new Pagerduty.UserContactMethod("email", new Pagerduty.UserContactMethodArgs
    ///         {
    ///             UserId = example.Id,
    ///             Type = "email_contact_method",
    ///             Address = "foo@bar.com",
    ///             Label = "Work",
    ///         });
    ///         var phone = new Pagerduty.UserContactMethod("phone", new Pagerduty.UserContactMethodArgs
    ///         {
    ///             UserId = example.Id,
    ///             Type = "phone_contact_method",
    ///             CountryCode = 1,
    ///             Address = "2025550199",
    ///             Label = "Work",
    ///         });
    ///         var sms = new Pagerduty.UserContactMethod("sms", new Pagerduty.UserContactMethodArgs
    ///         {
    ///             UserId = example.Id,
    ///             Type = "sms_contact_method",
    ///             CountryCode = 1,
    ///             Address = "2025550199",
    ///             Label = "Work",
    ///         });
    ///         var highUrgencyPhone = new Pagerduty.UserNotificationRule("highUrgencyPhone", new Pagerduty.UserNotificationRuleArgs
    ///         {
    ///             UserId = example.Id,
    ///             StartDelayInMinutes = 1,
    ///             Urgency = "high",
    ///             ContactMethod = new Pagerduty.Inputs.UserNotificationRuleContactMethodArgs
    ///             {
    ///                 Type = "phone_contact_method",
    ///                 Id = phone.Id,
    ///             },
    ///         });
    ///         var lowUrgencyEmail = new Pagerduty.UserNotificationRule("lowUrgencyEmail", new Pagerduty.UserNotificationRuleArgs
    ///         {
    ///             UserId = example.Id,
    ///             StartDelayInMinutes = 1,
    ///             Urgency = "low",
    ///             ContactMethod = new Pagerduty.Inputs.UserNotificationRuleContactMethodArgs
    ///             {
    ///                 Type = "email_contact_method",
    ///                 Id = email.Id,
    ///             },
    ///         });
    ///         var lowUrgencySms = new Pagerduty.UserNotificationRule("lowUrgencySms", new Pagerduty.UserNotificationRuleArgs
    ///         {
    ///             UserId = example.Id,
    ///             StartDelayInMinutes = 10,
    ///             Urgency = "low",
    ///             ContactMethod = new Pagerduty.Inputs.UserNotificationRuleContactMethodArgs
    ///             {
    ///                 Type = "sms_contact_method",
    ///                 Id = sms.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class UserNotificationRule : Pulumi.CustomResource
    {
        /// <summary>
        /// A contact method block, configured as a block described below.
        /// </summary>
        [Output("contactMethod")]
        public Output<Outputs.UserNotificationRuleContactMethod> ContactMethod { get; private set; } = null!;

        /// <summary>
        /// The delay before firing the rule, in minutes.
        /// </summary>
        [Output("startDelayInMinutes")]
        public Output<int> StartDelayInMinutes { get; private set; } = null!;

        /// <summary>
        /// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        /// </summary>
        [Output("urgency")]
        public Output<string> Urgency { get; private set; } = null!;

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserNotificationRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserNotificationRule(string name, UserNotificationRuleArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/userNotificationRule:UserNotificationRule", name, args ?? new UserNotificationRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserNotificationRule(string name, Input<string> id, UserNotificationRuleState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/userNotificationRule:UserNotificationRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserNotificationRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserNotificationRule Get(string name, Input<string> id, UserNotificationRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new UserNotificationRule(name, id, state, options);
        }
    }

    public sealed class UserNotificationRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A contact method block, configured as a block described below.
        /// </summary>
        [Input("contactMethod", required: true)]
        public Input<Inputs.UserNotificationRuleContactMethodArgs> ContactMethod { get; set; } = null!;

        /// <summary>
        /// The delay before firing the rule, in minutes.
        /// </summary>
        [Input("startDelayInMinutes", required: true)]
        public Input<int> StartDelayInMinutes { get; set; } = null!;

        /// <summary>
        /// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        /// </summary>
        [Input("urgency", required: true)]
        public Input<string> Urgency { get; set; } = null!;

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserNotificationRuleArgs()
        {
        }
    }

    public sealed class UserNotificationRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A contact method block, configured as a block described below.
        /// </summary>
        [Input("contactMethod")]
        public Input<Inputs.UserNotificationRuleContactMethodGetArgs>? ContactMethod { get; set; }

        /// <summary>
        /// The delay before firing the rule, in minutes.
        /// </summary>
        [Input("startDelayInMinutes")]
        public Input<int>? StartDelayInMinutes { get; set; }

        /// <summary>
        /// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        /// </summary>
        [Input("urgency")]
        public Input<string>? Urgency { get; set; }

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserNotificationRuleState()
        {
        }
    }
}

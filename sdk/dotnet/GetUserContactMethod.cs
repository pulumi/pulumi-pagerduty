// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetUserContactMethod
    {
        /// <summary>
        /// Use this data source to get information about a specific [contact method](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D~1contact_methods~1%7Bcontact_method_id%7D/get) of a PagerDuty [user](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D/get) that you can use for other PagerDuty resources.
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
        ///         var phonePush = me.Apply(me =&gt; Output.Create(Pagerduty.GetUserContactMethod.InvokeAsync(new Pagerduty.GetUserContactMethodArgs
        ///         {
        ///             UserId = me.Id,
        ///             Type = "push_notification_contact_method",
        ///             Label = "iPhone (John)",
        ///         })));
        ///         var lowUrgencySms = new Pagerduty.UserNotificationRule("lowUrgencySms", new Pagerduty.UserNotificationRuleArgs
        ///         {
        ///             UserId = me.Apply(me =&gt; me.Id),
        ///             StartDelayInMinutes = 5,
        ///             Urgency = "high",
        ///             ContactMethod = 
        ///             {
        ///                 { "type", "push_notification_contact_method" },
        ///                 { "id", phonePush.Apply(phonePush =&gt; phonePush.Id) },
        ///             },
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserContactMethodResult> InvokeAsync(GetUserContactMethodArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserContactMethodResult>("pagerduty:index/getUserContactMethod:getUserContactMethod", args ?? new GetUserContactMethodArgs(), options.WithVersion());
    }


    public sealed class GetUserContactMethodArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        /// <summary>
        /// The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId", required: true)]
        public string UserId { get; set; } = null!;

        public GetUserContactMethodArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUserContactMethodResult
    {
        /// <summary>
        /// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it. (Phone and SMS contact methods only.)
        /// </summary>
        public readonly bool Blacklisted;
        /// <summary>
        /// The 1-to-3 digit country calling code. (Phone and SMS contact methods only.)
        /// </summary>
        public readonly int CountryCode;
        /// <summary>
        /// Either `ios` or `android`, depending on the type of the device receiving notifications. (Push notification contact method only.)
        /// </summary>
        public readonly string DeviceType;
        /// <summary>
        /// If true, this phone is capable of receiving SMS messages. (Phone and SMS contact methods only.)
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Send an abbreviated email message instead of the standard email output. (Email contact method only.)
        /// </summary>
        public readonly bool SendShortEmail;
        /// <summary>
        /// The type of the found contact method. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        /// </summary>
        public readonly string Type;
        public readonly string UserId;

        [OutputConstructor]
        private GetUserContactMethodResult(
            string address,

            bool blacklisted,

            int countryCode,

            string deviceType,

            bool enabled,

            string id,

            string label,

            bool sendShortEmail,

            string type,

            string userId)
        {
            Address = address;
            Blacklisted = blacklisted;
            CountryCode = countryCode;
            DeviceType = deviceType;
            Enabled = enabled;
            Id = id;
            Label = label;
            SendShortEmail = sendShortEmail;
            Type = type;
            UserId = userId;
        }
    }
}

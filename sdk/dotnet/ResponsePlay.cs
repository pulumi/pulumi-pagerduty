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
    ///     var exampleUser = new Pagerduty.User("exampleUser", new()
    ///     {
    ///         Email = "125.greenholt.earline@graham.name",
    ///         Teams = new[]
    ///         {
    ///             pagerduty_team.Example.Id,
    ///         },
    ///     });
    /// 
    ///     var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("exampleEscalationPolicy", new()
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
    ///                         Id = exampleUser.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleResponsePlay = new Pagerduty.ResponsePlay("exampleResponsePlay", new()
    ///     {
    ///         From = exampleUser.Email,
    ///         Responders = new[]
    ///         {
    ///             new Pagerduty.Inputs.ResponsePlayResponderArgs
    ///             {
    ///                 Type = "escalation_policy_reference",
    ///                 Id = exampleEscalationPolicy.Id,
    ///             },
    ///         },
    ///         Subscribers = new[]
    ///         {
    ///             new Pagerduty.Inputs.ResponsePlaySubscriberArgs
    ///             {
    ///                 Type = "user_reference",
    ///                 Id = exampleUser.Id,
    ///             },
    ///         },
    ///         Runnability = "services",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Response Plays can be imported using the `id.from(email)`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/responsePlay:ResponsePlay main 16208303-022b-f745-f2f5-560e537a2a74.user@email.com
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/responsePlay:ResponsePlay")]
    public partial class ResponsePlay : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The telephone number that will be set as the conference number for any incident on which this response play is run.
        /// </summary>
        [Output("conferenceNumber")]
        public Output<string?> ConferenceNumber { get; private set; } = null!;

        /// <summary>
        /// The URL that will be set as the conference URL for any incident on which this response play is run.
        /// </summary>
        [Output("conferenceUrl")]
        public Output<string?> ConferenceUrl { get; private set; } = null!;

        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
        /// </summary>
        [Output("from")]
        public Output<string> From { get; private set; } = null!;

        /// <summary>
        /// The name of the response play.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
        /// </summary>
        [Output("responders")]
        public Output<ImmutableArray<Outputs.ResponsePlayResponder>> Responders { get; private set; } = null!;

        /// <summary>
        /// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
        /// </summary>
        [Output("respondersMessage")]
        public Output<string?> RespondersMessage { get; private set; } = null!;

        /// <summary>
        /// String representing how this response play is allowed to be run. Valid options are:
        /// </summary>
        [Output("runnability")]
        public Output<string?> Runnability { get; private set; } = null!;

        /// <summary>
        /// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
        /// </summary>
        [Output("subscribers")]
        public Output<ImmutableArray<Outputs.ResponsePlaySubscriber>> Subscribers { get; private set; } = null!;

        /// <summary>
        /// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
        /// </summary>
        [Output("subscribersMessage")]
        public Output<string?> SubscribersMessage { get; private set; } = null!;

        /// <summary>
        /// The ID of the team associated with the response play.
        /// </summary>
        [Output("team")]
        public Output<string?> Team { get; private set; } = null!;

        /// <summary>
        /// A string that determines the schema of the object. If not set, the default value is "response_play".
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ResponsePlay resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResponsePlay(string name, ResponsePlayArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/responsePlay:ResponsePlay", name, args ?? new ResponsePlayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResponsePlay(string name, Input<string> id, ResponsePlayState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/responsePlay:ResponsePlay", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResponsePlay resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResponsePlay Get(string name, Input<string> id, ResponsePlayState? state = null, CustomResourceOptions? options = null)
        {
            return new ResponsePlay(name, id, state, options);
        }
    }

    public sealed class ResponsePlayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The telephone number that will be set as the conference number for any incident on which this response play is run.
        /// </summary>
        [Input("conferenceNumber")]
        public Input<string>? ConferenceNumber { get; set; }

        /// <summary>
        /// The URL that will be set as the conference URL for any incident on which this response play is run.
        /// </summary>
        [Input("conferenceUrl")]
        public Input<string>? ConferenceUrl { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
        /// </summary>
        [Input("from", required: true)]
        public Input<string> From { get; set; } = null!;

        /// <summary>
        /// The name of the response play.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("responders")]
        private InputList<Inputs.ResponsePlayResponderArgs>? _responders;

        /// <summary>
        /// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.ResponsePlayResponderArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
        /// </summary>
        [Input("respondersMessage")]
        public Input<string>? RespondersMessage { get; set; }

        /// <summary>
        /// String representing how this response play is allowed to be run. Valid options are:
        /// </summary>
        [Input("runnability")]
        public Input<string>? Runnability { get; set; }

        [Input("subscribers")]
        private InputList<Inputs.ResponsePlaySubscriberArgs>? _subscribers;

        /// <summary>
        /// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
        /// </summary>
        public InputList<Inputs.ResponsePlaySubscriberArgs> Subscribers
        {
            get => _subscribers ?? (_subscribers = new InputList<Inputs.ResponsePlaySubscriberArgs>());
            set => _subscribers = value;
        }

        /// <summary>
        /// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
        /// </summary>
        [Input("subscribersMessage")]
        public Input<string>? SubscribersMessage { get; set; }

        /// <summary>
        /// The ID of the team associated with the response play.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        /// <summary>
        /// A string that determines the schema of the object. If not set, the default value is "response_play".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ResponsePlayArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new ResponsePlayArgs Empty => new ResponsePlayArgs();
    }

    public sealed class ResponsePlayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The telephone number that will be set as the conference number for any incident on which this response play is run.
        /// </summary>
        [Input("conferenceNumber")]
        public Input<string>? ConferenceNumber { get; set; }

        /// <summary>
        /// The URL that will be set as the conference URL for any incident on which this response play is run.
        /// </summary>
        [Input("conferenceUrl")]
        public Input<string>? ConferenceUrl { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
        /// </summary>
        [Input("from")]
        public Input<string>? From { get; set; }

        /// <summary>
        /// The name of the response play.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("responders")]
        private InputList<Inputs.ResponsePlayResponderGetArgs>? _responders;

        /// <summary>
        /// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderGetArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.ResponsePlayResponderGetArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
        /// </summary>
        [Input("respondersMessage")]
        public Input<string>? RespondersMessage { get; set; }

        /// <summary>
        /// String representing how this response play is allowed to be run. Valid options are:
        /// </summary>
        [Input("runnability")]
        public Input<string>? Runnability { get; set; }

        [Input("subscribers")]
        private InputList<Inputs.ResponsePlaySubscriberGetArgs>? _subscribers;

        /// <summary>
        /// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
        /// </summary>
        public InputList<Inputs.ResponsePlaySubscriberGetArgs> Subscribers
        {
            get => _subscribers ?? (_subscribers = new InputList<Inputs.ResponsePlaySubscriberGetArgs>());
            set => _subscribers = value;
        }

        /// <summary>
        /// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
        /// </summary>
        [Input("subscribersMessage")]
        public Input<string>? SubscribersMessage { get; set; }

        /// <summary>
        /// The ID of the team associated with the response play.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        /// <summary>
        /// A string that determines the schema of the object. If not set, the default value is "response_play".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ResponsePlayState()
        {
            Description = "Managed by Pulumi";
        }
        public static new ResponsePlayState Empty => new ResponsePlayState();
    }
}

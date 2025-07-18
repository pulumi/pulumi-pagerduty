// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [slack connection](https://developer.pagerduty.com/api-reference/YXBpOjExMjA5NTQ0-pager-duty-slack-integration-api) allows you to connect a workspace in Slack to a PagerDuty service or team which allows you to acknowledge and resolve PagerDuty incidents from the Slack user interface.
    /// 
    /// **NOTES for using this resource:**
    /// * To first use this resource you will need to [map your PagerDuty account to a valid Slack Workspace](https://support.pagerduty.com/docs/slack-integration-guide#integration-walkthrough). *This can only be done through the PagerDuty UI.*
    /// * This resource requires a PagerDuty [user-level API key](https://support.pagerduty.com/docs/generating-api-keys#section-generating-a-personal-rest-api-key). This can be set as the `user_token` on the provider tag or as the `PAGERDUTY_USER_TOKEN` environment variable.
    /// * This resource is for configuring Slack V2 Next Generation connections. If you configured your Slack integration (V1 or V2) prior to August 10, 2021, you may migrate to the Slack V2 Next Generation update using this [migration instructions](https://support.pagerduty.com/docs/slack-integration-guide#migrate-to-slack-v2-next-generation), but if you configured your Slack integration after that date, you will have access to the update out of the box.
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
    ///     var foo = new Pagerduty.Team("foo", new()
    ///     {
    ///         Name = "Team Foo",
    ///     });
    /// 
    ///     var p1 = Pagerduty.GetPriority.Invoke(new()
    ///     {
    ///         Name = "P1",
    ///     });
    /// 
    ///     var fooSlackConnection = new Pagerduty.SlackConnection("foo", new()
    ///     {
    ///         SourceId = foo.Id,
    ///         SourceType = "team_reference",
    ///         WorkspaceId = "T02A123LV1A",
    ///         ChannelId = "C02CABCDAC9",
    ///         NotificationType = "responder",
    ///         Configs = new[]
    ///         {
    ///             new Pagerduty.Inputs.SlackConnectionConfigArgs
    ///             {
    ///                 Events = new[]
    ///                 {
    ///                     "incident.triggered",
    ///                     "incident.acknowledged",
    ///                     "incident.escalated",
    ///                     "incident.resolved",
    ///                     "incident.reassigned",
    ///                     "incident.annotated",
    ///                     "incident.unacknowledged",
    ///                     "incident.delegated",
    ///                     "incident.priority_updated",
    ///                     "incident.responder.added",
    ///                     "incident.responder.replied",
    ///                     "incident.status_update_published",
    ///                     "incident.reopened",
    ///                 },
    ///                 Priorities = new[]
    ///                 {
    ///                     p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Slack connections can be imported using the related `workspace` ID and the `slack_connection` ID separated by a dot, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/slackConnection:SlackConnection main T02A123LV1A.PUABCDL
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/slackConnection:SlackConnection")]
    public partial class SlackConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of a Slack channel in the workspace.
        /// </summary>
        [Output("channelId")]
        public Output<string> ChannelId { get; private set; } = null!;

        /// <summary>
        /// Name of the Slack channel in Slack connection.
        /// </summary>
        [Output("channelName")]
        public Output<string> ChannelName { get; private set; } = null!;

        /// <summary>
        /// Configuration options for the Slack connection that provide options to filter events.
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.SlackConnectionConfig>> Configs { get; private set; } = null!;

        /// <summary>
        /// Type of notification. Either `responder` or `stakeholder`.
        /// </summary>
        [Output("notificationType")]
        public Output<string> NotificationType { get; private set; } = null!;

        /// <summary>
        /// The ID of the source in PagerDuty. Valid sources are services or teams.
        /// </summary>
        [Output("sourceId")]
        public Output<string> SourceId { get; private set; } = null!;

        /// <summary>
        /// Name of the source (team or service) in Slack connection.
        /// </summary>
        [Output("sourceName")]
        public Output<string> SourceName { get; private set; } = null!;

        /// <summary>
        /// The type of the source. Either `team_reference` or `service_reference`.
        /// </summary>
        [Output("sourceType")]
        public Output<string> SourceType { get; private set; } = null!;

        /// <summary>
        /// The slack team (workspace) ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a SlackConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SlackConnection(string name, SlackConnectionArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/slackConnection:SlackConnection", name, args ?? new SlackConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SlackConnection(string name, Input<string> id, SlackConnectionState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/slackConnection:SlackConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SlackConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SlackConnection Get(string name, Input<string> id, SlackConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new SlackConnection(name, id, state, options);
        }
    }

    public sealed class SlackConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a Slack channel in the workspace.
        /// </summary>
        [Input("channelId", required: true)]
        public Input<string> ChannelId { get; set; } = null!;

        [Input("configs", required: true)]
        private InputList<Inputs.SlackConnectionConfigArgs>? _configs;

        /// <summary>
        /// Configuration options for the Slack connection that provide options to filter events.
        /// </summary>
        public InputList<Inputs.SlackConnectionConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.SlackConnectionConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Type of notification. Either `responder` or `stakeholder`.
        /// </summary>
        [Input("notificationType", required: true)]
        public Input<string> NotificationType { get; set; } = null!;

        /// <summary>
        /// The ID of the source in PagerDuty. Valid sources are services or teams.
        /// </summary>
        [Input("sourceId", required: true)]
        public Input<string> SourceId { get; set; } = null!;

        /// <summary>
        /// The type of the source. Either `team_reference` or `service_reference`.
        /// </summary>
        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        /// <summary>
        /// The slack team (workspace) ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public SlackConnectionArgs()
        {
        }
        public static new SlackConnectionArgs Empty => new SlackConnectionArgs();
    }

    public sealed class SlackConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a Slack channel in the workspace.
        /// </summary>
        [Input("channelId")]
        public Input<string>? ChannelId { get; set; }

        /// <summary>
        /// Name of the Slack channel in Slack connection.
        /// </summary>
        [Input("channelName")]
        public Input<string>? ChannelName { get; set; }

        [Input("configs")]
        private InputList<Inputs.SlackConnectionConfigGetArgs>? _configs;

        /// <summary>
        /// Configuration options for the Slack connection that provide options to filter events.
        /// </summary>
        public InputList<Inputs.SlackConnectionConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.SlackConnectionConfigGetArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Type of notification. Either `responder` or `stakeholder`.
        /// </summary>
        [Input("notificationType")]
        public Input<string>? NotificationType { get; set; }

        /// <summary>
        /// The ID of the source in PagerDuty. Valid sources are services or teams.
        /// </summary>
        [Input("sourceId")]
        public Input<string>? SourceId { get; set; }

        /// <summary>
        /// Name of the source (team or service) in Slack connection.
        /// </summary>
        [Input("sourceName")]
        public Input<string>? SourceName { get; set; }

        /// <summary>
        /// The type of the source. Either `team_reference` or `service_reference`.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// The slack team (workspace) ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public SlackConnectionState()
        {
        }
        public static new SlackConnectionState Empty => new SlackConnectionState();
    }
}

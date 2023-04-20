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
    /// A [service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Nw-create-a-service) represents something you monitor (like a web service, email service, or database service). It is a container for related incidents that associates them with escalation policies.
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
    ///     var exampleUser = new Pagerduty.User("exampleUser", new()
    ///     {
    ///         Email = "125.greenholt.earline@graham.name",
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
    ///                         Type = "user_reference",
    ///                         Id = exampleUser.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleService = new Pagerduty.Service("exampleService", new()
    ///     {
    ///         AutoResolveTimeout = "14400",
    ///         AcknowledgementTimeout = "600",
    ///         EscalationPolicy = foo.Id,
    ///         AlertCreation = "create_alerts_and_incidents",
    ///         AutoPauseNotificationsParameters = new Pagerduty.Inputs.ServiceAutoPauseNotificationsParametersArgs
    ///         {
    ///             Enabled = true,
    ///             Timeout = 300,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Services can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/service:Service main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/service:Service")]
    public partial class Service : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
        /// </summary>
        [Output("acknowledgementTimeout")]
        public Output<string?> AcknowledgementTimeout { get; private set; } = null!;

        /// <summary>
        /// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "create_incidents" is default: events will create an incident that cannot be merged. Value "create_alerts_and_incidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
        /// </summary>
        [Output("alertCreation")]
        public Output<string?> AlertCreation { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
        /// </summary>
        [Output("alertGrouping")]
        public Output<string> AlertGrouping { get; private set; } = null!;

        /// <summary>
        /// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
        /// </summary>
        [Output("alertGroupingParameters")]
        public Output<Outputs.ServiceAlertGroupingParameters> AlertGroupingParameters { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
        /// </summary>
        [Output("alertGroupingTimeout")]
        public Output<string> AlertGroupingTimeout { get; private set; } = null!;

        /// <summary>
        /// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
        /// </summary>
        [Output("autoPauseNotificationsParameters")]
        public Output<Outputs.ServiceAutoPauseNotificationsParameters> AutoPauseNotificationsParameters { get; private set; } = null!;

        /// <summary>
        /// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
        /// </summary>
        [Output("autoResolveTimeout")]
        public Output<string?> AutoResolveTimeout { get; private set; } = null!;

        /// <summary>
        /// Creation timestamp of the service.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The escalation policy used by this service.
        /// </summary>
        [Output("escalationPolicy")]
        public Output<string> EscalationPolicy { get; private set; } = null!;

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Output("htmlUrl")]
        public Output<string> HtmlUrl { get; private set; } = null!;

        [Output("incidentUrgencyRule")]
        public Output<Outputs.ServiceIncidentUrgencyRule> IncidentUrgencyRule { get; private set; } = null!;

        /// <summary>
        /// Last incident timestamp of the service.
        /// </summary>
        [Output("lastIncidentTimestamp")]
        public Output<string> LastIncidentTimestamp { get; private set; } = null!;

        /// <summary>
        /// The name of the service.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The response play used by this service.
        /// </summary>
        [Output("responsePlay")]
        public Output<string?> ResponsePlay { get; private set; } = null!;

        [Output("scheduledActions")]
        public Output<ImmutableArray<Outputs.ServiceScheduledAction>> ScheduledActions { get; private set; } = null!;

        /// <summary>
        /// The status of the service.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("supportHours")]
        public Output<Outputs.ServiceSupportHours?> SupportHours { get; private set; } = null!;

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/service:Service", name, args ?? new ServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/service:Service", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
        /// </summary>
        [Input("acknowledgementTimeout")]
        public Input<string>? AcknowledgementTimeout { get; set; }

        /// <summary>
        /// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "create_incidents" is default: events will create an incident that cannot be merged. Value "create_alerts_and_incidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
        /// </summary>
        [Input("alertCreation")]
        public Input<string>? AlertCreation { get; set; }

        /// <summary>
        /// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
        /// </summary>
        [Input("alertGrouping")]
        public Input<string>? AlertGrouping { get; set; }

        /// <summary>
        /// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
        /// </summary>
        [Input("alertGroupingParameters")]
        public Input<Inputs.ServiceAlertGroupingParametersArgs>? AlertGroupingParameters { get; set; }

        /// <summary>
        /// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
        /// </summary>
        [Input("alertGroupingTimeout")]
        public Input<string>? AlertGroupingTimeout { get; set; }

        /// <summary>
        /// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
        /// </summary>
        [Input("autoPauseNotificationsParameters")]
        public Input<Inputs.ServiceAutoPauseNotificationsParametersArgs>? AutoPauseNotificationsParameters { get; set; }

        /// <summary>
        /// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
        /// </summary>
        [Input("autoResolveTimeout")]
        public Input<string>? AutoResolveTimeout { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The escalation policy used by this service.
        /// </summary>
        [Input("escalationPolicy", required: true)]
        public Input<string> EscalationPolicy { get; set; } = null!;

        [Input("incidentUrgencyRule")]
        public Input<Inputs.ServiceIncidentUrgencyRuleArgs>? IncidentUrgencyRule { get; set; }

        /// <summary>
        /// The name of the service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The response play used by this service.
        /// </summary>
        [Input("responsePlay")]
        public Input<string>? ResponsePlay { get; set; }

        [Input("scheduledActions")]
        private InputList<Inputs.ServiceScheduledActionArgs>? _scheduledActions;
        public InputList<Inputs.ServiceScheduledActionArgs> ScheduledActions
        {
            get => _scheduledActions ?? (_scheduledActions = new InputList<Inputs.ServiceScheduledActionArgs>());
            set => _scheduledActions = value;
        }

        [Input("supportHours")]
        public Input<Inputs.ServiceSupportHoursArgs>? SupportHours { get; set; }

        public ServiceArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new ServiceArgs Empty => new ServiceArgs();
    }

    public sealed class ServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
        /// </summary>
        [Input("acknowledgementTimeout")]
        public Input<string>? AcknowledgementTimeout { get; set; }

        /// <summary>
        /// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "create_incidents" is default: events will create an incident that cannot be merged. Value "create_alerts_and_incidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
        /// </summary>
        [Input("alertCreation")]
        public Input<string>? AlertCreation { get; set; }

        /// <summary>
        /// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
        /// </summary>
        [Input("alertGrouping")]
        public Input<string>? AlertGrouping { get; set; }

        /// <summary>
        /// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
        /// </summary>
        [Input("alertGroupingParameters")]
        public Input<Inputs.ServiceAlertGroupingParametersGetArgs>? AlertGroupingParameters { get; set; }

        /// <summary>
        /// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
        /// </summary>
        [Input("alertGroupingTimeout")]
        public Input<string>? AlertGroupingTimeout { get; set; }

        /// <summary>
        /// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
        /// </summary>
        [Input("autoPauseNotificationsParameters")]
        public Input<Inputs.ServiceAutoPauseNotificationsParametersGetArgs>? AutoPauseNotificationsParameters { get; set; }

        /// <summary>
        /// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
        /// </summary>
        [Input("autoResolveTimeout")]
        public Input<string>? AutoResolveTimeout { get; set; }

        /// <summary>
        /// Creation timestamp of the service.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The escalation policy used by this service.
        /// </summary>
        [Input("escalationPolicy")]
        public Input<string>? EscalationPolicy { get; set; }

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        [Input("incidentUrgencyRule")]
        public Input<Inputs.ServiceIncidentUrgencyRuleGetArgs>? IncidentUrgencyRule { get; set; }

        /// <summary>
        /// Last incident timestamp of the service.
        /// </summary>
        [Input("lastIncidentTimestamp")]
        public Input<string>? LastIncidentTimestamp { get; set; }

        /// <summary>
        /// The name of the service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The response play used by this service.
        /// </summary>
        [Input("responsePlay")]
        public Input<string>? ResponsePlay { get; set; }

        [Input("scheduledActions")]
        private InputList<Inputs.ServiceScheduledActionGetArgs>? _scheduledActions;
        public InputList<Inputs.ServiceScheduledActionGetArgs> ScheduledActions
        {
            get => _scheduledActions ?? (_scheduledActions = new InputList<Inputs.ServiceScheduledActionGetArgs>());
            set => _scheduledActions = value;
        }

        /// <summary>
        /// The status of the service.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("supportHours")]
        public Input<Inputs.ServiceSupportHoursGetArgs>? SupportHours { get; set; }

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServiceState()
        {
            Description = "Managed by Pulumi";
        }
        public static new ServiceState Empty => new ServiceState();
    }
}

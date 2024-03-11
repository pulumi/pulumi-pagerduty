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
    /// A [Service Orchestration](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
    /// 
    /// &gt; If you have a Service that uses [Service Event Rules](https://support.pagerduty.com/docs/rulesets#service-event-rules), you can switch to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) at any time setting the attribute `enable_event_orchestration_for_service` to `true`. Please read the [Switch to Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#switch-to-service-orchestrations) instructions for more information.
    /// 
    /// ## Example of configuring a Service Orchestration
    /// 
    /// This example shows creating `Team`, `User`, `Escalation Policy`, and `Service` resources followed by creating a Service Orchestration to handle Events sent to that Service.
    /// 
    /// This example also shows using `priority` data source to configure `priority` action for a rule. If the Event matches the first rule in set "step-two" the resulting incident will have the Priority `P1`.
    /// 
    /// This example shows a Service Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.
    /// 
    /// The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var engineering = new Pagerduty.Team("engineering");
    /// 
    ///     var exampleUser = new Pagerduty.User("exampleUser", new()
    ///     {
    ///         Email = "125.greenholt.earline@graham.name",
    ///     });
    /// 
    ///     var foo = new Pagerduty.TeamMembership("foo", new()
    ///     {
    ///         UserId = exampleUser.Id,
    ///         TeamId = engineering.Id,
    ///         Role = "manager",
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
    ///         EscalationPolicy = exampleEscalationPolicy.Id,
    ///         AlertCreation = "create_alerts_and_incidents",
    ///     });
    /// 
    ///     var csImpact = new Pagerduty.IncidentCustomField("csImpact", new()
    ///     {
    ///         DataType = "string",
    ///         FieldType = "single_value",
    ///     });
    /// 
    ///     var p1 = Pagerduty.GetPriority.Invoke(new()
    ///     {
    ///         Name = "P1",
    ///     });
    /// 
    ///     var www = new Pagerduty.EventOrchestrationService("www", new()
    ///     {
    ///         Service = exampleService.Id,
    ///         EnableEventOrchestrationForService = true,
    ///         Sets = new[]
    ///         {
    ///             new Pagerduty.Inputs.EventOrchestrationServiceSetArgs
    ///             {
    ///                 Id = "start",
    ///                 Rules = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleArgs
    ///                     {
    ///                         Label = "Always apply some consistent event transformations to all events",
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsArgs
    ///                         {
    ///                             Variables = new[]
    ///                             {
    ///                                 new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsVariableArgs
    ///                                 {
    ///                                     Name = "hostname",
    ///                                     Path = "event.component",
    ///                                     Value = "hostname: (.*)",
    ///                                     Type = "regex",
    ///                                 },
    ///                             },
    ///                             Extractions = new[]
    ///                             {
    ///                                 new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsExtractionArgs
    ///                                 {
    ///                                     Template = "{{variables.hostname}}",
    ///                                     Target = "event.custom_details.hostname",
    ///                                 },
    ///                                 new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsExtractionArgs
    ///                                 {
    ///                                     Source = "event.source",
    ///                                     Regex = "www (.*) service",
    ///                                     Target = "event.source",
    ///                                 },
    ///                             },
    ///                             RouteTo = "step-two",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Pagerduty.Inputs.EventOrchestrationServiceSetArgs
    ///             {
    ///                 Id = "step-two",
    ///                 Rules = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleArgs
    ///                     {
    ///                         Label = "All critical alerts should be treated as P1 incident",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationServiceSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.severity matches 'critical'",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsArgs
    ///                         {
    ///                             Annotate = "Please use our P1 runbook: https://docs.test/p1-runbook",
    ///                             Priority = p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
    ///                             IncidentCustomFieldUpdates = new[]
    ///                             {
    ///                                 new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsIncidentCustomFieldUpdateArgs
    ///                                 {
    ///                                     Id = csImpact.Id,
    ///                                     Value = "High Impact",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleArgs
    ///                     {
    ///                         Label = "If there's something wrong on the canary let the team know about it in our deployments Slack channel",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationServiceSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.custom_details.hostname matches part 'canary'",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsArgs
    ///                         {
    ///                             AutomationAction = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsAutomationActionArgs
    ///                             {
    ///                                 Name = "Canary Slack Notification",
    ///                                 Url = "https://our-slack-listerner.test/canary-notification",
    ///                                 AutoSend = true,
    ///                                 Parameters = new[]
    ///                                 {
    ///                                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs
    ///                                     {
    ///                                         Key = "channel",
    ///                                         Value = "#my-team-channel",
    ///                                     },
    ///                                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs
    ///                                     {
    ///                                         Key = "message",
    ///                                         Value = "something is wrong with the canary deployment",
    ///                                     },
    ///                                 },
    ///                                 Headers = new[]
    ///                                 {
    ///                                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs
    ///                                     {
    ///                                         Key = "X-Notification-Source",
    ///                                         Value = "PagerDuty Incident Webhook",
    ///                                     },
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                     new Pagerduty.Inputs.EventOrchestrationServiceSetRuleArgs
    ///                     {
    ///                         Label = "Never bother the on-call for info-level events outside of work hours",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationServiceSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.severity matches 'info' and not (now in Mon,Tue,Wed,Thu,Fri 09:00:00 to 17:00:00 America/Los_Angeles)",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsArgs
    ///                         {
    ///                             Suppress = true,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         CatchAll = new Pagerduty.Inputs.EventOrchestrationServiceCatchAllArgs
    ///         {
    ///             Actions = null,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Service Orchestration can be imported using the `id` of the Service, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestrationService:EventOrchestrationService")]
    public partial class EventOrchestrationService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Output("catchAll")]
        public Output<Outputs.EventOrchestrationServiceCatchAll> CatchAll { get; private set; } = null!;

        /// <summary>
        /// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        /// </summary>
        [Output("enableEventOrchestrationForService")]
        public Output<bool> EnableEventOrchestrationForService { get; private set; } = null!;

        /// <summary>
        /// ID of the Service to which this Service Orchestration belongs to.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        [Output("sets")]
        public Output<ImmutableArray<Outputs.EventOrchestrationServiceSet>> Sets { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestrationService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestrationService(string name, EventOrchestrationServiceArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, args ?? new EventOrchestrationServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestrationService(string name, Input<string> id, EventOrchestrationServiceState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestrationService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestrationService Get(string name, Input<string> id, EventOrchestrationServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestrationService(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Input("catchAll", required: true)]
        public Input<Inputs.EventOrchestrationServiceCatchAllArgs> CatchAll { get; set; } = null!;

        /// <summary>
        /// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        /// </summary>
        [Input("enableEventOrchestrationForService")]
        public Input<bool>? EnableEventOrchestrationForService { get; set; }

        /// <summary>
        /// ID of the Service to which this Service Orchestration belongs to.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        [Input("sets", required: true)]
        private InputList<Inputs.EventOrchestrationServiceSetArgs>? _sets;

        /// <summary>
        /// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceSetArgs> Sets
        {
            get => _sets ?? (_sets = new InputList<Inputs.EventOrchestrationServiceSetArgs>());
            set => _sets = value;
        }

        public EventOrchestrationServiceArgs()
        {
        }
        public static new EventOrchestrationServiceArgs Empty => new EventOrchestrationServiceArgs();
    }

    public sealed class EventOrchestrationServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Input("catchAll")]
        public Input<Inputs.EventOrchestrationServiceCatchAllGetArgs>? CatchAll { get; set; }

        /// <summary>
        /// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        /// </summary>
        [Input("enableEventOrchestrationForService")]
        public Input<bool>? EnableEventOrchestrationForService { get; set; }

        /// <summary>
        /// ID of the Service to which this Service Orchestration belongs to.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        [Input("sets")]
        private InputList<Inputs.EventOrchestrationServiceSetGetArgs>? _sets;

        /// <summary>
        /// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceSetGetArgs> Sets
        {
            get => _sets ?? (_sets = new InputList<Inputs.EventOrchestrationServiceSetGetArgs>());
            set => _sets = value;
        }

        public EventOrchestrationServiceState()
        {
        }
        public static new EventOrchestrationServiceState Empty => new EventOrchestrationServiceState();
    }
}

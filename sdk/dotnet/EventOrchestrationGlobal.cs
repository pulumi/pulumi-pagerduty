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
    /// A [Global Orchestration](https://support.pagerduty.com/docs/event-orchestration#global-orchestrations) allows you to create a set of Event Rules. The Global Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Global Orchestration for further processing.
    /// 
    /// ## Example of configuring a Global Orchestration
    /// 
    /// This example shows creating `Team`, and `Event Orchestration` resources followed by creating a Global Orchestration to handle Events sent to that Event Orchestration.
    /// 
    /// This example also shows using the pagerduty.getPriority and pagerduty.EscalationPolicy data sources to configure `priority` and `escalation_policy` actions for a rule.
    /// 
    /// This example shows a Global Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.
    /// 
    /// The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var databaseTeam = new Pagerduty.Team("database_team", new()
    ///     {
    ///         Name = "Database Team",
    ///     });
    /// 
    ///     var eventOrchestration = new Pagerduty.EventOrchestration("event_orchestration", new()
    ///     {
    ///         Name = "Example Orchestration",
    ///         Team = databaseTeam.Id,
    ///     });
    /// 
    ///     var p1 = Pagerduty.GetPriority.Invoke(new()
    ///     {
    ///         Name = "P1",
    ///     });
    /// 
    ///     var sreEscPolicy = Pagerduty.GetEscalationPolicy.Invoke(new()
    ///     {
    ///         Name = "SRE Escalation Policy",
    ///     });
    /// 
    ///     var @global = new Pagerduty.EventOrchestrationGlobal("global", new()
    ///     {
    ///         EventOrchestration = eventOrchestration.Id,
    ///         Sets = new[]
    ///         {
    ///             new Pagerduty.Inputs.EventOrchestrationGlobalSetArgs
    ///             {
    ///                 Id = "start",
    ///                 Rules = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleArgs
    ///                     {
    ///                         Label = "Always annotate a note to all events",
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsArgs
    ///                         {
    ///                             Annotate = "This incident was created by the Database Team via a Global Orchestration",
    ///                             RouteTo = "step-two",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Pagerduty.Inputs.EventOrchestrationGlobalSetArgs
    ///             {
    ///                 Id = "step-two",
    ///                 Rules = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleArgs
    ///                     {
    ///                         Label = "Drop events that are marked as no-op",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.summary matches 'no-op'",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsArgs
    ///                         {
    ///                             DropEvent = true,
    ///                         },
    ///                     },
    ///                     new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleArgs
    ///                     {
    ///                         Label = "If the DB host is running out of space, then page the SRE team",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.summary matches part 'running out of space'",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsArgs
    ///                         {
    ///                             EscalationPolicy = sreEscPolicy.Apply(getEscalationPolicyResult =&gt; getEscalationPolicyResult.Id),
    ///                         },
    ///                     },
    ///                     new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleArgs
    ///                     {
    ///                         Label = "If there's something wrong on the replica, then mark the alert as a warning",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "event.custom_details.hostname matches part 'replica'",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsArgs
    ///                         {
    ///                             Severity = "warning",
    ///                         },
    ///                     },
    ///                     new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleArgs
    ///                     {
    ///                         Label = "Otherwise, set the incident to P1, pause for 10 mins and run a diagnostic once the alert is suspended",
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsArgs
    ///                         {
    ///                             Priority = p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
    ///                             Suspend = 600,
    ///                             AutomationAction = new Pagerduty.Inputs.EventOrchestrationGlobalSetRuleActionsAutomationActionArgs
    ///                             {
    ///                                 Name = "db-diagnostic",
    ///                                 Url = "https://example.com/run-diagnostic",
    ///                                 AutoSend = true,
    ///                                 TriggerTypes = "alert_suspended",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         CatchAll = new Pagerduty.Inputs.EventOrchestrationGlobalCatchAllArgs
    ///         {
    ///             Actions = null,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Orchestration can be imported using the `id` of the Event Orchestration, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal global 1b49abe7-26db-4439-a715-c6d883acfb3e
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal")]
    public partial class EventOrchestrationGlobal : global::Pulumi.CustomResource
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Output("catchAll")]
        public Output<Outputs.EventOrchestrationGlobalCatchAll> CatchAll { get; private set; } = null!;

        /// <summary>
        /// ID of the Event Orchestration to which this Global Orchestration belongs to.
        /// </summary>
        [Output("eventOrchestration")]
        public Output<string> EventOrchestration { get; private set; } = null!;

        /// <summary>
        /// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        [Output("sets")]
        public Output<ImmutableArray<Outputs.EventOrchestrationGlobalSet>> Sets { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestrationGlobal resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestrationGlobal(string name, EventOrchestrationGlobalArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal", name, args ?? new EventOrchestrationGlobalArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestrationGlobal(string name, Input<string> id, EventOrchestrationGlobalState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestrationGlobal resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestrationGlobal Get(string name, Input<string> id, EventOrchestrationGlobalState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestrationGlobal(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationGlobalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Input("catchAll", required: true)]
        public Input<Inputs.EventOrchestrationGlobalCatchAllArgs> CatchAll { get; set; } = null!;

        /// <summary>
        /// ID of the Event Orchestration to which this Global Orchestration belongs to.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public Input<string> EventOrchestration { get; set; } = null!;

        [Input("sets", required: true)]
        private InputList<Inputs.EventOrchestrationGlobalSetArgs>? _sets;

        /// <summary>
        /// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalSetArgs> Sets
        {
            get => _sets ?? (_sets = new InputList<Inputs.EventOrchestrationGlobalSetArgs>());
            set => _sets = value;
        }

        public EventOrchestrationGlobalArgs()
        {
        }
        public static new EventOrchestrationGlobalArgs Empty => new EventOrchestrationGlobalArgs();
    }

    public sealed class EventOrchestrationGlobalState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        /// </summary>
        [Input("catchAll")]
        public Input<Inputs.EventOrchestrationGlobalCatchAllGetArgs>? CatchAll { get; set; }

        /// <summary>
        /// ID of the Event Orchestration to which this Global Orchestration belongs to.
        /// </summary>
        [Input("eventOrchestration")]
        public Input<string>? EventOrchestration { get; set; }

        [Input("sets")]
        private InputList<Inputs.EventOrchestrationGlobalSetGetArgs>? _sets;

        /// <summary>
        /// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalSetGetArgs> Sets
        {
            get => _sets ?? (_sets = new InputList<Inputs.EventOrchestrationGlobalSetGetArgs>());
            set => _sets = value;
        }

        public EventOrchestrationGlobalState()
        {
        }
        public static new EventOrchestrationGlobalState Empty => new EventOrchestrationGlobalState();
    }
}

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
    /// An Orchestration Router allows users to create a set of Event Rules. The Router evaluates events sent to this Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in the `catch_all` or to the "Unrouted" Orchestration if no service is specified.
    /// 
    /// ## Example of configuring Router rules for an Orchestration
    /// 
    /// In this example the user has defined the Router with two rules, each routing to a different service.
    /// 
    /// This example assumes services used in the `route_to` configuration already exists. So it does not show creation of service resource.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var router = new Pagerduty.EventOrchestrationRouter("router", new()
    ///     {
    ///         EventOrchestration = myMonitor.Id,
    ///         Set = new Pagerduty.Inputs.EventOrchestrationRouterSetArgs
    ///         {
    ///             Id = "start",
    ///             Rules = new[]
    ///             {
    ///                 new Pagerduty.Inputs.EventOrchestrationRouterSetRuleArgs
    ///                 {
    ///                     Label = "Events relating to our relational database",
    ///                     Conditions = new[]
    ///                     {
    ///                         new Pagerduty.Inputs.EventOrchestrationRouterSetRuleConditionArgs
    ///                         {
    ///                             Expression = "event.summary matches part 'database'",
    ///                         },
    ///                         new Pagerduty.Inputs.EventOrchestrationRouterSetRuleConditionArgs
    ///                         {
    ///                             Expression = "event.source matches regex 'db[0-9]+-server'",
    ///                         },
    ///                     },
    ///                     Actions = new Pagerduty.Inputs.EventOrchestrationRouterSetRuleActionsArgs
    ///                     {
    ///                         RouteTo = database.Id,
    ///                     },
    ///                 },
    ///                 new Pagerduty.Inputs.EventOrchestrationRouterSetRuleArgs
    ///                 {
    ///                     Conditions = new[]
    ///                     {
    ///                         new Pagerduty.Inputs.EventOrchestrationRouterSetRuleConditionArgs
    ///                         {
    ///                             Expression = "event.summary matches part 'www'",
    ///                         },
    ///                     },
    ///                     Actions = new Pagerduty.Inputs.EventOrchestrationRouterSetRuleActionsArgs
    ///                     {
    ///                         RouteTo = www.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         CatchAll = new Pagerduty.Inputs.EventOrchestrationRouterCatchAllArgs
    ///         {
    ///             Actions = new Pagerduty.Inputs.EventOrchestrationRouterCatchAllActionsArgs
    ///             {
    ///                 RouteTo = "unrouted",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Router can be imported using the `id` of the Event Orchestration, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter router 1b49abe7-26db-4439-a715-c6d883acfb3e
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter")]
    public partial class EventOrchestrationRouter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When none of the rules match an event, the event will be routed according to the catch_all settings.
        /// </summary>
        [Output("catchAll")]
        public Output<Outputs.EventOrchestrationRouterCatchAll> CatchAll { get; private set; } = null!;

        /// <summary>
        /// ID of the Event Orchestration to which the Router belongs.
        /// </summary>
        [Output("eventOrchestration")]
        public Output<string> EventOrchestration { get; private set; } = null!;

        /// <summary>
        /// The Router contains a single set of rules  (the "start" set).
        /// </summary>
        [Output("set")]
        public Output<Outputs.EventOrchestrationRouterSet> Set { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestrationRouter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestrationRouter(string name, EventOrchestrationRouterArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter", name, args ?? new EventOrchestrationRouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestrationRouter(string name, Input<string> id, EventOrchestrationRouterState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestrationRouter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestrationRouter Get(string name, Input<string> id, EventOrchestrationRouterState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestrationRouter(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationRouterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When none of the rules match an event, the event will be routed according to the catch_all settings.
        /// </summary>
        [Input("catchAll", required: true)]
        public Input<Inputs.EventOrchestrationRouterCatchAllArgs> CatchAll { get; set; } = null!;

        /// <summary>
        /// ID of the Event Orchestration to which the Router belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public Input<string> EventOrchestration { get; set; } = null!;

        /// <summary>
        /// The Router contains a single set of rules  (the "start" set).
        /// </summary>
        [Input("set", required: true)]
        public Input<Inputs.EventOrchestrationRouterSetArgs> Set { get; set; } = null!;

        public EventOrchestrationRouterArgs()
        {
        }
        public static new EventOrchestrationRouterArgs Empty => new EventOrchestrationRouterArgs();
    }

    public sealed class EventOrchestrationRouterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When none of the rules match an event, the event will be routed according to the catch_all settings.
        /// </summary>
        [Input("catchAll")]
        public Input<Inputs.EventOrchestrationRouterCatchAllGetArgs>? CatchAll { get; set; }

        /// <summary>
        /// ID of the Event Orchestration to which the Router belongs.
        /// </summary>
        [Input("eventOrchestration")]
        public Input<string>? EventOrchestration { get; set; }

        /// <summary>
        /// The Router contains a single set of rules  (the "start" set).
        /// </summary>
        [Input("set")]
        public Input<Inputs.EventOrchestrationRouterSetGetArgs>? Set { get; set; }

        public EventOrchestrationRouterState()
        {
        }
        public static new EventOrchestrationRouterState Empty => new EventOrchestrationRouterState();
    }
}

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
    /// [Event Orchestrations](https://support.pagerduty.com/docs/event-orchestration) allow you define a set of Event Rules, so that when you ingest events using the Orchestration's Routing Key your events will be routed to the correct Global and/or Service Orchestration, based on the event's content.
    /// 
    /// ## Example of configuring an Event Orchestration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var engineering = new Pagerduty.Team("engineering", new()
    ///     {
    ///         Name = "Engineering",
    ///     });
    /// 
    ///     var myMonitor = new Pagerduty.EventOrchestration("my_monitor", new()
    ///     {
    ///         Name = "My Monitoring Orchestration",
    ///         Description = "Send events to a pair of services",
    ///         Team = engineering.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// EventOrchestrations can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestration:EventOrchestration main 19acac92-027a-4ea0-b06c-bbf516519601
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestration:EventOrchestration")]
    public partial class EventOrchestration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A human-friendly description of the Event Orchestration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A list of integrations for the Event Orchestration.
        /// </summary>
        [Output("integrations")]
        public Output<ImmutableArray<Outputs.EventOrchestrationIntegration>> Integrations { get; private set; } = null!;

        /// <summary>
        /// Name of the Event Orchestration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("routes")]
        public Output<int> Routes { get; private set; } = null!;

        /// <summary>
        /// ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        /// </summary>
        [Output("team")]
        public Output<string?> Team { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestration(string name, EventOrchestrationArgs? args = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestration:EventOrchestration", name, args ?? new EventOrchestrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestration(string name, Input<string> id, EventOrchestrationState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestration:EventOrchestration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestration Get(string name, Input<string> id, EventOrchestrationState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestration(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A human-friendly description of the Event Orchestration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("integrations")]
        private InputList<Inputs.EventOrchestrationIntegrationArgs>? _integrations;

        /// <summary>
        /// A list of integrations for the Event Orchestration.
        /// </summary>
        public InputList<Inputs.EventOrchestrationIntegrationArgs> Integrations
        {
            get => _integrations ?? (_integrations = new InputList<Inputs.EventOrchestrationIntegrationArgs>());
            set => _integrations = value;
        }

        /// <summary>
        /// Name of the Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public EventOrchestrationArgs()
        {
        }
        public static new EventOrchestrationArgs Empty => new EventOrchestrationArgs();
    }

    public sealed class EventOrchestrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A human-friendly description of the Event Orchestration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("integrations")]
        private InputList<Inputs.EventOrchestrationIntegrationGetArgs>? _integrations;

        /// <summary>
        /// A list of integrations for the Event Orchestration.
        /// </summary>
        public InputList<Inputs.EventOrchestrationIntegrationGetArgs> Integrations
        {
            get => _integrations ?? (_integrations = new InputList<Inputs.EventOrchestrationIntegrationGetArgs>());
            set => _integrations = value;
        }

        /// <summary>
        /// Name of the Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("routes")]
        public Input<int>? Routes { get; set; }

        /// <summary>
        /// ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public EventOrchestrationState()
        {
        }
        public static new EventOrchestrationState Empty => new EventOrchestrationState();
    }
}

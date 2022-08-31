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
    /// ## Import
    /// 
    /// Service Orchestration can be imported using the `id` of the Service, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
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
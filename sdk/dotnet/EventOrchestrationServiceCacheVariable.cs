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
    /// A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Service Event Orchestration, in order to temporarily store event data to be referenced later within the Service Event Orchestration
    /// 
    /// ## Example of configuring a Cache Variable for a Service Event Orchestration
    /// 
    /// This example shows creating a service `Event Orchestration` and a `Cache Variable`. This Cache Variable will count and store the number of trigger events with 'database' in its title. Then all alerts sent to this Event Orchestration will have its severity upped to 'critical' if the count has reached at least 5 triggers within the last 1 minute.
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
    ///     var databaseTeam = new Pagerduty.Team("databaseTeam");
    /// 
    ///     var user1 = new Pagerduty.User("user1", new()
    ///     {
    ///         Email = "125.greenholt.earline@graham.name",
    ///         Teams = new[]
    ///         {
    ///             databaseTeam.Id,
    ///         },
    ///     });
    /// 
    ///     var dbEp = new Pagerduty.EscalationPolicy("dbEp", new()
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
    ///                         Id = user1.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var svc = new Pagerduty.Service("svc", new()
    ///     {
    ///         AutoResolveTimeout = "14400",
    ///         AcknowledgementTimeout = "600",
    ///         EscalationPolicy = dbEp.Id,
    ///         AlertCreation = "create_alerts_and_incidents",
    ///     });
    /// 
    ///     var numDbTriggers = new Pagerduty.EventOrchestrationServiceCacheVariable("numDbTriggers", new()
    ///     {
    ///         Service = svc.Id,
    ///         Conditions = new[]
    ///         {
    ///             new Pagerduty.Inputs.EventOrchestrationServiceCacheVariableConditionArgs
    ///             {
    ///                 Expression = "event.summary matches part 'database'",
    ///             },
    ///         },
    ///         Configuration = new Pagerduty.Inputs.EventOrchestrationServiceCacheVariableConfigurationArgs
    ///         {
    ///             Type = "trigger_event_count",
    ///             TtlSeconds = 60,
    ///         },
    ///     });
    /// 
    ///     var eventOrchestration = new Pagerduty.EventOrchestrationService("eventOrchestration", new()
    ///     {
    ///         Service = svc.Id,
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
    ///                         Label = "Set severity to critical if we see at least 5 triggers on the DB within the last 1 minute",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Pagerduty.Inputs.EventOrchestrationServiceSetRuleConditionArgs
    ///                             {
    ///                                 Expression = "cache_var.num_db_triggers &gt;= 5",
    ///                             },
    ///                         },
    ///                         Actions = new Pagerduty.Inputs.EventOrchestrationServiceSetRuleActionsArgs
    ///                         {
    ///                             Severity = "critical",
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
    /// Cache Variables can be imported using colon-separated IDs, which is the combination of the Service Event Orchestration ID followed by the Cache Variable ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable cache_variable PLBP09X:138ed254-3444-44ad-8cc7-701d69def439
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable")]
    public partial class EventOrchestrationServiceCacheVariable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
        /// </summary>
        [Output("conditions")]
        public Output<ImmutableArray<Outputs.EventOrchestrationServiceCacheVariableCondition>> Conditions { get; private set; } = null!;

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.EventOrchestrationServiceCacheVariableConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Name of the Cache Variable associated with the Service Event Orchestration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the Service Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestrationServiceCacheVariable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestrationServiceCacheVariable(string name, EventOrchestrationServiceCacheVariableArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable", name, args ?? new EventOrchestrationServiceCacheVariableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestrationServiceCacheVariable(string name, Input<string> id, EventOrchestrationServiceCacheVariableState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestrationServiceCacheVariable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestrationServiceCacheVariable Get(string name, Input<string> id, EventOrchestrationServiceCacheVariableState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestrationServiceCacheVariable(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationServiceCacheVariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationServiceCacheVariableConditionArgs>? _conditions;

        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceCacheVariableConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationServiceCacheVariableConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.EventOrchestrationServiceCacheVariableConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Service Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the Service Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public EventOrchestrationServiceCacheVariableArgs()
        {
        }
        public static new EventOrchestrationServiceCacheVariableArgs Empty => new EventOrchestrationServiceCacheVariableArgs();
    }

    public sealed class EventOrchestrationServiceCacheVariableState : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationServiceCacheVariableConditionGetArgs>? _conditions;

        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
        /// </summary>
        public InputList<Inputs.EventOrchestrationServiceCacheVariableConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationServiceCacheVariableConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.EventOrchestrationServiceCacheVariableConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Service Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the Service Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public EventOrchestrationServiceCacheVariableState()
        {
        }
        public static new EventOrchestrationServiceCacheVariableState Empty => new EventOrchestrationServiceCacheVariableState();
    }
}
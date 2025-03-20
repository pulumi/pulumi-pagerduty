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
    /// A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Global Event Orchestration, in order to temporarily store event data to be referenced later within the Global Event Orchestration
    /// 
    /// ## Import
    /// 
    /// Cache Variables can be imported using colon-separated IDs, which is the combination of the Global Event Orchestration ID followed by the Cache Variable ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventOrchestrationGlobalCacheVariable:EventOrchestrationGlobalCacheVariable cache_variable 5e7110bf-0ee7-429e-9724-34ed1fe15ac3:138ed254-3444-44ad-8cc7-701d69def439
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventOrchestrationGlobalCacheVariable:EventOrchestrationGlobalCacheVariable")]
    public partial class EventOrchestrationGlobalCacheVariable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        /// </summary>
        [Output("conditions")]
        public Output<ImmutableArray<Outputs.EventOrchestrationGlobalCacheVariableCondition>> Conditions { get; private set; } = null!;

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.EventOrchestrationGlobalCacheVariableConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// ID of the Global Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Output("eventOrchestration")]
        public Output<string> EventOrchestration { get; private set; } = null!;

        /// <summary>
        /// Name of the Cache Variable associated with the Global Event Orchestration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a EventOrchestrationGlobalCacheVariable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventOrchestrationGlobalCacheVariable(string name, EventOrchestrationGlobalCacheVariableArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationGlobalCacheVariable:EventOrchestrationGlobalCacheVariable", name, args ?? new EventOrchestrationGlobalCacheVariableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventOrchestrationGlobalCacheVariable(string name, Input<string> id, EventOrchestrationGlobalCacheVariableState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventOrchestrationGlobalCacheVariable:EventOrchestrationGlobalCacheVariable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventOrchestrationGlobalCacheVariable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventOrchestrationGlobalCacheVariable Get(string name, Input<string> id, EventOrchestrationGlobalCacheVariableState? state = null, CustomResourceOptions? options = null)
        {
            return new EventOrchestrationGlobalCacheVariable(name, id, state, options);
        }
    }

    public sealed class EventOrchestrationGlobalCacheVariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionArgs>? _conditions;

        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.EventOrchestrationGlobalCacheVariableConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// ID of the Global Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("eventOrchestration", required: true)]
        public Input<string> EventOrchestration { get; set; } = null!;

        /// <summary>
        /// Name of the Cache Variable associated with the Global Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EventOrchestrationGlobalCacheVariableArgs()
        {
        }
        public static new EventOrchestrationGlobalCacheVariableArgs Empty => new EventOrchestrationGlobalCacheVariableArgs();
    }

    public sealed class EventOrchestrationGlobalCacheVariableState : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionGetArgs>? _conditions;

        /// <summary>
        /// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        /// </summary>
        public InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.EventOrchestrationGlobalCacheVariableConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// A configuration object to define what and how values will be stored in the Cache Variable.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.EventOrchestrationGlobalCacheVariableConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// ID of the Global Event Orchestration to which this Cache Variable belongs.
        /// </summary>
        [Input("eventOrchestration")]
        public Input<string>? EventOrchestration { get; set; }

        /// <summary>
        /// Name of the Cache Variable associated with the Global Event Orchestration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EventOrchestrationGlobalCacheVariableState()
        {
        }
        public static new EventOrchestrationGlobalCacheVariableState Empty => new EventOrchestrationGlobalCacheVariableState();
    }
}

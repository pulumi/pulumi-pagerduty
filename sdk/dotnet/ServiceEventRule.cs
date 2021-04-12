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
    /// A [service event rule](https://support.pagerduty.com/docs/rulesets#service-event-rules) allows you to set actions that should be taken on events for a service that meet the designated rule criteria.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Pagerduty.Service("example", new Pagerduty.ServiceArgs
    ///         {
    ///             AutoResolveTimeout = "14400",
    ///             AcknowledgementTimeout = "600",
    ///             EscalationPolicy = pagerduty_escalation_policy.Example.Id,
    ///             AlertCreation = "create_alerts_and_incidents",
    ///         });
    ///         var foo = new Pagerduty.ServiceEventRule("foo", new Pagerduty.ServiceEventRuleArgs
    ///         {
    ///             Service = example.Id,
    ///             Position = 0,
    ///             Disabled = true,
    ///             Conditions = new Pagerduty.Inputs.ServiceEventRuleConditionsArgs
    ///             {
    ///                 Operator = "and",
    ///                 Subconditions = 
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceEventRuleConditionsSubconditionArgs
    ///                     {
    ///                         Operator = "contains",
    ///                         Parameters = 
    ///                         {
    ///                             new Pagerduty.Inputs.ServiceEventRuleConditionsSubconditionParameterArgs
    ///                             {
    ///                                 Value = "disk space",
    ///                                 Path = "summary",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             Variables = 
    ///             {
    ///                 new Pagerduty.Inputs.ServiceEventRuleVariableArgs
    ///                 {
    ///                     Type = "regex",
    ///                     Name = "Src",
    ///                     Parameters = 
    ///                     {
    ///                         new Pagerduty.Inputs.ServiceEventRuleVariableParameterArgs
    ///                         {
    ///                             Value = "(.*)",
    ///                             Path = "source",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             Actions = new Pagerduty.Inputs.ServiceEventRuleActionsArgs
    ///             {
    ///                 Annotates = 
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceEventRuleActionsAnnotateArgs
    ///                     {
    ///                         Value = "From Terraform",
    ///                     },
    ///                 },
    ///                 Extractions = 
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceEventRuleActionsExtractionArgs
    ///                     {
    ///                         Target = "dedup_key",
    ///                         Source = "source",
    ///                         Regex = "(.*)",
    ///                     },
    ///                     new Pagerduty.Inputs.ServiceEventRuleActionsExtractionArgs
    ///                     {
    ///                         Target = "summary",
    ///                         Template = "Warning: Disk Space Low on {{Src}}",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var bar = new Pagerduty.ServiceEventRule("bar", new Pagerduty.ServiceEventRuleArgs
    ///         {
    ///             Service = pagerduty_service.Foo.Id,
    ///             Position = 1,
    ///             Disabled = true,
    ///             Conditions = new Pagerduty.Inputs.ServiceEventRuleConditionsArgs
    ///             {
    ///                 Operator = "and",
    ///                 Subconditions = 
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceEventRuleConditionsSubconditionArgs
    ///                     {
    ///                         Operator = "contains",
    ///                         Parameters = 
    ///                         {
    ///                             new Pagerduty.Inputs.ServiceEventRuleConditionsSubconditionParameterArgs
    ///                             {
    ///                                 Value = "cpu spike",
    ///                                 Path = "summary",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             Actions = new Pagerduty.Inputs.ServiceEventRuleActionsArgs
    ///             {
    ///                 Annotates = 
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceEventRuleActionsAnnotateArgs
    ///                     {
    ///                         Value = "From Terraform",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/serviceEventRule:ServiceEventRule")]
    public partial class ServiceEventRule : Pulumi.CustomResource
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Output("actions")]
        public Output<Outputs.ServiceEventRuleActions?> Actions { get; private set; } = null!;

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule.
        /// </summary>
        [Output("conditions")]
        public Output<Outputs.ServiceEventRuleConditions?> Conditions { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Position/index of the rule within the service.
        /// </summary>
        [Output("position")]
        public Output<int?> Position { get; private set; } = null!;

        /// <summary>
        /// The ID of the service that the rule belongs to.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Output("timeFrame")]
        public Output<Outputs.ServiceEventRuleTimeFrame?> TimeFrame { get; private set; } = null!;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        [Output("variables")]
        public Output<ImmutableArray<Outputs.ServiceEventRuleVariable>> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceEventRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceEventRule(string name, ServiceEventRuleArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/serviceEventRule:ServiceEventRule", name, args ?? new ServiceEventRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceEventRule(string name, Input<string> id, ServiceEventRuleState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/serviceEventRule:ServiceEventRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceEventRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceEventRule Get(string name, Input<string> id, ServiceEventRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceEventRule(name, id, state, options);
        }
    }

    public sealed class ServiceEventRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.ServiceEventRuleActionsArgs>? Actions { get; set; }

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule.
        /// </summary>
        [Input("conditions")]
        public Input<Inputs.ServiceEventRuleConditionsArgs>? Conditions { get; set; }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Position/index of the rule within the service.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        /// <summary>
        /// The ID of the service that the rule belongs to.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Input("timeFrame")]
        public Input<Inputs.ServiceEventRuleTimeFrameArgs>? TimeFrame { get; set; }

        [Input("variables")]
        private InputList<Inputs.ServiceEventRuleVariableArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        public InputList<Inputs.ServiceEventRuleVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.ServiceEventRuleVariableArgs>());
            set => _variables = value;
        }

        public ServiceEventRuleArgs()
        {
        }
    }

    public sealed class ServiceEventRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.ServiceEventRuleActionsGetArgs>? Actions { get; set; }

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule.
        /// </summary>
        [Input("conditions")]
        public Input<Inputs.ServiceEventRuleConditionsGetArgs>? Conditions { get; set; }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Position/index of the rule within the service.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        /// <summary>
        /// The ID of the service that the rule belongs to.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Input("timeFrame")]
        public Input<Inputs.ServiceEventRuleTimeFrameGetArgs>? TimeFrame { get; set; }

        [Input("variables")]
        private InputList<Inputs.ServiceEventRuleVariableGetArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        public InputList<Inputs.ServiceEventRuleVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.ServiceEventRuleVariableGetArgs>());
            set => _variables = value;
        }

        public ServiceEventRuleState()
        {
        }
    }
}
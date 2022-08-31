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
    /// An [event rule](https://support.pagerduty.com/docs/rulesets#section-create-event-rules) allows you to set actions that should be taken on events that meet your designated rule criteria.
    /// 
    /// ## Import
    /// 
    /// Ruleset rules can be imported using the related `ruleset` ID and the `ruleset_rule` ID separated by a dot, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/rulesetRule:RulesetRule")]
    public partial class RulesetRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Output("actions")]
        public Output<Outputs.RulesetRuleActions?> Actions { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
        /// </summary>
        [Output("catchAll")]
        public Output<bool?> CatchAll { get; private set; } = null!;

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
        /// </summary>
        [Output("conditions")]
        public Output<Outputs.RulesetRuleConditions?> Conditions { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Position/index of the rule within the ruleset.
        /// </summary>
        [Output("position")]
        public Output<int?> Position { get; private set; } = null!;

        /// <summary>
        /// The ID of the ruleset that the rule belongs to.
        /// </summary>
        [Output("ruleset")]
        public Output<string> Ruleset { get; private set; } = null!;

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Output("timeFrame")]
        public Output<Outputs.RulesetRuleTimeFrame?> TimeFrame { get; private set; } = null!;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        [Output("variables")]
        public Output<ImmutableArray<Outputs.RulesetRuleVariable>> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a RulesetRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RulesetRule(string name, RulesetRuleArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/rulesetRule:RulesetRule", name, args ?? new RulesetRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RulesetRule(string name, Input<string> id, RulesetRuleState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/rulesetRule:RulesetRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RulesetRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RulesetRule Get(string name, Input<string> id, RulesetRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new RulesetRule(name, id, state, options);
        }
    }

    public sealed class RulesetRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.RulesetRuleActionsArgs>? Actions { get; set; }

        /// <summary>
        /// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
        /// </summary>
        [Input("catchAll")]
        public Input<bool>? CatchAll { get; set; }

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
        /// </summary>
        [Input("conditions")]
        public Input<Inputs.RulesetRuleConditionsArgs>? Conditions { get; set; }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Position/index of the rule within the ruleset.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        /// <summary>
        /// The ID of the ruleset that the rule belongs to.
        /// </summary>
        [Input("ruleset", required: true)]
        public Input<string> Ruleset { get; set; } = null!;

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Input("timeFrame")]
        public Input<Inputs.RulesetRuleTimeFrameArgs>? TimeFrame { get; set; }

        [Input("variables")]
        private InputList<Inputs.RulesetRuleVariableArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        public InputList<Inputs.RulesetRuleVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.RulesetRuleVariableArgs>());
            set => _variables = value;
        }

        public RulesetRuleArgs()
        {
        }
        public static new RulesetRuleArgs Empty => new RulesetRuleArgs();
    }

    public sealed class RulesetRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to apply to an event if the conditions match.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.RulesetRuleActionsGetArgs>? Actions { get; set; }

        /// <summary>
        /// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
        /// </summary>
        [Input("catchAll")]
        public Input<bool>? CatchAll { get; set; }

        /// <summary>
        /// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
        /// </summary>
        [Input("conditions")]
        public Input<Inputs.RulesetRuleConditionsGetArgs>? Conditions { get; set; }

        /// <summary>
        /// Indicates whether the rule is disabled and would therefore not be evaluated.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Position/index of the rule within the ruleset.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        /// <summary>
        /// The ID of the ruleset that the rule belongs to.
        /// </summary>
        [Input("ruleset")]
        public Input<string>? Ruleset { get; set; }

        /// <summary>
        /// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        /// </summary>
        [Input("timeFrame")]
        public Input<Inputs.RulesetRuleTimeFrameGetArgs>? TimeFrame { get; set; }

        [Input("variables")]
        private InputList<Inputs.RulesetRuleVariableGetArgs>? _variables;

        /// <summary>
        /// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        /// </summary>
        public InputList<Inputs.RulesetRuleVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.RulesetRuleVariableGetArgs>());
            set => _variables = value;
        }

        public RulesetRuleState()
        {
        }
        public static new RulesetRuleState Empty => new RulesetRuleState();
    }
}

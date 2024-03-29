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
    /// *NOTE: The `pagerduty.EventRule` resource has been deprecated in favor of the pagerduty.Ruleset and pagerduty.RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*
    /// 
    /// An [event rule](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var second = new Pagerduty.EventRule("second", new()
    ///     {
    ///         ActionJson = JsonSerializer.Serialize(new[]
    ///         {
    ///             new[]
    ///             {
    ///                 "route",
    ///                 "P5DTL0K",
    ///             },
    ///             new[]
    ///             {
    ///                 "severity",
    ///                 "warning",
    ///             },
    ///             new[]
    ///             {
    ///                 "annotate",
    ///                 "2 Managed by terraform",
    ///             },
    ///             new[]
    ///             {
    ///                 "priority",
    ///                 "PL451DT",
    ///             },
    ///         }),
    ///         ConditionJson = JsonSerializer.Serialize(new object?[]
    ///         {
    ///             "and",
    ///             new object?[]
    ///             {
    ///                 "contains",
    ///                 new[]
    ///                 {
    ///                     "path",
    ///                     "payload",
    ///                     "source",
    ///                 },
    ///                 "website",
    ///             },
    ///             new object?[]
    ///             {
    ///                 "contains",
    ///                 new[]
    ///                 {
    ///                     "path",
    ///                     "headers",
    ///                     "from",
    ///                     "0",
    ///                     "address",
    ///                 },
    ///                 "homer",
    ///             },
    ///         }),
    ///         AdvancedConditionJson = JsonSerializer.Serialize(new[]
    ///         {
    ///             new object?[]
    ///             {
    ///                 "scheduled-weekly",
    ///                 1565392127032,
    ///                 3600000,
    ///                 "America/Los_Angeles",
    ///                 new object?[]
    ///                 {
    ///                     1,
    ///                     2,
    ///                     3,
    ///                     5,
    ///                     7,
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var third = new Pagerduty.EventRule("third", new()
    ///     {
    ///         ActionJson = JsonSerializer.Serialize(new[]
    ///         {
    ///             new[]
    ///             {
    ///                 "route",
    ///                 "P5DTL0K",
    ///             },
    ///             new[]
    ///             {
    ///                 "severity",
    ///                 "warning",
    ///             },
    ///             new[]
    ///             {
    ///                 "annotate",
    ///                 "3 Managed by terraform",
    ///             },
    ///             new[]
    ///             {
    ///                 "priority",
    ///                 "PL451DT",
    ///             },
    ///         }),
    ///         ConditionJson = JsonSerializer.Serialize(new object?[]
    ///         {
    ///             "and",
    ///             new object?[]
    ///             {
    ///                 "contains",
    ///                 new[]
    ///                 {
    ///                     "path",
    ///                     "payload",
    ///                     "source",
    ///                 },
    ///                 "website",
    ///             },
    ///             new object?[]
    ///             {
    ///                 "contains",
    ///                 new[]
    ///                 {
    ///                     "path",
    ///                     "headers",
    ///                     "from",
    ///                     "0",
    ///                     "address",
    ///                 },
    ///                 "homer",
    ///             },
    ///         }),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             pagerduty_event_rule.Two, 
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Event rules can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/eventRule:EventRule")]
    public partial class EventRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of one or more actions for each rule. Each action within the list is itself a list.
        /// </summary>
        [Output("actionJson")]
        public Output<string> ActionJson { get; private set; } = null!;

        /// <summary>
        /// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        /// </summary>
        [Output("advancedConditionJson")]
        public Output<string?> AdvancedConditionJson { get; private set; } = null!;

        /// <summary>
        /// A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        /// </summary>
        [Output("catchAll")]
        public Output<bool> CatchAll { get; private set; } = null!;

        /// <summary>
        /// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        /// </summary>
        [Output("conditionJson")]
        public Output<string> ConditionJson { get; private set; } = null!;


        /// <summary>
        /// Create a EventRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventRule(string name, EventRuleArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventRule:EventRule", name, args ?? new EventRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventRule(string name, Input<string> id, EventRuleState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/eventRule:EventRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventRule Get(string name, Input<string> id, EventRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new EventRule(name, id, state, options);
        }
    }

    public sealed class EventRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of one or more actions for each rule. Each action within the list is itself a list.
        /// </summary>
        [Input("actionJson", required: true)]
        public Input<string> ActionJson { get; set; } = null!;

        /// <summary>
        /// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        /// </summary>
        [Input("advancedConditionJson")]
        public Input<string>? AdvancedConditionJson { get; set; }

        /// <summary>
        /// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        /// </summary>
        [Input("conditionJson", required: true)]
        public Input<string> ConditionJson { get; set; } = null!;

        public EventRuleArgs()
        {
        }
        public static new EventRuleArgs Empty => new EventRuleArgs();
    }

    public sealed class EventRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of one or more actions for each rule. Each action within the list is itself a list.
        /// </summary>
        [Input("actionJson")]
        public Input<string>? ActionJson { get; set; }

        /// <summary>
        /// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        /// </summary>
        [Input("advancedConditionJson")]
        public Input<string>? AdvancedConditionJson { get; set; }

        /// <summary>
        /// A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        /// </summary>
        [Input("catchAll")]
        public Input<bool>? CatchAll { get; set; }

        /// <summary>
        /// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        /// </summary>
        [Input("conditionJson")]
        public Input<string>? ConditionJson { get; set; }

        public EventRuleState()
        {
        }
        public static new EventRuleState Empty => new EventRuleState();
    }
}

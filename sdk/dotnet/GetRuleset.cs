// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetRuleset
    {
        /// <summary>
        /// Use this data source to get information about a specific [ruleset](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1rulesets/get) that you can use for managing and grouping [event rules](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1rulesets~1%7Bid%7D~1rules/get).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Pagerduty.GetRuleset.InvokeAsync(new Pagerduty.GetRulesetArgs
        ///         {
        ///             Name = "My Ruleset",
        ///         }));
        ///         var foo = new Pagerduty.RulesetRule("foo", new Pagerduty.RulesetRuleArgs
        ///         {
        ///             Ruleset = example.Apply(example =&gt; example.Id),
        ///             Position = 0,
        ///             Disabled = false,
        ///             Conditions = new Pagerduty.Inputs.RulesetRuleConditionsArgs
        ///             {
        ///                 Operator = "and",
        ///                 Subconditions = 
        ///                 {
        ///                     new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                     {
        ///                         Operator = "contains",
        ///                         Parameters = 
        ///                         {
        ///                             new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                             {
        ///                                 Value = "disk space",
        ///                                 Path = "payload.summary",
        ///                             },
        ///                         },
        ///                     },
        ///                     new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                     {
        ///                         Operator = "contains",
        ///                         Parameters = 
        ///                         {
        ///                             new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                             {
        ///                                 Value = "db",
        ///                                 Path = "payload.source",
        ///                             },
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///             Actions = new Pagerduty.Inputs.RulesetRuleActionsArgs
        ///             {
        ///                 Routes = 
        ///                 {
        ///                     new Pagerduty.Inputs.RulesetRuleActionsRouteArgs
        ///                     {
        ///                         Value = "P5DTL0K",
        ///                     },
        ///                 },
        ///             },
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Default Global Ruleset
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var defaultGlobal = Output.Create(Pagerduty.GetRuleset.InvokeAsync(new Pagerduty.GetRulesetArgs
        ///         {
        ///             Name = "Default Global",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRulesetResult> InvokeAsync(GetRulesetArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRulesetResult>("pagerduty:index/getRuleset:getRuleset", args ?? new GetRulesetArgs(), options.WithVersion());
    }


    public sealed class GetRulesetArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the ruleset to find in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetRulesetArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRulesetResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the found ruleset.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Routing keys routed to this ruleset.
        /// </summary>
        public readonly ImmutableArray<string> RoutingKeys;

        [OutputConstructor]
        private GetRulesetResult(
            string id,

            string name,

            ImmutableArray<string> routingKeys)
        {
            Id = id;
            Name = name;
            RoutingKeys = routingKeys;
        }
    }
}

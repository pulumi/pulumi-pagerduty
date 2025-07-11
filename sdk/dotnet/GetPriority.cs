// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetPriority
    {
        /// <summary>
        /// Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE2NA-list-priorities) that you can use for other PagerDuty resources. A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var p1 = Pagerduty.GetPriority.Invoke(new()
        ///     {
        ///         Name = "P1",
        ///     });
        /// 
        ///     var foo = new Pagerduty.Ruleset("foo", new()
        ///     {
        ///         Name = "Primary Ruleset",
        ///     });
        /// 
        ///     var fooRulesetRule = new Pagerduty.RulesetRule("foo", new()
        ///     {
        ///         Ruleset = foo.Id,
        ///         Position = 0,
        ///         Disabled = false,
        ///         Conditions = new Pagerduty.Inputs.RulesetRuleConditionsArgs
        ///         {
        ///             Operator = "and",
        ///             Subconditions = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "disk space",
        ///                             Path = "payload.summary",
        ///                         },
        ///                     },
        ///                 },
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "db",
        ///                             Path = "payload.source",
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///         Actions = new Pagerduty.Inputs.RulesetRuleActionsArgs
        ///         {
        ///             Routes = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsRouteArgs
        ///                 {
        ///                     Value = "P5DTL0K",
        ///                 },
        ///             },
        ///             Priorities = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsPriorityArgs
        ///                 {
        ///                     Value = p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPriorityResult> InvokeAsync(GetPriorityArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPriorityResult>("pagerduty:index/getPriority:getPriority", args ?? new GetPriorityArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE2NA-list-priorities) that you can use for other PagerDuty resources. A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var p1 = Pagerduty.GetPriority.Invoke(new()
        ///     {
        ///         Name = "P1",
        ///     });
        /// 
        ///     var foo = new Pagerduty.Ruleset("foo", new()
        ///     {
        ///         Name = "Primary Ruleset",
        ///     });
        /// 
        ///     var fooRulesetRule = new Pagerduty.RulesetRule("foo", new()
        ///     {
        ///         Ruleset = foo.Id,
        ///         Position = 0,
        ///         Disabled = false,
        ///         Conditions = new Pagerduty.Inputs.RulesetRuleConditionsArgs
        ///         {
        ///             Operator = "and",
        ///             Subconditions = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "disk space",
        ///                             Path = "payload.summary",
        ///                         },
        ///                     },
        ///                 },
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "db",
        ///                             Path = "payload.source",
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///         Actions = new Pagerduty.Inputs.RulesetRuleActionsArgs
        ///         {
        ///             Routes = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsRouteArgs
        ///                 {
        ///                     Value = "P5DTL0K",
        ///                 },
        ///             },
        ///             Priorities = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsPriorityArgs
        ///                 {
        ///                     Value = p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPriorityResult> Invoke(GetPriorityInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPriorityResult>("pagerduty:index/getPriority:getPriority", args ?? new GetPriorityInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE2NA-list-priorities) that you can use for other PagerDuty resources. A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var p1 = Pagerduty.GetPriority.Invoke(new()
        ///     {
        ///         Name = "P1",
        ///     });
        /// 
        ///     var foo = new Pagerduty.Ruleset("foo", new()
        ///     {
        ///         Name = "Primary Ruleset",
        ///     });
        /// 
        ///     var fooRulesetRule = new Pagerduty.RulesetRule("foo", new()
        ///     {
        ///         Ruleset = foo.Id,
        ///         Position = 0,
        ///         Disabled = false,
        ///         Conditions = new Pagerduty.Inputs.RulesetRuleConditionsArgs
        ///         {
        ///             Operator = "and",
        ///             Subconditions = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "disk space",
        ///                             Path = "payload.summary",
        ///                         },
        ///                     },
        ///                 },
        ///                 new Pagerduty.Inputs.RulesetRuleConditionsSubconditionArgs
        ///                 {
        ///                     Operator = "contains",
        ///                     Parameters = new[]
        ///                     {
        ///                         new Pagerduty.Inputs.RulesetRuleConditionsSubconditionParameterArgs
        ///                         {
        ///                             Value = "db",
        ///                             Path = "payload.source",
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///         Actions = new Pagerduty.Inputs.RulesetRuleActionsArgs
        ///         {
        ///             Routes = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsRouteArgs
        ///                 {
        ///                     Value = "P5DTL0K",
        ///                 },
        ///             },
        ///             Priorities = new[]
        ///             {
        ///                 new Pagerduty.Inputs.RulesetRuleActionsPriorityArgs
        ///                 {
        ///                     Value = p1.Apply(getPriorityResult =&gt; getPriorityResult.Id),
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPriorityResult> Invoke(GetPriorityInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPriorityResult>("pagerduty:index/getPriority:getPriority", args ?? new GetPriorityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPriorityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the priority to find in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetPriorityArgs()
        {
        }
        public static new GetPriorityArgs Empty => new GetPriorityArgs();
    }

    public sealed class GetPriorityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the priority to find in the PagerDuty API.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetPriorityInvokeArgs()
        {
        }
        public static new GetPriorityInvokeArgs Empty => new GetPriorityInvokeArgs();
    }


    [OutputType]
    public sealed class GetPriorityResult
    {
        /// <summary>
        /// A description of the found priority.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the found priority.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the found priority.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetPriorityResult(
            string description,

            string id,

            string name)
        {
            Description = description;
            Id = id;
            Name = name;
        }
    }
}

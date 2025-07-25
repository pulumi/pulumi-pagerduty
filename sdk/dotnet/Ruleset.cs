// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
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
    ///     var foo = new Pagerduty.Team("foo", new()
    ///     {
    ///         Name = "Engineering (Seattle)",
    ///     });
    /// 
    ///     var fooRuleset = new Pagerduty.Ruleset("foo", new()
    ///     {
    ///         Name = "Primary Ruleset",
    ///         Team = new Pagerduty.Inputs.RulesetTeamArgs
    ///         {
    ///             Id = foo.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Rulesets can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/ruleset:Ruleset main 19acac92-027a-4ea0-b06c-bbf516519601
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/ruleset:Ruleset")]
    public partial class Ruleset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Routing keys routed to this ruleset.
        /// </summary>
        [Output("routingKeys")]
        public Output<ImmutableArray<string>> RoutingKeys { get; private set; } = null!;

        /// <summary>
        /// Reference to the team that owns the ruleset. If none is specified, only admins have access.
        /// </summary>
        [Output("team")]
        public Output<Outputs.RulesetTeam?> Team { get; private set; } = null!;

        /// <summary>
        /// Type of ruleset. Currently, only sets to `global`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Ruleset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ruleset(string name, RulesetArgs? args = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/ruleset:Ruleset", name, args ?? new RulesetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ruleset(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/ruleset:Ruleset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ruleset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ruleset Get(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
        {
            return new Ruleset(name, id, state, options);
        }
    }

    public sealed class RulesetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Reference to the team that owns the ruleset. If none is specified, only admins have access.
        /// </summary>
        [Input("team")]
        public Input<Inputs.RulesetTeamArgs>? Team { get; set; }

        public RulesetArgs()
        {
        }
        public static new RulesetArgs Empty => new RulesetArgs();
    }

    public sealed class RulesetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("routingKeys")]
        private InputList<string>? _routingKeys;

        /// <summary>
        /// Routing keys routed to this ruleset.
        /// </summary>
        public InputList<string> RoutingKeys
        {
            get => _routingKeys ?? (_routingKeys = new InputList<string>());
            set => _routingKeys = value;
        }

        /// <summary>
        /// Reference to the team that owns the ruleset. If none is specified, only admins have access.
        /// </summary>
        [Input("team")]
        public Input<Inputs.RulesetTeamGetArgs>? Team { get; set; }

        /// <summary>
        /// Type of ruleset. Currently, only sets to `global`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RulesetState()
        {
        }
        public static new RulesetState Empty => new RulesetState();
    }
}

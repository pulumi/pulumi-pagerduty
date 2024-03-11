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
    /// An [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNQ-create-an-escalation-policy) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.
    /// 
    /// ## Import
    /// 
    /// Escalation policies can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/escalationPolicy:EscalationPolicy main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/escalationPolicy:EscalationPolicy")]
    public partial class EscalationPolicy : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the escalation policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of times the escalation policy will repeat after reaching the end of its escalation.
        /// </summary>
        [Output("numLoops")]
        public Output<int?> NumLoops { get; private set; } = null!;

        /// <summary>
        /// An Escalation rule block. Escalation rules documented below.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.EscalationPolicyRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        /// </summary>
        [Output("teams")]
        public Output<string?> Teams { get; private set; } = null!;


        /// <summary>
        /// Create a EscalationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EscalationPolicy(string name, EscalationPolicyArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/escalationPolicy:EscalationPolicy", name, args ?? new EscalationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EscalationPolicy(string name, Input<string> id, EscalationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/escalationPolicy:EscalationPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EscalationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EscalationPolicy Get(string name, Input<string> id, EscalationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new EscalationPolicy(name, id, state, options);
        }
    }

    public sealed class EscalationPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the escalation policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of times the escalation policy will repeat after reaching the end of its escalation.
        /// </summary>
        [Input("numLoops")]
        public Input<int>? NumLoops { get; set; }

        [Input("rules", required: true)]
        private InputList<Inputs.EscalationPolicyRuleArgs>? _rules;

        /// <summary>
        /// An Escalation rule block. Escalation rules documented below.
        /// </summary>
        public InputList<Inputs.EscalationPolicyRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EscalationPolicyRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        /// </summary>
        [Input("teams")]
        public Input<string>? Teams { get; set; }

        public EscalationPolicyArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new EscalationPolicyArgs Empty => new EscalationPolicyArgs();
    }

    public sealed class EscalationPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the escalation policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of times the escalation policy will repeat after reaching the end of its escalation.
        /// </summary>
        [Input("numLoops")]
        public Input<int>? NumLoops { get; set; }

        [Input("rules")]
        private InputList<Inputs.EscalationPolicyRuleGetArgs>? _rules;

        /// <summary>
        /// An Escalation rule block. Escalation rules documented below.
        /// </summary>
        public InputList<Inputs.EscalationPolicyRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EscalationPolicyRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        /// </summary>
        [Input("teams")]
        public Input<string>? Teams { get; set; }

        public EscalationPolicyState()
        {
            Description = "Managed by Pulumi";
        }
        public static new EscalationPolicyState Empty => new EscalationPolicyState();
    }
}

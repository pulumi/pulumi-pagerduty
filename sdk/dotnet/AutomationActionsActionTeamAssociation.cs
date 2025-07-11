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
    /// An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.
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
    ///     var example = new Pagerduty.Team("example", new()
    ///     {
    ///         Name = "Engineering",
    ///         Description = "All engineering",
    ///     });
    /// 
    ///     var paActionExample = new Pagerduty.AutomationActionsAction("pa_action_example", new()
    ///     {
    ///         Name = "PA Action created via TF",
    ///         Description = "Description of the PA Action created via TF",
    ///         ActionType = "process_automation",
    ///         ActionDataReference = new Pagerduty.Inputs.AutomationActionsActionActionDataReferenceArgs
    ///         {
    ///             ProcessAutomationJobId = "P123456",
    ///         },
    ///     });
    /// 
    ///     var foo = new Pagerduty.AutomationActionsActionTeamAssociation("foo", new()
    ///     {
    ///         ActionId = paActionExample.Id,
    ///         TeamId = example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation")]
    public partial class AutomationActionsActionTeamAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Id of the action.
        /// </summary>
        [Output("actionId")]
        public Output<string> ActionId { get; private set; } = null!;

        /// <summary>
        /// Id of the team associated to the action.
        /// </summary>
        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a AutomationActionsActionTeamAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutomationActionsActionTeamAssociation(string name, AutomationActionsActionTeamAssociationArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, args ?? new AutomationActionsActionTeamAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutomationActionsActionTeamAssociation(string name, Input<string> id, AutomationActionsActionTeamAssociationState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AutomationActionsActionTeamAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutomationActionsActionTeamAssociation Get(string name, Input<string> id, AutomationActionsActionTeamAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new AutomationActionsActionTeamAssociation(name, id, state, options);
        }
    }

    public sealed class AutomationActionsActionTeamAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the action.
        /// </summary>
        [Input("actionId", required: true)]
        public Input<string> ActionId { get; set; } = null!;

        /// <summary>
        /// Id of the team associated to the action.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        public AutomationActionsActionTeamAssociationArgs()
        {
        }
        public static new AutomationActionsActionTeamAssociationArgs Empty => new AutomationActionsActionTeamAssociationArgs();
    }

    public sealed class AutomationActionsActionTeamAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the action.
        /// </summary>
        [Input("actionId")]
        public Input<string>? ActionId { get; set; }

        /// <summary>
        /// Id of the team associated to the action.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public AutomationActionsActionTeamAssociationState()
        {
        }
        public static new AutomationActionsActionTeamAssociationState Empty => new AutomationActionsActionTeamAssociationState();
    }
}

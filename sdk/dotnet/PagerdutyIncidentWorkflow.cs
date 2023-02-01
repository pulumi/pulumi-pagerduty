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
    /// An [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) is a series of steps which can be executed on an incident.
    /// 
    /// &gt; The Incident Workflows feature is currently available in Early Access.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myFirstWorkflow = new Pagerduty.PagerdutyIncidentWorkflow("myFirstWorkflow", new()
    ///     {
    ///         Description = "This Incident Workflow is an example",
    ///         Steps = new[]
    ///         {
    ///             new Pagerduty.Inputs.PagerdutyIncidentWorkflowStepArgs
    ///             {
    ///                 Action = "pagerduty.com:incident-workflows:send-status-update:1",
    ///                 Inputs = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.PagerdutyIncidentWorkflowStepInputArgs
    ///                     {
    ///                         Name = "Message",
    ///                         Value = "Example status message sent on {{current_date}}",
    ///                     },
    ///                 },
    ///                 Name = "Send Status Update",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Incident workflows can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/pagerdutyIncidentWorkflow:PagerdutyIncidentWorkflow major_incident_workflow PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/pagerdutyIncidentWorkflow:PagerdutyIncidentWorkflow")]
    public partial class PagerdutyIncidentWorkflow : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the workflow.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The steps in the workflow.
        /// </summary>
        [Output("steps")]
        public Output<ImmutableArray<Outputs.PagerdutyIncidentWorkflowStep>> Steps { get; private set; } = null!;

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Output("team")]
        public Output<string?> Team { get; private set; } = null!;


        /// <summary>
        /// Create a PagerdutyIncidentWorkflow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PagerdutyIncidentWorkflow(string name, PagerdutyIncidentWorkflowArgs? args = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/pagerdutyIncidentWorkflow:PagerdutyIncidentWorkflow", name, args ?? new PagerdutyIncidentWorkflowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PagerdutyIncidentWorkflow(string name, Input<string> id, PagerdutyIncidentWorkflowState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/pagerdutyIncidentWorkflow:PagerdutyIncidentWorkflow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PagerdutyIncidentWorkflow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PagerdutyIncidentWorkflow Get(string name, Input<string> id, PagerdutyIncidentWorkflowState? state = null, CustomResourceOptions? options = null)
        {
            return new PagerdutyIncidentWorkflow(name, id, state, options);
        }
    }

    public sealed class PagerdutyIncidentWorkflowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the workflow.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("steps")]
        private InputList<Inputs.PagerdutyIncidentWorkflowStepArgs>? _steps;

        /// <summary>
        /// The steps in the workflow.
        /// </summary>
        public InputList<Inputs.PagerdutyIncidentWorkflowStepArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.PagerdutyIncidentWorkflowStepArgs>());
            set => _steps = value;
        }

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public PagerdutyIncidentWorkflowArgs()
        {
        }
        public static new PagerdutyIncidentWorkflowArgs Empty => new PagerdutyIncidentWorkflowArgs();
    }

    public sealed class PagerdutyIncidentWorkflowState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the workflow.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("steps")]
        private InputList<Inputs.PagerdutyIncidentWorkflowStepGetArgs>? _steps;

        /// <summary>
        /// The steps in the workflow.
        /// </summary>
        public InputList<Inputs.PagerdutyIncidentWorkflowStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.PagerdutyIncidentWorkflowStepGetArgs>());
            set => _steps = value;
        }

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public PagerdutyIncidentWorkflowState()
        {
        }
        public static new PagerdutyIncidentWorkflowState Empty => new PagerdutyIncidentWorkflowState();
    }
}
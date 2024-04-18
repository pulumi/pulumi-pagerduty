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
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myFirstWorkflow = new Pagerduty.IncidentWorkflow("my_first_workflow", new()
    ///     {
    ///         Name = "Example Incident Workflow",
    ///         Description = "This Incident Workflow is an example",
    ///         Steps = new[]
    ///         {
    ///             new Pagerduty.Inputs.IncidentWorkflowStepArgs
    ///             {
    ///                 Name = "Send Status Update",
    ///                 Action = "pagerduty.com:incident-workflows:send-status-update:1",
    ///                 Inputs = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.IncidentWorkflowStepInputArgs
    ///                     {
    ///                         Name = "Message",
    ///                         Value = "Example status message sent on {{current_date}}",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Incident workflows can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/incidentWorkflow:IncidentWorkflow major_incident_workflow PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/incidentWorkflow:IncidentWorkflow")]
    public partial class IncidentWorkflow : global::Pulumi.CustomResource
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
        public Output<ImmutableArray<Outputs.IncidentWorkflowStep>> Steps { get; private set; } = null!;

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Output("team")]
        public Output<string?> Team { get; private set; } = null!;


        /// <summary>
        /// Create a IncidentWorkflow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IncidentWorkflow(string name, IncidentWorkflowArgs? args = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentWorkflow:IncidentWorkflow", name, args ?? new IncidentWorkflowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IncidentWorkflow(string name, Input<string> id, IncidentWorkflowState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentWorkflow:IncidentWorkflow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IncidentWorkflow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IncidentWorkflow Get(string name, Input<string> id, IncidentWorkflowState? state = null, CustomResourceOptions? options = null)
        {
            return new IncidentWorkflow(name, id, state, options);
        }
    }

    public sealed class IncidentWorkflowArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.IncidentWorkflowStepArgs>? _steps;

        /// <summary>
        /// The steps in the workflow.
        /// </summary>
        public InputList<Inputs.IncidentWorkflowStepArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.IncidentWorkflowStepArgs>());
            set => _steps = value;
        }

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public IncidentWorkflowArgs()
        {
        }
        public static new IncidentWorkflowArgs Empty => new IncidentWorkflowArgs();
    }

    public sealed class IncidentWorkflowState : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.IncidentWorkflowStepGetArgs>? _steps;

        /// <summary>
        /// The steps in the workflow.
        /// </summary>
        public InputList<Inputs.IncidentWorkflowStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.IncidentWorkflowStepGetArgs>());
            set => _steps = value;
        }

        /// <summary>
        /// A team ID. If specified then workflow edit permissions will be scoped to members of this team.
        /// </summary>
        [Input("team")]
        public Input<string>? Team { get; set; }

        public IncidentWorkflowState()
        {
        }
        public static new IncidentWorkflowState Empty => new IncidentWorkflowState();
    }
}

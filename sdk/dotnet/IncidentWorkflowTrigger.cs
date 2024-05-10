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
    /// An [Incident Workflow Trigger](https://support.pagerduty.com/docs/incident-workflows#triggers) defines when and if an [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) will be triggered.
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
    ///     var firstService = Pagerduty.GetService.Invoke(new()
    ///     {
    ///         Name = "My First Service",
    ///     });
    /// 
    ///     var automaticTrigger = new Pagerduty.IncidentWorkflowTrigger("automatic_trigger", new()
    ///     {
    ///         Type = "conditional",
    ///         Workflow = myFirstWorkflow.Id,
    ///         Services = new[]
    ///         {
    ///             firstServicePagerdutyService.Id,
    ///         },
    ///         Condition = "incident.priority matches 'P1'",
    ///         SubscribedToAllServices = false,
    ///     });
    /// 
    ///     var devops = Pagerduty.GetTeam.Invoke(new()
    ///     {
    ///         Name = "devops",
    ///     });
    /// 
    ///     var manualTrigger = new Pagerduty.IncidentWorkflowTrigger("manual_trigger", new()
    ///     {
    ///         Type = "manual",
    ///         Workflow = myFirstWorkflow.Id,
    ///         Services = new[]
    ///         {
    ///             firstServicePagerdutyService.Id,
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
    /// $ pulumi import pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger pagerduty_incident_workflow_trigger PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger")]
    public partial class IncidentWorkflowTrigger : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
        /// </summary>
        [Output("condition")]
        public Output<string?> Condition { get; private set; } = null!;

        /// <summary>
        /// Indicates who can start this Trigger. Applicable only to `manual`-type triggers.
        /// </summary>
        [Output("permissions")]
        public Output<Outputs.IncidentWorkflowTriggerPermissions> Permissions { get; private set; } = null!;

        /// <summary>
        /// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<string>> Services { get; private set; } = null!;

        /// <summary>
        /// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
        /// </summary>
        [Output("subscribedToAllServices")]
        public Output<bool> SubscribedToAllServices { get; private set; } = null!;

        /// <summary>
        /// [Updating causes resource replacement] May be either `manual` or `conditional`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The workflow ID for the workflow to trigger.
        /// </summary>
        [Output("workflow")]
        public Output<string> Workflow { get; private set; } = null!;


        /// <summary>
        /// Create a IncidentWorkflowTrigger resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IncidentWorkflowTrigger(string name, IncidentWorkflowTriggerArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, args ?? new IncidentWorkflowTriggerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IncidentWorkflowTrigger(string name, Input<string> id, IncidentWorkflowTriggerState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IncidentWorkflowTrigger resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IncidentWorkflowTrigger Get(string name, Input<string> id, IncidentWorkflowTriggerState? state = null, CustomResourceOptions? options = null)
        {
            return new IncidentWorkflowTrigger(name, id, state, options);
        }
    }

    public sealed class IncidentWorkflowTriggerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Indicates who can start this Trigger. Applicable only to `manual`-type triggers.
        /// </summary>
        [Input("permissions")]
        public Input<Inputs.IncidentWorkflowTriggerPermissionsArgs>? Permissions { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
        /// </summary>
        [Input("subscribedToAllServices", required: true)]
        public Input<bool> SubscribedToAllServices { get; set; } = null!;

        /// <summary>
        /// [Updating causes resource replacement] May be either `manual` or `conditional`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The workflow ID for the workflow to trigger.
        /// </summary>
        [Input("workflow", required: true)]
        public Input<string> Workflow { get; set; } = null!;

        public IncidentWorkflowTriggerArgs()
        {
        }
        public static new IncidentWorkflowTriggerArgs Empty => new IncidentWorkflowTriggerArgs();
    }

    public sealed class IncidentWorkflowTriggerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Indicates who can start this Trigger. Applicable only to `manual`-type triggers.
        /// </summary>
        [Input("permissions")]
        public Input<Inputs.IncidentWorkflowTriggerPermissionsGetArgs>? Permissions { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
        /// </summary>
        [Input("subscribedToAllServices")]
        public Input<bool>? SubscribedToAllServices { get; set; }

        /// <summary>
        /// [Updating causes resource replacement] May be either `manual` or `conditional`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The workflow ID for the workflow to trigger.
        /// </summary>
        [Input("workflow")]
        public Input<string>? Workflow { get; set; }

        public IncidentWorkflowTriggerState()
        {
        }
        public static new IncidentWorkflowTriggerState Empty => new IncidentWorkflowTriggerState();
    }
}

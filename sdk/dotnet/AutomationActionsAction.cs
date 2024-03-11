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
    /// An Automation Actions [action](https://developer.pagerduty.com/api-reference/d64584a4371d3-create-an-automation-action) invokes jobs and workflows that are staged in Runbook Automation or Process Automation. It may also execute a command line script run by a Process Automation runner installed in your infrastructure.
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
    ///     var paActionExample = new Pagerduty.AutomationActionsAction("paActionExample", new()
    ///     {
    ///         ActionDataReference = new Pagerduty.Inputs.AutomationActionsActionActionDataReferenceArgs
    ///         {
    ///             ProcessAutomationJobId = "P123456",
    ///         },
    ///         ActionType = "process_automation",
    ///         Description = "Description of the PA Action created via TF",
    ///     });
    /// 
    ///     var scriptActionExample = new Pagerduty.AutomationActionsAction("scriptActionExample", new()
    ///     {
    ///         ActionDataReference = new Pagerduty.Inputs.AutomationActionsActionActionDataReferenceArgs
    ///         {
    ///             InvocationCommand = "/usr/local/bin/python3",
    ///             Script = "print(\"Hello from a Python script!\")",
    ///         },
    ///         ActionType = "script",
    ///         Description = "Description of the Script Action created via TF",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Actions can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/automationActionsAction:AutomationActionsAction example 01DER7CUUBF7TH4116K0M4WKPU
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/automationActionsAction:AutomationActionsAction")]
    public partial class AutomationActionsAction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        [Output("actionClassification")]
        public Output<string?> ActionClassification { get; private set; } = null!;

        /// <summary>
        /// Action Data block. Action Data is documented below.
        /// </summary>
        [Output("actionDataReference")]
        public Output<Outputs.AutomationActionsActionActionDataReference> ActionDataReference { get; private set; } = null!;

        /// <summary>
        /// The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        /// </summary>
        [Output("actionType")]
        public Output<string> ActionType { get; private set; } = null!;

        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// The description of the action. Max length is 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Output("modifyTime")]
        public Output<string> ModifyTime { get; private set; } = null!;

        /// <summary>
        /// The name of the action. Max length is 255 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        /// </summary>
        [Output("runnerId")]
        public Output<string?> RunnerId { get; private set; } = null!;

        /// <summary>
        /// (Optional) The type of the runner associated with the action.
        /// </summary>
        [Output("runnerType")]
        public Output<string> RunnerType { get; private set; } = null!;

        /// <summary>
        /// The type of object. The value returned will be `action`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AutomationActionsAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutomationActionsAction(string name, AutomationActionsActionArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/automationActionsAction:AutomationActionsAction", name, args ?? new AutomationActionsActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutomationActionsAction(string name, Input<string> id, AutomationActionsActionState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/automationActionsAction:AutomationActionsAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AutomationActionsAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutomationActionsAction Get(string name, Input<string> id, AutomationActionsActionState? state = null, CustomResourceOptions? options = null)
        {
            return new AutomationActionsAction(name, id, state, options);
        }
    }

    public sealed class AutomationActionsActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        [Input("actionClassification")]
        public Input<string>? ActionClassification { get; set; }

        /// <summary>
        /// Action Data block. Action Data is documented below.
        /// </summary>
        [Input("actionDataReference", required: true)]
        public Input<Inputs.AutomationActionsActionActionDataReferenceArgs> ActionDataReference { get; set; } = null!;

        /// <summary>
        /// The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        /// </summary>
        [Input("actionType", required: true)]
        public Input<string> ActionType { get; set; } = null!;

        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// The description of the action. Max length is 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("modifyTime")]
        public Input<string>? ModifyTime { get; set; }

        /// <summary>
        /// The name of the action. Max length is 255 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        /// </summary>
        [Input("runnerId")]
        public Input<string>? RunnerId { get; set; }

        /// <summary>
        /// (Optional) The type of the runner associated with the action.
        /// </summary>
        [Input("runnerType")]
        public Input<string>? RunnerType { get; set; }

        /// <summary>
        /// The type of object. The value returned will be `action`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AutomationActionsActionArgs()
        {
        }
        public static new AutomationActionsActionArgs Empty => new AutomationActionsActionArgs();
    }

    public sealed class AutomationActionsActionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        [Input("actionClassification")]
        public Input<string>? ActionClassification { get; set; }

        /// <summary>
        /// Action Data block. Action Data is documented below.
        /// </summary>
        [Input("actionDataReference")]
        public Input<Inputs.AutomationActionsActionActionDataReferenceGetArgs>? ActionDataReference { get; set; }

        /// <summary>
        /// The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        /// </summary>
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// The description of the action. Max length is 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("modifyTime")]
        public Input<string>? ModifyTime { get; set; }

        /// <summary>
        /// The name of the action. Max length is 255 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        /// </summary>
        [Input("runnerId")]
        public Input<string>? RunnerId { get; set; }

        /// <summary>
        /// (Optional) The type of the runner associated with the action.
        /// </summary>
        [Input("runnerType")]
        public Input<string>? RunnerType { get; set; }

        /// <summary>
        /// The type of object. The value returned will be `action`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AutomationActionsActionState()
        {
        }
        public static new AutomationActionsActionState Empty => new AutomationActionsActionState();
    }
}

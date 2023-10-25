// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetAutomationActionsAction
    {
        /// <summary>
        /// Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Pagerduty.GetAutomationActionsAction.Invoke(new()
        ///     {
        ///         Id = "01CS1685B2UDM4I3XUUOXPPORM",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAutomationActionsActionResult> InvokeAsync(GetAutomationActionsActionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAutomationActionsActionResult>("pagerduty:index/getAutomationActionsAction:getAutomationActionsAction", args ?? new GetAutomationActionsActionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Pagerduty.GetAutomationActionsAction.Invoke(new()
        ///     {
        ///         Id = "01CS1685B2UDM4I3XUUOXPPORM",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAutomationActionsActionResult> Invoke(GetAutomationActionsActionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAutomationActionsActionResult>("pagerduty:index/getAutomationActionsAction:getAutomationActionsAction", args ?? new GetAutomationActionsActionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAutomationActionsActionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        [Input("actionClassification")]
        public string? ActionClassification { get; set; }

        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("creationTime")]
        public string? CreationTime { get; set; }

        /// <summary>
        /// (Optional) The description of the action.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The id of the automation actions action in the PagerDuty API.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("modifyTime")]
        public string? ModifyTime { get; set; }

        /// <summary>
        /// (Optional) The Process Automation Actions runner to associate the action with.
        /// </summary>
        [Input("runnerId")]
        public string? RunnerId { get; set; }

        /// <summary>
        /// (Optional) The type of the runner associated with the action.
        /// </summary>
        [Input("runnerType")]
        public string? RunnerType { get; set; }

        /// <summary>
        /// The type of object. The value returned will be `action`.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetAutomationActionsActionArgs()
        {
        }
        public static new GetAutomationActionsActionArgs Empty => new GetAutomationActionsActionArgs();
    }

    public sealed class GetAutomationActionsActionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        [Input("actionClassification")]
        public Input<string>? ActionClassification { get; set; }

        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// (Optional) The description of the action.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The id of the automation actions action in the PagerDuty API.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        [Input("modifyTime")]
        public Input<string>? ModifyTime { get; set; }

        /// <summary>
        /// (Optional) The Process Automation Actions runner to associate the action with.
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

        public GetAutomationActionsActionInvokeArgs()
        {
        }
        public static new GetAutomationActionsActionInvokeArgs Empty => new GetAutomationActionsActionInvokeArgs();
    }


    [OutputType]
    public sealed class GetAutomationActionsActionResult
    {
        /// <summary>
        /// (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
        /// </summary>
        public readonly string ActionClassification;
        /// <summary>
        /// Action Data block. Action Data is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAutomationActionsActionActionDataReferenceResult> ActionDataReferences;
        /// <summary>
        /// The type of the action. The only allowed values are `process_automation` and `script`.
        /// </summary>
        public readonly string ActionType;
        /// <summary>
        /// The time action was created. Represented as an ISO 8601 timestamp.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// (Optional) The description of the action.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the action.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        /// </summary>
        public readonly string ModifyTime;
        /// <summary>
        /// The name of the action.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Optional) The Process Automation Actions runner to associate the action with.
        /// </summary>
        public readonly string RunnerId;
        /// <summary>
        /// (Optional) The type of the runner associated with the action.
        /// </summary>
        public readonly string RunnerType;
        /// <summary>
        /// The type of object. The value returned will be `action`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAutomationActionsActionResult(
            string actionClassification,

            ImmutableArray<Outputs.GetAutomationActionsActionActionDataReferenceResult> actionDataReferences,

            string actionType,

            string creationTime,

            string description,

            string id,

            string modifyTime,

            string name,

            string runnerId,

            string runnerType,

            string type)
        {
            ActionClassification = actionClassification;
            ActionDataReferences = actionDataReferences;
            ActionType = actionType;
            CreationTime = creationTime;
            Description = description;
            Id = id;
            ModifyTime = modifyTime;
            Name = name;
            RunnerId = runnerId;
            RunnerType = runnerType;
            Type = type;
        }
    }
}

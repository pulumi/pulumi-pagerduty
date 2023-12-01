// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class IncidentWorkflowStepInlineStepsInputStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("inputs")]
        private InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepInputGetArgs>? _inputs;

        /// <summary>
        /// The list of standard inputs for the workflow action.
        /// </summary>
        public InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepInputGetArgs> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepInputGetArgs>());
            set => _inputs = value;
        }

        /// <summary>
        /// The name of the workflow step.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public IncidentWorkflowStepInlineStepsInputStepGetArgs()
        {
        }
        public static new IncidentWorkflowStepInlineStepsInputStepGetArgs Empty => new IncidentWorkflowStepInlineStepsInputStepGetArgs();
    }
}

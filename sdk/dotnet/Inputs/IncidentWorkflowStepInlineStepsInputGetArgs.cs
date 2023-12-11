// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class IncidentWorkflowStepInlineStepsInputGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the input.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("steps")]
        private InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepGetArgs>? _steps;

        /// <summary>
        /// The inline steps of the input. An inline step adheres to the step schema described above.
        /// </summary>
        public InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.IncidentWorkflowStepInlineStepsInputStepGetArgs>());
            set => _steps = value;
        }

        public IncidentWorkflowStepInlineStepsInputGetArgs()
        {
        }
        public static new IncidentWorkflowStepInlineStepsInputGetArgs Empty => new IncidentWorkflowStepInlineStepsInputGetArgs();
    }
}
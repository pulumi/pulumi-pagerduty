// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class IncidentWorkflowStep
    {
        /// <summary>
        /// The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The ID of the incident workflow.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The list of inputs that contain a series of inline steps for the workflow action.
        /// </summary>
        public readonly ImmutableArray<Outputs.IncidentWorkflowStepInlineStepsInput> InlineStepsInputs;
        /// <summary>
        /// The list of standard inputs for the workflow action.
        /// </summary>
        public readonly ImmutableArray<Outputs.IncidentWorkflowStepInput> Inputs;
        /// <summary>
        /// The name of the workflow step.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private IncidentWorkflowStep(
            string action,

            string? id,

            ImmutableArray<Outputs.IncidentWorkflowStepInlineStepsInput> inlineStepsInputs,

            ImmutableArray<Outputs.IncidentWorkflowStepInput> inputs,

            string name)
        {
            Action = action;
            Id = id;
            InlineStepsInputs = inlineStepsInputs;
            Inputs = inputs;
            Name = name;
        }
    }
}

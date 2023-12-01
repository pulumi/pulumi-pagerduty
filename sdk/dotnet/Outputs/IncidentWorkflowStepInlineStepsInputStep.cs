// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class IncidentWorkflowStepInlineStepsInputStep
    {
        /// <summary>
        /// The action id for the workflow step, including the version. A list of actions available can be retrieved using the [PagerDuty API](https://developer.pagerduty.com/api-reference/aa192a25fac39-list-actions).
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The list of standard inputs for the workflow action.
        /// </summary>
        public readonly ImmutableArray<Outputs.IncidentWorkflowStepInlineStepsInputStepInput> Inputs;
        /// <summary>
        /// The name of the workflow step.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private IncidentWorkflowStepInlineStepsInputStep(
            string action,

            ImmutableArray<Outputs.IncidentWorkflowStepInlineStepsInputStepInput> inputs,

            string name)
        {
            Action = action;
            Inputs = inputs;
            Name = name;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class IncidentWorkflowStepInlineStepsInputStepInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("generated")]
        public Input<bool>? Generated { get; set; }

        /// <summary>
        /// The name of the input.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the input.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public IncidentWorkflowStepInlineStepsInputStepInputArgs()
        {
        }
        public static new IncidentWorkflowStepInlineStepsInputStepInputArgs Empty => new IncidentWorkflowStepInlineStepsInputStepInputArgs();
    }
}
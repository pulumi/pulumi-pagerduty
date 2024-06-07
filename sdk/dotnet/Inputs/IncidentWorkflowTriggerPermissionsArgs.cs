// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class IncidentWorkflowTriggerPermissionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
        /// </summary>
        [Input("restricted")]
        public Input<bool>? Restricted { get; set; }

        /// <summary>
        /// The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public IncidentWorkflowTriggerPermissionsArgs()
        {
        }
        public static new IncidentWorkflowTriggerPermissionsArgs Empty => new IncidentWorkflowTriggerPermissionsArgs();
    }
}

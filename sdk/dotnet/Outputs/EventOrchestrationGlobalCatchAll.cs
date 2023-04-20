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
    public sealed class EventOrchestrationGlobalCatchAll
    {
        /// <summary>
        /// These are the actions that will be taken to change the resulting alert and incident. `catch_all` supports all actions described above for `rule` _except_ `route_to` action.
        /// </summary>
        public readonly Outputs.EventOrchestrationGlobalCatchAllActions Actions;

        [OutputConstructor]
        private EventOrchestrationGlobalCatchAll(Outputs.EventOrchestrationGlobalCatchAllActions actions)
        {
            Actions = actions;
        }
    }
}

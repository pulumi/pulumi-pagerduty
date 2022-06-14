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
    public sealed class EventOrchestrationRouterSet
    {
        /// <summary>
        /// ID of the `start` set. Router supports only one set and it's id has to be `start`
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.EventOrchestrationRouterSetRule> Rules;

        [OutputConstructor]
        private EventOrchestrationRouterSet(
            string id,

            ImmutableArray<Outputs.EventOrchestrationRouterSetRule> rules)
        {
            Id = id;
            Rules = rules;
        }
    }
}

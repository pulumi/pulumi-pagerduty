// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class EventOrchestrationRouterSetRuleActionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("dynamicRouteTos")]
        private InputList<Inputs.EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs>? _dynamicRouteTos;

        /// <summary>
        /// supports the following:
        /// </summary>
        public InputList<Inputs.EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs> DynamicRouteTos
        {
            get => _dynamicRouteTos ?? (_dynamicRouteTos = new InputList<Inputs.EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs>());
            set => _dynamicRouteTos = value;
        }

        [Input("routeTo")]
        public Input<string>? RouteTo { get; set; }

        public EventOrchestrationRouterSetRuleActionsArgs()
        {
        }
        public static new EventOrchestrationRouterSetRuleActionsArgs Empty => new EventOrchestrationRouterSetRuleActionsArgs();
    }
}

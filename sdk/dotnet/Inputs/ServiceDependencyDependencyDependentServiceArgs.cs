// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceDependencyDependencyDependentServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the service dependency.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Can be `business_service`,  `service`, `business_service_reference` or `technical_service_reference`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServiceDependencyDependencyDependentServiceArgs()
        {
        }
        public static new ServiceDependencyDependencyDependentServiceArgs Empty => new ServiceDependencyDependencyDependentServiceArgs();
    }
}

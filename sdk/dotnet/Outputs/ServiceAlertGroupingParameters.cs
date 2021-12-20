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
    public sealed class ServiceAlertGroupingParameters
    {
        /// <summary>
        /// Alert grouping parameters dependent on `type`. If `type` is set to `intelligent` or empty then `config` can be empty.
        /// </summary>
        public readonly Outputs.ServiceAlertGroupingParametersConfig? Config;
        /// <summary>
        /// The type of scheduled action. Currently, this must be set to `urgency_change`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ServiceAlertGroupingParameters(
            Outputs.ServiceAlertGroupingParametersConfig? config,

            string? type)
        {
            Config = config;
            Type = type;
        }
    }
}

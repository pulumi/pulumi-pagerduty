// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceAlertGroupingParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert grouping parameters dependent on `type`. If `type` is set to `intelligent` or empty then `config` can be empty.
        /// </summary>
        [Input("config")]
        public Input<Inputs.ServiceAlertGroupingParametersConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time` or `content_based`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServiceAlertGroupingParametersGetArgs()
        {
        }
        public static new ServiceAlertGroupingParametersGetArgs Empty => new ServiceAlertGroupingParametersGetArgs();
    }
}

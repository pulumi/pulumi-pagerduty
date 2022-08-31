// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceAutoPauseNotificationsParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether alerts should be automatically suspended when identified as transient.  If not passed in, will default to 'false'.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates in seconds how long alerts should be suspended before triggering. Allowed values: `120`, `180`, `300`, `600`, `900` if `enabled` is `true`. Must be omitted or set to `null` if `enabled` is `false`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ServiceAutoPauseNotificationsParametersGetArgs()
        {
        }
        public static new ServiceAutoPauseNotificationsParametersGetArgs Empty => new ServiceAutoPauseNotificationsParametersGetArgs();
    }
}
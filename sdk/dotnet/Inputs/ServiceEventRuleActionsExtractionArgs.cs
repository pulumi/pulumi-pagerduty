// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsExtractionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
        /// 
        /// *- **OR** -*
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        /// <summary>
        /// Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
        /// 
        /// *NOTE: A rule can have multiple `extraction` objects attributed to it.*
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// A customized field message. This can also include variables extracted from the payload by using string interpolation.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        public ServiceEventRuleActionsExtractionArgs()
        {
        }
        public static new ServiceEventRuleActionsExtractionArgs Empty => new ServiceEventRuleActionsExtractionArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailFilterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be `always` or `match`.
        /// </summary>
        [Input("bodyMode")]
        public Input<string>? BodyMode { get; set; }

        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        [Input("bodyRegex")]
        public Input<string>? BodyRegex { get; set; }

        /// <summary>
        /// Can be `always` or `match`.
        /// </summary>
        [Input("fromEmailMode")]
        public Input<string>? FromEmailMode { get; set; }

        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        [Input("fromEmailRegex")]
        public Input<string>? FromEmailRegex { get; set; }

        /// <summary>
        /// The ID of the service integration.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Can be `always` or `match`.
        /// </summary>
        [Input("subjectMode")]
        public Input<string>? SubjectMode { get; set; }

        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        [Input("subjectRegex")]
        public Input<string>? SubjectRegex { get; set; }

        public ServiceIntegrationEmailFilterArgs()
        {
        }
    }
}

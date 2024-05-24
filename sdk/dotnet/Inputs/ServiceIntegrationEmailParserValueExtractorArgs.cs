// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceIntegrationEmailParserValueExtractorArgs : global::Pulumi.ResourceArgs
    {
        [Input("endsBefore")]
        public Input<string>? EndsBefore { get; set; }

        /// <summary>
        /// Can be `subject` or `body`.
        /// </summary>
        [Input("part", required: true)]
        public Input<string> Part { get; set; } = null!;

        /// <summary>
        /// If `type` has value `regex` this value should contain valid regex.
        /// 
        /// **Note:** You can use the `pagerduty.getVendor` data source to locate the appropriate vendor ID.
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        [Input("startsAfter")]
        public Input<string>? StartsAfter { get; set; }

        /// <summary>
        /// Can be `between`, `entire` or `regex`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// First value extractor should have name `incident_key` other value extractors should contain custom names.
        /// </summary>
        [Input("valueName", required: true)]
        public Input<string> ValueName { get; set; } = null!;

        public ServiceIntegrationEmailParserValueExtractorArgs()
        {
        }
        public static new ServiceIntegrationEmailParserValueExtractorArgs Empty => new ServiceIntegrationEmailParserValueExtractorArgs();
    }
}

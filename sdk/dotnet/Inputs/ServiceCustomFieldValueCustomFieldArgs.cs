// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceCustomFieldValueCustomFieldArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the custom field. Either `id` or `name` must be provided.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The name of the custom field. Either `id` or `name` must be provided.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value to set for the custom field. Must be provided as a JSON-encoded string matching the field's data type. Use the `jsonencode()` function to ensure proper formatting.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ServiceCustomFieldValueCustomFieldArgs()
        {
        }
        public static new ServiceCustomFieldValueCustomFieldArgs Empty => new ServiceCustomFieldValueCustomFieldArgs();
    }
}

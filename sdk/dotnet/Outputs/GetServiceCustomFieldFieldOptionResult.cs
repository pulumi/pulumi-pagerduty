// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class GetServiceCustomFieldFieldOptionResult
    {
        /// <summary>
        /// The data type of the field option.
        /// </summary>
        public readonly string DataType;
        /// <summary>
        /// The ID of the found field.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The value of the field option.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetServiceCustomFieldFieldOptionResult(
            string dataType,

            string id,

            string value)
        {
            DataType = dataType;
            Id = id;
            Value = value;
        }
    }
}

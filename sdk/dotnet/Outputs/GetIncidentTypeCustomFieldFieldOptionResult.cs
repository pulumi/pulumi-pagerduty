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
    public sealed class GetIncidentTypeCustomFieldFieldOptionResult
    {
        public readonly Outputs.GetIncidentTypeCustomFieldFieldOptionDataResult Data;
        public readonly string Id;
        public readonly string Type;

        [OutputConstructor]
        private GetIncidentTypeCustomFieldFieldOptionResult(
            Outputs.GetIncidentTypeCustomFieldFieldOptionDataResult data,

            string id,

            string type)
        {
            Data = data;
            Id = id;
            Type = type;
        }
    }
}

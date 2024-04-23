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
    public sealed class ServiceIntegrationEmailParserValueExtractor
    {
        public readonly string? EndsBefore;
        public readonly string Part;
        public readonly string? Regex;
        public readonly string? StartsAfter;
        public readonly string Type;
        public readonly string ValueName;

        [OutputConstructor]
        private ServiceIntegrationEmailParserValueExtractor(
            string? endsBefore,

            string part,

            string? regex,

            string? startsAfter,

            string type,

            string valueName)
        {
            EndsBefore = endsBefore;
            Part = part;
            Regex = regex;
            StartsAfter = startsAfter;
            Type = type;
            ValueName = valueName;
        }
    }
}

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
    public sealed class ResponsePlayResponderTeam
    {
        /// <summary>
        /// ID of the user defined as the responder
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A string that determines the schema of the object. If not set, the default value is "response_play".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ResponsePlayResponderTeam(
            string? id,

            string type)
        {
            Id = id;
            Type = type;
        }
    }
}
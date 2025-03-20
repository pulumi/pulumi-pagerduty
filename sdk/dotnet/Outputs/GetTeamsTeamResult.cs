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
    public sealed class GetTeamsTeamResult
    {
        /// <summary>
        /// The description of the team.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the team.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the team.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to name, though it is not intended to be an identifier.
        /// </summary>
        public readonly string Summary;

        [OutputConstructor]
        private GetTeamsTeamResult(
            string description,

            string id,

            string name,

            string summary)
        {
            Description = description;
            Id = id;
            Name = name;
            Summary = summary;
        }
    }
}

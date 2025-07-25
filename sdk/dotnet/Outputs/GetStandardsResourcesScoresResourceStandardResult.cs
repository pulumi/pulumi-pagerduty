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
    public sealed class GetStandardsResourcesScoresResourceStandardResult
    {
        /// <summary>
        /// Indicates whether the standard is currently active and applicable to the resource.
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// Provides a textual description of the standard.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A unique identifier for the standard.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The human-readable name of the standard.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates whether the resource complies to this standard.
        /// </summary>
        public readonly bool Pass;
        /// <summary>
        /// The type of the standard.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetStandardsResourcesScoresResourceStandardResult(
            bool active,

            string description,

            string id,

            string name,

            bool pass,

            string type)
        {
            Active = active;
            Description = description;
            Id = id;
            Name = name;
            Pass = pass;
            Type = type;
        }
    }
}

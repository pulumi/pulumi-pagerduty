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
    public sealed class ServiceIntegrationEmailFilter
    {
        /// <summary>
        /// Can be `always`, `match` or `no-match`.
        /// </summary>
        public readonly string? BodyMode;
        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        public readonly string? BodyRegex;
        /// <summary>
        /// Can be `always`, `match` or `no-match`.
        /// </summary>
        public readonly string? FromEmailMode;
        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        public readonly string? FromEmailRegex;
        /// <summary>
        /// The ID of the service integration.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Can be `always`, `match` or `no-match`.
        /// </summary>
        public readonly string? SubjectMode;
        /// <summary>
        /// Should be a valid regex or `null`
        /// </summary>
        public readonly string? SubjectRegex;

        [OutputConstructor]
        private ServiceIntegrationEmailFilter(
            string? bodyMode,

            string? bodyRegex,

            string? fromEmailMode,

            string? fromEmailRegex,

            string? id,

            string? subjectMode,

            string? subjectRegex)
        {
            BodyMode = bodyMode;
            BodyRegex = bodyRegex;
            FromEmailMode = fromEmailMode;
            FromEmailRegex = fromEmailRegex;
            Id = id;
            SubjectMode = subjectMode;
            SubjectRegex = subjectRegex;
        }
    }
}

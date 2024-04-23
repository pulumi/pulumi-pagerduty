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
    public sealed class ServiceIntegrationEmailFilter
    {
        public readonly string? BodyMode;
        public readonly string? BodyRegex;
        public readonly string? FromEmailMode;
        public readonly string? FromEmailRegex;
        /// <summary>
        /// The ID of the service integration.
        /// </summary>
        public readonly string? Id;
        public readonly string? SubjectMode;
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

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
    public sealed class JiraCloudAccountMappingRuleConfigJiraProject
    {
        /// <summary>
        /// Unique identifier for the Jira project.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The short key name of the Jira project.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The name of the Jira project.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private JiraCloudAccountMappingRuleConfigJiraProject(
            string id,

            string key,

            string name)
        {
            Id = id;
            Key = key;
            Name = name;
        }
    }
}
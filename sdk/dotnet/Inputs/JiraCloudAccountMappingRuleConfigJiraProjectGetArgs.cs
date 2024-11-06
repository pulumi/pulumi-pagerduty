// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class JiraCloudAccountMappingRuleConfigJiraProjectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier for the Jira project.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The short key name of the Jira project.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The name of the Jira project.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public JiraCloudAccountMappingRuleConfigJiraProjectGetArgs()
        {
        }
        public static new JiraCloudAccountMappingRuleConfigJiraProjectGetArgs Empty => new JiraCloudAccountMappingRuleConfigJiraProjectGetArgs();
    }
}

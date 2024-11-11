// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class JiraCloudAccountMappingRuleConfigJiraPriorityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Jira priority.
        /// </summary>
        [Input("jiraId", required: true)]
        public Input<string> JiraId { get; set; } = null!;

        /// <summary>
        /// The ID of the PagerDuty priority.
        /// </summary>
        [Input("pagerdutyId", required: true)]
        public Input<string> PagerdutyId { get; set; } = null!;

        public JiraCloudAccountMappingRuleConfigJiraPriorityArgs()
        {
        }
        public static new JiraCloudAccountMappingRuleConfigJiraPriorityArgs Empty => new JiraCloudAccountMappingRuleConfigJiraPriorityArgs();
    }
}
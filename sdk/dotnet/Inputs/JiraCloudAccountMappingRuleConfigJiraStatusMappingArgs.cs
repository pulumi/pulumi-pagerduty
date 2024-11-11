// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Jira status that maps to the PagerDuty `acknowledged` status.
        /// </summary>
        [Input("acknowledged")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingAcknowledgedArgs>? Acknowledged { get; set; }

        /// <summary>
        /// Jira status that maps to the PagerDuty `resolved` status.
        /// </summary>
        [Input("resolved")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingResolvedArgs>? Resolved { get; set; }

        /// <summary>
        /// Jira status that maps to the PagerDuty `triggered` status.
        /// </summary>
        [Input("triggered")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingTriggeredArgs>? Triggered { get; set; }

        public JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs()
        {
        }
        public static new JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs Empty => new JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs();
    }
}
// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class JiraCloudAccountMappingRuleConfigJiraStatusMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Jira status that maps to the PagerDuty `acknowledged` status.
        /// </summary>
        [Input("acknowledged")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingAcknowledgedGetArgs>? Acknowledged { get; set; }

        /// <summary>
        /// Jira status that maps to the PagerDuty `resolved` status.
        /// </summary>
        [Input("resolved")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingResolvedGetArgs>? Resolved { get; set; }

        /// <summary>
        /// Jira status that maps to the PagerDuty `triggered` status.
        /// </summary>
        [Input("triggered")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingTriggeredGetArgs>? Triggered { get; set; }

        public JiraCloudAccountMappingRuleConfigJiraStatusMappingGetArgs()
        {
        }
        public static new JiraCloudAccountMappingRuleConfigJiraStatusMappingGetArgs Empty => new JiraCloudAccountMappingRuleConfigJiraStatusMappingGetArgs();
    }
}

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
    public sealed class JiraCloudAccountMappingRuleConfigJiraCustomField
    {
        /// <summary>
        /// The PagerDuty incident field from which the value will be extracted (only applicable if `type` is `attribute`); one of `incident_number`, `incident_title`, `incident_description`, `incident_status`, `incident_created_at`, `incident_service`, `incident_escalation_policy`, `incident_impacted_services`, `incident_html_url`, `incident_assignees`, `incident_acknowledgers`, `incident_last_status_change_at`, `incident_last_status_change_by`, `incident_urgency` or `incident_priority`.
        /// </summary>
        public readonly string? SourceIncidentField;
        /// <summary>
        /// The unique identifier key of the Jira field that will be set.
        /// </summary>
        public readonly string TargetIssueField;
        /// <summary>
        /// The human-readable name of the Jira field.
        /// </summary>
        public readonly string TargetIssueFieldName;
        /// <summary>
        /// The type of the value that will be set; one of `attribute`, `const` or `jira_value`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The value to be set for the Jira field (only applicable if `type` is `const` or `jira_value`). It must be set as a JSON string.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private JiraCloudAccountMappingRuleConfigJiraCustomField(
            string? sourceIncidentField,

            string targetIssueField,

            string targetIssueFieldName,

            string type,

            string? value)
        {
            SourceIncidentField = sourceIncidentField;
            TargetIssueField = targetIssueField;
            TargetIssueFieldName = targetIssueFieldName;
            Type = type;
            Value = value;
        }
    }
}
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class JiraCloudAccountMappingRuleConfigJiraArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
        /// </summary>
        [Input("autocreateJql")]
        public Input<string>? AutocreateJql { get; set; }

        /// <summary>
        /// When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
        /// </summary>
        [Input("createIssueOnIncidentTrigger")]
        public Input<bool>? CreateIssueOnIncidentTrigger { get; set; }

        [Input("customFields")]
        private InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs>? _customFields;

        /// <summary>
        /// Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
        /// </summary>
        public InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs> CustomFields
        {
            get => _customFields ?? (_customFields = new InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs>());
            set => _customFields = value;
        }

        /// <summary>
        /// Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
        /// </summary>
        [Input("issueType")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs>? IssueType { get; set; }

        [Input("priorities")]
        private InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraPriorityArgs>? _priorities;

        /// <summary>
        /// Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
        /// </summary>
        public InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraPriorityArgs> Priorities
        {
            get => _priorities ?? (_priorities = new InputList<Inputs.JiraCloudAccountMappingRuleConfigJiraPriorityArgs>());
            set => _priorities = value;
        }

        /// <summary>
        /// [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
        /// </summary>
        [Input("project")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraProjectArgs>? Project { get; set; }

        /// <summary>
        /// Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
        /// </summary>
        [Input("statusMapping")]
        public Input<Inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs>? StatusMapping { get; set; }

        /// <summary>
        /// ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
        /// </summary>
        [Input("syncNotesUser")]
        public Input<string>? SyncNotesUser { get; set; }

        public JiraCloudAccountMappingRuleConfigJiraArgs()
        {
        }
        public static new JiraCloudAccountMappingRuleConfigJiraArgs Empty => new JiraCloudAccountMappingRuleConfigJiraArgs();
    }
}
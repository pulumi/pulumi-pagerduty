// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs;
import com.pulumi.pagerduty.inputs.JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs;
import com.pulumi.pagerduty.inputs.JiraCloudAccountMappingRuleConfigJiraPriorityArgs;
import com.pulumi.pagerduty.inputs.JiraCloudAccountMappingRuleConfigJiraProjectArgs;
import com.pulumi.pagerduty.inputs.JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JiraCloudAccountMappingRuleConfigJiraArgs extends com.pulumi.resources.ResourceArgs {

    public static final JiraCloudAccountMappingRuleConfigJiraArgs Empty = new JiraCloudAccountMappingRuleConfigJiraArgs();

    /**
     * JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
     * 
     */
    @Import(name="autocreateJql")
    private @Nullable Output<String> autocreateJql;

    /**
     * @return JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
     * 
     */
    public Optional<Output<String>> autocreateJql() {
        return Optional.ofNullable(this.autocreateJql);
    }

    /**
     * When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
     * 
     */
    @Import(name="createIssueOnIncidentTrigger")
    private @Nullable Output<Boolean> createIssueOnIncidentTrigger;

    /**
     * @return When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
     * 
     */
    public Optional<Output<Boolean>> createIssueOnIncidentTrigger() {
        return Optional.ofNullable(this.createIssueOnIncidentTrigger);
    }

    /**
     * Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
     * 
     */
    @Import(name="customFields")
    private @Nullable Output<List<JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs>> customFields;

    /**
     * @return Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
     * 
     */
    public Optional<Output<List<JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs>>> customFields() {
        return Optional.ofNullable(this.customFields);
    }

    /**
     * Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
     * 
     */
    @Import(name="issueType")
    private @Nullable Output<JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs> issueType;

    /**
     * @return Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
     * 
     */
    public Optional<Output<JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs>> issueType() {
        return Optional.ofNullable(this.issueType);
    }

    /**
     * Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
     * 
     */
    @Import(name="priorities")
    private @Nullable Output<List<JiraCloudAccountMappingRuleConfigJiraPriorityArgs>> priorities;

    /**
     * @return Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
     * 
     */
    public Optional<Output<List<JiraCloudAccountMappingRuleConfigJiraPriorityArgs>>> priorities() {
        return Optional.ofNullable(this.priorities);
    }

    /**
     * [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
     * 
     */
    @Import(name="project")
    private @Nullable Output<JiraCloudAccountMappingRuleConfigJiraProjectArgs> project;

    /**
     * @return [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
     * 
     */
    public Optional<Output<JiraCloudAccountMappingRuleConfigJiraProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
     * 
     */
    @Import(name="statusMapping")
    private @Nullable Output<JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs> statusMapping;

    /**
     * @return Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
     * 
     */
    public Optional<Output<JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs>> statusMapping() {
        return Optional.ofNullable(this.statusMapping);
    }

    /**
     * ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
     * 
     */
    @Import(name="syncNotesUser")
    private @Nullable Output<String> syncNotesUser;

    /**
     * @return ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
     * 
     */
    public Optional<Output<String>> syncNotesUser() {
        return Optional.ofNullable(this.syncNotesUser);
    }

    private JiraCloudAccountMappingRuleConfigJiraArgs() {}

    private JiraCloudAccountMappingRuleConfigJiraArgs(JiraCloudAccountMappingRuleConfigJiraArgs $) {
        this.autocreateJql = $.autocreateJql;
        this.createIssueOnIncidentTrigger = $.createIssueOnIncidentTrigger;
        this.customFields = $.customFields;
        this.issueType = $.issueType;
        this.priorities = $.priorities;
        this.project = $.project;
        this.statusMapping = $.statusMapping;
        this.syncNotesUser = $.syncNotesUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JiraCloudAccountMappingRuleConfigJiraArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JiraCloudAccountMappingRuleConfigJiraArgs $;

        public Builder() {
            $ = new JiraCloudAccountMappingRuleConfigJiraArgs();
        }

        public Builder(JiraCloudAccountMappingRuleConfigJiraArgs defaults) {
            $ = new JiraCloudAccountMappingRuleConfigJiraArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autocreateJql JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
         * 
         * @return builder
         * 
         */
        public Builder autocreateJql(@Nullable Output<String> autocreateJql) {
            $.autocreateJql = autocreateJql;
            return this;
        }

        /**
         * @param autocreateJql JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
         * 
         * @return builder
         * 
         */
        public Builder autocreateJql(String autocreateJql) {
            return autocreateJql(Output.of(autocreateJql));
        }

        /**
         * @param createIssueOnIncidentTrigger When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
         * 
         * @return builder
         * 
         */
        public Builder createIssueOnIncidentTrigger(@Nullable Output<Boolean> createIssueOnIncidentTrigger) {
            $.createIssueOnIncidentTrigger = createIssueOnIncidentTrigger;
            return this;
        }

        /**
         * @param createIssueOnIncidentTrigger When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
         * 
         * @return builder
         * 
         */
        public Builder createIssueOnIncidentTrigger(Boolean createIssueOnIncidentTrigger) {
            return createIssueOnIncidentTrigger(Output.of(createIssueOnIncidentTrigger));
        }

        /**
         * @param customFields Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
         * 
         * @return builder
         * 
         */
        public Builder customFields(@Nullable Output<List<JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs>> customFields) {
            $.customFields = customFields;
            return this;
        }

        /**
         * @param customFields Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
         * 
         * @return builder
         * 
         */
        public Builder customFields(List<JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs> customFields) {
            return customFields(Output.of(customFields));
        }

        /**
         * @param customFields Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
         * 
         * @return builder
         * 
         */
        public Builder customFields(JiraCloudAccountMappingRuleConfigJiraCustomFieldArgs... customFields) {
            return customFields(List.of(customFields));
        }

        /**
         * @param issueType Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
         * 
         * @return builder
         * 
         */
        public Builder issueType(@Nullable Output<JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs> issueType) {
            $.issueType = issueType;
            return this;
        }

        /**
         * @param issueType Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
         * 
         * @return builder
         * 
         */
        public Builder issueType(JiraCloudAccountMappingRuleConfigJiraIssueTypeArgs issueType) {
            return issueType(Output.of(issueType));
        }

        /**
         * @param priorities Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
         * 
         * @return builder
         * 
         */
        public Builder priorities(@Nullable Output<List<JiraCloudAccountMappingRuleConfigJiraPriorityArgs>> priorities) {
            $.priorities = priorities;
            return this;
        }

        /**
         * @param priorities Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
         * 
         * @return builder
         * 
         */
        public Builder priorities(List<JiraCloudAccountMappingRuleConfigJiraPriorityArgs> priorities) {
            return priorities(Output.of(priorities));
        }

        /**
         * @param priorities Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
         * 
         * @return builder
         * 
         */
        public Builder priorities(JiraCloudAccountMappingRuleConfigJiraPriorityArgs... priorities) {
            return priorities(List.of(priorities));
        }

        /**
         * @param project [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<JiraCloudAccountMappingRuleConfigJiraProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
         * 
         * @return builder
         * 
         */
        public Builder project(JiraCloudAccountMappingRuleConfigJiraProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param statusMapping Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
         * 
         * @return builder
         * 
         */
        public Builder statusMapping(@Nullable Output<JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs> statusMapping) {
            $.statusMapping = statusMapping;
            return this;
        }

        /**
         * @param statusMapping Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
         * 
         * @return builder
         * 
         */
        public Builder statusMapping(JiraCloudAccountMappingRuleConfigJiraStatusMappingArgs statusMapping) {
            return statusMapping(Output.of(statusMapping));
        }

        /**
         * @param syncNotesUser ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
         * 
         * @return builder
         * 
         */
        public Builder syncNotesUser(@Nullable Output<String> syncNotesUser) {
            $.syncNotesUser = syncNotesUser;
            return this;
        }

        /**
         * @param syncNotesUser ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
         * 
         * @return builder
         * 
         */
        public Builder syncNotesUser(String syncNotesUser) {
            return syncNotesUser(Output.of(syncNotesUser));
        }

        public JiraCloudAccountMappingRuleConfigJiraArgs build() {
            return $;
        }
    }

}
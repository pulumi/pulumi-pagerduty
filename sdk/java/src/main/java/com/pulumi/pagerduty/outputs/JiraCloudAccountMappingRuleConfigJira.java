// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJiraCustomField;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJiraIssueType;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJiraPriority;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJiraProject;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJiraStatusMapping;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JiraCloudAccountMappingRuleConfigJira {
    /**
     * @return JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
     * 
     */
    private @Nullable String autocreateJql;
    /**
     * @return When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
     * 
     */
    private @Nullable Boolean createIssueOnIncidentTrigger;
    /**
     * @return Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
     * 
     */
    private @Nullable List<JiraCloudAccountMappingRuleConfigJiraCustomField> customFields;
    /**
     * @return Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
     * 
     */
    private @Nullable JiraCloudAccountMappingRuleConfigJiraIssueType issueType;
    /**
     * @return Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
     * 
     */
    private @Nullable List<JiraCloudAccountMappingRuleConfigJiraPriority> priorities;
    /**
     * @return [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
     * 
     */
    private @Nullable JiraCloudAccountMappingRuleConfigJiraProject project;
    /**
     * @return Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
     * 
     */
    private @Nullable JiraCloudAccountMappingRuleConfigJiraStatusMapping statusMapping;
    /**
     * @return ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
     * 
     */
    private @Nullable String syncNotesUser;

    private JiraCloudAccountMappingRuleConfigJira() {}
    /**
     * @return JQL query to automatically create PagerDuty incidents when matching Jira issues are created. Leave empty to disable this feature.
     * 
     */
    public Optional<String> autocreateJql() {
        return Optional.ofNullable(this.autocreateJql);
    }
    /**
     * @return When enabled, automatically creates a Jira issue whenever a PagerDuty incident is triggered.
     * 
     */
    public Optional<Boolean> createIssueOnIncidentTrigger() {
        return Optional.ofNullable(this.createIssueOnIncidentTrigger);
    }
    /**
     * @return Defines how Jira fields are populated when a Jira Issue is created from a PagerDuty Incident.
     * 
     */
    public List<JiraCloudAccountMappingRuleConfigJiraCustomField> customFields() {
        return this.customFields == null ? List.of() : this.customFields;
    }
    /**
     * @return Specifies the Jira issue type to be created or synchronized with PagerDuty incidents.
     * 
     */
    public Optional<JiraCloudAccountMappingRuleConfigJiraIssueType> issueType() {
        return Optional.ofNullable(this.issueType);
    }
    /**
     * @return Maps PagerDuty incident priorities to Jira issue priorities for synchronization.
     * 
     */
    public List<JiraCloudAccountMappingRuleConfigJiraPriority> priorities() {
        return this.priorities == null ? List.of() : this.priorities;
    }
    /**
     * @return [Updating can cause a resource replacement] Defines the Jira project where issues will be created or synchronized.
     * 
     */
    public Optional<JiraCloudAccountMappingRuleConfigJiraProject> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return Maps PagerDuty incident statuses to corresponding Jira issue statuses for synchronization.
     * 
     */
    public Optional<JiraCloudAccountMappingRuleConfigJiraStatusMapping> statusMapping() {
        return Optional.ofNullable(this.statusMapping);
    }
    /**
     * @return ID of the PagerDuty user for syncing notes and comments between Jira issues and PagerDuty incidents. If not provided, note synchronization is disabled.
     * 
     */
    public Optional<String> syncNotesUser() {
        return Optional.ofNullable(this.syncNotesUser);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraCloudAccountMappingRuleConfigJira defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String autocreateJql;
        private @Nullable Boolean createIssueOnIncidentTrigger;
        private @Nullable List<JiraCloudAccountMappingRuleConfigJiraCustomField> customFields;
        private @Nullable JiraCloudAccountMappingRuleConfigJiraIssueType issueType;
        private @Nullable List<JiraCloudAccountMappingRuleConfigJiraPriority> priorities;
        private @Nullable JiraCloudAccountMappingRuleConfigJiraProject project;
        private @Nullable JiraCloudAccountMappingRuleConfigJiraStatusMapping statusMapping;
        private @Nullable String syncNotesUser;
        public Builder() {}
        public Builder(JiraCloudAccountMappingRuleConfigJira defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autocreateJql = defaults.autocreateJql;
    	      this.createIssueOnIncidentTrigger = defaults.createIssueOnIncidentTrigger;
    	      this.customFields = defaults.customFields;
    	      this.issueType = defaults.issueType;
    	      this.priorities = defaults.priorities;
    	      this.project = defaults.project;
    	      this.statusMapping = defaults.statusMapping;
    	      this.syncNotesUser = defaults.syncNotesUser;
        }

        @CustomType.Setter
        public Builder autocreateJql(@Nullable String autocreateJql) {

            this.autocreateJql = autocreateJql;
            return this;
        }
        @CustomType.Setter
        public Builder createIssueOnIncidentTrigger(@Nullable Boolean createIssueOnIncidentTrigger) {

            this.createIssueOnIncidentTrigger = createIssueOnIncidentTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder customFields(@Nullable List<JiraCloudAccountMappingRuleConfigJiraCustomField> customFields) {

            this.customFields = customFields;
            return this;
        }
        public Builder customFields(JiraCloudAccountMappingRuleConfigJiraCustomField... customFields) {
            return customFields(List.of(customFields));
        }
        @CustomType.Setter
        public Builder issueType(@Nullable JiraCloudAccountMappingRuleConfigJiraIssueType issueType) {

            this.issueType = issueType;
            return this;
        }
        @CustomType.Setter
        public Builder priorities(@Nullable List<JiraCloudAccountMappingRuleConfigJiraPriority> priorities) {

            this.priorities = priorities;
            return this;
        }
        public Builder priorities(JiraCloudAccountMappingRuleConfigJiraPriority... priorities) {
            return priorities(List.of(priorities));
        }
        @CustomType.Setter
        public Builder project(@Nullable JiraCloudAccountMappingRuleConfigJiraProject project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder statusMapping(@Nullable JiraCloudAccountMappingRuleConfigJiraStatusMapping statusMapping) {

            this.statusMapping = statusMapping;
            return this;
        }
        @CustomType.Setter
        public Builder syncNotesUser(@Nullable String syncNotesUser) {

            this.syncNotesUser = syncNotesUser;
            return this;
        }
        public JiraCloudAccountMappingRuleConfigJira build() {
            final var _resultValue = new JiraCloudAccountMappingRuleConfigJira();
            _resultValue.autocreateJql = autocreateJql;
            _resultValue.createIssueOnIncidentTrigger = createIssueOnIncidentTrigger;
            _resultValue.customFields = customFields;
            _resultValue.issueType = issueType;
            _resultValue.priorities = priorities;
            _resultValue.project = project;
            _resultValue.statusMapping = statusMapping;
            _resultValue.syncNotesUser = syncNotesUser;
            return _resultValue;
        }
    }
}

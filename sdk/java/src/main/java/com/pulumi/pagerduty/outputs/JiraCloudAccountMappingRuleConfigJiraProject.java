// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JiraCloudAccountMappingRuleConfigJiraProject {
    /**
     * @return Unique identifier for the Jira project.
     * 
     */
    private String id;
    /**
     * @return The short key name of the Jira project.
     * 
     */
    private String key;
    /**
     * @return The name of the Jira project.
     * 
     */
    private String name;

    private JiraCloudAccountMappingRuleConfigJiraProject() {}
    /**
     * @return Unique identifier for the Jira project.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The short key name of the Jira project.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The name of the Jira project.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraCloudAccountMappingRuleConfigJiraProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String key;
        private String name;
        public Builder() {}
        public Builder(JiraCloudAccountMappingRuleConfigJiraProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("JiraCloudAccountMappingRuleConfigJiraProject", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("JiraCloudAccountMappingRuleConfigJiraProject", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("JiraCloudAccountMappingRuleConfigJiraProject", "name");
            }
            this.name = name;
            return this;
        }
        public JiraCloudAccountMappingRuleConfigJiraProject build() {
            final var _resultValue = new JiraCloudAccountMappingRuleConfigJiraProject();
            _resultValue.id = id;
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}

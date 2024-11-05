// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.JiraCloudAccountMappingRuleConfigJira;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JiraCloudAccountMappingRuleConfig {
    /**
     * @return Synchronization settings.
     * 
     */
    private @Nullable JiraCloudAccountMappingRuleConfigJira jira;
    /**
     * @return [Updating can cause a resource replacement] The ID of the linked PagerDuty service.
     * 
     */
    private String service;

    private JiraCloudAccountMappingRuleConfig() {}
    /**
     * @return Synchronization settings.
     * 
     */
    public Optional<JiraCloudAccountMappingRuleConfigJira> jira() {
        return Optional.ofNullable(this.jira);
    }
    /**
     * @return [Updating can cause a resource replacement] The ID of the linked PagerDuty service.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraCloudAccountMappingRuleConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JiraCloudAccountMappingRuleConfigJira jira;
        private String service;
        public Builder() {}
        public Builder(JiraCloudAccountMappingRuleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jira = defaults.jira;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder jira(@Nullable JiraCloudAccountMappingRuleConfigJira jira) {

            this.jira = jira;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("JiraCloudAccountMappingRuleConfig", "service");
            }
            this.service = service;
            return this;
        }
        public JiraCloudAccountMappingRuleConfig build() {
            final var _resultValue = new JiraCloudAccountMappingRuleConfig();
            _resultValue.jira = jira;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}

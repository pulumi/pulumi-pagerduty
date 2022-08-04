// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceIntegrationResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The integration key for the integration. This can be used to configure alerts.
     * 
     */
    private final String integrationKey;
    private final String integrationSummary;
    private final String serviceName;

    @CustomType.Constructor
    private GetServiceIntegrationResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("integrationKey") String integrationKey,
        @CustomType.Parameter("integrationSummary") String integrationSummary,
        @CustomType.Parameter("serviceName") String serviceName) {
        this.id = id;
        this.integrationKey = integrationKey;
        this.integrationSummary = integrationSummary;
        this.serviceName = serviceName;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The integration key for the integration. This can be used to configure alerts.
     * 
     */
    public String integrationKey() {
        return this.integrationKey;
    }
    public String integrationSummary() {
        return this.integrationSummary;
    }
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String integrationKey;
        private String integrationSummary;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceIntegrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.integrationKey = defaults.integrationKey;
    	      this.integrationSummary = defaults.integrationSummary;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder integrationKey(String integrationKey) {
            this.integrationKey = Objects.requireNonNull(integrationKey);
            return this;
        }
        public Builder integrationSummary(String integrationSummary) {
            this.integrationSummary = Objects.requireNonNull(integrationSummary);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetServiceIntegrationResult build() {
            return new GetServiceIntegrationResult(id, integrationKey, integrationSummary, serviceName);
        }
    }
}

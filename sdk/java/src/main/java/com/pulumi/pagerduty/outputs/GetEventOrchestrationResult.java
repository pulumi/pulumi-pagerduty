// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.GetEventOrchestrationIntegration;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEventOrchestrationResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return An integration for the Event Orchestration.
     * 
     */
    private List<GetEventOrchestrationIntegration> integrations;
    /**
     * @return The name of the found Event Orchestration.
     * 
     */
    private String name;

    private GetEventOrchestrationResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An integration for the Event Orchestration.
     * 
     */
    public List<GetEventOrchestrationIntegration> integrations() {
        return this.integrations;
    }
    /**
     * @return The name of the found Event Orchestration.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventOrchestrationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetEventOrchestrationIntegration> integrations;
        private String name;
        public Builder() {}
        public Builder(GetEventOrchestrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.integrations = defaults.integrations;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder integrations(List<GetEventOrchestrationIntegration> integrations) {
            this.integrations = Objects.requireNonNull(integrations);
            return this;
        }
        public Builder integrations(GetEventOrchestrationIntegration... integrations) {
            return integrations(List.of(integrations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetEventOrchestrationResult build() {
            final var o = new GetEventOrchestrationResult();
            o.id = id;
            o.integrations = integrations;
            o.name = name;
            return o;
        }
    }
}
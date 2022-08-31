// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationIntegrationParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationIntegration {
    /**
     * @return ID of the integration
     * * `parameters`
     * 
     */
    private @Nullable String id;
    private @Nullable List<EventOrchestrationIntegrationParameter> parameters;

    private EventOrchestrationIntegration() {}
    /**
     * @return ID of the integration
     * * `parameters`
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public List<EventOrchestrationIntegrationParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationIntegration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<EventOrchestrationIntegrationParameter> parameters;
        public Builder() {}
        public Builder(EventOrchestrationIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<EventOrchestrationIntegrationParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(EventOrchestrationIntegrationParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public EventOrchestrationIntegration build() {
            final var o = new EventOrchestrationIntegration();
            o.id = id;
            o.parameters = parameters;
            return o;
        }
    }
}
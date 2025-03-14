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
     * 
     */
    private @Nullable String id;
    private @Nullable String label;
    /**
     * @return A single-item list containing a parameter object describing the integration
     * 
     */
    private @Nullable List<EventOrchestrationIntegrationParameter> parameters;

    private EventOrchestrationIntegration() {}
    /**
     * @return ID of the integration
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return A single-item list containing a parameter object describing the integration
     * 
     */
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
        private @Nullable String label;
        private @Nullable List<EventOrchestrationIntegrationParameter> parameters;
        public Builder() {}
        public Builder(EventOrchestrationIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
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
            final var _resultValue = new EventOrchestrationIntegration();
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}

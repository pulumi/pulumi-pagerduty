// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationIntegrationParameter {
    /**
     * @return Routing key that routes to this Orchestration.
     * 
     */
    private @Nullable String routingKey;
    /**
     * @return Type of the routing key. `global` is the default type.
     * 
     */
    private @Nullable String type;

    private EventOrchestrationIntegrationParameter() {}
    /**
     * @return Routing key that routes to this Orchestration.
     * 
     */
    public Optional<String> routingKey() {
        return Optional.ofNullable(this.routingKey);
    }
    /**
     * @return Type of the routing key. `global` is the default type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationIntegrationParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String routingKey;
        private @Nullable String type;
        public Builder() {}
        public Builder(EventOrchestrationIntegrationParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingKey = defaults.routingKey;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder routingKey(@Nullable String routingKey) {

            this.routingKey = routingKey;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public EventOrchestrationIntegrationParameter build() {
            final var _resultValue = new EventOrchestrationIntegrationParameter();
            _resultValue.routingKey = routingKey;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

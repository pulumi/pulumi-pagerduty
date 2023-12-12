// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEventOrchestrationIntegrationParameter {
    /**
     * @return Routing key that routes to this Orchestration.
     * 
     */
    private String routingKey;
    /**
     * @return Type of the routing key. `global` is the default type.
     * 
     */
    private String type;

    private GetEventOrchestrationIntegrationParameter() {}
    /**
     * @return Routing key that routes to this Orchestration.
     * 
     */
    public String routingKey() {
        return this.routingKey;
    }
    /**
     * @return Type of the routing key. `global` is the default type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventOrchestrationIntegrationParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String routingKey;
        private String type;
        public Builder() {}
        public Builder(GetEventOrchestrationIntegrationParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingKey = defaults.routingKey;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder routingKey(String routingKey) {
            this.routingKey = Objects.requireNonNull(routingKey);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetEventOrchestrationIntegrationParameter build() {
            final var _resultValue = new GetEventOrchestrationIntegrationParameter();
            _resultValue.routingKey = routingKey;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

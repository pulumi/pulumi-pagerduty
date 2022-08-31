// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationRouterCatchAllActions {
    /**
     * @return The ID of the target Service for the resulting alert.
     * 
     */
    private String routeTo;

    private EventOrchestrationRouterCatchAllActions() {}
    /**
     * @return The ID of the target Service for the resulting alert.
     * 
     */
    public String routeTo() {
        return this.routeTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationRouterCatchAllActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String routeTo;
        public Builder() {}
        public Builder(EventOrchestrationRouterCatchAllActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTo = defaults.routeTo;
        }

        @CustomType.Setter
        public Builder routeTo(String routeTo) {
            this.routeTo = Objects.requireNonNull(routeTo);
            return this;
        }
        public EventOrchestrationRouterCatchAllActions build() {
            final var o = new EventOrchestrationRouterCatchAllActions();
            o.routeTo = routeTo;
            return o;
        }
    }
}
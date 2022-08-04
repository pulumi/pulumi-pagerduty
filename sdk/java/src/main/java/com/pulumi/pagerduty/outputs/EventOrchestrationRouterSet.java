// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationRouterSetRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationRouterSet {
    /**
     * @return ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    private final String id;
    private final @Nullable List<EventOrchestrationRouterSetRule> rules;

    @CustomType.Constructor
    private EventOrchestrationRouterSet(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rules") @Nullable List<EventOrchestrationRouterSetRule> rules) {
        this.id = id;
        this.rules = rules;
    }

    /**
     * @return ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    public String id() {
        return this.id;
    }
    public List<EventOrchestrationRouterSetRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationRouterSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable List<EventOrchestrationRouterSetRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(EventOrchestrationRouterSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.rules = defaults.rules;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rules(@Nullable List<EventOrchestrationRouterSetRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(EventOrchestrationRouterSetRule... rules) {
            return rules(List.of(rules));
        }        public EventOrchestrationRouterSet build() {
            return new EventOrchestrationRouterSet(id, rules);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationServiceSetRuleActionsAutomationActionHeader {
    /**
     * @return Name to identify the parameter
     * 
     */
    private String key;
    /**
     * @return The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    private String value;

    private EventOrchestrationServiceSetRuleActionsAutomationActionHeader() {}
    /**
     * @return Name to identify the parameter
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationServiceSetRuleActionsAutomationActionHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(EventOrchestrationServiceSetRuleActionsAutomationActionHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public EventOrchestrationServiceSetRuleActionsAutomationActionHeader build() {
            final var o = new EventOrchestrationServiceSetRuleActionsAutomationActionHeader();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}

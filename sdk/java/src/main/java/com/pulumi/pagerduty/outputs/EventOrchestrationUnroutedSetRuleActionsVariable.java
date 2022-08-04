// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationUnroutedSetRuleActionsVariable {
    /**
     * @return The name of the variable
     * 
     */
    private final String name;
    /**
     * @return Path to a field in an event, in dot-notation. This supports both [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data.
     * 
     */
    private final String path;
    /**
     * @return Only `regex` is supported
     * 
     */
    private final String type;
    /**
     * @return The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EventOrchestrationUnroutedSetRuleActionsVariable(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.path = path;
        this.type = type;
        this.value = value;
    }

    /**
     * @return The name of the variable
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Path to a field in an event, in dot-notation. This supports both [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Only `regex` is supported
     * 
     */
    public String type() {
        return this.type;
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

    public static Builder builder(EventOrchestrationUnroutedSetRuleActionsVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventOrchestrationUnroutedSetRuleActionsVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EventOrchestrationUnroutedSetRuleActionsVariable build() {
            return new EventOrchestrationUnroutedSetRuleActionsVariable(name, path, type, value);
        }
    }
}

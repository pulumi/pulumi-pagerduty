// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationGlobalCatchAllActionsVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalCatchAllActionsVariableArgs Empty = new EventOrchestrationGlobalCatchAllActionsVariableArgs();

    /**
     * The name of the variable
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the variable
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * Only `regex` is supported
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Only `regex` is supported
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EventOrchestrationGlobalCatchAllActionsVariableArgs() {}

    private EventOrchestrationGlobalCatchAllActionsVariableArgs(EventOrchestrationGlobalCatchAllActionsVariableArgs $) {
        this.name = $.name;
        this.path = $.path;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalCatchAllActionsVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalCatchAllActionsVariableArgs $;

        public Builder() {
            $ = new EventOrchestrationGlobalCatchAllActionsVariableArgs();
        }

        public Builder(EventOrchestrationGlobalCatchAllActionsVariableArgs defaults) {
            $ = new EventOrchestrationGlobalCatchAllActionsVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param type Only `regex` is supported
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Only `regex` is supported
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventOrchestrationGlobalCatchAllActionsVariableArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

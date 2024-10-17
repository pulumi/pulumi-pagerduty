// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs Empty = new EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs();

    /**
     * Indicates whether the extracted value from the source is a service&#39;s name or ID. Allowed values are: `service_name`, `service_id`
     * 
     * If an event has a value at the specified `source`, and if the `regex` successfully matches the value, and if the matching portion is valid Service ID or Name, then the event will be routed to that service. Otherwise the event will be checked against any subsequent router rules.
     * 
     */
    @Import(name="lookupBy", required=true)
    private Output<String> lookupBy;

    /**
     * @return Indicates whether the extracted value from the source is a service&#39;s name or ID. Allowed values are: `service_name`, `service_id`
     * 
     * If an event has a value at the specified `source`, and if the `regex` successfully matches the value, and if the matching portion is valid Service ID or Name, then the event will be routed to that service. Otherwise the event will be checked against any subsequent router rules.
     * 
     */
    public Output<String> lookupBy() {
        return this.lookupBy;
    }

    /**
     * The regular expression, used to extract a value from the source field. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    @Import(name="regex", required=true)
    private Output<String> regex;

    /**
     * @return The regular expression, used to extract a value from the source field. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
     * 
     */
    public Output<String> regex() {
        return this.regex;
    }

    /**
     * The path to a field in an event.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The path to a field in an event.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    private EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs() {}

    private EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs(EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs $) {
        this.lookupBy = $.lookupBy;
        this.regex = $.regex;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs();
        }

        public Builder(EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs defaults) {
            $ = new EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lookupBy Indicates whether the extracted value from the source is a service&#39;s name or ID. Allowed values are: `service_name`, `service_id`
         * 
         * If an event has a value at the specified `source`, and if the `regex` successfully matches the value, and if the matching portion is valid Service ID or Name, then the event will be routed to that service. Otherwise the event will be checked against any subsequent router rules.
         * 
         * @return builder
         * 
         */
        public Builder lookupBy(Output<String> lookupBy) {
            $.lookupBy = lookupBy;
            return this;
        }

        /**
         * @param lookupBy Indicates whether the extracted value from the source is a service&#39;s name or ID. Allowed values are: `service_name`, `service_id`
         * 
         * If an event has a value at the specified `source`, and if the `regex` successfully matches the value, and if the matching portion is valid Service ID or Name, then the event will be routed to that service. Otherwise the event will be checked against any subsequent router rules.
         * 
         * @return builder
         * 
         */
        public Builder lookupBy(String lookupBy) {
            return lookupBy(Output.of(lookupBy));
        }

        /**
         * @param regex The regular expression, used to extract a value from the source field. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder regex(Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex The regular expression, used to extract a value from the source field. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param source The path to a field in an event.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The path to a field in an event.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs build() {
            if ($.lookupBy == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs", "lookupBy");
            }
            if ($.regex == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs", "regex");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs", "source");
            }
            return $;
        }
    }

}
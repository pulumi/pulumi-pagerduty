// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.EventOrchestrationRouterSetRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationRouterSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationRouterSetArgs Empty = new EventOrchestrationRouterSetArgs();

    /**
     * ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="rules")
    private @Nullable Output<List<EventOrchestrationRouterSetRuleArgs>> rules;

    public Optional<Output<List<EventOrchestrationRouterSetRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private EventOrchestrationRouterSetArgs() {}

    private EventOrchestrationRouterSetArgs(EventOrchestrationRouterSetArgs $) {
        this.id = $.id;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationRouterSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationRouterSetArgs $;

        public Builder() {
            $ = new EventOrchestrationRouterSetArgs();
        }

        public Builder(EventOrchestrationRouterSetArgs defaults) {
            $ = new EventOrchestrationRouterSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the `start` set. Router supports only one set and it&#39;s id has to be `start`
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder rules(@Nullable Output<List<EventOrchestrationRouterSetRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<EventOrchestrationRouterSetRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(EventOrchestrationRouterSetRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public EventOrchestrationRouterSetArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationRouterSetArgs", "id");
            }
            return $;
        }
    }

}

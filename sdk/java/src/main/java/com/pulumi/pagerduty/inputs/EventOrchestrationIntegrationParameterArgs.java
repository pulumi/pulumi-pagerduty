// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationIntegrationParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationIntegrationParameterArgs Empty = new EventOrchestrationIntegrationParameterArgs();

    /**
     * Routing key that routes to this Orchestration.
     * 
     */
    @Import(name="routingKey")
    private @Nullable Output<String> routingKey;

    /**
     * @return Routing key that routes to this Orchestration.
     * 
     */
    public Optional<Output<String>> routingKey() {
        return Optional.ofNullable(this.routingKey);
    }

    /**
     * Type of the routing key. `global` is the default type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the routing key. `global` is the default type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private EventOrchestrationIntegrationParameterArgs() {}

    private EventOrchestrationIntegrationParameterArgs(EventOrchestrationIntegrationParameterArgs $) {
        this.routingKey = $.routingKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationIntegrationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationIntegrationParameterArgs $;

        public Builder() {
            $ = new EventOrchestrationIntegrationParameterArgs();
        }

        public Builder(EventOrchestrationIntegrationParameterArgs defaults) {
            $ = new EventOrchestrationIntegrationParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routingKey Routing key that routes to this Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder routingKey(@Nullable Output<String> routingKey) {
            $.routingKey = routingKey;
            return this;
        }

        /**
         * @param routingKey Routing key that routes to this Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder routingKey(String routingKey) {
            return routingKey(Output.of(routingKey));
        }

        /**
         * @param type Type of the routing key. `global` is the default type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the routing key. `global` is the default type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EventOrchestrationIntegrationParameterArgs build() {
            return $;
        }
    }

}
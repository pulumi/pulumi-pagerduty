// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.ServiceEventRuleVariableParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceEventRuleVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleVariableArgs Empty = new ServiceEventRuleVariableArgs();

    /**
     * The name of the variable.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the variable.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parameters for performing the operation to populate the variable.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ServiceEventRuleVariableParameterArgs>> parameters;

    /**
     * @return The parameters for performing the operation to populate the variable.
     * 
     */
    public Optional<Output<List<ServiceEventRuleVariableParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Type of operation to populate the variable. Usually `regex`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of operation to populate the variable. Usually `regex`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceEventRuleVariableArgs() {}

    private ServiceEventRuleVariableArgs(ServiceEventRuleVariableArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleVariableArgs $;

        public Builder() {
            $ = new ServiceEventRuleVariableArgs();
        }

        public Builder(ServiceEventRuleVariableArgs defaults) {
            $ = new ServiceEventRuleVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The parameters for performing the operation to populate the variable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<ServiceEventRuleVariableParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters for performing the operation to populate the variable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ServiceEventRuleVariableParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The parameters for performing the operation to populate the variable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(ServiceEventRuleVariableParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param type Type of operation to populate the variable. Usually `regex`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of operation to populate the variable. Usually `regex`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceEventRuleVariableArgs build() {
            return $;
        }
    }

}

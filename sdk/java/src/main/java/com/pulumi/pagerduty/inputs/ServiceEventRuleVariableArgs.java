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

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="parameters")
    private @Nullable Output<List<ServiceEventRuleVariableParameterArgs>> parameters;

    public Optional<Output<List<ServiceEventRuleVariableParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

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

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<List<ServiceEventRuleVariableParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<ServiceEventRuleVariableParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(ServiceEventRuleVariableParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceEventRuleVariableArgs build() {
            return $;
        }
    }

}

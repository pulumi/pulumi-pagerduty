// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.RulesetRuleVariableParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleVariableArgs Empty = new RulesetRuleVariableArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="parameters")
    private @Nullable Output<List<RulesetRuleVariableParameterArgs>> parameters;

    public Optional<Output<List<RulesetRuleVariableParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RulesetRuleVariableArgs() {}

    private RulesetRuleVariableArgs(RulesetRuleVariableArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleVariableArgs $;

        public Builder() {
            $ = new RulesetRuleVariableArgs();
        }

        public Builder(RulesetRuleVariableArgs defaults) {
            $ = new RulesetRuleVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<List<RulesetRuleVariableParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<RulesetRuleVariableParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(RulesetRuleVariableParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RulesetRuleVariableArgs build() {
            return $;
        }
    }

}

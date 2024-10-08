// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceEventRuleVariableParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleVariableParameterArgs Empty = new ServiceEventRuleVariableParameterArgs();

    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceEventRuleVariableParameterArgs() {}

    private ServiceEventRuleVariableParameterArgs(ServiceEventRuleVariableParameterArgs $) {
        this.path = $.path;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleVariableParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleVariableParameterArgs $;

        public Builder() {
            $ = new ServiceEventRuleVariableParameterArgs();
        }

        public Builder(ServiceEventRuleVariableParameterArgs defaults) {
            $ = new ServiceEventRuleVariableParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceEventRuleVariableParameterArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceEventRuleConditionsSubconditionParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleConditionsSubconditionParameterArgs Empty = new ServiceEventRuleConditionsSubconditionParameterArgs();

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

    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceEventRuleConditionsSubconditionParameterArgs() {}

    private ServiceEventRuleConditionsSubconditionParameterArgs(ServiceEventRuleConditionsSubconditionParameterArgs $) {
        this.path = $.path;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleConditionsSubconditionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleConditionsSubconditionParameterArgs $;

        public Builder() {
            $ = new ServiceEventRuleConditionsSubconditionParameterArgs();
        }

        public Builder(ServiceEventRuleConditionsSubconditionParameterArgs defaults) {
            $ = new ServiceEventRuleConditionsSubconditionParameterArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceEventRuleConditionsSubconditionParameterArgs build() {
            return $;
        }
    }

}

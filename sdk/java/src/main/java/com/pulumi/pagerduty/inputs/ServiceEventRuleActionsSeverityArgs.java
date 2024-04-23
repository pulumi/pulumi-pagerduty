// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceEventRuleActionsSeverityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleActionsSeverityArgs Empty = new ServiceEventRuleActionsSeverityArgs();

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceEventRuleActionsSeverityArgs() {}

    private ServiceEventRuleActionsSeverityArgs(ServiceEventRuleActionsSeverityArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleActionsSeverityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleActionsSeverityArgs $;

        public Builder() {
            $ = new ServiceEventRuleActionsSeverityArgs();
        }

        public Builder(ServiceEventRuleActionsSeverityArgs defaults) {
            $ = new ServiceEventRuleActionsSeverityArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceEventRuleActionsSeverityArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceScheduledActionAtArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceScheduledActionAtArgs Empty = new ServiceScheduledActionAtArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceScheduledActionAtArgs() {}

    private ServiceScheduledActionAtArgs(ServiceScheduledActionAtArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceScheduledActionAtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceScheduledActionAtArgs $;

        public Builder() {
            $ = new ServiceScheduledActionAtArgs();
        }

        public Builder(ServiceScheduledActionAtArgs defaults) {
            $ = new ServiceScheduledActionAtArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceScheduledActionAtArgs build() {
            return $;
        }
    }

}

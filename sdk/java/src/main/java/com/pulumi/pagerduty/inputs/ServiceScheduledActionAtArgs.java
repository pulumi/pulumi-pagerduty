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

    /**
     * Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of time specification. Currently, this must be set to `named_time`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of time specification. Currently, this must be set to `named_time`.
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

        /**
         * @param name Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of time specification. Currently, this must be set to `named_time`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of time specification. Currently, this must be set to `named_time`.
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
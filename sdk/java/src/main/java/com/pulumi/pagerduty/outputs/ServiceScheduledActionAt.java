// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceScheduledActionAt {
    /**
     * @return Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The type of time specification. Currently, this must be set to `named_time`.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ServiceScheduledActionAt(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of time specification. Currently, this must be set to `named_time`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceScheduledActionAt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceScheduledActionAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ServiceScheduledActionAt build() {
            return new ServiceScheduledActionAt(name, type);
        }
    }
}

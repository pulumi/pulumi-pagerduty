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
    private @Nullable String name;
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    private @Nullable String type;

    private ServiceScheduledActionAt() {}
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceScheduledActionAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ServiceScheduledActionAt build() {
            final var _resultValue = new ServiceScheduledActionAt();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

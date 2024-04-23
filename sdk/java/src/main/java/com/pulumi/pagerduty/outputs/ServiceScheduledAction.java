// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.ServiceScheduledActionAt;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceScheduledAction {
    private @Nullable List<ServiceScheduledActionAt> ats;
    private @Nullable String toUrgency;
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    private @Nullable String type;

    private ServiceScheduledAction() {}
    public List<ServiceScheduledActionAt> ats() {
        return this.ats == null ? List.of() : this.ats;
    }
    public Optional<String> toUrgency() {
        return Optional.ofNullable(this.toUrgency);
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

    public static Builder builder(ServiceScheduledAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceScheduledActionAt> ats;
        private @Nullable String toUrgency;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceScheduledAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ats = defaults.ats;
    	      this.toUrgency = defaults.toUrgency;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder ats(@Nullable List<ServiceScheduledActionAt> ats) {

            this.ats = ats;
            return this;
        }
        public Builder ats(ServiceScheduledActionAt... ats) {
            return ats(List.of(ats));
        }
        @CustomType.Setter
        public Builder toUrgency(@Nullable String toUrgency) {

            this.toUrgency = toUrgency;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ServiceScheduledAction build() {
            final var _resultValue = new ServiceScheduledAction();
            _resultValue.ats = ats;
            _resultValue.toUrgency = toUrgency;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

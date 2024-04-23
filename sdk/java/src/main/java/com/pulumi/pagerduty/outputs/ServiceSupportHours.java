// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSupportHours {
    private @Nullable List<Integer> daysOfWeeks;
    private @Nullable String endTime;
    private @Nullable String startTime;
    private @Nullable String timeZone;
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    private @Nullable String type;

    private ServiceSupportHours() {}
    public List<Integer> daysOfWeeks() {
        return this.daysOfWeeks == null ? List.of() : this.daysOfWeeks;
    }
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
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

    public static Builder builder(ServiceSupportHours defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> daysOfWeeks;
        private @Nullable String endTime;
        private @Nullable String startTime;
        private @Nullable String timeZone;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceSupportHours defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfWeeks = defaults.daysOfWeeks;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder daysOfWeeks(@Nullable List<Integer> daysOfWeeks) {

            this.daysOfWeeks = daysOfWeeks;
            return this;
        }
        public Builder daysOfWeeks(Integer... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {

            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {

            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(@Nullable String timeZone) {

            this.timeZone = timeZone;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ServiceSupportHours build() {
            final var _resultValue = new ServiceSupportHours();
            _resultValue.daysOfWeeks = daysOfWeeks;
            _resultValue.endTime = endTime;
            _resultValue.startTime = startTime;
            _resultValue.timeZone = timeZone;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

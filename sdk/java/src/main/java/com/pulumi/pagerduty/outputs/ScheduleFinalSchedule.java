// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleFinalSchedule {
    /**
     * @return The name of the schedule.
     * 
     */
    private @Nullable String name;
    private @Nullable String renderedCoveragePercentage;

    private ScheduleFinalSchedule() {}
    /**
     * @return The name of the schedule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> renderedCoveragePercentage() {
        return Optional.ofNullable(this.renderedCoveragePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleFinalSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String renderedCoveragePercentage;
        public Builder() {}
        public Builder(ScheduleFinalSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.renderedCoveragePercentage = defaults.renderedCoveragePercentage;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder renderedCoveragePercentage(@Nullable String renderedCoveragePercentage) {

            this.renderedCoveragePercentage = renderedCoveragePercentage;
            return this;
        }
        public ScheduleFinalSchedule build() {
            final var _resultValue = new ScheduleFinalSchedule();
            _resultValue.name = name;
            _resultValue.renderedCoveragePercentage = renderedCoveragePercentage;
            return _resultValue;
        }
    }
}

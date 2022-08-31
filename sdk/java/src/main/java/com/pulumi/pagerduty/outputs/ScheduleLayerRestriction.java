// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleLayerRestriction {
    /**
     * @return The duration of the restriction in `seconds`.
     * 
     */
    private Integer durationSeconds;
    /**
     * @return Number of the day when restriction starts. From 1 to 7 where 1 is Monday and 7 is Sunday.
     * 
     */
    private @Nullable Integer startDayOfWeek;
    /**
     * @return The start time in `HH:mm:ss` format.
     * 
     */
    private String startTimeOfDay;
    /**
     * @return Can be `daily_restriction` or `weekly_restriction`.
     * 
     */
    private String type;

    private ScheduleLayerRestriction() {}
    /**
     * @return The duration of the restriction in `seconds`.
     * 
     */
    public Integer durationSeconds() {
        return this.durationSeconds;
    }
    /**
     * @return Number of the day when restriction starts. From 1 to 7 where 1 is Monday and 7 is Sunday.
     * 
     */
    public Optional<Integer> startDayOfWeek() {
        return Optional.ofNullable(this.startDayOfWeek);
    }
    /**
     * @return The start time in `HH:mm:ss` format.
     * 
     */
    public String startTimeOfDay() {
        return this.startTimeOfDay;
    }
    /**
     * @return Can be `daily_restriction` or `weekly_restriction`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleLayerRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer durationSeconds;
        private @Nullable Integer startDayOfWeek;
        private String startTimeOfDay;
        private String type;
        public Builder() {}
        public Builder(ScheduleLayerRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.startDayOfWeek = defaults.startDayOfWeek;
    	      this.startTimeOfDay = defaults.startTimeOfDay;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder durationSeconds(Integer durationSeconds) {
            this.durationSeconds = Objects.requireNonNull(durationSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder startDayOfWeek(@Nullable Integer startDayOfWeek) {
            this.startDayOfWeek = startDayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder startTimeOfDay(String startTimeOfDay) {
            this.startTimeOfDay = Objects.requireNonNull(startTimeOfDay);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ScheduleLayerRestriction build() {
            final var o = new ScheduleLayerRestriction();
            o.durationSeconds = durationSeconds;
            o.startDayOfWeek = startDayOfWeek;
            o.startTimeOfDay = startTimeOfDay;
            o.type = type;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSupportHoursArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSupportHoursArgs Empty = new ServiceSupportHoursArgs();

    /**
     * Array of days of week as integers. `1` to `7`, `1` being
     * Monday and `7` being Sunday.
     * 
     */
    @Import(name="daysOfWeeks")
    private @Nullable Output<List<Integer>> daysOfWeeks;

    /**
     * @return Array of days of week as integers. `1` to `7`, `1` being
     * Monday and `7` being Sunday.
     * 
     */
    public Optional<Output<List<Integer>>> daysOfWeeks() {
        return Optional.ofNullable(this.daysOfWeeks);
    }

    /**
     * The support hours&#39; ending time of day.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The support hours&#39; ending time of day.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The support hours&#39; starting time of day.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The support hours&#39; starting time of day.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The time zone for the support hours.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone for the support hours.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * The type of support hours. Can be `fixed_time_per_day`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of support hours. Can be `fixed_time_per_day`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceSupportHoursArgs() {}

    private ServiceSupportHoursArgs(ServiceSupportHoursArgs $) {
        this.daysOfWeeks = $.daysOfWeeks;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSupportHoursArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSupportHoursArgs $;

        public Builder() {
            $ = new ServiceSupportHoursArgs();
        }

        public Builder(ServiceSupportHoursArgs defaults) {
            $ = new ServiceSupportHoursArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfWeeks Array of days of week as integers. `1` to `7`, `1` being
         * Monday and `7` being Sunday.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(@Nullable Output<List<Integer>> daysOfWeeks) {
            $.daysOfWeeks = daysOfWeeks;
            return this;
        }

        /**
         * @param daysOfWeeks Array of days of week as integers. `1` to `7`, `1` being
         * Monday and `7` being Sunday.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(List<Integer> daysOfWeeks) {
            return daysOfWeeks(Output.of(daysOfWeeks));
        }

        /**
         * @param daysOfWeeks Array of days of week as integers. `1` to `7`, `1` being
         * Monday and `7` being Sunday.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(Integer... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }

        /**
         * @param endTime The support hours&#39; ending time of day.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The support hours&#39; ending time of day.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime The support hours&#39; starting time of day.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The support hours&#39; starting time of day.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone The time zone for the support hours.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone for the support hours.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param type The type of support hours. Can be `fixed_time_per_day`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of support hours. Can be `fixed_time_per_day`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceSupportHoursArgs build() {
            return $;
        }
    }

}

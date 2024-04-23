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


public final class ServiceEventRuleTimeFrameScheduledWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEventRuleTimeFrameScheduledWeeklyArgs Empty = new ServiceEventRuleTimeFrameScheduledWeeklyArgs();

    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="startTime")
    private @Nullable Output<Integer> startTime;

    public Optional<Output<Integer>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    @Import(name="weekdays")
    private @Nullable Output<List<Integer>> weekdays;

    public Optional<Output<List<Integer>>> weekdays() {
        return Optional.ofNullable(this.weekdays);
    }

    private ServiceEventRuleTimeFrameScheduledWeeklyArgs() {}

    private ServiceEventRuleTimeFrameScheduledWeeklyArgs(ServiceEventRuleTimeFrameScheduledWeeklyArgs $) {
        this.duration = $.duration;
        this.startTime = $.startTime;
        this.timezone = $.timezone;
        this.weekdays = $.weekdays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEventRuleTimeFrameScheduledWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEventRuleTimeFrameScheduledWeeklyArgs $;

        public Builder() {
            $ = new ServiceEventRuleTimeFrameScheduledWeeklyArgs();
        }

        public Builder(ServiceEventRuleTimeFrameScheduledWeeklyArgs defaults) {
            $ = new ServiceEventRuleTimeFrameScheduledWeeklyArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        public Builder startTime(@Nullable Output<Integer> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(Integer startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public Builder weekdays(@Nullable Output<List<Integer>> weekdays) {
            $.weekdays = weekdays;
            return this;
        }

        public Builder weekdays(List<Integer> weekdays) {
            return weekdays(Output.of(weekdays));
        }

        public Builder weekdays(Integer... weekdays) {
            return weekdays(List.of(weekdays));
        }

        public ServiceEventRuleTimeFrameScheduledWeeklyArgs build() {
            return $;
        }
    }

}

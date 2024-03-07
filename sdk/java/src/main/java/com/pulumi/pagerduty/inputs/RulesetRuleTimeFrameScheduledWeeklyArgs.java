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


public final class RulesetRuleTimeFrameScheduledWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleTimeFrameScheduledWeeklyArgs Empty = new RulesetRuleTimeFrameScheduledWeeklyArgs();

    /**
     * Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
     * 
     */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<Integer> startTime;

    /**
     * @return A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
     * 
     */
    public Optional<Output<Integer>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     * 
     */
    @Import(name="weekdays")
    private @Nullable Output<List<Integer>> weekdays;

    /**
     * @return An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     * 
     */
    public Optional<Output<List<Integer>>> weekdays() {
        return Optional.ofNullable(this.weekdays);
    }

    private RulesetRuleTimeFrameScheduledWeeklyArgs() {}

    private RulesetRuleTimeFrameScheduledWeeklyArgs(RulesetRuleTimeFrameScheduledWeeklyArgs $) {
        this.duration = $.duration;
        this.startTime = $.startTime;
        this.timezone = $.timezone;
        this.weekdays = $.weekdays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleTimeFrameScheduledWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleTimeFrameScheduledWeeklyArgs $;

        public Builder() {
            $ = new RulesetRuleTimeFrameScheduledWeeklyArgs();
        }

        public Builder(RulesetRuleTimeFrameScheduledWeeklyArgs defaults) {
            $ = new RulesetRuleTimeFrameScheduledWeeklyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param startTime A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<Integer> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
         * 
         * @return builder
         * 
         */
        public Builder startTime(Integer startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timezone [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        /**
         * @param weekdays An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(@Nullable Output<List<Integer>> weekdays) {
            $.weekdays = weekdays;
            return this;
        }

        /**
         * @param weekdays An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(List<Integer> weekdays) {
            return weekdays(Output.of(weekdays));
        }

        /**
         * @param weekdays An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(Integer... weekdays) {
            return weekdays(List.of(weekdays));
        }

        public RulesetRuleTimeFrameScheduledWeeklyArgs build() {
            return $;
        }
    }

}

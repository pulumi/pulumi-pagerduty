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
public final class RulesetRuleTimeFrameScheduledWeekly {
    /**
     * @return Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
     * 
     */
    private @Nullable Integer duration;
    /**
     * @return A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%2FNew_York).
     * 
     */
    private @Nullable Integer startTime;
    /**
     * @return [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
     * 
     */
    private @Nullable String timezone;
    /**
     * @return An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     * 
     */
    private @Nullable List<Integer> weekdays;

    private RulesetRuleTimeFrameScheduledWeekly() {}
    /**
     * @return Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
     * 
     */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%2FNew_York).
     * 
     */
    public Optional<Integer> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = &#34;America/Toronto&#34;`
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }
    /**
     * @return An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     * 
     */
    public List<Integer> weekdays() {
        return this.weekdays == null ? List.of() : this.weekdays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleTimeFrameScheduledWeekly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer duration;
        private @Nullable Integer startTime;
        private @Nullable String timezone;
        private @Nullable List<Integer> weekdays;
        public Builder() {}
        public Builder(RulesetRuleTimeFrameScheduledWeekly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
    	      this.timezone = defaults.timezone;
    	      this.weekdays = defaults.weekdays;
        }

        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }
        @CustomType.Setter
        public Builder weekdays(@Nullable List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public Builder weekdays(Integer... weekdays) {
            return weekdays(List.of(weekdays));
        }
        public RulesetRuleTimeFrameScheduledWeekly build() {
            final var o = new RulesetRuleTimeFrameScheduledWeekly();
            o.duration = duration;
            o.startTime = startTime;
            o.timezone = timezone;
            o.weekdays = weekdays;
            return o;
        }
    }
}

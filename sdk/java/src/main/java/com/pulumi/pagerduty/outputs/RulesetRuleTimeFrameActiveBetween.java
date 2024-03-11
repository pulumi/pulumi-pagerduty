// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleTimeFrameActiveBetween {
    private @Nullable Integer endTime;
    /**
     * @return A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
     * 
     */
    private @Nullable Integer startTime;

    private RulesetRuleTimeFrameActiveBetween() {}
    public Optional<Integer> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](&lt;https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%!F(MISSING)New_York&gt;).
     * 
     */
    public Optional<Integer> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleTimeFrameActiveBetween defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer endTime;
        private @Nullable Integer startTime;
        public Builder() {}
        public Builder(RulesetRuleTimeFrameActiveBetween defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(@Nullable Integer endTime) {

            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable Integer startTime) {

            this.startTime = startTime;
            return this;
        }
        public RulesetRuleTimeFrameActiveBetween build() {
            final var _resultValue = new RulesetRuleTimeFrameActiveBetween();
            _resultValue.endTime = endTime;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}

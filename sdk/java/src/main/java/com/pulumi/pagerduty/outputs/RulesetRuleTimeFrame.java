// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.RulesetRuleTimeFrameActiveBetween;
import com.pulumi.pagerduty.outputs.RulesetRuleTimeFrameScheduledWeekly;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleTimeFrame {
    /**
     * @return Values for executing the rule during a specific time period.
     * 
     */
    private @Nullable List<RulesetRuleTimeFrameActiveBetween> activeBetweens;
    /**
     * @return Values for executing the rule on a recurring schedule.
     * 
     */
    private @Nullable List<RulesetRuleTimeFrameScheduledWeekly> scheduledWeeklies;

    private RulesetRuleTimeFrame() {}
    /**
     * @return Values for executing the rule during a specific time period.
     * 
     */
    public List<RulesetRuleTimeFrameActiveBetween> activeBetweens() {
        return this.activeBetweens == null ? List.of() : this.activeBetweens;
    }
    /**
     * @return Values for executing the rule on a recurring schedule.
     * 
     */
    public List<RulesetRuleTimeFrameScheduledWeekly> scheduledWeeklies() {
        return this.scheduledWeeklies == null ? List.of() : this.scheduledWeeklies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleTimeFrame defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RulesetRuleTimeFrameActiveBetween> activeBetweens;
        private @Nullable List<RulesetRuleTimeFrameScheduledWeekly> scheduledWeeklies;
        public Builder() {}
        public Builder(RulesetRuleTimeFrame defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeBetweens = defaults.activeBetweens;
    	      this.scheduledWeeklies = defaults.scheduledWeeklies;
        }

        @CustomType.Setter
        public Builder activeBetweens(@Nullable List<RulesetRuleTimeFrameActiveBetween> activeBetweens) {
            this.activeBetweens = activeBetweens;
            return this;
        }
        public Builder activeBetweens(RulesetRuleTimeFrameActiveBetween... activeBetweens) {
            return activeBetweens(List.of(activeBetweens));
        }
        @CustomType.Setter
        public Builder scheduledWeeklies(@Nullable List<RulesetRuleTimeFrameScheduledWeekly> scheduledWeeklies) {
            this.scheduledWeeklies = scheduledWeeklies;
            return this;
        }
        public Builder scheduledWeeklies(RulesetRuleTimeFrameScheduledWeekly... scheduledWeeklies) {
            return scheduledWeeklies(List.of(scheduledWeeklies));
        }
        public RulesetRuleTimeFrame build() {
            final var o = new RulesetRuleTimeFrame();
            o.activeBetweens = activeBetweens;
            o.scheduledWeeklies = scheduledWeeklies;
            return o;
        }
    }
}

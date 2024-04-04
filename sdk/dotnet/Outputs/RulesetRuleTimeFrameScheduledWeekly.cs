// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class RulesetRuleTimeFrameScheduledWeekly
    {
        /// <summary>
        /// Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `start_time`.
        /// </summary>
        public readonly int? Duration;
        /// <summary>
        /// A Unix timestamp in milliseconds which is combined with the `timezone` to determine the time this rule will start on each specified `weekday`. Note that the _date_ of the timestamp you specify does **not** matter, except that it lets you determine whether daylight saving time is in effect so that you use the correct UTC offset for the timezone you specify. In practice, you may want to use the `time_static` resource to generate this value, as demonstrated in the `resource.pagerduty_ruleset_rule.foo` code example at the top of this page. To generate this timestamp manually, if you want your rule to apply starting at 9:30am in the `America/New_York` timezone, use your programing language of choice to determine a Unix timestamp that represents 9:30am in that timezone, like [1554989400000](https://www.epochconverter.com/timezones?q=1554989400000&amp;tz=America%2FNew_York).
        /// </summary>
        public readonly int? StartTime;
        /// <summary>
        /// [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = "America/Toronto"`
        /// </summary>
        public readonly string? Timezone;
        /// <summary>
        /// An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
        /// </summary>
        public readonly ImmutableArray<int> Weekdays;

        [OutputConstructor]
        private RulesetRuleTimeFrameScheduledWeekly(
            int? duration,

            int? startTime,

            string? timezone,

            ImmutableArray<int> weekdays)
        {
            Duration = duration;
            StartTime = startTime;
            Timezone = timezone;
            Weekdays = weekdays;
        }
    }
}

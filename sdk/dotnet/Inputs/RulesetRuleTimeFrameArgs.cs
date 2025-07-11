// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class RulesetRuleTimeFrameArgs : global::Pulumi.ResourceArgs
    {
        [Input("activeBetweens")]
        private InputList<Inputs.RulesetRuleTimeFrameActiveBetweenArgs>? _activeBetweens;

        /// <summary>
        /// Values for executing the rule during a specific time period.
        /// </summary>
        public InputList<Inputs.RulesetRuleTimeFrameActiveBetweenArgs> ActiveBetweens
        {
            get => _activeBetweens ?? (_activeBetweens = new InputList<Inputs.RulesetRuleTimeFrameActiveBetweenArgs>());
            set => _activeBetweens = value;
        }

        [Input("scheduledWeeklies")]
        private InputList<Inputs.RulesetRuleTimeFrameScheduledWeeklyArgs>? _scheduledWeeklies;

        /// <summary>
        /// Values for executing the rule on a recurring schedule.
        /// </summary>
        public InputList<Inputs.RulesetRuleTimeFrameScheduledWeeklyArgs> ScheduledWeeklies
        {
            get => _scheduledWeeklies ?? (_scheduledWeeklies = new InputList<Inputs.RulesetRuleTimeFrameScheduledWeeklyArgs>());
            set => _scheduledWeeklies = value;
        }

        public RulesetRuleTimeFrameArgs()
        {
        }
        public static new RulesetRuleTimeFrameArgs Empty => new RulesetRuleTimeFrameArgs();
    }
}

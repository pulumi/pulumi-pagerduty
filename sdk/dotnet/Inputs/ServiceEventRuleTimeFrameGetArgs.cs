// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleTimeFrameGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("activeBetweens")]
        private InputList<Inputs.ServiceEventRuleTimeFrameActiveBetweenGetArgs>? _activeBetweens;

        /// <summary>
        /// Values for executing the rule during a specific time period.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleTimeFrameActiveBetweenGetArgs> ActiveBetweens
        {
            get => _activeBetweens ?? (_activeBetweens = new InputList<Inputs.ServiceEventRuleTimeFrameActiveBetweenGetArgs>());
            set => _activeBetweens = value;
        }

        [Input("scheduledWeeklies")]
        private InputList<Inputs.ServiceEventRuleTimeFrameScheduledWeeklyGetArgs>? _scheduledWeeklies;

        /// <summary>
        /// Values for executing the rule on a recurring schedule.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleTimeFrameScheduledWeeklyGetArgs> ScheduledWeeklies
        {
            get => _scheduledWeeklies ?? (_scheduledWeeklies = new InputList<Inputs.ServiceEventRuleTimeFrameScheduledWeeklyGetArgs>());
            set => _scheduledWeeklies = value;
        }

        public ServiceEventRuleTimeFrameGetArgs()
        {
        }
        public static new ServiceEventRuleTimeFrameGetArgs Empty => new ServiceEventRuleTimeFrameGetArgs();
    }
}

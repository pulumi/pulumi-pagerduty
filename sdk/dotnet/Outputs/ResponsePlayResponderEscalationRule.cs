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
    public sealed class ResponsePlayResponderEscalationRule
    {
        /// <summary>
        /// The number of minutes before an unacknowledged incident escalates away from this rule.
        /// </summary>
        public readonly int? EscalationDelayInMinutes;
        /// <summary>
        /// ID of the user defined as the responder
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The targets an incident should be assigned to upon reaching this rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.ResponsePlayResponderEscalationRuleTarget> Targets;

        [OutputConstructor]
        private ResponsePlayResponderEscalationRule(
            int? escalationDelayInMinutes,

            string? id,

            ImmutableArray<Outputs.ResponsePlayResponderEscalationRuleTarget> targets)
        {
            EscalationDelayInMinutes = escalationDelayInMinutes;
            Id = id;
            Targets = targets;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ResponsePlayResponderEscalationRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of minutes before an unacknowledged incident escalates away from this rule.
        /// </summary>
        [Input("escalationDelayInMinutes")]
        public Input<int>? EscalationDelayInMinutes { get; set; }

        /// <summary>
        /// The ID of the response play.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("targets", required: true)]
        private InputList<Inputs.ResponsePlayResponderEscalationRuleTargetArgs>? _targets;

        /// <summary>
        /// The targets an incident should be assigned to upon reaching this rule.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderEscalationRuleTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.ResponsePlayResponderEscalationRuleTargetArgs>());
            set => _targets = value;
        }

        public ResponsePlayResponderEscalationRuleArgs()
        {
        }
        public static new ResponsePlayResponderEscalationRuleArgs Empty => new ResponsePlayResponderEscalationRuleArgs();
    }
}

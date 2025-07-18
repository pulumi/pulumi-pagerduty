// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ResponsePlayResponderEscalationRuleGetArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.ResponsePlayResponderEscalationRuleTargetGetArgs>? _targets;

        /// <summary>
        /// The targets an incident should be assigned to upon reaching this rule.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderEscalationRuleTargetGetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.ResponsePlayResponderEscalationRuleTargetGetArgs>());
            set => _targets = value;
        }

        public ResponsePlayResponderEscalationRuleGetArgs()
        {
        }
        public static new ResponsePlayResponderEscalationRuleGetArgs Empty => new ResponsePlayResponderEscalationRuleGetArgs();
    }
}

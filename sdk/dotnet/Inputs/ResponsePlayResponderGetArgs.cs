// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ResponsePlayResponderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of escalation policy
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("escalationRules")]
        private InputList<Inputs.ResponsePlayResponderEscalationRuleGetArgs>? _escalationRules;

        /// <summary>
        /// The escalation rules
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderEscalationRuleGetArgs> EscalationRules
        {
            get => _escalationRules ?? (_escalationRules = new InputList<Inputs.ResponsePlayResponderEscalationRuleGetArgs>());
            set => _escalationRules = value;
        }

        /// <summary>
        /// ID of the user defined as the responder
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the escalation policy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of times the escalation policy will repeat after reaching the end of its escalation.
        /// </summary>
        [Input("numLoops")]
        public Input<int>? NumLoops { get; set; }

        /// <summary>
        /// Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services". Could be "if_has_services", "always
        /// </summary>
        [Input("onCallHandoffNotifications")]
        public Input<string>? OnCallHandoffNotifications { get; set; }

        [Input("services")]
        private InputList<Inputs.ResponsePlayResponderServiceGetArgs>? _services;

        /// <summary>
        /// There can be multiple services associated with a policy.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderServiceGetArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.ResponsePlayResponderServiceGetArgs>());
            set => _services = value;
        }

        [Input("teams")]
        private InputList<Inputs.ResponsePlayResponderTeamGetArgs>? _teams;

        /// <summary>
        /// Teams associated with the policy. Account must have the `teams` ability to use this parameter. There can be multiple teams associated with a policy.
        /// </summary>
        public InputList<Inputs.ResponsePlayResponderTeamGetArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.ResponsePlayResponderTeamGetArgs>());
            set => _teams = value;
        }

        /// <summary>
        /// Should be set as `escalation_policy` for escalation policy responders.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ResponsePlayResponderGetArgs()
        {
        }
        public static new ResponsePlayResponderGetArgs Empty => new ResponsePlayResponderGetArgs();
    }
}

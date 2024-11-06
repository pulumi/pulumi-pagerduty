// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class SlackConnectionConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("events", required: true)]
        private InputList<string>? _events;

        /// <summary>
        /// A list of strings to filter events by PagerDuty event type. `"incident.triggered"` is required. The follow event types are also possible:
        /// - `incident.acknowledged`
        /// - `incident.escalated`
        /// - `incident.resolved`
        /// - `incident.reassigned`
        /// - `incident.annotated`
        /// - `incident.unacknowledged`
        /// - `incident.delegated`
        /// - `incident.priority_updated`
        /// - `incident.responder.added`
        /// - `incident.responder.replied`
        /// - `incident.status_update_published`
        /// - `incident.reopened`
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("priorities")]
        private InputList<string>? _priorities;

        /// <summary>
        /// Allows you to filter events by priority. Needs to be an array of PagerDuty priority IDs. Available through pagerduty.getPriority data source.
        /// - When omitted or set to an empty array (`[]`) in the configuration for a Slack Connection, its default behavior is to set `priorities` to `No Priority` value.
        /// - When set to `["*"]` its corresponding value for `priorities` in Slack Connection's configuration will be `Any Priority`.
        /// </summary>
        public InputList<string> Priorities
        {
            get => _priorities ?? (_priorities = new InputList<string>());
            set => _priorities = value;
        }

        /// <summary>
        /// Allows you to filter events by urgency. Either `high`, `low` or `null` for Any urgency. Default is `null`.
        /// </summary>
        [Input("urgency")]
        public Input<string>? Urgency { get; set; }

        public SlackConnectionConfigGetArgs()
        {
        }
        public static new SlackConnectionConfigGetArgs Empty => new SlackConnectionConfigGetArgs();
    }
}

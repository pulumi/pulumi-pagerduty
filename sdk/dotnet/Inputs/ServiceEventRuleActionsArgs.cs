// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ServiceEventRuleActionsArgs : Pulumi.ResourceArgs
    {
        [Input("annotates")]
        private InputList<Inputs.ServiceEventRuleActionsAnnotateArgs>? _annotates;

        /// <summary>
        /// Note added to the event.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsAnnotateArgs> Annotates
        {
            get => _annotates ?? (_annotates = new InputList<Inputs.ServiceEventRuleActionsAnnotateArgs>());
            set => _annotates = value;
        }

        [Input("eventActions")]
        private InputList<Inputs.ServiceEventRuleActionsEventActionArgs>? _eventActions;

        /// <summary>
        /// An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsEventActionArgs> EventActions
        {
            get => _eventActions ?? (_eventActions = new InputList<Inputs.ServiceEventRuleActionsEventActionArgs>());
            set => _eventActions = value;
        }

        [Input("extractions")]
        private InputList<Inputs.ServiceEventRuleActionsExtractionArgs>? _extractions;

        /// <summary>
        /// Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsExtractionArgs> Extractions
        {
            get => _extractions ?? (_extractions = new InputList<Inputs.ServiceEventRuleActionsExtractionArgs>());
            set => _extractions = value;
        }

        [Input("priorities")]
        private InputList<Inputs.ServiceEventRuleActionsPriorityArgs>? _priorities;

        /// <summary>
        /// The ID of the priority applied to the event.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsPriorityArgs> Priorities
        {
            get => _priorities ?? (_priorities = new InputList<Inputs.ServiceEventRuleActionsPriorityArgs>());
            set => _priorities = value;
        }

        [Input("severities")]
        private InputList<Inputs.ServiceEventRuleActionsSeverityArgs>? _severities;

        /// <summary>
        /// The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsSeverityArgs> Severities
        {
            get => _severities ?? (_severities = new InputList<Inputs.ServiceEventRuleActionsSeverityArgs>());
            set => _severities = value;
        }

        [Input("suppresses")]
        private InputList<Inputs.ServiceEventRuleActionsSuppressArgs>? _suppresses;

        /// <summary>
        /// Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsSuppressArgs> Suppresses
        {
            get => _suppresses ?? (_suppresses = new InputList<Inputs.ServiceEventRuleActionsSuppressArgs>());
            set => _suppresses = value;
        }

        [Input("suspends")]
        private InputList<Inputs.ServiceEventRuleActionsSuspendArgs>? _suspends;

        /// <summary>
        /// An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering.
        /// </summary>
        public InputList<Inputs.ServiceEventRuleActionsSuspendArgs> Suspends
        {
            get => _suspends ?? (_suspends = new InputList<Inputs.ServiceEventRuleActionsSuspendArgs>());
            set => _suspends = value;
        }

        public ServiceEventRuleActionsArgs()
        {
        }
    }
}

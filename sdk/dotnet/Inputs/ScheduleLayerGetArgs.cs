// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Inputs
{

    public sealed class ScheduleLayerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The end time of the schedule layer. If not specified, the layer does not end.
        /// </summary>
        [Input("end")]
        public Input<string>? End { get; set; }

        /// <summary>
        /// The ID of the schedule.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the schedule layer.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("renderedCoveragePercentage")]
        public Input<string>? RenderedCoveragePercentage { get; set; }

        [Input("restrictions")]
        private InputList<Inputs.ScheduleLayerRestrictionGetArgs>? _restrictions;

        /// <summary>
        /// A schedule layer restriction block. Restriction blocks documented below.
        /// </summary>
        public InputList<Inputs.ScheduleLayerRestrictionGetArgs> Restrictions
        {
            get => _restrictions ?? (_restrictions = new InputList<Inputs.ScheduleLayerRestrictionGetArgs>());
            set => _restrictions = value;
        }

        /// <summary>
        /// The duration of each on-call shift in `seconds`.
        /// </summary>
        [Input("rotationTurnLengthSeconds", required: true)]
        public Input<int> RotationTurnLengthSeconds { get; set; } = null!;

        /// <summary>
        /// The effective start time of the schedule layer. This can be before the start time of the schedule.
        /// </summary>
        [Input("rotationVirtualStart", required: true)]
        public Input<string> RotationVirtualStart { get; set; } = null!;

        /// <summary>
        /// The start time of the schedule layer.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        [Input("users", required: true)]
        private InputList<string>? _users;

        /// <summary>
        /// The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public ScheduleLayerGetArgs()
        {
        }
        public static new ScheduleLayerGetArgs Empty => new ScheduleLayerGetArgs();
    }
}
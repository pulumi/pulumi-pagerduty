// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [schedule](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Schedules/get_schedules) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Pagerduty.User("example", new Pagerduty.UserArgs
    ///         {
    ///             Email = "125.greenholt.earline@graham.name",
    ///             Teams = 
    ///             {
    ///                 pagerduty_team.Example.Id,
    ///             },
    ///         });
    ///         var foo = new Pagerduty.Schedule("foo", new Pagerduty.ScheduleArgs
    ///         {
    ///             TimeZone = "America/New_York",
    ///             Layers = 
    ///             {
    ///                 new Pagerduty.Inputs.ScheduleLayerArgs
    ///                 {
    ///                     Name = "Night Shift",
    ///                     Start = "2015-11-06T20:00:00-05:00",
    ///                     RotationVirtualStart = "2015-11-06T20:00:00-05:00",
    ///                     RotationTurnLengthSeconds = 86400,
    ///                     Users = 
    ///                     {
    ///                         pagerduty_user.Foo.Id,
    ///                     },
    ///                     Restrictions = 
    ///                     {
    ///                         new Pagerduty.Inputs.ScheduleLayerRestrictionArgs
    ///                         {
    ///                             Type = "daily_restriction",
    ///                             StartTimeOfDay = "08:00:00",
    ///                             DurationSeconds = 32400,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Schedules can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/schedule:Schedule")]
    public partial class Schedule : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the schedule
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A schedule layer block. Schedule layers documented below.
        /// </summary>
        [Output("layers")]
        public Output<ImmutableArray<Outputs.ScheduleLayer>> Layers { get; private set; } = null!;

        /// <summary>
        /// The name of the schedule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        /// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        /// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        /// </summary>
        [Output("overflow")]
        public Output<bool?> Overflow { get; private set; } = null!;

        /// <summary>
        /// The time zone of the schedule (e.g Europe/Berlin).
        /// </summary>
        [Output("timeZone")]
        public Output<string> TimeZone { get; private set; } = null!;


        /// <summary>
        /// Create a Schedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Schedule(string name, ScheduleArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/schedule:Schedule", name, args ?? new ScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Schedule(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/schedule:Schedule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Schedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Schedule Get(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new Schedule(name, id, state, options);
        }
    }

    public sealed class ScheduleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the schedule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("layers", required: true)]
        private InputList<Inputs.ScheduleLayerArgs>? _layers;

        /// <summary>
        /// A schedule layer block. Schedule layers documented below.
        /// </summary>
        public InputList<Inputs.ScheduleLayerArgs> Layers
        {
            get => _layers ?? (_layers = new InputList<Inputs.ScheduleLayerArgs>());
            set => _layers = value;
        }

        /// <summary>
        /// The name of the schedule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        /// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        /// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        /// </summary>
        [Input("overflow")]
        public Input<bool>? Overflow { get; set; }

        /// <summary>
        /// The time zone of the schedule (e.g Europe/Berlin).
        /// </summary>
        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public ScheduleArgs()
        {
            Description = "Managed by Pulumi";
        }
    }

    public sealed class ScheduleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the schedule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("layers")]
        private InputList<Inputs.ScheduleLayerGetArgs>? _layers;

        /// <summary>
        /// A schedule layer block. Schedule layers documented below.
        /// </summary>
        public InputList<Inputs.ScheduleLayerGetArgs> Layers
        {
            get => _layers ?? (_layers = new InputList<Inputs.ScheduleLayerGetArgs>());
            set => _layers = value;
        }

        /// <summary>
        /// The name of the schedule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        /// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        /// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        /// </summary>
        [Input("overflow")]
        public Input<bool>? Overflow { get; set; }

        /// <summary>
        /// The time zone of the schedule (e.g Europe/Berlin).
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public ScheduleState()
        {
            Description = "Managed by Pulumi";
        }
    }
}

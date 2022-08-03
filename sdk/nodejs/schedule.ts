// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * A [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4Mg-create-a-schedule) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const exampleUser = new pagerduty.User("exampleUser", {email: "125.greenholt.earline@graham.name"});
 * const exampleTeam = new pagerduty.Team("exampleTeam", {});
 * const foo = new pagerduty.Schedule("foo", {
 *     timeZone: "America/New_York",
 *     layers: [{
 *         name: "Night Shift",
 *         start: "2015-11-06T20:00:00-05:00",
 *         rotationVirtualStart: "2015-11-06T20:00:00-05:00",
 *         rotationTurnLengthSeconds: 86400,
 *         users: [exampleUser.id],
 *         restrictions: [{
 *             type: "daily_restriction",
 *             startTimeOfDay: "08:00:00",
 *             durationSeconds: 32400,
 *         }],
 *     }],
 *     teams: [exampleTeam.id],
 * });
 * ```
 *
 * ## Import
 *
 * Schedules can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
 * ```
 */
export class Schedule extends pulumi.CustomResource {
    /**
     * Get an existing Schedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleState, opts?: pulumi.CustomResourceOptions): Schedule {
        return new Schedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/schedule:Schedule';

    /**
     * Returns true if the given object is an instance of Schedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schedule.__pulumiType;
    }

    /**
     * The description of the schedule.
     */
    public readonly description!: pulumi.Output<string>;
    public /*out*/ readonly finalSchedules!: pulumi.Output<outputs.ScheduleFinalSchedule[]>;
    /**
     * A schedule layer block. Schedule layers documented below.
     */
    public readonly layers!: pulumi.Output<outputs.ScheduleLayer[]>;
    /**
     * The name of the schedule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
     * If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
     * If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
     */
    public readonly overflow!: pulumi.Output<boolean | undefined>;
    /**
     * Teams associated with the schedule.
     */
    public readonly teams!: pulumi.Output<string[] | undefined>;
    /**
     * The time zone of the schedule (e.g. `Europe/Berlin`).
     */
    public readonly timeZone!: pulumi.Output<string>;

    /**
     * Create a Schedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleArgs | ScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduleState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["finalSchedules"] = state ? state.finalSchedules : undefined;
            resourceInputs["layers"] = state ? state.layers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["overflow"] = state ? state.overflow : undefined;
            resourceInputs["teams"] = state ? state.teams : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
        } else {
            const args = argsOrState as ScheduleArgs | undefined;
            if ((!args || args.layers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'layers'");
            }
            if ((!args || args.timeZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeZone'");
            }
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["layers"] = args ? args.layers : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["overflow"] = args ? args.overflow : undefined;
            resourceInputs["teams"] = args ? args.teams : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
            resourceInputs["finalSchedules"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Schedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schedule resources.
 */
export interface ScheduleState {
    /**
     * The description of the schedule.
     */
    description?: pulumi.Input<string>;
    finalSchedules?: pulumi.Input<pulumi.Input<inputs.ScheduleFinalSchedule>[]>;
    /**
     * A schedule layer block. Schedule layers documented below.
     */
    layers?: pulumi.Input<pulumi.Input<inputs.ScheduleLayer>[]>;
    /**
     * The name of the schedule.
     */
    name?: pulumi.Input<string>;
    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
     * If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
     * If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
     */
    overflow?: pulumi.Input<boolean>;
    /**
     * Teams associated with the schedule.
     */
    teams?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time zone of the schedule (e.g. `Europe/Berlin`).
     */
    timeZone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Schedule resource.
 */
export interface ScheduleArgs {
    /**
     * The description of the schedule.
     */
    description?: pulumi.Input<string>;
    /**
     * A schedule layer block. Schedule layers documented below.
     */
    layers: pulumi.Input<pulumi.Input<inputs.ScheduleLayer>[]>;
    /**
     * The name of the schedule.
     */
    name?: pulumi.Input<string>;
    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
     * If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
     * If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
     */
    overflow?: pulumi.Input<boolean>;
    /**
     * Teams associated with the schedule.
     */
    teams?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time zone of the schedule (e.g. `Europe/Berlin`).
     */
    timeZone: pulumi.Input<string>;
}

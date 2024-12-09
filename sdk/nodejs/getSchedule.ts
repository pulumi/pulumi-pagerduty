// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4MQ-list-schedules) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const test = pagerduty.getSchedule({
 *     name: "Daily Engineering Rotation",
 * });
 * const foo = new pagerduty.EscalationPolicy("foo", {
 *     name: "Engineering Escalation Policy",
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "schedule",
 *             id: test.then(test => test.id),
 *         }],
 *     }],
 * });
 * ```
 */
export function getSchedule(args: GetScheduleArgs, opts?: pulumi.InvokeOptions): Promise<GetScheduleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getSchedule:getSchedule", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchedule.
 */
export interface GetScheduleArgs {
    /**
     * The name to use to find a schedule in the PagerDuty API.
     */
    name: string;
}

/**
 * A collection of values returned by getSchedule.
 */
export interface GetScheduleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The short name of the found schedule.
     */
    readonly name: string;
}
/**
 * Use this data source to get information about a specific [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4MQ-list-schedules) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const test = pagerduty.getSchedule({
 *     name: "Daily Engineering Rotation",
 * });
 * const foo = new pagerduty.EscalationPolicy("foo", {
 *     name: "Engineering Escalation Policy",
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "schedule",
 *             id: test.then(test => test.id),
 *         }],
 *     }],
 * });
 * ```
 */
export function getScheduleOutput(args: GetScheduleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetScheduleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getSchedule:getSchedule", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchedule.
 */
export interface GetScheduleOutputArgs {
    /**
     * The name to use to find a schedule in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}

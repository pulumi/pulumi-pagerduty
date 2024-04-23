// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about the [scores for the standards for
 * many resources][1].
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const foo = pagerduty.getService({
 *     name: "foo",
 * });
 * const bar = pagerduty.getService({
 *     name: "bar",
 * });
 * const baz = pagerduty.getService({
 *     name: "baz",
 * });
 * const scores = Promise.all([foo, bar, baz]).then(([foo, bar, baz]) => pagerduty.getStandardsResourcesScores({
 *     resourceType: "technical_services",
 *     ids: [
 *         foo.id,
 *         bar.id,
 *         baz.id,
 *     ],
 * }));
 * ```
 */
export function getStandardsResourcesScores(args: GetStandardsResourcesScoresArgs, opts?: pulumi.InvokeOptions): Promise<GetStandardsResourcesScoresResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores", {
        "ids": args.ids,
        "resourceType": args.resourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandardsResourcesScores.
 */
export interface GetStandardsResourcesScoresArgs {
    /**
     * List of identifiers of the resources to query.
     */
    ids: string[];
    /**
     * Type of the object the standards are associated to. Allowed values are `technicalServices`.
     */
    resourceType: string;
}

/**
 * A collection of values returned by getStandardsResourcesScores.
 */
export interface GetStandardsResourcesScoresResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * Specifies the type of resource to which the standard applies.
     */
    readonly resourceType: string;
    /**
     * List of score results for each queried resource.
     */
    readonly resources: outputs.GetStandardsResourcesScoresResource[];
}
/**
 * Use this data source to get information about the [scores for the standards for
 * many resources][1].
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const foo = pagerduty.getService({
 *     name: "foo",
 * });
 * const bar = pagerduty.getService({
 *     name: "bar",
 * });
 * const baz = pagerduty.getService({
 *     name: "baz",
 * });
 * const scores = Promise.all([foo, bar, baz]).then(([foo, bar, baz]) => pagerduty.getStandardsResourcesScores({
 *     resourceType: "technical_services",
 *     ids: [
 *         foo.id,
 *         bar.id,
 *         baz.id,
 *     ],
 * }));
 * ```
 */
export function getStandardsResourcesScoresOutput(args: GetStandardsResourcesScoresOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStandardsResourcesScoresResult> {
    return pulumi.output(args).apply((a: any) => getStandardsResourcesScores(a, opts))
}

/**
 * A collection of arguments for invoking getStandardsResourcesScores.
 */
export interface GetStandardsResourcesScoresOutputArgs {
    /**
     * List of identifiers of the resources to query.
     */
    ids: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of the object the standards are associated to. Allowed values are `technicalServices`.
     */
    resourceType: pulumi.Input<string>;
}

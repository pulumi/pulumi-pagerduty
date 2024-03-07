// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about the [scores for the standards of a
 * resource][1].
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getService({
 *     name: "My Service",
 * });
 * const scores = example.then(example => pagerduty.getStandardsResourceScores({
 *     resourceType: "technical_services",
 *     id: example.id,
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getStandardsResourceScores(args: GetStandardsResourceScoresArgs, opts?: pulumi.InvokeOptions): Promise<GetStandardsResourceScoresResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getStandardsResourceScores:getStandardsResourceScores", {
        "id": args.id,
        "resourceType": args.resourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandardsResourceScores.
 */
export interface GetStandardsResourceScoresArgs {
    /**
     * Identifier of said resource.
     */
    id: string;
    /**
     * Type of the object the standards are associated to. Allowed values are `technicalServices`.
     */
    resourceType: string;
}

/**
 * A collection of values returned by getStandardsResourceScores.
 */
export interface GetStandardsResourceScoresResult {
    /**
     * A unique identifier for the standard.
     */
    readonly id: string;
    /**
     * Specifies the type of resource to which the standard applies.
     */
    readonly resourceType: string;
    /**
     * Summary of the scores for standards associated with this resource.
     */
    readonly score: outputs.GetStandardsResourceScoresScore;
    /**
     * The list of standards evaluated against.
     */
    readonly standards: outputs.GetStandardsResourceScoresStandard[];
}
/**
 * Use this data source to get information about the [scores for the standards of a
 * resource][1].
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getService({
 *     name: "My Service",
 * });
 * const scores = example.then(example => pagerduty.getStandardsResourceScores({
 *     resourceType: "technical_services",
 *     id: example.id,
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getStandardsResourceScoresOutput(args: GetStandardsResourceScoresOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStandardsResourceScoresResult> {
    return pulumi.output(args).apply((a: any) => getStandardsResourceScores(a, opts))
}

/**
 * A collection of arguments for invoking getStandardsResourceScores.
 */
export interface GetStandardsResourceScoresOutputArgs {
    /**
     * Identifier of said resource.
     */
    id: pulumi.Input<string>;
    /**
     * Type of the object the standards are associated to. Allowed values are `technicalServices`.
     */
    resourceType: pulumi.Input<string>;
}

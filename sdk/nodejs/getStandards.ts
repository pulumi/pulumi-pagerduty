// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about the [standards](https://developer.pagerduty.com/api-reference/dbed9a0ff9355-list-standards) applicable to
 * the PagerDuty account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const standards = pagerduty.getStandards({});
 * ```
 */
export function getStandards(args?: GetStandardsArgs, opts?: pulumi.InvokeOptions): Promise<GetStandardsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getStandards:getStandards", {
        "resourceType": args.resourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandards.
 */
export interface GetStandardsArgs {
    /**
     * Filter by `resourceType` the received standards. Allowed values are `technicalService`.
     */
    resourceType?: string;
}

/**
 * A collection of values returned by getStandards.
 */
export interface GetStandardsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies the type of resource to which the standard applies.
     */
    readonly resourceType?: string;
    /**
     * The list of standards defined.
     */
    readonly standards: outputs.GetStandardsStandard[];
}
/**
 * Use this data source to get information about the [standards](https://developer.pagerduty.com/api-reference/dbed9a0ff9355-list-standards) applicable to
 * the PagerDuty account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const standards = pagerduty.getStandards({});
 * ```
 */
export function getStandardsOutput(args?: GetStandardsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStandardsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getStandards:getStandards", {
        "resourceType": args.resourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandards.
 */
export interface GetStandardsOutputArgs {
    /**
     * Filter by `resourceType` the received standards. Allowed values are `technicalService`.
     */
    resourceType?: pulumi.Input<string>;
}

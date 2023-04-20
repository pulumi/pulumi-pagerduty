// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about the purchased [licenses](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) that you can use for other managing PagerDuty user resources. To reference a unique license, see `pagerduty.getLicense` [data source](https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/data-sources/pagerduty_license). After applying changes to users' licenses, the `currentValue` and `allocationsAvailable` attributes of licenses will change.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const invalidRoles = ["owner"];
 * const licenses = pagerduty.getLicenses({});
 * const example = new pagerduty.User("example", {
 *     email: "125.greenholt.earline@graham.name",
 *     license: licenses.then(licenses => licenses.licenses?.[0]?.id),
 *     role: "user",
 * });
 * ```
 */
export function getLicenses(args?: GetLicensesArgs, opts?: pulumi.InvokeOptions): Promise<GetLicensesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getLicenses:getLicenses", {
        "id": args.id,
        "licenses": args.licenses,
    }, opts);
}

/**
 * A collection of arguments for invoking getLicenses.
 */
export interface GetLicensesArgs {
    /**
     * Allows to override the default behavior for setting the `id` attribute that is required for data sources.
     */
    id?: string;
    /**
     * The list of purchased licenses.
     */
    licenses?: inputs.GetLicensesLicense[];
}

/**
 * A collection of values returned by getLicenses.
 */
export interface GetLicensesResult {
    /**
     * ID of the license
     */
    readonly id?: string;
    /**
     * The list of purchased licenses.
     */
    readonly licenses: outputs.GetLicensesLicense[];
}
/**
 * Use this data source to get information about the purchased [licenses](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) that you can use for other managing PagerDuty user resources. To reference a unique license, see `pagerduty.getLicense` [data source](https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/data-sources/pagerduty_license). After applying changes to users' licenses, the `currentValue` and `allocationsAvailable` attributes of licenses will change.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const invalidRoles = ["owner"];
 * const licenses = pagerduty.getLicenses({});
 * const example = new pagerduty.User("example", {
 *     email: "125.greenholt.earline@graham.name",
 *     license: licenses.then(licenses => licenses.licenses?.[0]?.id),
 *     role: "user",
 * });
 * ```
 */
export function getLicensesOutput(args?: GetLicensesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLicensesResult> {
    return pulumi.output(args).apply((a: any) => getLicenses(a, opts))
}

/**
 * A collection of arguments for invoking getLicenses.
 */
export interface GetLicensesOutputArgs {
    /**
     * Allows to override the default behavior for setting the `id` attribute that is required for data sources.
     */
    id?: pulumi.Input<string>;
    /**
     * The list of purchased licenses.
     */
    licenses?: pulumi.Input<pulumi.Input<inputs.GetLicensesLicenseArgs>[]>;
}

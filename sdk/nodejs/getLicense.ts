// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to use a single purchased [license](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) to manage PagerDuty user resources. After applying changes to users' licenses, the `currentValue` and `allocationsAvailable` attributes of licenses will change.
 *
 * > It is preferred to set the `name` and `description` to their exact values or to set the `id`. However, this will require updating your configuration if the accounts products ever change. To avoid errors when account products change, you may set the `name` of a license to a valid substring such as `"Full User"` or `"Stakeholder"`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const invalidRoles = ["owner"];
 * const fullUser = pagerduty.getLicense({
 *     name: "Full User",
 *     description: "",
 * });
 * const example = new pagerduty.User("example", {
 *     name: "Earline Greenholt",
 *     email: "125.greenholt.earline@graham.name",
 *     license: fullUser.then(fullUser => fullUser.id),
 *     role: "user",
 * });
 * ```
 */
export function getLicense(args?: GetLicenseArgs, opts?: pulumi.InvokeOptions): Promise<GetLicenseResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getLicense:getLicense", {
        "description": args.description,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLicense.
 */
export interface GetLicenseArgs {
    /**
     * Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
     */
    description?: string;
    /**
     * Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
     */
    id?: string;
    /**
     * Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
     */
    name?: string;
}

/**
 * A collection of values returned by getLicense.
 */
export interface GetLicenseResult {
    /**
     * Available allocations to assign to users
     */
    readonly allocationsAvailable: number;
    /**
     * The number of allocations already assigned to users
     */
    readonly currentValue: number;
    readonly description: string;
    readonly htmlUrl: string;
    readonly id: string;
    readonly name: string;
    /**
     * The role group for the license that determines the available `validRoles`
     */
    readonly roleGroup: string;
    readonly self: string;
    /**
     * Summary of the license
     */
    readonly summary: string;
    readonly type: string;
    /**
     * List of allowed roles that may be assigned to a user with this license
     */
    readonly validRoles: string[];
}
/**
 * Use this data source to use a single purchased [license](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) to manage PagerDuty user resources. After applying changes to users' licenses, the `currentValue` and `allocationsAvailable` attributes of licenses will change.
 *
 * > It is preferred to set the `name` and `description` to their exact values or to set the `id`. However, this will require updating your configuration if the accounts products ever change. To avoid errors when account products change, you may set the `name` of a license to a valid substring such as `"Full User"` or `"Stakeholder"`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const invalidRoles = ["owner"];
 * const fullUser = pagerduty.getLicense({
 *     name: "Full User",
 *     description: "",
 * });
 * const example = new pagerduty.User("example", {
 *     name: "Earline Greenholt",
 *     email: "125.greenholt.earline@graham.name",
 *     license: fullUser.then(fullUser => fullUser.id),
 *     role: "user",
 * });
 * ```
 */
export function getLicenseOutput(args?: GetLicenseOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLicenseResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getLicense:getLicense", {
        "description": args.description,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLicense.
 */
export interface GetLicenseOutputArgs {
    /**
     * Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
     */
    description?: pulumi.Input<string>;
    /**
     * Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
     */
    id?: pulumi.Input<string>;
    /**
     * Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
     */
    name?: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [alert grouping setting](https://developer.pagerduty.com/api-reference/9b5a6c8d7379b-get-an-alert-grouping-setting).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAlertGroupingSetting({
 *     name: "My example setting",
 * });
 * ```
 */
export function getAlertGroupingSetting(args: GetAlertGroupingSettingArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertGroupingSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getAlertGroupingSetting:getAlertGroupingSetting", {
        "config": args.config,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertGroupingSetting.
 */
export interface GetAlertGroupingSettingArgs {
    /**
     * The values for the configuration setup for this setting.
     */
    config?: inputs.GetAlertGroupingSettingConfig;
    /**
     * The name to use to find an alert grouping setting in the PagerDuty API.
     */
    name: string;
}

/**
 * A collection of values returned by getAlertGroupingSetting.
 */
export interface GetAlertGroupingSettingResult {
    /**
     * The values for the configuration setup for this setting.
     */
    readonly config?: outputs.GetAlertGroupingSettingConfig;
    /**
     * A description of this alert grouping setting.
     */
    readonly description: string;
    /**
     * The ID of the found alert grouping setting.
     */
    readonly id: string;
    /**
     * The short name of the found alert grouping setting.
     */
    readonly name: string;
    /**
     * A list of string containing the IDs of services associated with this setting.
     */
    readonly services: string[];
    /**
     * The type of object. The value returned will be one of `contentBased`, `contentBasedIntelligent`, `intelligent` or `time`.
     */
    readonly type: string;
}
/**
 * Use this data source to get information about a specific [alert grouping setting](https://developer.pagerduty.com/api-reference/9b5a6c8d7379b-get-an-alert-grouping-setting).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAlertGroupingSetting({
 *     name: "My example setting",
 * });
 * ```
 */
export function getAlertGroupingSettingOutput(args: GetAlertGroupingSettingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertGroupingSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getAlertGroupingSetting:getAlertGroupingSetting", {
        "config": args.config,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertGroupingSetting.
 */
export interface GetAlertGroupingSettingOutputArgs {
    /**
     * The values for the configuration setup for this setting.
     */
    config?: pulumi.Input<inputs.GetAlertGroupingSettingConfigArgs>;
    /**
     * The name to use to find an alert grouping setting in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}
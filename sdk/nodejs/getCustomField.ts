// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.
 *
 * Use this data source to get information about a specific [Custom Field](https://support.pagerduty.com/docs/custom-fields) that you can add to a custom field schema.
 *
 * ## Migration
 *
 * The `incidentCustomField` data source provides similar functionality
 * with the same arguments and attributes. The key distinction is that while custom fields returned by this data source
 * may have only applied to a subset of incidents within the account, custom fields returned by the `incidentCustomField`
 * data source are applied to all incidents in the account.
 */
export function getCustomField(args: GetCustomFieldArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomFieldResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getCustomField:getCustomField", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomField.
 */
export interface GetCustomFieldArgs {
    /**
     * The name of the field.
     */
    name: string;
}

/**
 * A collection of values returned by getCustomField.
 */
export interface GetCustomFieldResult {
    readonly datatype: string;
    readonly description: string;
    readonly displayName: string;
    readonly fixedOptions: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly multiValue: boolean;
    readonly name: string;
}
/**
 * !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.
 *
 * Use this data source to get information about a specific [Custom Field](https://support.pagerduty.com/docs/custom-fields) that you can add to a custom field schema.
 *
 * ## Migration
 *
 * The `incidentCustomField` data source provides similar functionality
 * with the same arguments and attributes. The key distinction is that while custom fields returned by this data source
 * may have only applied to a subset of incidents within the account, custom fields returned by the `incidentCustomField`
 * data source are applied to all incidents in the account.
 */
export function getCustomFieldOutput(args: GetCustomFieldOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCustomFieldResult> {
    return pulumi.output(args).apply((a: any) => getCustomField(a, opts))
}

/**
 * A collection of arguments for invoking getCustomField.
 */
export interface GetCustomFieldOutputArgs {
    /**
     * The name of the field.
     */
    name: pulumi.Input<string>;
}

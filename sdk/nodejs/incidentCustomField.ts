// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * An [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) defines a field which can be set on incidents in the target account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const csImpact = new pagerduty.IncidentCustomField("cs_impact", {
 *     name: "impact",
 *     displayName: "Customer Impact",
 *     dataType: "string",
 *     fieldType: "single_value",
 * });
 * const sreEnvironment = new pagerduty.IncidentCustomField("sre_environment", {
 *     name: "environment",
 *     displayName: "Environment",
 *     dataType: "string",
 *     fieldType: "single_value_fixed",
 * });
 * const falseAlarm = new pagerduty.IncidentCustomField("false_alarm", {
 *     name: "false_alarm",
 *     displayName: "False Alarm",
 *     dataType: "boolean",
 *     fieldType: "single_value",
 *     defaultValue: "false",
 * });
 * ```
 *
 * ## Import
 *
 * Fields can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/incidentCustomField:IncidentCustomField sre_environment PLBP09X
 * ```
 */
export class IncidentCustomField extends pulumi.CustomResource {
    /**
     * Get an existing IncidentCustomField resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IncidentCustomFieldState, opts?: pulumi.CustomResourceOptions): IncidentCustomField {
        return new IncidentCustomField(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/incidentCustomField:IncidentCustomField';

    /**
     * Returns true if the given object is an instance of IncidentCustomField.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IncidentCustomField {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IncidentCustomField.__pulumiType;
    }

    public readonly dataType!: pulumi.Output<string>;
    public readonly defaultValue!: pulumi.Output<string | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly displayName!: pulumi.Output<string>;
    public readonly fieldType!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a IncidentCustomField resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IncidentCustomFieldArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IncidentCustomFieldArgs | IncidentCustomFieldState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IncidentCustomFieldState | undefined;
            resourceInputs["dataType"] = state ? state.dataType : undefined;
            resourceInputs["defaultValue"] = state ? state.defaultValue : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["fieldType"] = state ? state.fieldType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as IncidentCustomFieldArgs | undefined;
            if ((!args || args.dataType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataType'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.fieldType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fieldType'");
            }
            resourceInputs["dataType"] = args ? args.dataType : undefined;
            resourceInputs["defaultValue"] = args ? args.defaultValue : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["fieldType"] = args ? args.fieldType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IncidentCustomField.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IncidentCustomField resources.
 */
export interface IncidentCustomFieldState {
    dataType?: pulumi.Input<string>;
    defaultValue?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    displayName?: pulumi.Input<string>;
    fieldType?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IncidentCustomField resource.
 */
export interface IncidentCustomFieldArgs {
    dataType: pulumi.Input<string>;
    defaultValue?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    displayName: pulumi.Input<string>;
    fieldType: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [Custom Field Configuration](https://support.pagerduty.com/docs/custom-fields#associate-schemas-with-services) is a declaration of a specific Custom Field in a specific Custom Field Schema.
 *
 * > The Custom Fields feature is currently available in Early Access.
 */
export class CustomFieldSchemaFieldConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing CustomFieldSchemaFieldConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomFieldSchemaFieldConfigurationState, opts?: pulumi.CustomResourceOptions): CustomFieldSchemaFieldConfiguration {
        return new CustomFieldSchemaFieldConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration';

    /**
     * Returns true if the given object is an instance of CustomFieldSchemaFieldConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomFieldSchemaFieldConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomFieldSchemaFieldConfiguration.__pulumiType;
    }

    /**
     * The default value for the field.
     */
    public readonly defaultValue!: pulumi.Output<string | undefined>;
    /**
     * The datatype of the default value.
     */
    public readonly defaultValueDatatype!: pulumi.Output<string | undefined>;
    /**
     * Whether or not the default value is multi-valued.
     */
    public readonly defaultValueMultiValue!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the field.
     */
    public readonly field!: pulumi.Output<string>;
    /**
     * True if the field is required
     */
    public readonly required!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the schema.
     */
    public readonly schema!: pulumi.Output<string>;

    /**
     * Create a CustomFieldSchemaFieldConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomFieldSchemaFieldConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomFieldSchemaFieldConfigurationArgs | CustomFieldSchemaFieldConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomFieldSchemaFieldConfigurationState | undefined;
            resourceInputs["defaultValue"] = state ? state.defaultValue : undefined;
            resourceInputs["defaultValueDatatype"] = state ? state.defaultValueDatatype : undefined;
            resourceInputs["defaultValueMultiValue"] = state ? state.defaultValueMultiValue : undefined;
            resourceInputs["field"] = state ? state.field : undefined;
            resourceInputs["required"] = state ? state.required : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
        } else {
            const args = argsOrState as CustomFieldSchemaFieldConfigurationArgs | undefined;
            if ((!args || args.field === undefined) && !opts.urn) {
                throw new Error("Missing required property 'field'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["defaultValue"] = args ? args.defaultValue : undefined;
            resourceInputs["defaultValueDatatype"] = args ? args.defaultValueDatatype : undefined;
            resourceInputs["defaultValueMultiValue"] = args ? args.defaultValueMultiValue : undefined;
            resourceInputs["field"] = args ? args.field : undefined;
            resourceInputs["required"] = args ? args.required : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomFieldSchemaFieldConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomFieldSchemaFieldConfiguration resources.
 */
export interface CustomFieldSchemaFieldConfigurationState {
    /**
     * The default value for the field.
     */
    defaultValue?: pulumi.Input<string>;
    /**
     * The datatype of the default value.
     */
    defaultValueDatatype?: pulumi.Input<string>;
    /**
     * Whether or not the default value is multi-valued.
     */
    defaultValueMultiValue?: pulumi.Input<boolean>;
    /**
     * The ID of the field.
     */
    field?: pulumi.Input<string>;
    /**
     * True if the field is required
     */
    required?: pulumi.Input<boolean>;
    /**
     * The ID of the schema.
     */
    schema?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomFieldSchemaFieldConfiguration resource.
 */
export interface CustomFieldSchemaFieldConfigurationArgs {
    /**
     * The default value for the field.
     */
    defaultValue?: pulumi.Input<string>;
    /**
     * The datatype of the default value.
     */
    defaultValueDatatype?: pulumi.Input<string>;
    /**
     * Whether or not the default value is multi-valued.
     */
    defaultValueMultiValue?: pulumi.Input<boolean>;
    /**
     * The ID of the field.
     */
    field: pulumi.Input<string>;
    /**
     * True if the field is required
     */
    required?: pulumi.Input<boolean>;
    /**
     * The ID of the schema.
     */
    schema: pulumi.Input<string>;
}

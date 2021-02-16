// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [business service](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Business_Services/get_business_services) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.BusinessService("example", {
 *     description: "A very descriptive description of this business service",
 *     pointOfContact: "PagerDuty Admin",
 * });
 * ```
 *
 * ## Import
 *
 * Services can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
 * ```
 */
export class BusinessService extends pulumi.CustomResource {
    /**
     * Get an existing BusinessService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BusinessServiceState, opts?: pulumi.CustomResourceOptions): BusinessService {
        return new BusinessService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/businessService:BusinessService';

    /**
     * Returns true if the given object is an instance of BusinessService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BusinessService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BusinessService.__pulumiType;
    }

    public readonly description!: pulumi.Output<string | undefined>;
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * The name of the business service.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The owner of the business service.
     */
    public readonly pointOfContact!: pulumi.Output<string | undefined>;
    public /*out*/ readonly self!: pulumi.Output<string>;
    public /*out*/ readonly summary!: pulumi.Output<string>;
    /**
     * Default value is `businessService`. Can also be set as `businessServiceReference`.
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a BusinessService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BusinessServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BusinessServiceArgs | BusinessServiceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BusinessServiceState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["pointOfContact"] = state ? state.pointOfContact : undefined;
            inputs["self"] = state ? state.self : undefined;
            inputs["summary"] = state ? state.summary : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as BusinessServiceArgs | undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["pointOfContact"] = args ? args.pointOfContact : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["htmlUrl"] = undefined /*out*/;
            inputs["self"] = undefined /*out*/;
            inputs["summary"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(BusinessService.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BusinessService resources.
 */
export interface BusinessServiceState {
    readonly description?: pulumi.Input<string>;
    readonly htmlUrl?: pulumi.Input<string>;
    /**
     * The name of the business service.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The owner of the business service.
     */
    readonly pointOfContact?: pulumi.Input<string>;
    readonly self?: pulumi.Input<string>;
    readonly summary?: pulumi.Input<string>;
    /**
     * Default value is `businessService`. Can also be set as `businessServiceReference`.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BusinessService resource.
 */
export interface BusinessServiceArgs {
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the business service.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The owner of the business service.
     */
    readonly pointOfContact?: pulumi.Input<string>;
    /**
     * Default value is `businessService`. Can also be set as `businessServiceReference`.
     */
    readonly type?: pulumi.Input<string>;
}

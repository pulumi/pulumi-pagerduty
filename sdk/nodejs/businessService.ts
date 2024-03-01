// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [business service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODExNg-create-a-business-service) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.
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
 *     team: "P37RSRS",
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

    public readonly description!: pulumi.Output<string>;
    /**
     * A URL at which the entity is uniquely displayed in the Web app.
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * The name of the business service.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The owner of the business service.
     */
    public readonly pointOfContact!: pulumi.Output<string | undefined>;
    /**
     * The API show URL at which the object is accessible.
     */
    public /*out*/ readonly self!: pulumi.Output<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    public /*out*/ readonly summary!: pulumi.Output<string>;
    /**
     * ID of the team that owns the business service.
     */
    public readonly team!: pulumi.Output<string | undefined>;
    /**
     * **Deprecated** (Optional) Default (and only supported) value is `businessService`.
     *
     * @deprecated This will become a computed attribute in the next major release.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a BusinessService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BusinessServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BusinessServiceArgs | BusinessServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BusinessServiceState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pointOfContact"] = state ? state.pointOfContact : undefined;
            resourceInputs["self"] = state ? state.self : undefined;
            resourceInputs["summary"] = state ? state.summary : undefined;
            resourceInputs["team"] = state ? state.team : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as BusinessServiceArgs | undefined;
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pointOfContact"] = args ? args.pointOfContact : undefined;
            resourceInputs["team"] = args ? args.team : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["htmlUrl"] = undefined /*out*/;
            resourceInputs["self"] = undefined /*out*/;
            resourceInputs["summary"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BusinessService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BusinessService resources.
 */
export interface BusinessServiceState {
    description?: pulumi.Input<string>;
    /**
     * A URL at which the entity is uniquely displayed in the Web app.
     */
    htmlUrl?: pulumi.Input<string>;
    /**
     * The name of the business service.
     */
    name?: pulumi.Input<string>;
    /**
     * The owner of the business service.
     */
    pointOfContact?: pulumi.Input<string>;
    /**
     * The API show URL at which the object is accessible.
     */
    self?: pulumi.Input<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    summary?: pulumi.Input<string>;
    /**
     * ID of the team that owns the business service.
     */
    team?: pulumi.Input<string>;
    /**
     * **Deprecated** (Optional) Default (and only supported) value is `businessService`.
     *
     * @deprecated This will become a computed attribute in the next major release.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BusinessService resource.
 */
export interface BusinessServiceArgs {
    description?: pulumi.Input<string>;
    /**
     * The name of the business service.
     */
    name?: pulumi.Input<string>;
    /**
     * The owner of the business service.
     */
    pointOfContact?: pulumi.Input<string>;
    /**
     * ID of the team that owns the business service.
     */
    team?: pulumi.Input<string>;
    /**
     * **Deprecated** (Optional) Default (and only supported) value is `businessService`.
     *
     * @deprecated This will become a computed attribute in the next major release.
     */
    type?: pulumi.Input<string>;
}

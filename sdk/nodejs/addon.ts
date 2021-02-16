// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With [add-ons](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Add-ons/get_addons), third-party developers can write their own add-ons to PagerDuty's UI. Given a configuration containing a src parameter, that URL will be embedded in an iframe on a page that's available to users from a drop-down menu.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.Addon("example", {
 *     src: "https://intranet.example.com/status",
 * });
 * ```
 *
 * ## Import
 *
 * Add-ons can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/addon:Addon example P3DH5M6
 * ```
 */
export class Addon extends pulumi.CustomResource {
    /**
     * Get an existing Addon resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddonState, opts?: pulumi.CustomResourceOptions): Addon {
        return new Addon(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/addon:Addon';

    /**
     * Returns true if the given object is an instance of Addon.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Addon {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Addon.__pulumiType;
    }

    /**
     * The name of the add-on.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     */
    public readonly src!: pulumi.Output<string>;

    /**
     * Create a Addon resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AddonArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddonArgs | AddonState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddonState | undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["src"] = state ? state.src : undefined;
        } else {
            const args = argsOrState as AddonArgs | undefined;
            if ((!args || args.src === undefined) && !opts.urn) {
                throw new Error("Missing required property 'src'");
            }
            inputs["name"] = args ? args.name : undefined;
            inputs["src"] = args ? args.src : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Addon.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Addon resources.
 */
export interface AddonState {
    /**
     * The name of the add-on.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     */
    readonly src?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Addon resource.
 */
export interface AddonArgs {
    /**
     * The name of the add-on.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     */
    readonly src: pulumi.Input<string>;
}

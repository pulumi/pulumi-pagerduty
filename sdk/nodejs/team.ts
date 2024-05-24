// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMg-create-a-team) is a collection of users and escalation policies that represent a group of people within an organization.
 *
 * The account must have the `teams` ability to use the following resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const parent = new pagerduty.Team("parent", {
 *     name: "Product Development",
 *     description: "Product and Engineering",
 * });
 * const example = new pagerduty.Team("example", {
 *     name: "Engineering",
 *     description: "All engineering",
 *     parent: parent.id,
 * });
 * ```
 *
 * ## Import
 *
 * Teams can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/team:Team main PLBP09X
 * ```
 */
export class Team extends pulumi.CustomResource {
    /**
     * Get an existing Team resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamState, opts?: pulumi.CustomResourceOptions): Team {
        return new Team(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/team:Team';

    /**
     * Returns true if the given object is an instance of Team.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Team {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Team.__pulumiType;
    }

    /**
     * The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    public readonly defaultRole!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * The name of the group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    public readonly parent!: pulumi.Output<string | undefined>;

    /**
     * Create a Team resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TeamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamArgs | TeamState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamState | undefined;
            resourceInputs["defaultRole"] = state ? state.defaultRole : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
        } else {
            const args = argsOrState as TeamArgs | undefined;
            resourceInputs["defaultRole"] = args ? args.defaultRole : undefined;
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["htmlUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Team.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Team resources.
 */
export interface TeamState {
    /**
     * The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    defaultRole?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    htmlUrl?: pulumi.Input<string>;
    /**
     * The name of the group.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    parent?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Team resource.
 */
export interface TeamArgs {
    /**
     * The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    defaultRole?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * The name of the group.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    parent?: pulumi.Input<string>;
}

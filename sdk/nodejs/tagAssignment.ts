// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.Tag("example", {label: "API"});
 * const engteam = new pagerduty.Team("engteam", {name: "Engineering"});
 * const exampleTagAssignment = new pagerduty.TagAssignment("example", {
 *     tagId: example.id,
 *     entityType: "teams",
 *     entityId: engteam.id,
 * });
 * ```
 *
 * ## Import
 *
 * Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
 * ```
 */
export class TagAssignment extends pulumi.CustomResource {
    /**
     * Get an existing TagAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagAssignmentState, opts?: pulumi.CustomResourceOptions): TagAssignment {
        return new TagAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/tagAssignment:TagAssignment';

    /**
     * Returns true if the given object is an instance of TagAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TagAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TagAssignment.__pulumiType;
    }

    /**
     * The ID of the entity.
     */
    public readonly entityId!: pulumi.Output<string>;
    /**
     * Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
     */
    public readonly entityType!: pulumi.Output<string>;
    /**
     * The ID of the tag.
     */
    public readonly tagId!: pulumi.Output<string>;

    /**
     * Create a TagAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagAssignmentArgs | TagAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagAssignmentState | undefined;
            resourceInputs["entityId"] = state ? state.entityId : undefined;
            resourceInputs["entityType"] = state ? state.entityType : undefined;
            resourceInputs["tagId"] = state ? state.tagId : undefined;
        } else {
            const args = argsOrState as TagAssignmentArgs | undefined;
            if ((!args || args.entityId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityId'");
            }
            if ((!args || args.entityType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityType'");
            }
            if ((!args || args.tagId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagId'");
            }
            resourceInputs["entityId"] = args ? args.entityId : undefined;
            resourceInputs["entityType"] = args ? args.entityType : undefined;
            resourceInputs["tagId"] = args ? args.tagId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TagAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TagAssignment resources.
 */
export interface TagAssignmentState {
    /**
     * The ID of the entity.
     */
    entityId?: pulumi.Input<string>;
    /**
     * Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
     */
    entityType?: pulumi.Input<string>;
    /**
     * The ID of the tag.
     */
    tagId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TagAssignment resource.
 */
export interface TagAssignmentArgs {
    /**
     * The ID of the entity.
     */
    entityId: pulumi.Input<string>;
    /**
     * Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
     */
    entityType: pulumi.Input<string>;
    /**
     * The ID of the tag.
     */
    tagId: pulumi.Input<string>;
}
